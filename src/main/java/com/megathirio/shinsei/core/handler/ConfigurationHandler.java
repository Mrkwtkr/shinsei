package com.megathirio.shinsei.core.handler;

import com.megathirio.shinsei.reference.ConfigValues;
import com.megathirio.shinsei.reference.Reference;
import com.megathirio.shinsei.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;

    public static void init(File configFile){
        //Create the configuration object from the given configuration file
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();

        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event){
           if (event.modID.equalsIgnoreCase((Reference.MOD_ID))){
               //Resync the configs
               loadConfiguration();
           }
    }

    private static void loadConfiguration(){
        //Tools
        ConfigValues.booToolValue = configuration.get(Configuration.CATEGORY_GENERAL, "VanillaToolRecipes", false, "Set to true to enable Vanilla Tool Recipes").getBoolean(false);
        LogHelper.info("Vanilla Recipes are set to: " + String.valueOf(ConfigValues.booToolValue));

        //Minerals
        ConfigValues.booBasaltValue = configuration.get(Configuration.CATEGORY_GENERAL, "BasaltBlock", true, "Set to false to disable Basalt Spawning").getBoolean(true);
        LogHelper.info("Basalt Spawning is set to: " + String.valueOf(ConfigValues.booBasaltValue));
        ConfigValues.booChalkValue = configuration.get(Configuration.CATEGORY_GENERAL, "ChalkBlock", true, "Set to false to disable Chalk Spawning").getBoolean(true);
        LogHelper.info("Chalk Spawning is set to: " + String.valueOf(ConfigValues.booChalkValue));
        ConfigValues.booGraniteValue = configuration.get(Configuration.CATEGORY_GENERAL, "GraniteBlock", true, "Set to false to disable Granite Spawning").getBoolean(true);
        LogHelper.info("Granite Spawning is set to: " + String.valueOf(ConfigValues.booGraniteValue));
        ConfigValues.booGypsumValue = configuration.get(Configuration.CATEGORY_GENERAL, "GypsumBlock", true, "Set to false to disable Gypsum Spawning").getBoolean(true);
        LogHelper.info("Gypsum Spawning is set to: " + String.valueOf(ConfigValues.booGypsumValue));
        ConfigValues.booLimestoneValue = configuration.get(Configuration.CATEGORY_GENERAL, "LimestoneBlock", true, "Set to false to disable Limestone Spawning").getBoolean(true);
        LogHelper.info("Limestone Spawning is set to: " + String.valueOf(ConfigValues.booLimestoneValue));
        ConfigValues.booSaltValue = configuration.get(Configuration.CATEGORY_GENERAL, "SaltBlock", true, "Set to false to disable Salt Spawning").getBoolean(true);
        LogHelper.info("Salt Spawning is set to: " + String.valueOf(ConfigValues.booSaltValue));
        ConfigValues.booSiltValue = configuration.get(Configuration.CATEGORY_GENERAL, "SiltBlock", true, "Set to false to disable Silt Spawning").getBoolean(true);
        LogHelper.info("Silt Spawning is set to: " + String.valueOf(ConfigValues.booSiltValue));

        //Ores
        ConfigValues.booAluminumValue = configuration.get(Configuration.CATEGORY_GENERAL, "AluminumOre", true, "Set to false to disable Aluminum Ore Spawning").getBoolean(true);
        LogHelper.info("Aluminum Ore Spawning is set to: " + String.valueOf(ConfigValues.booAluminumValue));
        ConfigValues.booAmethystValue = configuration.get(Configuration.CATEGORY_GENERAL, "AmethystOre", true, "Set to false to disable Amethyst Ore Spawning").getBoolean(true);
        LogHelper.info("Amethyst Ore Spawning is set to: " + String.valueOf(ConfigValues.booAmethystValue));
        ConfigValues.booApatiteValue = configuration.get(Configuration.CATEGORY_GENERAL, "ApatiteOre", true, "Set to false to disable Apatite Ore Spawning").getBoolean(true);
        LogHelper.info("Apatite Ore Spawning is set to: " + String.valueOf(ConfigValues.booApatiteValue));
        ConfigValues.booBariteValue = configuration.get(Configuration.CATEGORY_GENERAL, "BariteOre", true, "Set to false to disable Barite Ore Spawning").getBoolean(true);
        LogHelper.info("Barite Ore Spawning is set to: " + String.valueOf(ConfigValues.booBariteValue));
        ConfigValues.booCopperValue = configuration.get(Configuration.CATEGORY_GENERAL, "CopperOre", true, "Set to false to disable Copper Ore Spawning").getBoolean(true);
        LogHelper.info("Copper Ore Spawning is set to: " + String.valueOf(ConfigValues.booCopperValue));
        ConfigValues.booLeadValue = configuration.get(Configuration.CATEGORY_GENERAL, "LeadOre", true, "Set to false to disable Lead Ore Spawning").getBoolean(true);
        LogHelper.info("Lead Ore Spawning is set to: " + String.valueOf(ConfigValues.booLeadValue));
        ConfigValues.booSilverValue = configuration.get(Configuration.CATEGORY_GENERAL, "SilverOre", true, "Set to false to disable Silver Ore Spawning").getBoolean(true);
        LogHelper.info("Silver Ore Spawning is set to: " + String.valueOf(ConfigValues.booSilverValue));

        if (configuration.hasChanged()){
            configuration.save();
        }
    }

}
