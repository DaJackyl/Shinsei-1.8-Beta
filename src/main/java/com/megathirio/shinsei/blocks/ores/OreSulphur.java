package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreSulphur extends OreShinsei{

    private static String name = BlockNames.ores.SULFUR_ORE;
    private static Material material = Material.rock;
    public OreSulphur(){
        super(material, name);
    }
}
