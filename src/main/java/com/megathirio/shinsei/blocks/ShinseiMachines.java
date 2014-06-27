package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.tileentity.TileEntityForgeFurnace;
import com.megathirio.shinsei.tileentity.TileEntityWoodFurnace;
import com.megathirio.shinsei.tileentity.TileEntityPressureFurnace;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ShinseiMachines {
	
//Block Variables
	//Furnaces
	public static Block blockWoodFurnaceIdle;
	public static Block blockWoodFurnaceActi;
	public static final int guiIDWoodFurnace = 2;
	public static Block blockForgeFurnaceIdle;
	public static Block blockForgeFurnaceActi;
	public static final int guiIDForgeFurnace = 3;
    public static Block blockPressureFurnaceIdle;
    public static Block blockPressureFurnaceActi;
    public static final int guiIDPressureFurnace = 4;

    public static Block blockShinseiFurnaceIdle;
    public static Block blockShinseiFurnaceActi;
    public static final int guiIDShinseiFurnace = 5;

	//Work Stations
	public static Block blockToolBench;
	public static final int guiIDToolBench = 0;
	public static Block blockMachinePress;
	public static final int guiIDMachinePress = 1;
	
	public static void init(){
	
	//Block Initialization
		//Furnaces
		blockWoodFurnaceIdle = new WoodFurnace(false).setBlockName("iwood_furnace").setHardness(3.5F);
		GameRegistry.registerBlock(blockWoodFurnaceIdle, "iwood_furnace");
		blockWoodFurnaceActi = new WoodFurnace(true).setBlockName("awood_furnace").setLightLevel(0.875F).setHardness(3.5F).setCreativeTab(null);
		GameRegistry.registerBlock(blockWoodFurnaceActi, "awood_furnace");
		GameRegistry.registerTileEntity(TileEntityWoodFurnace.class, "WoodFurnace");

		blockForgeFurnaceIdle = new ForgeFurnace(false).setBlockName("iforge_furnace").setHardness(3.5F);
		GameRegistry.registerBlock(blockForgeFurnaceIdle, "iforge_furnace");
		blockForgeFurnaceActi = new ForgeFurnace(true).setBlockName("aforge_furnace").setLightLevel(0.875F).setHardness(3.5F).setCreativeTab(null);
		GameRegistry.registerBlock(blockForgeFurnaceActi, "aforge_furnace");
		GameRegistry.registerTileEntity(TileEntityForgeFurnace.class, "ForgeFurnace");

        blockPressureFurnaceIdle = new PressureFurnace(false).setBlockName("ipressure_furnace").setHardness(3.5F);
        GameRegistry.registerBlock(blockPressureFurnaceIdle, "ipressure_furnace");
        blockPressureFurnaceActi = new PressureFurnace(true).setBlockName("apressure_furnace").setLightLevel(0.875F).setHardness(3.5F).setCreativeTab(null);
        GameRegistry.registerBlock(blockPressureFurnaceActi, "apressure_furnace");
        GameRegistry.registerTileEntity(TileEntityPressureFurnace.class, "PressureFurnace");


        blockShinseiFurnaceIdle = new ShinseiFurnace(false).setBlockName("ishinsei_furnace").setHardness(3.5F);
        GameRegistry.registerBlock(blockShinseiFurnaceIdle, "ishinsei_furnace");
        blockShinseiFurnaceActi = new ShinseiFurnace(true).setBlockName("ashinsei_furnace").setLightLevel(0.875F).setHardness(3.5F).setCreativeTab(null);
        GameRegistry.registerBlock(blockShinseiFurnaceActi, "ashinsei_furnace");


		//Work Stations
		blockToolBench = new ToolBench(Material.wood).setBlockName("tool_bench").setBlockTextureName("");
		GameRegistry.registerBlock(blockToolBench, "tool_bench");

		blockMachinePress = new MachinePress(Material.iron).setBlockName("machine_press").setBlockTextureName("");
		GameRegistry.registerBlock(blockMachinePress, "machine_press");

	}
}
