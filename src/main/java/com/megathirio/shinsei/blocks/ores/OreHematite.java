package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreHematite extends OreShinsei{

    private static String name = BlockNames.ores.HEMATITE_ORE;
    private static Material material = Material.rock;
    public OreHematite(){
        super(material, name);
        setHardness(5.0f);
        setResistance(8.1f);
    }
}
