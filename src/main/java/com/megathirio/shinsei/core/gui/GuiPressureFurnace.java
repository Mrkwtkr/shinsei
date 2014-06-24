package com.megathirio.shinsei.core.gui;

import com.megathirio.shinsei.core.container.ContainerPressureFurnace;
import com.megathirio.shinsei.lib.References;
import com.megathirio.shinsei.tileentity.TileEntityPressureFurnace;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiPressureFurnace extends GuiContainer{

	private ResourceLocation bground = new ResourceLocation(References.MODID + ":" + "textures/gui/containers/gui_pressure_furnace.png");

	public TileEntityPressureFurnace pressureFurnace;

	public GuiPressureFurnace(InventoryPlayer inventoryPlayer, TileEntityPressureFurnace tePressureFurnace) {
		super(new ContainerPressureFurnace(inventoryPlayer, tePressureFurnace));
		
		this.pressureFurnace = tePressureFurnace;
		
		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2){

		String name = this.pressureFurnace.hasCustomInventoryName() ? this.pressureFurnace.getInventoryName() : I18n.format(this.pressureFurnace.getInventoryName());
		this.fontRendererObj.drawString(name,  this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8,this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
		GL11.glColor4f(1f, 1f, 1f, 1f);
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		 if(this.pressureFurnace.isBurning()){
		  	
			int k = this.pressureFurnace.getBurnTimeRemainingScaled(32);
			drawTexturedModalRect(guiLeft + 38, guiTop + 48 - k, 176, 32 - k, 10, k + 2);
			
		}
		
		int k = this.pressureFurnace.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 108, guiTop + 36, 186, 0, k + 1, 16);

	}

}
