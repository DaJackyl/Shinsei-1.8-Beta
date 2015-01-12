package com.megathirio.shinsei.init;

import com.megathirio.shinsei.reference.names.TabNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShinseiTabs {
    public static final CreativeTabs ORES_TAB = new CreativeTabs(TabNames.tabs.ORES_TAB) {
        @Override
        public Item getTabIconItem() { return Item.getItemFromBlock(ShinseiBlocks.acanthite_ore); }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs(TabNames.tabs.BLOCKS_TAB) {
        @Override
        public Item getTabIconItem() { return Item.getItemFromBlock(ShinseiBlocks.acanthite_ore); }
    };

    public static final CreativeTabs FUELS_TAB = new CreativeTabs(TabNames.tabs.FUELS_TAB) {
        @Override
        public Item getTabIconItem() { return ShinseiItems.split_wood; }
    };

    public static final CreativeTabs GEMS_TAB = new CreativeTabs(TabNames.tabs.GEMS_TAB) {
        @Override
        public Item getTabIconItem() { return ShinseiItems.amethyst_gem; }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(TabNames.tabs.ITEMS_TAB) {
        @Override
        public Item getTabIconItem() { return ShinseiItems.coke; }
    };

}