package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockAntimony extends BlockShinsei {

    private static String name = BlockNames.blocks.ANTIMONY_BLOCK;
    private static Material material = Material.rock;
    public BlockAntimony(){
        super(material, name);
    }
}
