package com.megathirio.shinsei.core.proxy;

import com.megathirio.shinsei.renderer.*;
import com.megathirio.shinsei.tileentity.TileEntityTatara;
import cpw.mods.fml.client.registry.ClientRegistry;

import com.megathirio.shinsei.init.ShinseiMachines;
//import com.megathirio.shinsei.renderer.ItemRenderTataraIdle;
//import com.megathirio.shinsei.renderer.ItemRenderTataraActi;
//import com.megathirio.shinsei.renderer.RenderTataraActi;
import com.megathirio.shinsei.tileentity.TileEntityMachinePress;
import com.megathirio.shinsei.tileentity.TileEntityToolBench;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;


public class ClientProxy extends CommonProxy {
	
	public void registerRenderThings(){

        //Tatara Bench
        TileEntitySpecialRenderer renderTataraIdle = new RenderTataraIdle();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTatara.class, renderTataraIdle);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ShinseiMachines.blockTataraIdle), new ItemRenderTataraIdle(renderTataraIdle, new TileEntityTatara()));

        //Tool Bench
		TileEntitySpecialRenderer renderToolBench = new RenderToolBench();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityToolBench.class, renderToolBench);
//		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ShinseiMachines.blockToolBench), new ItemRenderToolBench(renderToolBench, new TileEntityToolBench()));

		//Machine Press
		TileEntitySpecialRenderer renderMachinePress = new RenderMachinePress();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMachinePress.class, renderMachinePress);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ShinseiMachines.blockMachinePress), new ItemRenderMachinePress(renderMachinePress, new TileEntityMachinePress()));

	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}

}
