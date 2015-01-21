package com.megathirio.shinsei.items.books;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.items.ItemShinsei;

public class BookShinsei extends ItemShinsei{

    public BookShinsei(String name) {
        super(name);
        setCreativeTab(ShinseiTabs.BOOKS_TAB);
    }
}
