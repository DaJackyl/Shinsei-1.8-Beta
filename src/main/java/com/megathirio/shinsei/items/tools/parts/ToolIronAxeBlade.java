package com.megathirio.shinsei.items.tools.parts;

import com.megathirio.shinsei.core.crafting.ToolRecipes;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.items.tools.ToolShinsei;
import com.megathirio.shinsei.reference.names.ItemNames;
import net.minecraft.item.ItemStack;

public class ToolIronAxeBlade extends ToolShinsei {
    private static String name = ItemNames.tools.IRON_AXE_BLADE;
    ToolRecipes recipe = new ToolRecipes();

    public ToolIronAxeBlade(){
        super(name);

        recipe.addBladeRecipe(new ItemStack[]{new ItemStack(ShinseiItems.iron_axe_blade, 1), new ItemStack(ShinseiItems.book_axe, 1)}, "ingotIron");
    }
}
