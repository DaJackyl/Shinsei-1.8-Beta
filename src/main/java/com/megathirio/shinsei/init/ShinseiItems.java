package com.megathirio.shinsei.init;

import com.megathirio.shinsei.items.ItemShinsei;
import com.megathirio.shinsei.items.fuels.FuelCoke;
import com.megathirio.shinsei.items.fuels.FuelSplitWood;
import com.megathirio.shinsei.items.gems.GemAmethyst;
import com.megathirio.shinsei.items.gems.GemApatite;

public class ShinseiItems {

//Variable Intitializations
    //Fuels
        public static ItemShinsei split_wood = new FuelSplitWood();
        public static ItemShinsei coke = new FuelCoke();
    //Gems
        public static ItemShinsei amethyst_gem = new GemAmethyst();
        public static ItemShinsei apatite_gem = new GemApatite();

//Registers renders for Items
    public static void registerRenders(){
    //Fuels
        FuelSplitWood.registerRender(split_wood);
        FuelCoke.registerRender(coke);
    //Gems
        GemAmethyst.registerRender(amethyst_gem);
        GemApatite.registerRender(apatite_gem);
    }
}
