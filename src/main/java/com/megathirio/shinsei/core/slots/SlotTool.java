package com.megathirio.shinsei.core.slots;

import com.megathirio.shinsei.items.tools.ToolShinsei;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class SlotTool extends Slot {

    public SlotTool(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public int getSlotStackLimit(){
        return 1;
    }

}
