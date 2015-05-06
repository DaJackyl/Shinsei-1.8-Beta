package com.megathirio.shinsei.core.crafting;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class FoodRecipes {

    private static HashMap<Item[], String> foodRecipes = new HashMap<Item[], String>();

    public static void addFoods(){
        //Food Recipes
        foodRecipes.put(new Item[]{ShinseiItems.cured_beef, Items.beef}, "dustSalt");
        foodRecipes.put(new Item[]{ShinseiItems.cured_pork, Items.porkchop}, "dustSalt");

        //Food Recipe Pattern
        for (Map.Entry<Item[], String> entry : foodRecipes.entrySet()) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(entry.getKey()[0], 1), entry.getValue(), new ItemStack(entry.getKey()[1], 1)));
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(entry.getKey()[0], 1), "@ "," #","##", '@', entry.getValue(), '#', "dustSalt"));
        }
    }
}
