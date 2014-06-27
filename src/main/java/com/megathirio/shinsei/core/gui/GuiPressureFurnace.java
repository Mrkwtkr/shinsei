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

	private ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/gui/containers/gui_forge_furnace.png");
	private TileEntityPressureFurnace pressureFurnace;

	public GuiPressureFurnace(InventoryPlayer invPlayer, TileEntityPressureFurnace tePressureFurnace) {
		
		super(new ContainerPressureFurnace(invPlayer, tePressureFurnace));
        pressureFurnace = tePressureFurnace;
		this.xSize = 176;
		this.ySize = 166;
		
	}

	protected void drawGuiContainerForegroundLayer(int i, int j){
	
		String name = this.pressureFurnace.hasCustomInventoryName() ? this.pressureFurnace.getInventoryName() : I18n.format(this.pressureFurnace.getInventoryName());
		this.fontRendererObj.drawString(name, this.xSize / 2 - fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 3, 4210752);
	}
	
    @Override
    protected void drawGuiContainerBackgroundLayer(float fltK, int intI, int intJ) {

        GL11.glColor4f(1f, 1f, 1f, 1f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        if(this.pressureFurnace.hasPower()){

            int intK = this.pressureFurnace.getPressurePowerRemainingScaled(32);
            drawTexturedModalRect(guiLeft + 38, guiTop + 48 - intK, 176, 32 - intK, 10, intK + 2);

        }

        int k = this.pressureFurnace.getPressureProgressScaled(24);
        drawTexturedModalRect(guiLeft + 108, guiTop + 36, 186, 0, k + 1, 16);

    }

}
