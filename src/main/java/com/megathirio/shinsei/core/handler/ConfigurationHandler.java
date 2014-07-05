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
        ConfigValues.booToolValue = configuration.get(Configuration.CATEGORY_GENERAL, "VanillaToolRecipes", false, "Set to true to enable Vanilla Tool Recipes").getBoolean(false);
        LogHelper.info("Vanilla Recipes are set to: " + String.valueOf(ConfigValues.booToolValue));
        ConfigValues.booBauxiteValue = configuration.get(Configuration.CATEGORY_GENERAL, "BauxiteOre", true, "Set to false to disable Bauxite(Aluminum) Ore Spawning").getBoolean(true);
        LogHelper.info("Bauxite(Aluminum) Ore Spawning is set to: " + String.valueOf(ConfigValues.booBauxiteValue));
        ConfigValues.booCopperValue = configuration.get(Configuration.CATEGORY_GENERAL, "CopperOre", true, "Set to false to disable Copper Ore Spawning").getBoolean(true);
        LogHelper.info("Copper Ore Spawning is set to: " + String.valueOf(ConfigValues.booCopperValue));
        ConfigValues.booLeadValue = configuration.get(Configuration.CATEGORY_GENERAL, "LeadOre", true, "Set to false to disable Lead Ore Spawning").getBoolean(true);
        LogHelper.info("Lead Ore Spawning is set to: " + String.valueOf(ConfigValues.booLeadValue));

        if (configuration.hasChanged()){
            configuration.save();
        }
    }

}
