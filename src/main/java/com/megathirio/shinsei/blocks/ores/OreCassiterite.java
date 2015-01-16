package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreCassiterite extends OreShinsei{

    private static String name = BlockNames.ores.CASSITERITE_ORE;
    private static Material material = Material.rock;
    public OreCassiterite(){
        super(material, name);
        setHardness(7.0f);
        setResistance(11.3f);
        setHarvestLevel("pickaxe", 2);
    }
}
