package com.megathirio.shinsei.items.dusts;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.items.foods.FoodShinsei;
import com.megathirio.shinsei.reference.names.ItemNames;

public class DustArsenic extends FoodShinsei {
    private static String name = ItemNames.dusts.ARSENIC_DUST;
    private static int intHeal = 0;
    private static float fltSat = .0f;
    private static boolean boolWolf = false;
    public DustArsenic(){
        super(intHeal, fltSat, boolWolf, name);
        this.setPotionEffect(19, 360, 1, 80);
        this.setPotionEffect(17, 360, 1, 80);
        this.setCreativeTab(ShinseiTabs.DUSTS_TAB);
    }
}
