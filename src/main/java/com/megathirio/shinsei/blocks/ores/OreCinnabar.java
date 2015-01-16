package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreCinnabar extends OreShinsei{

    private static String name = BlockNames.ores.CINNABAR_ORE;
    private static Material material = Material.rock;
    public OreCinnabar(){
        super(material, name);
    }
}
