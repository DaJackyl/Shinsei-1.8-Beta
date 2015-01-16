package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockAmethyst extends BlockShinsei {

    private static String name = BlockNames.blocks.AMETHYST_BLOCK;
    private static Material material = Material.rock;
    public BlockAmethyst(){
        super(material, name);
        setHardness(7.0f);
        setResistance(11.3f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(.5f);
    }
}
