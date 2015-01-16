package com.megathirio.shinsei.blocks.minerals;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class MineralLimestone extends MineralShinsei {

    private static String name = BlockNames.minerals.LIMESTONE_BLOCK;
    private static Material material = Material.rock;
    public MineralLimestone(){
        super(material, name);
    }
}
