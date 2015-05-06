package com.megathirio.shinsei.items.foods;

import com.megathirio.shinsei.reference.names.ItemNames;
import net.minecraft.potion.Potion;

public class FoodCuredPork extends FoodShinsei {
    private static String name = ItemNames.foods.CURED_PORK;
    private static int intHeal = 4;
    private static float fltSat = .6f;
    private static boolean boolWolf = true;
    public FoodCuredPork(){
        super(intHeal, fltSat, boolWolf, name);
        //Temp
        this.setPotionEffect(Potion.poison.id, 0, 2, 100);
        this.setAlwaysEdible();
    }
}
