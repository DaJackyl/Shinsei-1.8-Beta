package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockOpal extends BlockShinsei {

    private static String name = BlockNames.blocks.OPAL_BLOCK;
    private static Material material = Material.rock;
    public BlockOpal(){
        super(material, name);
        setHardness(6.0f);
        setResistance(9.7f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(.5f);
    }
}
