package com.megathirio.shinsei.items.foods;

import com.megathirio.shinsei.reference.names.ItemNames;
import net.minecraft.potion.Potion;

public class FoodPoisonedCarrot extends FoodShinsei {
    private static String name = ItemNames.foods.POISONED_CARROT;
    private static int intHeal = 0;
    private static float fltSat = .0f;
    private static boolean boolWolf = false;
    public FoodPoisonedCarrot(){
        super(intHeal, fltSat, boolWolf, name);
        this.setPotionEffect(Potion.poison.id, 180, 1, 80);
        this.setAlwaysEdible();
    }
}
