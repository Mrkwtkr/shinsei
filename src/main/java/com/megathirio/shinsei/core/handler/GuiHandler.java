package com.megathirio.shinsei.core.handler;

import com.megathirio.shinsei.init.ShinseiMachines;
import com.megathirio.shinsei.core.container.ContainerTatara;
import com.megathirio.shinsei.core.container.ContainerMachinePress;
import com.megathirio.shinsei.core.container.ContainerToolBench;
import com.megathirio.shinsei.core.gui.GuiTatara;
import com.megathirio.shinsei.core.gui.GuiMachinePress;
import com.megathirio.shinsei.core.gui.GuiToolBench;
import com.megathirio.shinsei.tileentity.TileEntityTatara;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null){
			
			switch(ID){
			case ShinseiMachines.guiIDTatara:
				if(entity instanceof TileEntityTatara){
					
					return new ContainerTatara(player.inventory, (TileEntityTatara) entity);
				}
				return null;		
            }

			switch(ID){
//			case ShinseiMachines.guiIDToolBench:
//				return ID == ShinseiMachines.guiIDToolBench && world.getBlock(x, y, z) == ShinseiMachines.blockToolBench ? new ContainerToolBench(player.inventory, world, x, y, z) : null;
			case ShinseiMachines.guiIDMachinePress:
				return ID == ShinseiMachines.guiIDMachinePress && world.getBlock(x, y, z) == ShinseiMachines.blockMachinePress ? new ContainerMachinePress(player.inventory, world, x, y, z) : null;
			}
			return null;
	}
		return null;
}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null){
			
			switch(ID){
			case ShinseiMachines.guiIDTatara:
				if(entity instanceof TileEntityTatara){
					
					return new GuiTatara(player.inventory, (TileEntityTatara) entity);
					
				}
				return null;
		}
			switch(ID){
//			case ShinseiMachines.guiIDToolBench:
//				return ID == ShinseiMachines.guiIDToolBench && world.getBlock(x, y, z) == ShinseiMachines.blockToolBench ? new GuiToolBench(player.inventory, world, x, y, z) : null;
			case ShinseiMachines.guiIDMachinePress:
				return ID == ShinseiMachines.guiIDMachinePress && world.getBlock(x, y, z) == ShinseiMachines.blockMachinePress ? new GuiMachinePress(player.inventory, world, x, y, z) : null;
			}

		return null;
	}
		return null;
	}
}
