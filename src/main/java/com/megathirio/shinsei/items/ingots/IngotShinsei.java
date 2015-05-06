package com.megathirio.shinsei.items.ingots;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.items.ItemShinsei;

public class IngotShinsei extends ItemShinsei{

    public IngotShinsei(String name) {
        super(name);
        setCreativeTab(ShinseiTabs.INGOTS_TAB);
    }
}
