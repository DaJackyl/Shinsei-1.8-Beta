package com.megathirio.shinsei.core.tileentities;

import com.megathirio.shinsei.core.crafting.AnbiruRecipes;
import com.megathirio.shinsei.core.handlers.FuelHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagIntArray;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;

import java.util.Arrays;

public class TileEntityAnbiru extends TileEntity implements IInventory, IUpdatePlayerListBox{

    // Create and initialize the itemStacks variable that will store the itemStacks
    public static final int BOOK_SLOTS_COUNT = 1;
    public static final int TOOL_SLOTS_COUNT = 1;
    public static final int INPUT_SLOTS_COUNT = 1;
    public static final int OUTPUT_SLOTS_COUNT = 1;
    public static final int TOTAL_SLOTS_COUNT = BOOK_SLOTS_COUNT + TOOL_SLOTS_COUNT + INPUT_SLOTS_COUNT + OUTPUT_SLOTS_COUNT;

    public static final int FIRST_BOOK_SLOT = 0;
    public static final int FIRST_TOOL_SLOT = FIRST_BOOK_SLOT + BOOK_SLOTS_COUNT;
    public static final int FIRST_INPUT_SLOT = FIRST_TOOL_SLOT + TOOL_SLOTS_COUNT;
    public static final int FIRST_OUTPUT_SLOT = FIRST_INPUT_SLOT + INPUT_SLOTS_COUNT;

    private ItemStack[] itemStacks = new ItemStack[TOTAL_SLOTS_COUNT];

    // The number of ticks remaining on the current piece of tool
    private int [] processTimeRemaining = new int[TOOL_SLOTS_COUNT];
    // The initial process value of the current tool (in ticks of process duration)
    private int [] processTimeInitialValue = new int[TOOL_SLOTS_COUNT];
    //The number of ticks the current item has been processing
    private short processTime;
    //The number of ticks required to process an item
    private static final short PROCESS_TIME_FOR_COMPLETION = 200;  // vanilla value is 200 = 10 seconds

    private int cachedNumberOfProcessingSlots = -1;

    /**
     * Returns the amount of tool remaining on the currently processing item in the given tool slot.
     * @toolSlot the number of the tool slot (0..3)
     * @return fraction remaining, between 0 - 1
     */
    public double fractionOfToolRemaining(int toolSlot)
    {
        if (processTimeInitialValue[toolSlot] <= 0 ) return 0;
        double fraction = processTimeRemaining[toolSlot] / (double)processTimeInitialValue[toolSlot];
        return MathHelper.clamp_double(fraction, 0.0, 1.0);
    }

    /**
     * return the remaining process time of the tool in the given slot
     * @param toolSlot the number of the tool slot (0..3)
     * @return seconds remaining
     */
    public int secondsOfToolRemaining(int toolSlot)
    {
        if (processTimeRemaining[toolSlot] <= 0 ) return 0;
        return processTimeRemaining[toolSlot] / 20; // 20 ticks per second
    }

    /**
     * Get the number of slots which have tools processing in them.
     * @return number of slots with processing tools, 0 - TOOL_SLOTS_COUNT
     */
    public int numberOfProcessingToolSlots()
    {
        int processingCount = 0;
        for (int processTime : processTimeRemaining) {
            if (processTime > 0) ++processingCount;
        }
        return processingCount;
    }

    /**
     * Returns the amount of process time completed on the currently processing item.
     * @return fraction remaining, between 0 - 1
     */
    public double fractionOfProcessTimeComplete()
    {
        double fraction = processTime / (double)PROCESS_TIME_FOR_COMPLETION;
        return MathHelper.clamp_double(fraction, 0.0, 1.0);
    }

    // This method is called every tick to update the tile entity, i.e.
    // - see if the tool has run out, and if so turn the anbiru "off" and slowly unprocess the current item (if any)
    // - see if any of the items have finished processing
    // It runs both on the server and the client.
    @Override
    public void update() {
        // If there is nothing to process or there is no room in the output, reset processTime and return
        if (canProcess()) {
            int numberOfToolProcessing = processTool();

            // If tool is available, keep processing the item, otherwise start "unprocessing" it at double speed
            if (numberOfToolProcessing > 0) {
                processTime += numberOfToolProcessing;
            }	else {
                processTime -= 2;
            }

            if (processTime < 0) processTime = 0;

            // If cookTime has reached maxCookTime smelt the item and reset cookTime
            if (processTime >= PROCESS_TIME_FOR_COMPLETION) {
                processItem();
                processTime = 0;
            }
        }	else {
            processTime = 0;
        }

        // when the number of burning slots changes, we need to force the block to re-render, otherwise the change in
        //   state will not be visible.  Likewise, we need to force a lighting recalculation.
        // The block update (for renderer) is only required on client side, but the lighting is required on both, since
        //    the client needs it for rendering and the server needs it for crop growth etc
        int numberProcessing = numberOfProcessingToolSlots();
        if (cachedNumberOfProcessingSlots != numberProcessing) {
            cachedNumberOfProcessingSlots = numberProcessing;
            if (worldObj.isRemote) {
                worldObj.markBlockForUpdate(pos);
            }
            worldObj.checkLightFor(EnumSkyBlock.BLOCK, pos);
        }
    }

    /**
     * 	checks if processTimeRemaining = 0 and tries to consume a new piece of tool if one is available
     */
    private int processTool() {
        int processingCount = 0;
        boolean inventoryChanged = false;
        // Iterate over all the tool slots
        for (int i = 0; i < TOOL_SLOTS_COUNT; i++) {
            int toolSlotNumber = i + FIRST_TOOL_SLOT;
            if (processTimeRemaining[i] > 0) {
                --processTimeRemaining[i];
                ++processingCount;
            }
            if (processTimeRemaining[i] == 0) {
                if (itemStacks[toolSlotNumber] != null && getItemProcessTime(itemStacks[toolSlotNumber]) > 0) {
                    // If the stack in this slot is not null and is a tool, set processTimeRemaining & processTimeInitialValue to the
                    // item's process time and decrease the stack size
                    processTimeRemaining[i] = processTimeInitialValue[i] = getItemProcessTime(itemStacks[toolSlotNumber]);
                    --itemStacks[toolSlotNumber].stackSize;
                    ++processingCount;
                    inventoryChanged = true;
                    // If the stack size now equals 0 set the slot contents to the items container item. This is for tool
                    // items such as lava buckets so that the bucket is not consumed. If the item dose not have
                    // a container item getContainerItem returns null which sets the slot contents to null
                    if (itemStacks[toolSlotNumber].stackSize == 0) {
                        itemStacks[toolSlotNumber] = itemStacks[toolSlotNumber].getItem().getContainerItem(itemStacks[toolSlotNumber]);
                    }
                }
            }
        }
        if (inventoryChanged) markDirty();
        return processingCount;
    }

    /**
     * Check if any of the input items are processable and there is sufficient space in the output slots
     * @return true if processing is possible
     */
    private boolean canProcess() {return processItem(false);}

    /**
     * Process an input item into an output slot, if possible
     */
    private void processItem() {processItem(true);}

    /**
     * checks that there is an item to be processed in one of the input slots and that there is room for the result in the output slots
     * If desired, performs the process
     * @param performProcess if true, perform the process.  if false, check whether processing is possible, but don't change the inventory
     * @return false if no items can be processed, true otherwise
     */
    private boolean processItem(boolean performProcess)
    {
        Integer firstSuitableInputSlot = null;
        Integer firstSuitableOutputSlot = null;
        ItemStack result = null;

        // finds the first input slot which is processable and whose result fits into an output slot (stacking if possible)
        for (int inputSlot = FIRST_INPUT_SLOT; inputSlot < FIRST_INPUT_SLOT + INPUT_SLOTS_COUNT; inputSlot++)	{
            if (itemStacks[inputSlot] != null) {
                result = getProcessingResultForItem(itemStacks[inputSlot]);
                if (result != null) {
                    // find the first suitable output slot- either empty, or with identical item that has enough space
                    for (int outputSlot = FIRST_OUTPUT_SLOT; outputSlot < FIRST_OUTPUT_SLOT + OUTPUT_SLOTS_COUNT; outputSlot++) {
                        ItemStack outputStack = itemStacks[outputSlot];
                        if (outputStack == null) {
                            firstSuitableInputSlot = inputSlot;
                            firstSuitableOutputSlot = outputSlot;
                            break;
                        }

                        if (outputStack.getItem() == result.getItem() && (!outputStack.getHasSubtypes() || outputStack.getMetadata() == outputStack.getMetadata())
                                && ItemStack.areItemStackTagsEqual(outputStack, result)) {
                            int combinedSize = itemStacks[outputSlot].stackSize + result.stackSize;
                            if (combinedSize <= getInventoryStackLimit() && combinedSize <= itemStacks[outputSlot].getMaxStackSize()) {
                                firstSuitableInputSlot = inputSlot;
                                firstSuitableOutputSlot = outputSlot;
                                break;
                            }
                        }
                    }
                    if (firstSuitableInputSlot != null) break;
                }
            }
        }

        if (firstSuitableInputSlot == null) return false;
        if (!performProcess) return true;

        // alter input and output
        itemStacks[firstSuitableInputSlot].stackSize--;
        if (itemStacks[firstSuitableInputSlot].stackSize <=0) itemStacks[firstSuitableInputSlot] = null;
        if (itemStacks[firstSuitableOutputSlot] == null) {
            itemStacks[firstSuitableOutputSlot] = result.copy(); // Use deep .copy() to avoid altering the recipe
        } else {
            itemStacks[firstSuitableOutputSlot].stackSize += result.stackSize;
        }
        markDirty();
        return true;
    }

    // returns the processing result for the given stack. Returns null if the given stack can not be processed
    public static ItemStack getProcessingResultForItem(ItemStack stack) { return AnbiruRecipes.instance().getProcessingResult(stack); }

    // returns the number of ticks the given item will process. Returns 0 if the given item is not a valid tool
    public static short getItemProcessTime(ItemStack stack)
    {
        int processtime = FuelHandler.getToolProcessTime(stack);
        return (short)MathHelper.clamp_int(processtime, 0, Short.MAX_VALUE);
    }

    @Override
    public int getSizeInventory() {
        return itemStacks.length;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return itemStacks[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack itemStackInSlot = getStackInSlot(index);
        if (itemStackInSlot == null) return null;

        ItemStack itemStackRemoved;
        if (itemStackInSlot.stackSize <= count) {
            itemStackRemoved = itemStackInSlot;
            setInventorySlotContents(index, null);
        } else {
            itemStackRemoved = itemStackInSlot.splitStack(count);
            if (itemStackInSlot.stackSize == 0) {
                setInventorySlotContents(index, null);
            }
        }
        markDirty();
        return itemStackRemoved;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        itemStacks[index] = stack;
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
        markDirty();
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        if (this.worldObj.getTileEntity(this.pos) != this) return false;
        final double X_CENTER_OFFSET = 0.5;
        final double Y_CENTER_OFFSET = 0.5;
        final double Z_CENTER_OFFSET = 0.5;
        final double MAXIMUM_DISTANCE_SQ = 8.0 * 8.0;
        return player.getDistanceSq(pos.getX() + X_CENTER_OFFSET, pos.getY() + Y_CENTER_OFFSET, pos.getZ() + Z_CENTER_OFFSET) < MAXIMUM_DISTANCE_SQ;
    }

    // Return true if the given stack is allowed to be inserted in the given slot
    public boolean isItemValidForBookSlot(ItemStack stack) {
        return true;
    }

    // Return true if the given stack is allowed to be inserted in the given slot
    public boolean isItemValidForToolSlot(ItemStack stack) {
        return true;
    }

    // Return true if the given stack is allowed to be inserted in the given slot
    public boolean isItemValidForInputSlot(ItemStack stack) {
        return true;
    }

    // Return true if the given stack is allowed to be inserted in the given slot
    public boolean isItemValidForOutputSlot(ItemStack stack) {
        return false;
    }

    // This is where you save any data that you don't want to lose when the tile entity unloads
    // In this case, it saves the state of the furnace (burn time etc) and the itemstacks stored in the fuel, input, and output slots
    @Override
    public void writeToNBT(NBTTagCompound parentNBTTagCompound)
    {
        super.writeToNBT(parentNBTTagCompound); // The super call is required to save and load the tiles location

//		// Save the stored item stacks
//		NBTTagCompound[] tag = new NBTTagCompound[itemStacks.length];

        // to use an analogy with Java, this code generates an array of hashmaps
        // The itemStack in each slot is converted to an NBTTagCompound, which is effectively a hashmap of key->value pairs such
        //   as slot=1, id=2353, count=1, etc
        // Each of these NBTTagCompound are then inserted into NBTTagList, which is similar to an array.
        NBTTagList dataForAllSlots = new NBTTagList();
        for (int i = 0; i < this.itemStacks.length; ++i) {
            if (this.itemStacks[i] != null) {
                NBTTagCompound dataForThisSlot = new NBTTagCompound();
                dataForThisSlot.setByte("Slot", (byte) i);
                this.itemStacks[i].writeToNBT(dataForThisSlot);
                dataForAllSlots.appendTag(dataForThisSlot);
            }
        }
        // the array of hashmaps is then inserted into the parent hashmap for the container
        parentNBTTagCompound.setTag("Items", dataForAllSlots);

        // Save everything else
        parentNBTTagCompound.setShort("ProcessTime", processTime);
        parentNBTTagCompound.setTag("processTimeRemaining", new NBTTagIntArray(processTimeRemaining));
        parentNBTTagCompound.setTag("processTimeInitial", new NBTTagIntArray(processTimeInitialValue));
    }

    // This is where you load the data that you saved in writeToNBT
    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound); // The super call is required to save and load the tiles location
        final byte NBT_TYPE_COMPOUND = 10;       // See NBTBase.createNewByType() for a listing
        NBTTagList dataForAllSlots = nbtTagCompound.getTagList("Items", NBT_TYPE_COMPOUND);

        Arrays.fill(itemStacks, null);           // set all slots to empty
        for (int i = 0; i < dataForAllSlots.tagCount(); ++i) {
            NBTTagCompound dataForOneSlot = dataForAllSlots.getCompoundTagAt(i);
            byte slotNumber = dataForOneSlot.getByte("Slot");
            if (slotNumber >= 0 && slotNumber < this.itemStacks.length) {
                this.itemStacks[slotNumber] = ItemStack.loadItemStackFromNBT(dataForOneSlot);
            }
        }

        // Load everything else.  Trim the arrays (or pad with 0) to make sure they have the correct number of elements
        processTime = nbtTagCompound.getShort("CookTime");
        processTimeRemaining = Arrays.copyOf(nbtTagCompound.getIntArray("burnTimeRemaining"), TOOL_SLOTS_COUNT);
        processTimeInitialValue = Arrays.copyOf(nbtTagCompound.getIntArray("burnTimeInitial"), TOOL_SLOTS_COUNT);
        cachedNumberOfProcessingSlots = -1;
    }

    // When the world loads from disk, the server needs to send the TileEntity information to the client
    //  it uses getDescriptionPacket() and onDataPacket() to do this
    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        writeToNBT(nbtTagCompound);
        final int METADATA = 0;
        return new S35PacketUpdateTileEntity(this.pos, METADATA, nbtTagCompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
    }

    //------------------------

    // set all slots to empty
    @Override
    public void clear() {
        Arrays.fill(itemStacks, null);
    }

    // will add a key for this container to the lang file so we can name it in the GUI
    @Override
    public String getName() {
        return "container.anbiru.name";
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    // standard code to look up what the human-readable name is
    @Override
    public IChatComponent getDisplayName() {
        return this.hasCustomName() ? new ChatComponentText(this.getName()) : new ChatComponentTranslation(this.getName());
    }

    // Fields are used to send non-inventory information from the server to interested clients
    // The container code caches the fields and sends the client any fields which have changed.
    // The field ID is limited to byte, and the field value is limited to short. (if you use more than this, they get cast down
    //   in the network packets)
    // If you need more than this, or shorts are too small, use a custom packet in your container instead.

    private static final byte PROCESS_FIELD_ID = 0;
    private static final byte FIRST_PROCESS_TIME_REMAINING_FIELD_ID = 1;
    private static final byte FIRST_PROCESS_TIME_INITIAL_FIELD_ID = FIRST_PROCESS_TIME_REMAINING_FIELD_ID + (byte)TOOL_SLOTS_COUNT;
    private static final byte NUMBER_OF_FIELDS = FIRST_PROCESS_TIME_INITIAL_FIELD_ID + (byte)TOOL_SLOTS_COUNT;

    @Override
    public int getField(int id) {
        if (id == PROCESS_FIELD_ID) return processTime;
        if (id >= FIRST_PROCESS_TIME_REMAINING_FIELD_ID && id < FIRST_PROCESS_TIME_REMAINING_FIELD_ID + TOOL_SLOTS_COUNT) {
            return processTimeRemaining[id - FIRST_PROCESS_TIME_REMAINING_FIELD_ID];
        }
        if (id >= FIRST_PROCESS_TIME_INITIAL_FIELD_ID && id < FIRST_PROCESS_TIME_INITIAL_FIELD_ID + TOOL_SLOTS_COUNT) {
            return processTimeInitialValue[id - FIRST_PROCESS_TIME_INITIAL_FIELD_ID];
        }
        System.err.println("Invalid field ID in TileInventoryProcessing.getField:" + id);
        return 0;
    }

    @Override
    public void setField(int id, int value)
    {
        if (id == PROCESS_FIELD_ID) {
            processTime = (short)value;
        } else if (id >= FIRST_PROCESS_TIME_REMAINING_FIELD_ID && id < FIRST_PROCESS_TIME_REMAINING_FIELD_ID + TOOL_SLOTS_COUNT) {
            processTimeRemaining[id - FIRST_PROCESS_TIME_REMAINING_FIELD_ID] = value;
        } else if (id >= FIRST_PROCESS_TIME_INITIAL_FIELD_ID && id < FIRST_PROCESS_TIME_INITIAL_FIELD_ID + TOOL_SLOTS_COUNT) {
            processTimeInitialValue[id - FIRST_PROCESS_TIME_INITIAL_FIELD_ID] = value;
        } else {
            System.err.println("Invalid field ID in TileInventoryProcessing.setField:" + id);
        }
    }

    @Override
    public int getFieldCount() {
        return NUMBER_OF_FIELDS;
    }

    // -----------------------------------------------------------------------------------------------------------
    // The following methods are not needed for this example but are part of IInventory so they must be implemented

    // Unused unless your container specifically uses it.
    // Return true if the given stack is allowed to go in the given slot
    @Override
    public boolean isItemValidForSlot(int slotIndex, ItemStack itemstack) {
        return false;
    }

    /**
     * This method removes the entire contents of the given slot and returns it.
     * Used by containers such as crafting tables which return any items in their slots when you close the GUI
     * @param slotIndex
     * @return
     */
    @Override
    public ItemStack getStackInSlotOnClosing(int slotIndex) {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null) setInventorySlotContents(slotIndex, null);
        return itemStack;
    }

    @Override
    public void openInventory(EntityPlayer player) {}

    @Override
    public void closeInventory(EntityPlayer player) {}


}
