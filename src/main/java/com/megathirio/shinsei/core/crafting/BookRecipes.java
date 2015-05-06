package com.megathirio.shinsei.core.crafting;

import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class BookRecipes {

    private static HashMap<Item, Item> toolBookRecipes = new HashMap<Item, Item>();

    public static void addToolBooks(){
        //Tool Recipes
        toolBookRecipes.put(ShinseiItems.wood_axe_blade, ShinseiItems.book_axe);
        toolBookRecipes.put(ShinseiItems.stone_axe_blade, ShinseiItems.book_axe);
        toolBookRecipes.put(Items.wooden_axe, ShinseiItems.book_axe);
        toolBookRecipes.put(Items.stone_axe, ShinseiItems.book_axe);
        toolBookRecipes.put(ShinseiItems.stone_chisel_blade, ShinseiItems.book_chisel);
        toolBookRecipes.put(ShinseiItems.stone_chisel, ShinseiItems.book_chisel);
        toolBookRecipes.put(ShinseiItems.wood_hoe_blade, ShinseiItems.book_hoe);
        toolBookRecipes.put(ShinseiItems.stone_hoe_blade, ShinseiItems.book_hoe);
        toolBookRecipes.put(Items.wooden_hoe, ShinseiItems.book_hoe);
        toolBookRecipes.put(Items.stone_hoe, ShinseiItems.book_hoe);
        toolBookRecipes.put(ShinseiItems.wood_pickaxe_blade, ShinseiItems.book_pickaxe);
        toolBookRecipes.put(ShinseiItems.stone_pickaxe_blade, ShinseiItems.book_pickaxe);
        toolBookRecipes.put(Items.wooden_pickaxe, ShinseiItems.book_pickaxe);
        toolBookRecipes.put(Items.stone_pickaxe, ShinseiItems.book_pickaxe);
        toolBookRecipes.put(ShinseiItems.wood_shovel_blade, ShinseiItems.book_shovel);
        toolBookRecipes.put(ShinseiItems.stone_shovel_blade, ShinseiItems.book_shovel);
        toolBookRecipes.put(Items.wooden_shovel, ShinseiItems.book_shovel);
        toolBookRecipes.put(Items.stone_shovel, ShinseiItems.book_shovel);
        toolBookRecipes.put(ShinseiItems.wood_sword_blade, ShinseiItems.book_sword);
        toolBookRecipes.put(ShinseiItems.stone_sword_blade, ShinseiItems.book_sword);
        toolBookRecipes.put(Items.wooden_sword, ShinseiItems.book_sword);
        toolBookRecipes.put(Items.stone_sword, ShinseiItems.book_sword);

        //Tool Recipe Pattern
        for(Map.Entry<Item, Item> entry : toolBookRecipes.entrySet()){
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(entry.getValue()), new ItemStack(entry.getKey(), 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.book, 1)));
        }
    }
}
