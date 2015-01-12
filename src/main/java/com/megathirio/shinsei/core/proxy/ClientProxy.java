package com.megathirio.shinsei.core.proxy;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerRenders(){
        ShinseiBlocks.registerRenders();
        ShinseiItems.registerRenders();
    }
}
