package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiIngots {

	//Item Variables
        //Ingots
        public static Item ingotAluminum;
        public static Item ingotAntimony;
        public static Item ingotBismuth;
        public static Item ingotCadmium;
        public static Item ingotChromium;
        public static Item ingotCopper;
        public static Item ingotIndium;
        public static Item ingotIridium;
        public static Item ingotLead;

//Item Initialization
    public static void init(){
		
	//Item Initialzation
		//Ingots

        //Aluminum - processed in Pressurized Smelter from Aluminum Ore
        ingotAluminum = new ShinseiItem().setUnlocalizedName("aluminum_ingot");
		GameRegistry.registerItem(ingotAluminum, "aluminum_ingot");
		OreDictionary.registerOre("ingotAluminum", new ItemStack(ingotAluminum));

	    //Antimony - processed in Furnaces from Antimony Ore
        ingotAntimony = new ShinseiItem().setUnlocalizedName("antimony_ingot");
		GameRegistry.registerItem(ingotAntimony, "antimony_ingot");
		OreDictionary.registerOre("ingotAntimony", new ItemStack(ingotAntimony));

        //Bismuth - processed in Furnaces from Bismuth Ore
        ingotBismuth = new ShinseiItem().setUnlocalizedName("bismuth_ingot");
        GameRegistry.registerItem(ingotBismuth, "bismuth_ingot");
        OreDictionary.registerOre("ingotBismuth", new ItemStack(ingotBismuth));

        //Cadmium - Byproduct of Zinc Ore processing
        ingotCadmium = new ShinseiItem().setUnlocalizedName("cadmium_ingot");
        GameRegistry.registerItem(ingotCadmium, "cadmium_ingot");
        OreDictionary.registerOre("ingotCadmium", new ItemStack(ingotCadmium));

        //Chromium - processed in furnaces from Chromite Ore
        ingotChromium = new ShinseiItem().setUnlocalizedName("chromium_ingot");
        GameRegistry.registerItem(ingotChromium, "chromium_ingot");
        OreDictionary.registerOre("ingotChromium", new ItemStack(ingotChromium));

        //Copper - processed in Furnaces from Copper Ore
        ingotCopper = new ShinseiItem().setUnlocalizedName("copper_ingot");
		GameRegistry.registerItem(ingotCopper, "copper_ingot");
		OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));

        //Indium - Byproduct of Zinc Ore processing
        ingotIndium = new ShinseiItem().setUnlocalizedName("indium_ingot");
        GameRegistry.registerItem(ingotIndium, "indium_ingot");
        OreDictionary.registerOre("ingotIndium", new ItemStack(ingotIndium));

        //Iridium - Iridium powder?
        ingotIridium = new ShinseiItem().setUnlocalizedName("iridium_ingot");
        GameRegistry.registerItem(ingotIridium, "iridium_ingot");
        OreDictionary.registerOre("ingotIridium", new ItemStack(ingotIridium));

        //Lead - processed in furnaces from Lead Ore
        ingotLead = new ShinseiItem().setUnlocalizedName("lead_ingot");
        GameRegistry.registerItem(ingotLead, "lead_ingot");
        OreDictionary.registerOre("ingotLead", new ItemStack(ingotLead));
	}
}
