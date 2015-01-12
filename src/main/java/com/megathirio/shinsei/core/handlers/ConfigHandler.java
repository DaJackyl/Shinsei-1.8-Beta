package com.megathirio.shinsei.core.handlers;

//import com.megathirio.shinsei.utility.LogHelper;
import com.megathirio.shinsei.core.config.ConfigValues;
import com.megathirio.shinsei.core.utilities.LogHelper;
import com.megathirio.shinsei.reference.CoreRef;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigHandler {
    public static Configuration configuration;

    public static void init(File configFile){
        //Create the config object from the given config file
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();

        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase((CoreRef.MOD_ID))){
            //Resync the configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration(){
        //Tools
        ConfigValues.enableVanillaTools = configuration.get(Configuration.CATEGORY_GENERAL, "VanillaToolRecipes", false, "Set to true to enable Vanilla Tool Recipes").getBoolean(false);
        LogHelper.info("Vanilla Recipes are set to: " + String.valueOf(ConfigValues.enableVanillaTools));

        //Ores
        ConfigValues.enableAcanthite = configuration.get(Configuration.CATEGORY_GENERAL, "acanthite_ore", true, "Set to false to disable Acanthite Ore Spawning").getBoolean(true);
        LogHelper.info("Acanthite Ore Spawning is set to: " + String.valueOf(ConfigValues.enableAcanthite));
        ConfigValues.enableAmethyst = configuration.get(Configuration.CATEGORY_GENERAL, "amethyst_ore", true, "Set to false to disable Amethyst Ore Spawning").getBoolean(true);
        LogHelper.info("Amethyst Ore Spawning is set to: " + String.valueOf(ConfigValues.enableAmethyst));
        ConfigValues.enableApatite = configuration.get(Configuration.CATEGORY_GENERAL, "apatite_ore", true, "Set to false to disable Apatite Ore Spawning").getBoolean(true);
        LogHelper.info("Apatite Ore Spawning is set to: " + String.valueOf(ConfigValues.enableApatite));

        if (configuration.hasChanged()){
            configuration.save();
        }
    }

}
