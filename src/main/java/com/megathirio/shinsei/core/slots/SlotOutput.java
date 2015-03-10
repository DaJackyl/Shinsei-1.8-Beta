package com.megathirio.shinsei.core.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;


public class SlotOutput extends Slot {
    public SlotOutput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public int getSlotStackLimit(){
        return 64;
    }
}
