package com.megathirio.shinsei.core.slots;

import com.megathirio.shinsei.core.tileentities.TileEntityAnbiru;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;


public class SlotBook extends Slot {
    public SlotBook(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public int getSlotStackLimit(){
        return 1;
    }
}
