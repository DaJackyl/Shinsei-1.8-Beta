package com.megathirio.shinsei.core.guis;

import com.megathirio.shinsei.core.handlers.ConfigHandler;
import com.megathirio.shinsei.reference.CoreRef;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

import java.util.List;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen guiScreen){
        super(guiScreen, new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), CoreRef.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
    }
}
