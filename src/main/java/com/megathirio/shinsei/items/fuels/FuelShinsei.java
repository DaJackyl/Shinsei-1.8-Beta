package com.megathirio.shinsei.items.fuels;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.items.ItemShinsei;
import net.minecraft.creativetab.CreativeTabs;

public class FuelShinsei extends ItemShinsei{

    public FuelShinsei(String name) {
        super(name);
        setCreativeTab(ShinseiTabs.FUELS_TAB);
    }
}
