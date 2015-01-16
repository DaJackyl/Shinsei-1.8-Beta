package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreCryolite extends OreShinsei{

    private static String name = BlockNames.ores.CRYOLITE_ORE;
    private static Material material = Material.rock;
    public OreCryolite(){
        super(material, name);
        setHardness(2.5F);
        setResistance(4.0f);
    }
}
