package com.megathirio.shinsei.init;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.MachinePress;
import com.megathirio.shinsei.block.Tatara;
import com.megathirio.shinsei.block.ToolBench;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ShinseiMachines {
	
//Block Variables
	//Furnaces
    public static Block blockTataraIdle;
    public static final int guiIDTatara = 2;

	//Work Stations
	public static Block blockToolBench;
	public static final int guiIDToolBench = 0;
	public static Block blockMachinePress;
	public static final int guiIDMachinePress = 1;
	
	public static void init(){
	
	//Block Initialization
        //Furnaces
        blockTataraIdle = new Tatara(Material.rock).setBlockName(Names.Machines.TATARA + "Idle");
        GameRegistry.registerBlock(blockTataraIdle, Names.Machines.TATARA + "Idle");

        //Work Stations
		blockToolBench = new ToolBench(Material.wood).setBlockName(Names.Machines.TOOLBENCH).setBlockTextureName("");
		GameRegistry.registerBlock(blockToolBench, Names.Machines.TOOLBENCH);

		blockMachinePress = new MachinePress(Material.iron).setBlockName(Names.Machines.MACHINE_PRESS).setBlockTextureName("");
		GameRegistry.registerBlock(blockMachinePress, Names.Machines.MACHINE_PRESS);

	}
}
