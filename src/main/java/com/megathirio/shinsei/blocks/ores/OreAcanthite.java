package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreAcanthite extends OreShinsei{

    private static String name = BlockNames.ores.ACANTHITE_ORE;
    private static Material material = Material.rock;
    public OreAcanthite(){
        super(material, name);
    }
}
