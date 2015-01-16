package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreStibnite extends OreShinsei{

    private static String name = BlockNames.ores.STIBNITE_ORE;
    private static Material material = Material.rock;
    public OreStibnite(){
        super(material, name);
    }
}
