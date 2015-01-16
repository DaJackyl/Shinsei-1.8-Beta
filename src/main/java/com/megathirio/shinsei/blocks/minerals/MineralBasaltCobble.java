package com.megathirio.shinsei.blocks.minerals;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class MineralBasaltCobble extends MineralShinsei {

    private static String name = BlockNames.minerals.BASALT_COBBLE_BLOCK;
    private static Material material = Material.rock;
    public MineralBasaltCobble(){
        super(material, name);
        setHardness(6.0f);
        setResistance(9.7f);
        setHarvestLevel("pickaxe", 3);
    }
}
