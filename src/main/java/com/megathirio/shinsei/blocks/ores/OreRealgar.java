package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreRealgar extends OreShinsei{

    private static String name = BlockNames.ores.REALGAR_ORE;
    private static Material material = Material.rock;
    public OreRealgar(){
        super(material, name);
    }
}
