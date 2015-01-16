package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockBarium extends BlockShinsei {

    private static String name = BlockNames.blocks.BARIUM_BLOCK;
    private static Material material = Material.rock;
    public BlockBarium(){
        super(material, name);
        setHardness(3.5f);
        setResistance(5.7f);
    }
}
