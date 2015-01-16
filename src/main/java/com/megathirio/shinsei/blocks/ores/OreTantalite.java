package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreTantalite extends OreShinsei{

    private static String name = BlockNames.ores.TANTALITE_ORE;
    private static Material material = Material.rock;
    public OreTantalite(){
        super(material, name);
        setHardness(6.5f);
        setResistance(10.5f);
        setHarvestLevel("pickaxe", 2);
    }
}
