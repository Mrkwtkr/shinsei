package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiIngots {

	//Item Variables
        //Ingots
        public static Item itemAluminumIngot;
        public static Item itemAntimonyIngot;
        public static Item itemBismuthIngot;
        public static Item itemCadmiumIngot;
        public static Item itemChromiumIngot;
        public static Item itemCopperIngot;
        public static Item itemIndiumIngot;

//Item Initialization
    public static void init(){
		
	//Item Initialzation
		//Ingots

        //Aluminum - processed in Pressurized Smelter from Aluminum Ore
		itemAluminumIngot = new ShinseiItem().setUnlocalizedName("aluminum_ingot");
		GameRegistry.registerItem(itemAluminumIngot, "aluminum_ingot");
		OreDictionary.registerOre("ingotAluminum", new ItemStack(itemAluminumIngot));

	    //Antimony - processed in Furnaces from Antimony Ore
		itemAntimonyIngot = new ShinseiItem().setUnlocalizedName("antimony_ingot");
		GameRegistry.registerItem(itemAntimonyIngot, "antimony_ingot");
		OreDictionary.registerOre("ingotAntimony", new ItemStack(itemAntimonyIngot));

        //Bismuth - processed in Furnaces from Bismuth Ore
        itemBismuthIngot = new ShinseiItem().setUnlocalizedName("bismuth_ingot");
        GameRegistry.registerItem(itemBismuthIngot, "bismuth_ingot");
        OreDictionary.registerOre("ingotBismuth", new ItemStack(itemBismuthIngot));

        //Cadmium - Byproduct of Zinc Ore processing
        itemCadmiumIngot = new ShinseiItem().setUnlocalizedName("cadmium_ingot");
        GameRegistry.registerItem(itemCadmiumIngot, "cadmium_ingot");
        OreDictionary.registerOre("ingotCadmium", new ItemStack(itemCadmiumIngot));

        //Chromium - processed in furnaces from Chromite Ore
        itemChromiumIngot = new ShinseiItem().setUnlocalizedName("chromium_ingot");
        GameRegistry.registerItem(itemChromiumIngot, "chromium_ingot");
        OreDictionary.registerOre("ingotChromium", new ItemStack(itemChromiumIngot));

        //Copper - processed in Furnaces from Copper Ore
		itemCopperIngot = new ShinseiItem().setUnlocalizedName("copper_ingot");
		GameRegistry.registerItem(itemCopperIngot, "copper_ingot");
		OreDictionary.registerOre("ingotCopper", new ItemStack(itemCopperIngot));

        //Indium - Byproduct of Zinc Ore processing
        itemIndiumIngot = new ShinseiItem().setUnlocalizedName("indium_ingot");
        GameRegistry.registerItem(itemIndiumIngot, "indium_ingot");
        OreDictionary.registerOre("ingotIndium", new ItemStack(itemIndiumIngot));

	}
}
