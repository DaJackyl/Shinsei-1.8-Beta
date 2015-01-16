package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockOnyx extends BlockShinsei {

    private static String name = BlockNames.blocks.ONYX_BLOCK;
    private static Material material = Material.rock;
    public BlockOnyx(){
        super(material, name);
        setHardness(6.0f);
        setResistance(9.7f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(.5f);
    }
}
