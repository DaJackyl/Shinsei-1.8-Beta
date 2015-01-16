package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockTantalum extends BlockShinsei {

    private static String name = BlockNames.blocks.TANTALUM_BLOCK;
    private static Material material = Material.rock;
    public BlockTantalum(){
        super(material, name);
        setHardness(6.5f);
        setResistance(10.5f);
        setHarvestLevel("pickaxe", 2);
    }
}
