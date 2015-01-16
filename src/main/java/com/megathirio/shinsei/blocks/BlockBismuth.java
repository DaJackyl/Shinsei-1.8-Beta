package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockBismuth extends BlockShinsei {

    private static String name = BlockNames.blocks.BISMUTH_BLOCK;
    private static Material material = Material.rock;
    public BlockBismuth(){
        super(material, name);
        setHardness(2.25f);
        setResistance(3.6f);
    }
}
