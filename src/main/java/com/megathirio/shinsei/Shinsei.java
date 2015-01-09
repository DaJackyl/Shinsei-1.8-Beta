package com.megathirio.shinsei;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.megathirio.shinsei.reference.CoreRef;

@Mod(modid = CoreRef.MOD_ID, name = CoreRef.MOD_NAME, version = CoreRef.MOD_VERSION)
public class Shinsei {

    @SidedProxy(clientSide = CoreRef.CLIENT_PROXY, serverSide = CoreRef.COMMON_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ShinseiBlocks.init();
        ShinseiBlocks.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
