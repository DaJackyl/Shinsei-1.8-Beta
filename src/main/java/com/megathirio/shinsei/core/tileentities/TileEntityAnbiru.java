package com.megathirio.shinsei.core.tileentities;

import com.megathirio.shinsei.items.books.BookShinsei;
import com.megathirio.shinsei.items.tools.ToolShinsei;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IChatComponent;

public class TileEntityAnbiru extends TileEntity implements IInventory, IUpdatePlayerListBox {

    // Create and initialize the itemStacks variable that will store the itemStacks
    public static final int BOOK_SLOTS_COUNT = 1;
    public static final int TOOL_SLOTS_COUNT = 1;
    public static final int INPUT_SLOTS_COUNT = 1;
    public static final int OUTPUT_SLOTS_COUNT = 1;
    public static final int TOTAL_SLOTS_COUNT = BOOK_SLOTS_COUNT + TOOL_SLOTS_COUNT + INPUT_SLOTS_COUNT + OUTPUT_SLOTS_COUNT;

    public static final int BOOK_SLOT_INDEX = 0;
    public static final int TOOL_SLOT_INDEX = BOOK_SLOT_INDEX + BOOK_SLOTS_COUNT;
    public static final int INPUT_SLOT_INDEX = TOOL_SLOT_INDEX + TOOL_SLOTS_COUNT;
    public static final int OUTPUT_SLOT_INDEX = INPUT_SLOT_INDEX + INPUT_SLOTS_COUNT;

    private ItemStack[] itemStacks = new ItemStack[TOTAL_SLOTS_COUNT];

    /** The number of process ticks remaining on the current tool use */
    public int processTimeRemaining = TOOL_SLOTS_COUNT;
    /** The initial fuel value of the currently burning fuel (in ticks of burn duration) */
    public int processTimeInitialValue = TOOL_SLOTS_COUNT;

    /**The number of ticks the current item has been cooking*/
    public short processTime;
    /**The number of ticks required to process an item*/
    public static final short PROCESS_TIME_FOR_COMPLETION = 200;  // vanilla value is 200 = 10 seconds

    @Override
    public int getSizeInventory() {
        return TOTAL_SLOTS_COUNT;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return itemStacks[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack itemStackInSlot = getStackInSlot(index);
        if(itemStackInSlot == null) return null;

        ItemStack itemStackRemoved;
        if(itemStackInSlot.stackSize <= count){
            itemStackRemoved = itemStackInSlot;
            setInventorySlotContents(index, null);
        }else{
            itemStackRemoved = itemStackInSlot.splitStack(count);
            if(itemStackInSlot.stackSize == 0){
                setInventorySlotContents(index, null);
            }
        }
        markDirty();
        return itemStackRemoved;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        ItemStack itemStack = getStackInSlot(index);
        if (itemStack != null) setInventorySlotContents(index, null);
        return itemStack;
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

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        Item item = stack.getItem();
        if(index == OUTPUT_SLOT_INDEX) return false;
        if(index == BOOK_SLOT_INDEX && item instanceof BookShinsei) return true;
        if(index == TOOL_SLOT_INDEX && item instanceof ToolShinsei) return true;
        return true;
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
            return processTimeRemaining;
        }
        if (id >= FIRST_PROCESS_TIME_INITIAL_FIELD_ID && id < FIRST_PROCESS_TIME_INITIAL_FIELD_ID + TOOL_SLOTS_COUNT) {
            return processTimeInitialValue;
        }
        System.err.println("Invalid field ID in TileInventorySmelting.getField:" + id);
        return 0;
    }

    @Override
    public void setField(int id, int value)
    {
        if (id == PROCESS_FIELD_ID) {
            processTime = (short)value;
        } else if (id >= FIRST_PROCESS_TIME_REMAINING_FIELD_ID && id < FIRST_PROCESS_TIME_REMAINING_FIELD_ID + TOOL_SLOTS_COUNT) {
            processTimeRemaining = value;
        } else if (id >= FIRST_PROCESS_TIME_INITIAL_FIELD_ID && id < FIRST_PROCESS_TIME_INITIAL_FIELD_ID + TOOL_SLOTS_COUNT) {
            processTimeInitialValue = value;
        } else {
            System.err.println("Invalid field ID in TileInventorySmelting.setField:" + id);
        }
    }

    @Override
    public int getFieldCount() {
        return NUMBER_OF_FIELDS;
    }

    @Override
    public void clear() {

    }

    @Override
    public void update() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public IChatComponent getDisplayName() {
        return null;
    }
}
