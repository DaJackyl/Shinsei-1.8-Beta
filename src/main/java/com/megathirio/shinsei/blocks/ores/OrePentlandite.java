package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OrePentlandite extends OreShinsei{

    private static String name = BlockNames.ores.PENTLANDITE_ORE;
    private static Material material = Material.rock;
    public OrePentlandite(){
        super(material, name);
        setHardness(4.0f);
        setResistance(6.5f);
    }
}
