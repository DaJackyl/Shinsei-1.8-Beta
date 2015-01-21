package com.megathirio.shinsei.core.oredict;

import com.megathirio.shinsei.init.ShinseiBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ShinseiOreDict extends OreDictionary{

    public static void blocks(){
        registerOre("oreIron", ShinseiBlocks.hematite_ore);
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.diamond_block), "oreIron"));
    }

}
