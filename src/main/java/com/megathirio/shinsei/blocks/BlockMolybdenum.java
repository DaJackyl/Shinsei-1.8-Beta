package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockMolybdenum extends BlockShinsei {

    private static String name = BlockNames.blocks.MOLYBDENUM_BLOCK;
    private static Material material = Material.rock;
    public BlockMolybdenum(){
        super(material, name);
        setHardness(1.5f);
        setResistance(2.4f);
        setHarvestLevel("pickaxe", 0);
    }
}
