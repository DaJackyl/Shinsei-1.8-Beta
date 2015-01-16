package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockLead extends BlockShinsei {

    private static String name = BlockNames.blocks.LEAD_BLOCK;
    private static Material material = Material.rock;
    public BlockLead(){
        super(material, name);
        setHardness(2.5F);
        setResistance(4.0f);
    }
}
