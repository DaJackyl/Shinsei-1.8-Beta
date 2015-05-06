package com.megathirio.shinsei.items.foods;

import com.megathirio.shinsei.reference.names.ItemNames;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class FoodPoisonedBeef extends FoodShinsei {
    private static String name = ItemNames.foods.POISONED_BEEF;
    private static int intHeal = 0;
    private static float fltSat = .0f;
    private static boolean boolWolf = false;
    public FoodPoisonedBeef(){
        super(intHeal, fltSat, boolWolf, name);
        this.setPotionEffect(Potion.poison.id, 180, 1, 80);
        this.setAlwaysEdible();
    }
}
