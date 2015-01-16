package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreChromite extends OreShinsei{

    private static String name = BlockNames.ores.CHROMITE_ORE;
    private static Material material = Material.rock;
    public OreChromite(){
        super(material, name);
        setHardness(8.5f);
        setResistance(13.8f);
        setHarvestLevel("pickaxe", 3);
    }
}
