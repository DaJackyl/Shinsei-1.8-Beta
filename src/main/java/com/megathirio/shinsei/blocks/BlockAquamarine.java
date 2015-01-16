package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockAquamarine extends BlockShinsei {

    private static String name = BlockNames.blocks.AQUAMARINE_BLOCK;
    private static Material material = Material.rock;
    public BlockAquamarine(){
        super(material, name);
        setHardness(7.5f);
        setResistance(12.1f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(.5f);
    }
}
