package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreBismuth extends OreShinsei{

    private static String name = BlockNames.ores.BISMUTH_ORE;
    private static Material material = Material.rock;
    public OreBismuth(){
        super(material, name);
        setHardness(2.25f);
        setResistance(3.6f);
    }
}
