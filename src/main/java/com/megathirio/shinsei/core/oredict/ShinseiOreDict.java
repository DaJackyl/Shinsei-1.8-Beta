package com.megathirio.shinsei.core.oredict;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ShinseiOreDict extends OreDictionary{

    public static void blocks(){
        registerOre("oreIron", ShinseiBlocks.hematite_ore);
        //Blocks
        OreDictionary.registerOre("blockAluminum", ShinseiBlocks.aluminum_block);
        OreDictionary.registerOre("blockAntimony", ShinseiBlocks.antimony_block);
        OreDictionary.registerOre("blockBarium", ShinseiBlocks.barium_block);
        OreDictionary.registerOre("blockBismuth", ShinseiBlocks.bismuth_block);
        OreDictionary.registerOre("blockBrass", ShinseiBlocks.brass_block);
        OreDictionary.registerOre("blockBronze", ShinseiBlocks.bronze_block);
        OreDictionary.registerOre("blockChromium", ShinseiBlocks.chromium_block);
        OreDictionary.registerOre("blockCobalt", ShinseiBlocks.cobalt_block);
        OreDictionary.registerOre("blockCopper", ShinseiBlocks.copper_block);
        OreDictionary.registerOre("blockIndium", ShinseiBlocks.indium_block);
        OreDictionary.registerOre("blockIridium", ShinseiBlocks.iridium_block);
        OreDictionary.registerOre("blockLead", ShinseiBlocks.lead_block);
        OreDictionary.registerOre("blockMagnesium", ShinseiBlocks.magnesium_block);
        OreDictionary.registerOre("blockManganese", ShinseiBlocks.manganese_block);
        OreDictionary.registerOre("blockMolybdenum", ShinseiBlocks.molybdenum_block);
        OreDictionary.registerOre("blockNickel", ShinseiBlocks.nickel_block);
        OreDictionary.registerOre("blockPlatinum", ShinseiBlocks.platinum_block);
//        OreDictionary.registerOre("blockShinsei", ShinseiBlocks.shinsei_block);
        OreDictionary.registerOre("blockSilver", ShinseiBlocks.silver_block);
        OreDictionary.registerOre("blockStainlessSteel", ShinseiBlocks.stainless_steel_block);
        OreDictionary.registerOre("blockSteel", ShinseiBlocks.steel_block);
        OreDictionary.registerOre("blockTantalum", ShinseiBlocks.tantalum_block);
        OreDictionary.registerOre("blockTin", ShinseiBlocks.tin_block);
        OreDictionary.registerOre("blockTitanium", ShinseiBlocks.titanium_block);
        OreDictionary.registerOre("blockTungsten", ShinseiBlocks.tungsten_block);
        OreDictionary.registerOre("blockVanadium", ShinseiBlocks.vanadium_block);
        OreDictionary.registerOre("blockZinc", ShinseiBlocks.zinc_block);

    }

    public static void items(){
        //Ingots
        OreDictionary.registerOre("ingotAluminum", ShinseiItems.aluminum_ingot);
        OreDictionary.registerOre("ingotAntimony", ShinseiItems.antimony_ingot);
        OreDictionary.registerOre("ingotBarium", ShinseiItems.barium_ingot);
        OreDictionary.registerOre("ingotBismuth", ShinseiItems.bismuth_ingot);
        OreDictionary.registerOre("ingotBrass", ShinseiItems.brass_ingot);
        OreDictionary.registerOre("ingotBronze", ShinseiItems.bronze_ingot);
        OreDictionary.registerOre("ingotChromium", ShinseiItems.chromium_ingot);
        OreDictionary.registerOre("ingotCobalt", ShinseiItems.cobalt_ingot);
        OreDictionary.registerOre("ingotCopper", ShinseiItems.copper_ingot);
        OreDictionary.registerOre("ingotIndium", ShinseiItems.indium_ingot);
        OreDictionary.registerOre("ingotIridium", ShinseiItems.iridium_ingot);
        OreDictionary.registerOre("ingotLead", ShinseiItems.lead_ingot);
        OreDictionary.registerOre("ingotMagnesium", ShinseiItems.magnesium_ingot);
        OreDictionary.registerOre("ingotManganese", ShinseiItems.manganese_ingot);
        OreDictionary.registerOre("ingotMolybdenum", ShinseiItems.molybdenum_ingot);
        OreDictionary.registerOre("ingotNickel", ShinseiItems.nickel_ingot);
        OreDictionary.registerOre("ingotPlatinum", ShinseiItems.platinum_ingot);
//        OreDictionary.registerOre("ingotShinsei", ShinseiItems.shinsei_ingot);
        OreDictionary.registerOre("ingotSilver", ShinseiItems.silver_ingot);
        OreDictionary.registerOre("ingotStainlessSteel", ShinseiItems.stainless_steel_ingot);
        OreDictionary.registerOre("ingotSteel", ShinseiItems.steel_ingot);
        OreDictionary.registerOre("ingotTantalum", ShinseiItems.tantalum_ingot);
        OreDictionary.registerOre("ingotTin", ShinseiItems.tin_ingot);
        OreDictionary.registerOre("ingotTitanium", ShinseiItems.titanium_ingot);
        OreDictionary.registerOre("ingotTungsten", ShinseiItems.tungsten_ingot);
        OreDictionary.registerOre("ingotVanadium", ShinseiItems.vanadium_ingot);
        OreDictionary.registerOre("ingotZinc", ShinseiItems.zinc_ingot);

        //Nuggets
        OreDictionary.registerOre("nuggetAluminum", ShinseiItems.aluminum_nugget);
        OreDictionary.registerOre("nuggetAntimony", ShinseiItems.antimony_nugget);
        OreDictionary.registerOre("nuggetBarium", ShinseiItems.barium_nugget);
        OreDictionary.registerOre("nuggetBismuth", ShinseiItems.bismuth_nugget);
        OreDictionary.registerOre("nuggetBrass", ShinseiItems.brass_nugget);
        OreDictionary.registerOre("nuggetBronze", ShinseiItems.bronze_nugget);
        OreDictionary.registerOre("nuggetChromium", ShinseiItems.chromium_nugget);
        OreDictionary.registerOre("nuggetCobalt", ShinseiItems.cobalt_nugget);
        OreDictionary.registerOre("nuggetCopper", ShinseiItems.copper_nugget);
        OreDictionary.registerOre("nuggetIndium", ShinseiItems.indium_nugget);
        OreDictionary.registerOre("nuggetIridium", ShinseiItems.iridium_nugget);
        OreDictionary.registerOre("nuggetLead", ShinseiItems.lead_nugget);
        OreDictionary.registerOre("nuggetMagnesium", ShinseiItems.magnesium_nugget);
        OreDictionary.registerOre("nuggetManganese", ShinseiItems.manganese_nugget);
        OreDictionary.registerOre("nuggetMolybdenum", ShinseiItems.molybdenum_nugget);
        OreDictionary.registerOre("nuggetNickel", ShinseiItems.nickel_nugget);
        OreDictionary.registerOre("nuggetPlatinum", ShinseiItems.platinum_nugget);
//        OreDictionary.registerOre("nuggetShinsei", ShinseiItems.shinsei_nugget);
        OreDictionary.registerOre("nuggetSilver", ShinseiItems.silver_nugget);
        OreDictionary.registerOre("nuggetStainlessSteel", ShinseiItems.stainless_steel_nugget);
        OreDictionary.registerOre("nuggetSteel", ShinseiItems.steel_nugget);
        OreDictionary.registerOre("nuggetTantalum", ShinseiItems.tantalum_nugget);
        OreDictionary.registerOre("nuggetTin", ShinseiItems.tin_nugget);
        OreDictionary.registerOre("nuggetTitanium", ShinseiItems.titanium_nugget);
        OreDictionary.registerOre("nuggetTungsten", ShinseiItems.tungsten_nugget);
        OreDictionary.registerOre("nuggetVanadium", ShinseiItems.vanadium_nugget);
        OreDictionary.registerOre("nuggetZinc", ShinseiItems.zinc_nugget);

        //Dusts
        OreDictionary.registerOre("dustArsenic", ShinseiItems.arsenic_dust);
        OreDictionary.registerOre("dustSalt", ShinseiItems.salt);
        OreDictionary.registerOre("itemSalt", ShinseiItems.salt);

        //Foods
        OreDictionary.registerOre("foodBeef", Items.beef);
        OreDictionary.registerOre("foodPork", Items.porkchop);
    }
}
