package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreRutile extends OreShinsei{

    private static String name = BlockNames.ores.RUTILE_ORE;
    private static Material material = Material.rock;
    public OreRutile(){
        super(material, name);
        setHardness(6.0f);
        setResistance(9.7f);
        setHarvestLevel("pickaxe", 2);
    }
}
