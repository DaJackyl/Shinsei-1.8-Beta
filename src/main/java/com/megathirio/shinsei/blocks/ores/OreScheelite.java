package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreScheelite extends OreShinsei{

    private static String name = BlockNames.ores.SCHEELITE_ORE;
    private static Material material = Material.rock;
    public OreScheelite(){
        super(material, name);
        setHardness(5.0f);
        setResistance(8.1f);
        setHarvestLevel("pickaxe", 2);
    }
}
