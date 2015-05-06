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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FormRecipes {

    private static HashMap<Item[], String[]> ingotRecipes = new HashMap<Item[], String[]>();
    private static HashMap<Block, String> blockRecipes = new HashMap<Block, String>();

    public static void addIngots(){
        //Ingot Recipes
        ingotRecipes.put(new Item[]{ShinseiItems.barium_ingot, ShinseiItems.barium_nugget}, new String[]{"ingotBarium", "nuggetBarium"});
        ingotRecipes.put(new Item[]{ShinseiItems.chromium_ingot, ShinseiItems.chromium_nugget}, new String[]{"ingotChromium", "nuggetChromium"});
        ingotRecipes.put(new Item[]{ShinseiItems.cobalt_ingot, ShinseiItems.cobalt_nugget}, new String[]{"ingotCobalt", "nuggetCobalt"});
        ingotRecipes.put(new Item[]{ShinseiItems.indium_ingot, ShinseiItems.indium_nugget}, new String[]{"ingotIndium", "nuggetIndium"});
        ingotRecipes.put(new Item[]{ShinseiItems.iridium_ingot, ShinseiItems.iridium_nugget}, new String[]{"ingotIridium", "nuggetIridium"});
        ingotRecipes.put(new Item[]{ShinseiItems.nickel_ingot, ShinseiItems.nickel_nugget}, new String[]{"ingotNickel", "nuggetNickel"});
        ingotRecipes.put(new Item[]{ShinseiItems.platinum_ingot, ShinseiItems.platinum_nugget}, new String[]{"ingotPlatinum", "nuggetPlatinum"});
//        ingotRecipes.put(new Item[]{ShinseiItems.shinsei_ingot, ShinseiItems.shinsei_nugget}, new String[]{"ingotShinsei", "nuggetShinsei"});
        ingotRecipes.put(new Item[]{ShinseiItems.silver_ingot, ShinseiItems.silver_nugget}, new String[]{"ingotSilver", "nuggetSilver"});

        //Ingot Recipe Pattern
        for(Map.Entry<Item[], String[]> entry : ingotRecipes.entrySet()){
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(entry.getKey()[0], 1), "@@@","@@@","@@@", '@', entry.getValue()[1]));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(entry.getKey()[1], 9), entry.getValue()[0]));
        }
    }

    public static void addBlocks(){
        //Blocks Recipes
        blockRecipes.put(ShinseiBlocks.barium_block, "ingotBarium");

        //Block Recipe Pattern
        for(Map.Entry<Block, String> entry : blockRecipes.entrySet()){
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(entry.getKey(), 1), "@@@","@@@","@@@", '@', entry.getValue()));
        }
    }

}
