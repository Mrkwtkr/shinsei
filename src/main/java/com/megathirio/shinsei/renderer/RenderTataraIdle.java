package com.megathirio.shinsei.renderer;

import com.megathirio.shinsei.reference.Reference;
import com.megathirio.shinsei.model.ModelTataraIdle;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderTataraIdle extends TileEntitySpecialRenderer{
    private static ResourceLocation texture = new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/models/tatara_idle.png");

    private ModelTataraIdle model;

    public RenderTataraIdle(){
        this.model = new ModelTataraIdle();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
            GL11.glRotatef(180, 0F, 0F, 1F);
            this.bindTexture(texture);

            GL11.glPushMatrix();
            this.model.renderModel(0.0625F);
           GL11.glPopMatrix();
        GL11.glPopMatrix();

    }
}
