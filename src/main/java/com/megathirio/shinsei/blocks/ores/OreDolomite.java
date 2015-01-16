package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreDolomite extends OreShinsei{

    private static String name = BlockNames.ores.DOLOMITE_ORE;
    private static Material material = Material.rock;
    public OreDolomite(){
        super(material, name);
        setHardness(3.5f);
        setResistance(5.7f);
    }
}
