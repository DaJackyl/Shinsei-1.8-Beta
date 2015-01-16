package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockSilver extends BlockShinsei {

    private static String name = BlockNames.blocks.SILVER_BLOCK;
    private static Material material = Material.rock;
    public BlockSilver(){
        super(material, name);
    }
}
