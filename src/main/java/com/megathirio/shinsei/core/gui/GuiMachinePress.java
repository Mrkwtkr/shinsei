package com.megathirio.shinsei.core.gui;

import com.megathirio.shinsei.reference.Reference;
import org.lwjgl.opengl.GL11;

import com.megathirio.shinsei.core.container.ContainerMachinePress;
import com.megathirio.shinsei.tileentity.TileEntityMachinePress;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiMachinePress extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/gui/containers/gui_machine_press.png");
	private TileEntityMachinePress machinePress;

	public GuiMachinePress(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerMachinePress(invPlayer, world, x, y, z));

		this.xSize = 176;
		this.ySize = 166;
		
	}


	public void onGuiClosed(){
		super.onGuiClosed();
	}

	protected void drawGuiContainerForegroundLayer(int i, int j){

		this.fontRendererObj.drawString(StatCollector.translateToLocal("Machine Press"), 75, 6, 0x000000);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) {
		
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
}
