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
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_apple, Items.apple}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_beef, Items.cooked_beef}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_bread, Items.bread}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_carrot, Items.carrot}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_chicken, Items.cooked_chicken}, "dustArsenic");
//        foodRecipes.put(new Item[]{ShinseiItems.poisoned_cod, Items.cooked_fish}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_cookie, Items.cookie}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_melon, Items.melon}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_milk, Items.milk_bucket}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_pie, Items.pumpkin_pie}, "dustArsenic");
        foodRecipes.put(new Item[]{ShinseiItems.poisoned_pork, Items.cooked_porkchop}, "dustArsenic");
//        foodRecipes.put(new Item[]{ShinseiItems.poisoned_salmon, Items.cooked_fish}, "dustArsenic");

        //Food Recipe Pattern
        for (Map.Entry<Item[], String> entry : foodRecipes.entrySet()) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(entry.getKey()[0], 1), entry.getValue(), new ItemStack(entry.getKey()[1], 1)));
//            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(entry.getKey()[0], 1), "@ "," #","##", '@', entry.getValue(), '#', "dustSalt"));
        }
    }
}
