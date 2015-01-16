package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockApatite extends BlockShinsei {

    private static String name = BlockNames.blocks.APATITE_BLOCK;
    private static Material material = Material.rock;
    public BlockApatite(){
        super(material, name);
        setHardness(5.0f);
        setResistance(10f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(.5f);
    }
}
