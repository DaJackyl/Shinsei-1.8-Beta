package com.megathirio.shinsei.core.crafting;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.items.tools.parts.ToolIronAxeBlade;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class ToolRecipes {

    private static HashMap<Item[], String> bladeRecipes = new HashMap<Item[], String>();
    private static HashMap<Item[], Item> toolRecipes = new HashMap<Item[], Item>();

    public static void addParts() {
        //Handle Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_tool_handle, 1), "@","@", '@', "stickWood"));

        //Vanilla Basic Tool Part Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_axe_blade, 1), "@@ ","@  ","   ", '@', "cobblestone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_axe_blade, 1), "@@ ","@  ","   ", '@', "stone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_chisel_blade, 1), "@@ ","  @","   ", '@', "cobblestone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_chisel_blade, 1), "@@ ","  @","   ", '@', "stone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_hoe_blade, 1), " @ ","@  ","   ", '@', "cobblestone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_hoe_blade, 1), " @ ","@  ","   ", '@', "stone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_pickaxe_blade, 1), " @ ","@ @","   ", '@', "cobblestone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_pickaxe_blade, 1), " @ ", "@ @", "   ", '@', "stone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_shovel_blade, 1), " @ ","   ","   ", '@', "cobblestone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_shovel_blade, 1), " @ ","   ","   ", '@', "stone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_sword_blade, 1), " @ "," @ "," @ ", '@', "cobblestone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_sword_blade, 1), " @ "," @ "," @ ", '@', "stone"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_axe_blade, 1), "@@ ","@  ","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_hoe_blade, 1), " @ ","@  ","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_pickaxe_blade, 1), " @ ","@ @","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_shovel_blade, 1), " @ ","   ","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_sword_blade, 1), " @ "," @ "," @ ", '@', "plankWood"));


        //Vanilla Metal Tool Part Recipes
        bladeRecipes.put(new Item[]{ShinseiItems.gold_axe_blade, ShinseiItems.iron_hammer, ShinseiItems.book_axe}, "ingotGold");
        bladeRecipes.put(new Item[]{ShinseiItems.gold_hoe_blade, ShinseiItems.iron_hammer, ShinseiItems.book_hoe}, "ingotGold");
        bladeRecipes.put(new Item[]{ShinseiItems.gold_pickaxe_blade, ShinseiItems.iron_hammer, ShinseiItems.book_pickaxe}, "ingotGold");
        bladeRecipes.put(new Item[]{ShinseiItems.gold_shovel_blade, ShinseiItems.iron_hammer, ShinseiItems.book_shovel}, "ingotGold");
        bladeRecipes.put(new Item[]{ShinseiItems.gold_sword_blade, ShinseiItems.iron_hammer, ShinseiItems.book_sword}, "ingotGold");

        bladeRecipes.put(new Item[]{ShinseiItems.iron_axe_blade, ShinseiItems.iron_hammer, ShinseiItems.book_axe}, "ingotIron");
        bladeRecipes.put(new Item[]{ShinseiItems.iron_chisel_blade, ShinseiItems.iron_hammer, ShinseiItems.book_chisel}, "ingotIron");
        bladeRecipes.put(new Item[]{ShinseiItems.iron_hoe_blade, ShinseiItems.iron_hammer, ShinseiItems.book_hoe}, "ingotIron");
        bladeRecipes.put(new Item[]{ShinseiItems.iron_pickaxe_blade, ShinseiItems.iron_hammer, ShinseiItems.book_pickaxe}, "ingotIron");
        bladeRecipes.put(new Item[]{ShinseiItems.iron_shovel_blade, ShinseiItems.iron_hammer, ShinseiItems.book_shovel}, "ingotIron");
        bladeRecipes.put(new Item[]{ShinseiItems.iron_sword_blade, ShinseiItems.iron_hammer, ShinseiItems.book_sword}, "ingotIron");

        //Vanilla Metal Tool Part Recipe Pattern
        for (Map.Entry<Item[], String> entry : bladeRecipes.entrySet()) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(entry.getKey()[0], 1), entry.getValue(), new ItemStack(entry.getKey()[1], 1, OreDictionary.WILDCARD_VALUE), new ItemStack(entry.getKey()[2], 1, OreDictionary.WILDCARD_VALUE)));
        }

    }

    public static void addTools(){
        //Tool Recipes
        toolRecipes.put(new Item[]{Items.golden_axe, ShinseiItems.gold_axe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.golden_hoe, ShinseiItems.gold_hoe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.golden_pickaxe, ShinseiItems.gold_pickaxe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.golden_shovel, ShinseiItems.gold_shovel_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.golden_sword, ShinseiItems.gold_sword_blade}, ShinseiItems.wood_tool_handle);

        toolRecipes.put(new Item[]{Items.iron_axe, ShinseiItems.iron_axe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{ShinseiItems.iron_chisel, ShinseiItems.iron_chisel_blade}, ShinseiItems.wood_tool_handle);
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.iron_hammer, 1), new ItemStack(ShinseiItems.wood_tool_handle), "ingotIron"));
        toolRecipes.put(new Item[]{Items.iron_hoe, ShinseiItems.iron_hoe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.iron_pickaxe, ShinseiItems.iron_pickaxe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.iron_shovel, ShinseiItems.iron_shovel_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.iron_sword, ShinseiItems.iron_sword_blade}, ShinseiItems.wood_tool_handle);

        toolRecipes.put(new Item[]{Items.stone_axe, ShinseiItems.stone_axe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{ShinseiItems.stone_chisel, ShinseiItems.stone_chisel_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.stone_hoe, ShinseiItems.stone_hoe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.stone_pickaxe, ShinseiItems.stone_pickaxe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.stone_shovel, ShinseiItems.stone_shovel_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.stone_sword, ShinseiItems.stone_sword_blade}, ShinseiItems.wood_tool_handle);

        toolRecipes.put(new Item[]{Items.wooden_axe, ShinseiItems.wood_axe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.wooden_hoe, ShinseiItems.wood_hoe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.wooden_pickaxe, ShinseiItems.wood_pickaxe_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.wooden_shovel, ShinseiItems.wood_shovel_blade}, ShinseiItems.wood_tool_handle);
        toolRecipes.put(new Item[]{Items.wooden_sword, ShinseiItems.wood_sword_blade}, ShinseiItems.wood_tool_handle);

        //Tool Recipe Pattern
        for(Map.Entry<Item[], Item> entry : toolRecipes.entrySet()){
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(entry.getKey()[0], 1), new ItemStack(entry.getValue(), 1), new ItemStack(entry.getKey()[1],1)));
        }

    }
}
