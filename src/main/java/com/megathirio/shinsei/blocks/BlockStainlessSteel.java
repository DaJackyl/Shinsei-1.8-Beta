package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockStainlessSteel extends BlockShinsei {

    private static String name = BlockNames.blocks.STAINLESS_STEEL_BLOCK;
    private static Material material = Material.rock;
    public BlockStainlessSteel(){
        super(material, name);
        setHardness(4.5f);
        setResistance(7.3f);
        setHarvestLevel("pickaxe", 2);
    }
}
