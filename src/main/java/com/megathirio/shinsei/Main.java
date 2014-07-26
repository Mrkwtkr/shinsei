package com.megathirio.shinsei;

import com.megathirio.shinsei.core.handler.ConfigurationHandler;
import com.megathirio.shinsei.core.handler.*;
import com.megathirio.shinsei.core.proxy.IProxy;
import com.megathirio.shinsei.init.ShinseiRecipes;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.init.*;
import com.megathirio.shinsei.reference.Reference;
import com.megathirio.shinsei.utility.LogHelper;
import com.megathirio.shinsei.world.ShinseiWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)

public class Main {

    ShinseiWorldGen eventWorldGen = new ShinseiWorldGen();

//	public static final String modid = "shinsei";

    @Instance(Reference.MOD_ID)
	public static Main instance;
	
	//Proxies
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;

	
	//Initialization Methods
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event){


        //Configuration file Initializations
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

 		//Fluid Initializations
 		ShinseiFluids.init();

 		//Block Initializations
		ShinseiBlocks.init();

        //Item Ore Dictionary Registration
        ShinseiOreDict.items();

        //Block Initializations
        ShinseiTrees.init();

		//Machine Initializations
		ShinseiMachines.init();

		//Item Initializations
		ShinseiItems.init();

        //Tool Initializations
		ShinseiTools.init();

		//WorldGen Registry
		GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 1);

       LogHelper.info("Pre Initialization Complete!");

    }
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){

        //Fluid Handler Initialization
        FluidHandler.init();

		//Crafting Handler Registration
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		//Gui Handler Registration 
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		//Fuel Handler Registration
		GameRegistry.registerFuelHandler(new FuelHandler());

        //Block Ore Dictionary Registration
        ShinseiOreDict.blocks();

		//Recipes Initialization
        ShinseiRecipes.init();

        LogHelper.info("Initialization Complete!");

    }

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete!");

	}

}
