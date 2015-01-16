package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreMolybdenite extends OreShinsei{

    private static String name = BlockNames.ores.MOLYBDENITE_ORE;
    private static Material material = Material.rock;
    public OreMolybdenite(){
        super(material, name);
        setHardness(1.5f);
        setResistance(2.4f);
        setHarvestLevel("pickaxe", 0);
    }
}
