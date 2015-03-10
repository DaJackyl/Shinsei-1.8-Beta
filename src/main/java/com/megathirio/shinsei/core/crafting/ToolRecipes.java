package com.megathirio.shinsei.core.crafting;

import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class ToolRecipes {

    private static HashMap<ItemStack[], String> bladeRecipes = new HashMap<ItemStack[], String>();
    private static HashMap<ItemStack[], ItemStack> toolRecipes = new HashMap<ItemStack[], ItemStack>();

    public static void addParts() {
        bladeRecipes = new HashMap<ItemStack[], String>();

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_tool_handle, 1), "@","@", '@', "stickWood"));

        addBladeRecipe(new ItemStack[]{new ItemStack(ShinseiItems.gold_axe_blade, 1), new ItemStack(ShinseiItems.book_axe, 1)}, "ingotGold");
        addBladeRecipe(new ItemStack[]{new ItemStack(ShinseiItems.iron_axe_blade, 1), new ItemStack(ShinseiItems.book_axe, 1)}, "ingotIron");
        addBladeRecipe(new ItemStack[]{new ItemStack(ShinseiItems.gold_pickaxe_blade, 1), new ItemStack(ShinseiItems.book_pickaxe, 1)}, "ingotGold");
        addBladeRecipe(new ItemStack[]{new ItemStack(ShinseiItems.iron_pickaxe_blade, 1), new ItemStack(ShinseiItems.book_pickaxe, 1)}, "ingotIron");

        for (Map.Entry<ItemStack[], String> entry : bladeRecipes.entrySet()) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(entry.getKey()[0], entry.getValue(), entry.getKey()[1]));
        }

    }

    public static void addTools(){
        addToolRecipe(new ItemStack[]{new ItemStack(Items.iron_axe, 1), new ItemStack(ShinseiItems.iron_axe_blade)}, new ItemStack(ShinseiItems.wood_tool_handle));
        addToolRecipe(new ItemStack[]{new ItemStack(Items.golden_axe, 1), new ItemStack(ShinseiItems.gold_axe_blade)}, new ItemStack(ShinseiItems.wood_tool_handle));
        addToolRecipe(new ItemStack[]{new ItemStack(Items.iron_pickaxe, 1), new ItemStack(ShinseiItems.iron_pickaxe_blade)}, new ItemStack(ShinseiItems.wood_tool_handle));
        addToolRecipe(new ItemStack[]{new ItemStack(Items.golden_pickaxe, 1), new ItemStack(ShinseiItems.gold_pickaxe_blade)}, new ItemStack(ShinseiItems.wood_tool_handle));

        for(Map.Entry<ItemStack[], ItemStack> entry : toolRecipes.entrySet()){
            GameRegistry.addRecipe(new ShapelessOreRecipe(entry.getKey()[0], entry.getValue(), entry.getKey()[1]));
        }

    }

    public static void addBladeRecipe(ItemStack[] components, String material){
        bladeRecipes.put(components, material);
    }

    public static void addToolRecipe(ItemStack[] components, ItemStack handle){
        toolRecipes.put(components, handle);
    }
}
