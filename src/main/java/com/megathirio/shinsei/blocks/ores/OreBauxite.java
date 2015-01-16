package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreBauxite extends OreShinsei{

    private static String name = BlockNames.ores.BAUXITE_ORE;
    private static Material material = Material.rock;
    public OreBauxite(){
        super(material, name);
    }
}
