package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreUraninite extends OreShinsei{

    private static String name = BlockNames.ores.URANINITE_ORE;
    private static Material material = Material.rock;
    public OreUraninite(){
        super(material, name);
    }
}
