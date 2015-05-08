package com.megathirio.shinsei.core.crafting;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class FormRecipes {

    private static HashMap<Item[], String[]> binRecipes = new HashMap<Item[], String[]>();

    public static void addIngots(){
        //BIN(Block, Ingot, Nugget) Recipes
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.aluminum_block), ShinseiItems.aluminum_ingot, ShinseiItems.aluminum_nugget}, new String[]{"blockAluminum", "ingotAluminum", "nuggetAluminum"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.antimony_block), ShinseiItems.antimony_ingot, ShinseiItems.antimony_nugget}, new String[]{"blockAntimony", "ingotAntimony", "nuggetAntimony"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.barium_block), ShinseiItems.barium_ingot, ShinseiItems.barium_nugget}, new String[]{"blockBarium", "ingotBarium", "nuggetBarium"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.bismuth_block), ShinseiItems.bismuth_ingot, ShinseiItems.bismuth_nugget}, new String[]{"blockBismuth", "ingotBismuth", "nuggetBismuth"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.brass_block), ShinseiItems.brass_ingot, ShinseiItems.brass_nugget}, new String[]{"blockBrass", "ingotBrass", "nuggetBrass"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.bronze_block), ShinseiItems.bronze_ingot, ShinseiItems.bronze_nugget}, new String[]{"blockBronze", "ingotBronze", "nuggetBronze"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.chromium_block), ShinseiItems.chromium_ingot, ShinseiItems.chromium_nugget}, new String[]{"blockChromium", "ingotChromium", "nuggetChromium"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.cobalt_block), ShinseiItems.cobalt_ingot, ShinseiItems.cobalt_nugget}, new String[]{"blockCobalt", "ingotCobalt", "nuggetCobalt"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.copper_block), ShinseiItems.copper_ingot, ShinseiItems.copper_nugget}, new String[]{"blockCopper", "ingotCopper", "nuggetCopper"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.indium_block), ShinseiItems.indium_ingot, ShinseiItems.indium_nugget}, new String[]{"blockIndium", "ingotIndium", "nuggetIndium"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.iridium_block), ShinseiItems.iridium_ingot, ShinseiItems.iridium_nugget}, new String[]{"blockIridium", "ingotIridium", "nuggetIridium"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.lead_block), ShinseiItems.lead_ingot, ShinseiItems.lead_nugget}, new String[]{"blockLead", "ingotLead", "nuggetLead"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.magnesium_block), ShinseiItems.magnesium_ingot, ShinseiItems.magnesium_nugget}, new String[]{"blockMagnesium", "ingotMagnesium", "nuggetMagnesium"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.manganese_block), ShinseiItems.manganese_ingot, ShinseiItems.manganese_nugget}, new String[]{"blockManganese", "ingotManganese", "nuggetManganese"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.molybdenum_block), ShinseiItems.molybdenum_ingot, ShinseiItems.molybdenum_nugget}, new String[]{"blockMolybdenum", "ingotMolybdenum", "nuggetMolybdenum"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.nickel_block), ShinseiItems.nickel_ingot, ShinseiItems.nickel_nugget}, new String[]{"blockNickel", "ingotNickel", "nuggetNickel"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.platinum_block), ShinseiItems.platinum_ingot, ShinseiItems.platinum_nugget}, new String[]{"blockPlatinum", "ingotPlatinum", "nuggetPlatinum"});
//        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.shinsei_block), ShinseiItems.shinsei_ingot, ShinseiItems.shinsei_nugget}, new String[]{"blockShinsei", "ingotShinsei", "nuggetShinsei"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.silver_block), ShinseiItems.silver_ingot, ShinseiItems.silver_nugget}, new String[]{"blockSilver", "ingotSilver", "nuggetSilver"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.stainless_steel_block), ShinseiItems.stainless_steel_ingot, ShinseiItems.stainless_steel_nugget}, new String[]{"blockStainlessSteel", "ingotStainlessSteel", "nuggetStainlessSteel"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.steel_block), ShinseiItems.steel_ingot, ShinseiItems.steel_nugget}, new String[]{"blockSteel", "ingotSteel", "nuggetSteel"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.tantalum_block), ShinseiItems.tantalum_ingot, ShinseiItems.tantalum_nugget}, new String[]{"blockTantalum", "ingotTantalum", "nuggetTantalum"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.tin_block), ShinseiItems.tin_ingot, ShinseiItems.tin_nugget}, new String[]{"blockTin", "ingotTin", "nuggetTin"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.titanium_block), ShinseiItems.titanium_ingot, ShinseiItems.titanium_nugget}, new String[]{"blockTitanium", "ingotTitanium", "nuggetTitanium"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.tungsten_block), ShinseiItems.tungsten_ingot, ShinseiItems.tungsten_nugget}, new String[]{"blockTungsten", "ingotTungsten", "nuggetTungsten"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.vanadium_block), ShinseiItems.vanadium_ingot, ShinseiItems.vanadium_nugget}, new String[]{"blockVanadium", "ingotVanadium", "nuggetVanadium"});
        binRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.zinc_block), ShinseiItems.zinc_ingot, ShinseiItems.zinc_nugget}, new String[]{"blockZinc", "ingotZinc", "nuggetZinc"});

        //BIN Recipe Pattern
        for(Map.Entry<Item[], String[]> entry : binRecipes.entrySet()){
            for(int a=0;a<2;a++){
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(entry.getKey()[a], 1), "@@@","@@@","@@@", '@', entry.getValue()[a+1]));
                    GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(entry.getKey()[a+1], 9), entry.getKey()[a]));
                }

            }
        }
}
