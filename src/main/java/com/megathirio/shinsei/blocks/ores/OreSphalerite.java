package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreSphalerite extends OreShinsei{

    private static String name = BlockNames.ores.SPHALERITE_ORE;
    private static Material material = Material.rock;
    public OreSphalerite(){
        super(material, name);
        setHardness(3.5f);
        setResistance(4.9f);
    }
}
