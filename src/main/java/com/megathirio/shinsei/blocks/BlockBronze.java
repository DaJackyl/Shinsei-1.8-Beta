package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockBronze extends BlockShinsei {

    private static String name = BlockNames.blocks.BRONZE_BLOCK;
    private static Material material = Material.rock;
    public BlockBronze(){
        super(material, name);
    }
}
