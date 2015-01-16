package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class BlockScarletEmerald extends BlockShinsei {

    private static String name = BlockNames.blocks.SCARLET_EMERALD_BLOCK;
    private static Material material = Material.rock;
    public BlockScarletEmerald(){
        super(material, name);
        setHardness(7.5f);
        setResistance(12.1f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(.5f);
    }
}
