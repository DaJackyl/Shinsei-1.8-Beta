package com.megathirio.shinsei.init;

import com.megathirio.shinsei.items.ItemShinsei;
import com.megathirio.shinsei.items.fuels.FuelCoke;
import com.megathirio.shinsei.items.fuels.FuelSplitWood;

public class ShinseiItems {

//Variable Intitializations
    //Fuels
        public static ItemShinsei split_wood = new FuelSplitWood();
        public static ItemShinsei coke = new FuelCoke();

//Registers renders for Items
    public static void registerRenders(){
    //Fuels
        FuelSplitWood.registerRender(split_wood);
        FuelCoke.registerRender(coke);
    }
}
