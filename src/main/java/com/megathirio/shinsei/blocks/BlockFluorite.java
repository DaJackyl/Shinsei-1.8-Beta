package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockFluorite extends BlockShinsei {

    private static String name = BlockNames.blocks.FLUORITE_BLOCK;
    private static Material material = Material.rock;
    public BlockFluorite(){
        super(material, name);
        setHardness(4.0f);
        setResistance(6.5f);
        setLightLevel(.5f);
    }
}
