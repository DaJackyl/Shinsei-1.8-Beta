package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreBornite extends OreShinsei{

    private static String name = BlockNames.ores.BORNITE_ORE;
    private static Material material = Material.rock;
    public OreBornite(){
        super(material, name);
        setHardness(3.0f);
        setResistance(4.9f);
    }
}
