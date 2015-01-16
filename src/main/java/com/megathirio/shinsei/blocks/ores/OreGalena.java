package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreGalena extends OreShinsei{

    private static String name = BlockNames.ores.GALENA_ORE;
    private static Material material = Material.rock;
    public OreGalena(){
        super(material, name);
        setHardness(2.5F);
        setResistance(6.5f);
    }
}
