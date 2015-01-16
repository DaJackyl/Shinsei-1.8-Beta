package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockBrass extends BlockShinsei {

    private static String name = BlockNames.blocks.BRASS_BLOCK;
    private static Material material = Material.rock;
    public BlockBrass(){
        super(material, name);
        setHardness(4.0f);
        setResistance(6.5f);
    }
}
