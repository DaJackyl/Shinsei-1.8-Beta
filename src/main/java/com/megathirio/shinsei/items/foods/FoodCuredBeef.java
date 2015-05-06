package com.megathirio.shinsei.items.foods;

import com.megathirio.shinsei.items.fuels.FuelShinsei;
import com.megathirio.shinsei.reference.names.ItemNames;
import net.minecraft.potion.Potion;

public class FoodCuredBeef extends FoodShinsei {
    private static String name = ItemNames.foods.CURED_BEEF;
    private static int intHeal = 4;
    private static float fltSat = .6f;
    private static boolean boolWolf = true;
    public FoodCuredBeef(){
        super(intHeal, fltSat, boolWolf, name);
        //Temp
        this.setPotionEffect(Potion.poison.id, 0, 2, 100);
        this.setAlwaysEdible();
    }
}
