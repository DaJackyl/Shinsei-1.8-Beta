package com.megathirio.shinsei.items.foods;

import com.megathirio.shinsei.reference.names.ItemNames;
import net.minecraft.potion.Potion;

public class FoodPoisonedBread extends FoodShinsei {
    private static String name = ItemNames.foods.POISONED_BREAD;
    private static int intHeal = 0;
    private static float fltSat = .0f;
    private static boolean boolWolf = false;
    public FoodPoisonedBread(){
        super(intHeal, fltSat, boolWolf, name);
        this.setPotionEffect(Potion.poison.id, 180, 1, 80);
        this.setAlwaysEdible();
    }
}
