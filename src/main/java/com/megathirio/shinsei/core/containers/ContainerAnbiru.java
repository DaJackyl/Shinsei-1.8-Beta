package com.megathirio.shinsei.core.containers;

import com.megathirio.shinsei.core.tileentities.TileEntityAnbiru;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerAnbiru {//extends Container {

//    // Stores a reference to the tile entity instance for later use
//    private TileEntityAnbiru teAnbiru;
//
//    // These store cache values, used by the server to only update the client side tile entity when values have changed
//    private int [] cachedFields;
//
//    // must assign a slot number to each of the slots used by the GUI.
//    // For this container, we can see both the tile inventory's slots as well as the player inventory slots and the hotbar.
//    // Each time we add a Slot to the container, it automatically increases the slotIndex, which means
//    //  0 - 8 = hotbar slots (which will map to the InventoryPlayer slot numbers 0 - 8)
//    //  9 - 35 = player inventory slots (which map to the InventoryPlayer slot numbers 9 - 35)
//    //  36 = book slot (tileEntity slot number 0)
//    //  37 = tool slot (tileEntity slot number 1)
//    //  38 = input slot (tileEntity slot number 2)
//    //  39 = output slot (tileEntity slot number 3)
//
//    private final int HOTBAR_SLOT_COUNT = 9;
//    private final int PLAYER_INVENTORY_ROW_COUNT = 3;
//    private final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
//    private final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
//    private final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
//
//    public final int BOOK_SLOTS_COUNT = 1;
//    public final int TOOL_SLOTS_COUNT = 1;
//    public final int INPUT_SLOTS_COUNT = 1;
//    public final int OUTPUT_SLOTS_COUNT = 1;
//    public final int ANBIRU_SLOTS_COUNT = BOOK_SLOTS_COUNT + TOOL_SLOTS_COUNT + INPUT_SLOTS_COUNT + OUTPUT_SLOTS_COUNT;
//
//    // slot index is the unique index for all slots in this container i.e. 0 - 35 for invPlayer then 36 - 39 for tileInventoryAnbiru
//    private final int VANILLA_FIRST_SLOT_INDEX = 0;
//    private final int FIRST_BOOK_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
//    private final int FIRST_TOOL_SLOT_INDEX = FIRST_BOOK_SLOT_INDEX + BOOK_SLOTS_COUNT;
//    private final int FIRST_INPUT_SLOT_INDEX = FIRST_TOOL_SLOT_INDEX + TOOL_SLOTS_COUNT;
//    private final int FIRST_OUTPUT_SLOT_INDEX = FIRST_INPUT_SLOT_INDEX + INPUT_SLOTS_COUNT;
//
//    // slot number is the slot number within each component; i.e. invPlayer slots 0 - 35, and tileInventoryAnbiru slots 0 - 3
//    private final int FIRST_BOOK_SLOT_NUMBER = 0;
//    private final int FIRST_TOOL_SLOT_NUMBER = FIRST_BOOK_SLOT_NUMBER + BOOK_SLOTS_COUNT;
//    private final int FIRST_INPUT_SLOT_NUMBER = FIRST_TOOL_SLOT_NUMBER + TOOL_SLOTS_COUNT;
//    private final int FIRST_OUTPUT_SLOT_NUMBER = FIRST_INPUT_SLOT_NUMBER + INPUT_SLOTS_COUNT;
//
//    public ContainerAnbiru(InventoryPlayer invPlayer, TileEntityAnbiru tile) {
//        this.teAnbiru = tile;
//
//        final int SLOT_X_SPACING = 18;
//        final int SLOT_Y_SPACING = 18;
//        final int HOTBAR_XPOS = 8;
//        final int HOTBAR_YPOS = 142;
//        // Add the players hotbar to the gui - the [xpos, ypos] location of each item
//        for (int x = 0; x < HOTBAR_SLOT_COUNT; x++) {
//            int slotNumber = x;
//            addSlotToContainer(new Slot(invPlayer, slotNumber, HOTBAR_XPOS + SLOT_X_SPACING * x, HOTBAR_YPOS));
//        }
//
//        final int PLAYER_INVENTORY_XPOS = 8;
//        final int PLAYER_INVENTORY_YPOS = 84;
//        // Add the rest of the players inventory to the gui
//        for (int y = 0; y < PLAYER_INVENTORY_ROW_COUNT; y++) {
//            for (int x = 0; x < PLAYER_INVENTORY_COLUMN_COUNT; x++) {
//                int slotNumber = HOTBAR_SLOT_COUNT + y * PLAYER_INVENTORY_COLUMN_COUNT + x;
//                int xpos = PLAYER_INVENTORY_XPOS + x * SLOT_X_SPACING;
//                int ypos = PLAYER_INVENTORY_YPOS + y * SLOT_Y_SPACING;
//                addSlotToContainer(new Slot(invPlayer, slotNumber,  xpos, ypos));
//            }
//        }
//
//        final int BOOK_SLOTS_XPOS = 16;
//        final int BOOK_SLOTS_YPOS = 35;
//        // Add the book slots
//        for (int y = 0; y < BOOK_SLOTS_COUNT; y++) {
//            int slotNumber = y + FIRST_BOOK_SLOT_NUMBER;
//            addSlotToContainer(new SlotBook(tile, slotNumber, BOOK_SLOTS_XPOS, BOOK_SLOTS_YPOS + SLOT_Y_SPACING * y));
//        }
//
//        final int TOOL_SLOTS_XPOS = 54;
//        final int TOOL_SLOTS_YPOS = 35;
//        // Add the tool slots
//        for (int y = 0; y < TOOL_SLOTS_COUNT; y++) {
//            int slotNumber = y + FIRST_TOOL_SLOT_NUMBER;
//            addSlotToContainer(new SlotTool(tile, slotNumber, TOOL_SLOTS_XPOS, TOOL_SLOTS_YPOS + SLOT_Y_SPACING * y));
//        }
//
//        final int INPUT_SLOTS_XPOS = 92;
//        final int INPUT_SLOTS_YPOS = 35;
//        // Add the input slots
//        for (int x = 0; x < INPUT_SLOTS_COUNT; x++) {
//            int slotNumber = x + FIRST_INPUT_SLOT_NUMBER;
//            addSlotToContainer(new SlotInput(tile, slotNumber, INPUT_SLOTS_XPOS + SLOT_X_SPACING * x, INPUT_SLOTS_YPOS));
//        }
//
//        final int OUTPUT_SLOTS_XPOS = 148;
//        final int OUTPUT_SLOTS_YPOS = 35;
//        // Add the output slots
//        for (int y = 0; y < OUTPUT_SLOTS_COUNT; y++) {
//            int slotNumber = y + FIRST_OUTPUT_SLOT_NUMBER;
//            addSlotToContainer(new SlotOutput(tile, slotNumber, OUTPUT_SLOTS_XPOS, OUTPUT_SLOTS_YPOS + SLOT_Y_SPACING * y));
//        }
//    }
//
//    // Vanilla calls this method every tick to make sure the player is still able to access the inventory, and if not closes the gui
//    @Override
//    public boolean canInteractWith(EntityPlayer player)
//    {
//        return teAnbiru.isUseableByPlayer(player);
//    }
//
//    // This is where you specify what happens when a player shift clicks a slot in the gui
//    //  (when you shift click a slot in the TileEntity Inventory, it moves it to the first available position in the hotbar and/or
//    //    player inventory.  When you you shift-click a hotbar or player inventory item, it moves it to the first available
//    //    position in the TileEntity inventory)
//    // At the very least you must override this and return null or the game will crash when the player shift clicks a slot
//    // returns null if the source slot is empty, or if none of the the source slot items could be moved
//    //   otherwise, returns a copy of the source stack
//    @Override
//    public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex)
//    {
//        Slot sourceSlot = (Slot)inventorySlots.get(sourceSlotIndex);
//        if (sourceSlot == null || !sourceSlot.getHasStack()) return null;
//        ItemStack sourceStack = sourceSlot.getStack();
//        ItemStack copyOfSourceStack = sourceStack.copy();
//
//        // Check if the slot clicked is one of the vanilla container slots
//        if (sourceSlotIndex >= VANILLA_FIRST_SLOT_INDEX && sourceSlotIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
//            // This is a vanilla container slot so merge the stack into one of the anbiru slots
//            if (TileEntityAnbiru.getProcessingResultForItem(sourceStack) != null){
//                if (!mergeItemStack(sourceStack, FIRST_INPUT_SLOT_INDEX, FIRST_INPUT_SLOT_INDEX + INPUT_SLOTS_COUNT, false)){
//                    return null;
//                }
//            }	else if (TileEntityAnbiru.getItemProcessTime(sourceStack) > 0) {
//                if (!mergeItemStack(sourceStack, FIRST_BOOK_SLOT_INDEX, FIRST_BOOK_SLOT_INDEX + BOOK_SLOTS_COUNT, true)) {
//                    // Setting the boolean to true places the stack in the bottom slot first
//                    return null;
//                }
//            }	else {
//                return null;
//            }
//        } else if (sourceSlotIndex >= FIRST_TOOL_SLOT_INDEX && sourceSlotIndex < FIRST_TOOL_SLOT_INDEX + ANBIRU_SLOTS_COUNT) {
//            // This is an anbiru slot so merge the stack into the players inventory: try the hotbar first and then the main inventory
//            //   because the main inventory slots are immediately after the hotbar slots, we can just merge with a single call
//            if (!mergeItemStack(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
//                return null;
//            }
//        } else {
//            System.err.print("Invalid slotIndex:" + sourceSlotIndex);
//            return null;
//        }
//
//        // If stack size == 0 (the entire stack was moved) set slot contents to null
//        if (sourceStack.stackSize == 0) {
//            sourceSlot.putStack(null);
//        } else {
//            sourceSlot.onSlotChanged();
//        }
//
//        sourceSlot.onPickupFromSlot(player, sourceStack);
//        return copyOfSourceStack;
//    }
//
///* Client Synchronization */
//
//    // This is where you check if any values have changed and if so send an update to any clients accessing this container
//    // The container itemstacks are tested in Container.detectAndSendChanges, so we don't need to do that
//    // We iterate through all of the TileEntity Fields to find any which have changed, and send them.
//    // You don't have to use fields if you don't wish to; just manually match the ID in sendProgressBarUpdate with the value in
//    //   updateProgressBar()
//    // The progress bar values are restricted to shorts.  If you have a larger value (eg int), it's not a good idea to try and split it
//    //   up into two shorts because the progress bar values are sent independently, and unless you add synchronisation logic at the
//    //   receiving side, your int value will be wrong until the second short arrives.  Use a custom packet instead.
//    @Override
//    public void detectAndSendChanges() {
//        super.detectAndSendChanges();
//
//        boolean allFieldsHaveChanged = false;
//        boolean fieldHasChanged [] = new boolean[teAnbiru.getFieldCount()];
//        if (cachedFields == null) {
//            cachedFields = new int[teAnbiru.getFieldCount()];
//            allFieldsHaveChanged = true;
//        }
//        for (int i = 0; i < cachedFields.length; ++i) {
//            if (allFieldsHaveChanged || cachedFields[i] != teAnbiru.getField(i)) {
//                cachedFields[i] = teAnbiru.getField(i);
//                fieldHasChanged[i] = true;
//            }
//        }
//
//        // go through the list of crafters (players using this container) and update them if necessary
//        for (int i = 0; i < this.crafters.size(); ++i) {
//            ICrafting icrafting = (ICrafting)this.crafters.get(i);
//            for (int fieldID = 0; fieldID < teAnbiru.getFieldCount(); ++fieldID) {
//                if (fieldHasChanged[fieldID]) {
//                    // Note that although sendProgressBarUpdate takes 2 ints on a server these are truncated to shorts
//                    icrafting.sendProgressBarUpdate(this, fieldID, cachedFields[fieldID]);
//                }
//            }
//        }
//    }
//
//    // Called when a progress bar update is received from the server. The two values (id and data) are the same two
//    // values given to sendProgressBarUpdate.  In this case we are using fields so we just pass them to the tileEntity.
//    @SideOnly(Side.CLIENT)
//    @Override
//    public void updateProgressBar(int id, int data) {
//        teAnbiru.setField(id, data);
//    }
//
//    // SlotBook is a slot for books
//    public class SlotBook extends Slot {
//        public SlotBook(IInventory inventoryIn, int index, int xPosition, int yPosition) {
//            super(inventoryIn, index, xPosition, yPosition);
//        }
//
//        // if this function returns false, the player won't be able to insert the given item into this slot
//        @Override
//        public boolean isItemValid(ItemStack stack) {
//            return teAnbiru.isItemValidForBookSlot(stack);
//        }
//    }
//
//    // SlotTool is a slot for tool items
//    public class SlotTool extends Slot {
//        public SlotTool(IInventory inventoryIn, int index, int xPosition, int yPosition) {
//            super(inventoryIn, index, xPosition, yPosition);
//        }
//
//        // if this function returns false, the player won't be able to insert the given item into this slot
//        @Override
//        public boolean isItemValid(ItemStack stack) {
//            return teAnbiru.isItemValidForToolSlot(stack);
//        }
//    }
//
//    // SlotInput is a slot for input items
//    public class SlotInput extends Slot {
//        public SlotInput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
//            super(inventoryIn, index, xPosition, yPosition);
//        }
//
//        // if this function returns false, the player won't be able to insert the given item into this slot
//        @Override
//        public boolean isItemValid(ItemStack stack) {
//            return teAnbiru.isItemValidForInputSlot(stack);
//        }
//    }
//
//    // SlotOutput is a slot that will not accept any items
//    public class SlotOutput extends Slot {
//        public SlotOutput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
//            super(inventoryIn, index, xPosition, yPosition);
//        }
//
//        // if this function returns false, the player won't be able to insert the given item into this slot
//        @Override
//        public boolean isItemValid(ItemStack stack) {
//            return teAnbiru.isItemValidForOutputSlot(stack);
//        }
//    }
//
//    // pass the close container message to the tileEntityInventory (not strictly needed for this example)
//    //  see ContainerChest and TileEntityChest
//    @Override
//    public void onContainerClosed(EntityPlayer playerIn)
//    {
//        super.onContainerClosed(playerIn);
//        this.teAnbiru.closeInventory(playerIn);
//    }

}
