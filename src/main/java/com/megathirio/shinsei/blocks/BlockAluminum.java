package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.blocks.BlockShinsei;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockAluminum extends BlockShinsei {

    private static String name = BlockNames.blocks.ALUMINUM_BLOCK;
    private static Material material = Material.rock;
    public BlockAluminum(){
        super(material, name);
    }
}
