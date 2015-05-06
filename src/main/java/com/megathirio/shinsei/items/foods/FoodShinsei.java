package com.megathirio.shinsei.items.foods;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.items.ItemShinsei;

public class FoodShinsei extends ItemShinsei{

    public FoodShinsei(String name) {
        super(name);
        setCreativeTab(ShinseiTabs.ITEMS_TAB);
    }
}
