package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockSteel extends BlockShinsei {

    private static String name = BlockNames.blocks.STEEL_BLOCK;
    private static Material material = Material.rock;
    public BlockSteel(){
        super(material, name);
        setHardness(4.5f);
        setResistance(7.3f);
        setHarvestLevel("pickaxe", 2);
    }
}
