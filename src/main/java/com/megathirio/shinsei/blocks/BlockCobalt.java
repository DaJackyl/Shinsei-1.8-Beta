package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockCobalt extends BlockShinsei {

    private static String name = BlockNames.blocks.COBALT_BLOCK;
    private static Material material = Material.rock;
    public BlockCobalt(){
        super(material, name);
        setHardness(5.0f);
        setResistance(8.1f);
        setHarvestLevel("pickaxe", 2);
    }
}
