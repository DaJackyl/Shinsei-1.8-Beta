package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockTopaz extends BlockShinsei {

    private static String name = BlockNames.blocks.TOPAZ_BLOCK;
    private static Material material = Material.rock;
    public BlockTopaz(){
        super(material, name);
        setHardness(8f);
        setResistance(12.9f);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(.5f);
    }
}
