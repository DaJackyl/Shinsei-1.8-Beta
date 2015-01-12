package com.megathirio.shinsei.items.gems;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.items.ItemShinsei;

public class GemShinsei extends ItemShinsei{

    public GemShinsei(String name) {
        super(name);
        setCreativeTab(ShinseiTabs.GEMS_TAB);
    }
}
