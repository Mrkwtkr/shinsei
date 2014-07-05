package com.megathirio.shinsei.core.client.gui;

import com.megathirio.shinsei.core.handler.ConfigurationHandler;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class GuiConfigShinsei extends GuiConfig{

    public GuiConfigShinsei(GuiScreen guiScreen){
        super(guiScreen, new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
