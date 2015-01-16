package com.megathirio.shinsei.core.handlers;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;

    // Sections to add to the config
    public static String oreGen = "Ore Generation";

    // Options in the config
    public static boolean enableAcanthite;
    public static boolean enableAmethyst;
    public static boolean enableApatite;
    public static boolean enableBarite;

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
        config.addCustomCategoryComment(oreGen, "This section contains all settings regarding ore generation.");

        enableAcanthite = config.get(oreGen, "enableAcanthite", true, "Enable Acanthite Ore generation").getBoolean(enableAcanthite);
        enableAmethyst = config.get(oreGen, "enableAmethyst", true, "Enable Amethyst Ore generation").getBoolean(enableAmethyst);
        enableApatite = config.get(oreGen, "enableApatite", true, "Enable Apatite Ore generation").getBoolean(enableApatite);
        enableBarite = config.get(oreGen, "enableBarite", true, "Enable Barite Ore generation").getBoolean(enableBarite);

        config.save();
    }
}