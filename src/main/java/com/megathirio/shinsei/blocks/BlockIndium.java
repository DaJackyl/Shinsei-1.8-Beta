package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockIndium extends BlockShinsei {

    private static String name = BlockNames.blocks.INDIUM_BLOCK;
    private static Material material = Material.rock;
    public BlockIndium(){
        super(material, name);
        setHardness(1.5F);
        setResistance(2.4f);
        setHarvestLevel("pickaxe", 0);
    }
}
