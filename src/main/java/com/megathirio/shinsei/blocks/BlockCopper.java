package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockCopper extends BlockShinsei {

    private static String name = BlockNames.blocks.COPPER_BLOCK;
    private static Material material = Material.rock;
    public BlockCopper(){
        super(material, name);
        setHardness(3.5f);
        setResistance(5.7f);
    }
}
