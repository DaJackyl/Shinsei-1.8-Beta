package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreIlmenite extends OreShinsei{

    private static String name = BlockNames.ores.ILMENITE_ORE;
    private static Material material = Material.rock;
    public OreIlmenite(){
        super(material, name);
        setHardness(6.0f);
        setResistance(9.7f);
        setHarvestLevel("pickaxe", 2);
    }
}
