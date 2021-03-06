package com.megathirio.shinsei;

import com.megathirio.shinsei.core.crafting.ShinseiCraftingManager;
import com.megathirio.shinsei.core.handlers.ConfigHandler;
import com.megathirio.shinsei.core.handlers.GuiHandlerAnbiru;
import com.megathirio.shinsei.core.handlers.GuiHandlerRegistry;
import com.megathirio.shinsei.core.handlers.WorldGenHandler;
import com.megathirio.shinsei.core.oredict.ShinseiOreDict;
import com.megathirio.shinsei.core.proxy.CommonProxy;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.megathirio.shinsei.reference.CoreRef;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = CoreRef.MOD_ID, name = CoreRef.MOD_NAME, version = CoreRef.MOD_VERSION)
public class Shinsei {

    @Mod.Instance(CoreRef.MOD_ID)
    public static Shinsei instance;

    //WorldGenHandler eventWorldGen = new WorldGenHandler();

    @SidedProxy(clientSide = CoreRef.CLIENT_PROXY, serverSide = CoreRef.COMMON_PROXY)
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        //Configuration file Initializations
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        //Register World Generation
        GameRegistry.registerWorldGenerator(new WorldGenHandler(), 2);

        //Items Ore Dictionary Registration
        ShinseiOreDict.items();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandlerAnbiru());

        //Crafting Manager Intialization
        ShinseiCraftingManager.init();

        //Blocks Ore Dictionary Registration
        ShinseiOreDict.blocks();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
