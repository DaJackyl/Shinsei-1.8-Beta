package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;

public class OreSylvite extends OreShinsei{

    private static String name = BlockNames.ores.SYLVITE_ORE;
    private static Material material = Material.rock;
    public OreSylvite(){
        super(material, name);
    }
}
