package com.megathirio.shinsei.init;

import com.megathirio.shinsei.blocks.BlockShinsei;
import com.megathirio.shinsei.blocks.ores.OreAcanthite;
import com.megathirio.shinsei.blocks.ores.OreAmethyst;
import com.megathirio.shinsei.blocks.ores.OreApatite;

public class ShinseiBlocks {

    //Variable Intitializations
    //Ores
    public static BlockShinsei acanthite_ore = new OreAcanthite();
    public static BlockShinsei amethyst_ore = new OreAmethyst();
    public static BlockShinsei apatite_ore = new OreApatite();

    //Registers renders for Blocks
    public static void registerRenders(){
        //Ores
        OreAcanthite.registerRender(acanthite_ore);
        OreAmethyst.registerRender(amethyst_ore);
        OreApatite.registerRender(apatite_ore);
    }

}
