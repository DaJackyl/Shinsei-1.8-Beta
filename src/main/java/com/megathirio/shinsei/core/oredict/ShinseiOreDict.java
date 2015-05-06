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
    }

    public static void items(){
        //Ingots
        OreDictionary.registerOre("ingotBarium", ShinseiItems.barium_ingot);
        OreDictionary.registerOre("ingotChromium", ShinseiItems.chromium_ingot);
        OreDictionary.registerOre("ingotCobalt", ShinseiItems.cobalt_ingot);
        OreDictionary.registerOre("ingotIndium", ShinseiItems.indium_ingot);
        OreDictionary.registerOre("ingotIridium", ShinseiItems.iridium_ingot);
        OreDictionary.registerOre("ingotNickel", ShinseiItems.nickel_ingot);
        OreDictionary.registerOre("ingotPlatinum", ShinseiItems.platinum_ingot);
//        OreDictionary.registerOre("ingotShinsei", ShinseiItems.shinsei_ingot);
        OreDictionary.registerOre("ingotSilver", ShinseiItems.silver_ingot);

        //Nuggets
        OreDictionary.registerOre("nuggetBarium", ShinseiItems.barium_nugget);
        OreDictionary.registerOre("nuggetChromium", ShinseiItems.chromium_nugget);
        OreDictionary.registerOre("nuggetCobalt", ShinseiItems.cobalt_nugget);
        OreDictionary.registerOre("nuggetIndium", ShinseiItems.indium_nugget);
        OreDictionary.registerOre("nuggetIridium", ShinseiItems.iridium_nugget);
        OreDictionary.registerOre("nuggetNickel", ShinseiItems.nickel_nugget);
        OreDictionary.registerOre("nuggetPlatinum", ShinseiItems.platinum_nugget);
//        OreDictionary.registerOre("nuggetShinsei", ShinseiItems.shinsei_nugget);
        OreDictionary.registerOre("nuggetSilver", ShinseiItems.silver_nugget);

        //Dusts
        OreDictionary.registerOre("dustArsenic", ShinseiItems.arsenic_dust);
        OreDictionary.registerOre("dustSalt", ShinseiItems.salt);
        OreDictionary.registerOre("itemSalt", ShinseiItems.salt);

        //Foods
        OreDictionary.registerOre("foodBeef", Items.beef);
        OreDictionary.registerOre("foodPork", Items.porkchop);
    }
}
