package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockZinc extends BlockShinsei {

    private static String name = BlockNames.blocks.ZINC_BLOCK;
    private static Material material = Material.rock;
    public BlockZinc(){
        super(material, name);
        setHardness(3.5f);
        setResistance(4.9f);
    }
}
