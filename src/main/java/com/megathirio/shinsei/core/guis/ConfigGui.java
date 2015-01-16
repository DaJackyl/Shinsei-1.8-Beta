package com.megathirio.shinsei.core.guis;

import com.megathirio.shinsei.core.utilities.TextHelper;
import com.megathirio.shinsei.reference.CoreRef;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

import static com.megathirio.shinsei.core.handlers.ConfigHandler.*;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), CoreRef.MOD_ID, false, false, TextHelper.localize("gui." + CoreRef.MOD_ID + ".config.title"));
    }

    @SuppressWarnings("rawtypes")
    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        // Adds sections declared in ConfigHandler. toLowerCase() is used because the configuration class automatically does this, so must we.
        list.add(new ConfigElement(config.getCategory(oreGen.toLowerCase())));

        return list;
    }
}
