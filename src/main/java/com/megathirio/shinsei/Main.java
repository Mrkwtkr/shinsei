package com.megathirio.shinsei;

import com.megathirio.shinsei.blocks.*;
import com.megathirio.shinsei.core.handler.*;
import com.megathirio.shinsei.core.proxy.CommonProxy;
import com.megathirio.shinsei.crafting.ShinseiRecipes;
import com.megathirio.shinsei.creativetab.ShinseiTabs;
import com.megathirio.shinsei.items.*;
import com.megathirio.shinsei.lib.References;
import com.megathirio.shinsei.world.ShinseiWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)

public class Main {

    ShinseiWorldGen eventWorldGen = new ShinseiWorldGen();

//	public static final String modid = "shinsei";

    @Instance(References.MODID)
	public static Main instance;
	
	// Client and Server Proxies 
	@SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
	public static CommonProxy proxy;

	
	//Initialization Methods
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		
		//Creative Tab Initializations
		ShinseiTabs.init();

		//Block Initializations
		ShinseiBlocks.init();

		//Machine Initializations
		ShinseiMachines.init();

		//Item Initializations
		ShinseiItems.init();

		//Ingot Initializations
		ShinseiIngots.init();

		//Dust Initializations
		ShinseiDusts.init();

        //Fuel Initializations
        ShinseiFuels.init();

        //Tool Initializations
		ShinseiTools.init();

		//WorldGen Registry
		GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 1);
		
		//Renderers
		proxy.registerRenderThings();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){

		//Crafting Handler Registration
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		//Gui Handler Registration 
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		//Fuel Handler Registration
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		//Recipes Initialization
		ShinseiRecipes.init();
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event){
	}
}
