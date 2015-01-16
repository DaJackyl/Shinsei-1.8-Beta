package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockPlatinum extends BlockShinsei {

    private static String name = BlockNames.blocks.PLATINUM_BLOCK;
    private static Material material = Material.rock;
    public BlockPlatinum(){
        super(material, name);
        setHardness(6.0f);
        setResistance(9.7f);
        setHarvestLevel("pickaxe", 2);
    }
}
