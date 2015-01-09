package com.megathirio.shinsei.proxy;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerRenders(){
        ShinseiBlocks.registerRenders();
        ShinseiItems.registerRenders();
    }
}
