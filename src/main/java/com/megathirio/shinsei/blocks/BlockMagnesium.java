package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockMagnesium extends BlockShinsei {

    private static String name = BlockNames.blocks.MAGNESIUM_BLOCK;
    private static Material material = Material.rock;
    public BlockMagnesium(){
        super(material, name);
        setHardness(3.5f);
        setResistance(5.7f);
    }
}
