package com.megathirio.shinsei.core.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;


public class SlotInput extends Slot {
    public SlotInput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public int getSlotStackLimit(){
        return 64;
    }
}
