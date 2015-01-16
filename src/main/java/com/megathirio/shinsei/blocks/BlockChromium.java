package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockChromium extends BlockShinsei {

    private static String name = BlockNames.blocks.CHROMIUM_BLOCK;
    private static Material material = Material.rock;
    public BlockChromium(){
        super(material, name);
        setHardness(8.5f);
        setResistance(13.8f);
        setHarvestLevel("pickaxe", 3);
    }
}
