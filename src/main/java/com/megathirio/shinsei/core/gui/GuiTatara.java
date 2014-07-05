package com.megathirio.shinsei.core.gui;

import com.megathirio.shinsei.core.container.ContainerTatara;
import com.megathirio.shinsei.reference.Reference;
import com.megathirio.shinsei.tileentity.TileEntityTatara;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiTatara extends GuiContainer{

	private ResourceLocation bground = new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/gui/containers/gui_tatara.png");
	
	public TileEntityTatara teTatara;
	
	public GuiTatara(InventoryPlayer inventoryPlayer, TileEntityTatara tileEntity) {
		super(new ContainerTatara(inventoryPlayer, tileEntity));
		
		this.teTatara = tileEntity;
		
		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2){

		String name = this.teTatara.hasCustomInventoryName() ? this.teTatara.getInventoryName() : I18n.format(this.teTatara.getInventoryName());
		this.fontRendererObj.drawString(name,  this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8,this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
		GL11.glColor4f(1f, 1f, 1f, 1f);
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		 if(this.teTatara.isBurning()){
		  	
			int k = this.teTatara.getBurnTimeRemainingScaled(32);
			drawTexturedModalRect(guiLeft + 38, guiTop + 48 - k, 176, 32 - k, 10, k + 2);
			
		}
		
		int k = this.teTatara.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 108, guiTop + 36, 186, 0, k + 1, 16);

	}

}
