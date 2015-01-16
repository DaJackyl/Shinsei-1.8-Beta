package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockSapphire extends BlockShinsei {

    private static String name = BlockNames.blocks.SAPPHIRE_BLOCK;
    private static Material material = Material.rock;
    public BlockSapphire(){
        super(material, name);
        setHardness(9f);
        setResistance(14.6f);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(.5f);
    }
}
