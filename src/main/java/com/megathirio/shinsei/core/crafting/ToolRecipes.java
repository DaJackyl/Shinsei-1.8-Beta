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

    private static HashMap<ItemStack, String> axeBladeRecipes = new HashMap<ItemStack, String>();

    public static void addParts() {

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_tool_handle, 1), "@","@", '@', "stickWood"));

        axeBladeRecipes.put(new ItemStack(ShinseiItems.iron_axe_blade, 1), "ingotIron");
        axeBladeRecipes.put(new ItemStack(ShinseiItems.gold_axe_blade, 1), "ingotGold");
        for (Map.Entry<ItemStack, String> entry : axeBladeRecipes.entrySet()) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(entry.getKey(), entry.getValue(), ShinseiItems.book_axe));
        }

        HashMap<ItemStack, String> pickaxeBladeRecipes = new HashMap<ItemStack, String>();
        pickaxeBladeRecipes.put(new ItemStack(ShinseiItems.iron_pickaxe_blade, 1), "ingotIron");
        pickaxeBladeRecipes.put(new ItemStack(ShinseiItems.gold_pickaxe_blade, 1), "ingotGold");
        for (Map.Entry<ItemStack, String> entry : pickaxeBladeRecipes.entrySet()) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(entry.getKey(), entry.getValue(), ShinseiItems.book_pickaxe));
        }
    }

    public static void addTools(){
        HashMap<ItemStack, ItemStack> toolRecipes = new HashMap<ItemStack, ItemStack>();
        toolRecipes.put(new ItemStack(Items.iron_axe, 1), new ItemStack(ShinseiItems.iron_axe_blade));
        toolRecipes.put(new ItemStack(Items.golden_axe, 1), new ItemStack(ShinseiItems.gold_axe_blade));
        for(Map.Entry<ItemStack, ItemStack> entry : toolRecipes.entrySet()){
            GameRegistry.addRecipe(new ShapelessOreRecipe(entry.getKey(), entry.getValue(), ShinseiItems.wood_tool_handle));
        }

    }
}
