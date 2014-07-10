package com.megathirio.shinsei.init;

import com.megathirio.shinsei.block.MachinePress;
import com.megathirio.shinsei.block.Tatara;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ShinseiMachines {
	
//Block Variables
	//Furnaces
    public static Block blockTataraIdle;
    public static final int guiIDTatara = 2;

	//Work Stations
//	public static final BlockShinsei blockToolBench = new ToolBench();
	public static final int guiIDToolBench = 0;
	public static Block blockMachinePress;
	public static final int guiIDMachinePress = 1;
	
	public static void init(){
	
	//Block Initialization
        //Furnaces
        blockTataraIdle = new Tatara(Material.rock).setBlockName("tatara_idle");
        GameRegistry.registerBlock(blockTataraIdle, "tatara_idle");

        //Work Stations
//		blockToolBench = new ToolBench().setBlockName("tool_bench").setBlockTextureName("");
//		GameRegistry.registerBlock(blockToolBench, Names.Blocks.TOOLBENCH);

		blockMachinePress = new MachinePress(Material.iron).setBlockName("machine_press").setBlockTextureName("");
		GameRegistry.registerBlock(blockMachinePress, "machine_press");

	}
}
