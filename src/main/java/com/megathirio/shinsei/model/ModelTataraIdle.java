package com.megathirio.shinsei.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTataraIdle extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer table;
    ModelRenderer firepan;
    ModelRenderer ubwall;
    ModelRenderer ulwall;
    ModelRenderer urwall;
    ModelRenderer troof;
    ModelRenderer lroof;
    ModelRenderer rroof;
    ModelRenderer froof;
    ModelRenderer broof;
    ModelRenderer lwall;
    ModelRenderer rwall;
    ModelRenderer bwall;
  
  public ModelTataraIdle()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      base = new ModelRenderer(this, 0, 32);
      base.addBox(0F, 0F, 0F, 10, 4, 10);
      base.setRotationPoint(-5F, 20F, -5F);
      base.setTextureSize(64, 64);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      table = new ModelRenderer(this, 0, 46);
      table.addBox(0F, 0F, 0F, 16, 2, 16);
      table.setRotationPoint(-8F, 18F, -8F);
      table.setTextureSize(64, 64);
      table.mirror = true;
      setRotation(table, 0F, 0F, 0F);
      firepan = new ModelRenderer(this, 40, 32);
      firepan.addBox(0F, 0F, 0F, 4, 1, 4);
      firepan.setRotationPoint(-2F, 17F, -2F);
      firepan.setTextureSize(64, 64);
      firepan.mirror = true;
      setRotation(firepan, 0F, 0F, 0F);
      ubwall = new ModelRenderer(this, 53, 38);
      ubwall.addBox(0F, 0F, 0F, 2, 4, 4);
      ubwall.setRotationPoint(-2F, 10F, 4F);
      ubwall.setTextureSize(64, 64);
      ubwall.mirror = true;
      setRotation(ubwall, 0F, 1.570796F, 0F);
      ulwall = new ModelRenderer(this, 20, 20);
      ulwall.addBox(0F, 0F, 0F, 1, 4, 8);
      ulwall.setRotationPoint(2F, 10F, -4F);
      ulwall.setTextureSize(64, 64);
      ulwall.mirror = true;
      setRotation(ulwall, 0F, 0F, 0F);
      urwall = new ModelRenderer(this, 20, 20);
      urwall.addBox(0F, 0F, 0F, 1, 4, 8);
      urwall.setRotationPoint(-3F, 10F, -4F);
      urwall.setTextureSize(64, 64);
      urwall.mirror = true;
      setRotation(urwall, 0F, 0F, 0F);
      troof = new ModelRenderer(this, 14, 11);
      troof.addBox(0F, 0F, 0F, 6, 1, 8);
      troof.setRotationPoint(-3F, 9F, -4F);
      troof.setTextureSize(64, 64);
      troof.mirror = true;
      setRotation(troof, 0F, 0F, 0F);
      lroof = new ModelRenderer(this, 38, 20);
      lroof.addBox(0F, 0F, 0F, 1, 4, 8);
      lroof.setRotationPoint(2F, 10F, -4F);
      lroof.setTextureSize(64, 64);
      lroof.mirror = true;
      setRotation(lroof, 0F, 0F, -0.6108652F);
      rroof = new ModelRenderer(this, 38, 20);
      rroof.addBox(0F, 0F, 0F, 1, 4, 8);
      rroof.setRotationPoint(-2F, 10F, 4F);
      rroof.setTextureSize(64, 64);
      rroof.mirror = true;
      setRotation(rroof, 0F, -3.152065F, -0.6108652F);
      froof = new ModelRenderer(this, 0, 10);
      froof.addBox(0F, 0F, 0F, 1, 4, 6);
      froof.setRotationPoint(-3F, 10F, -3F);
      froof.setTextureSize(64, 64);
      froof.mirror = true;
      setRotation(froof, 0F, 1.570796F, -0.6108652F);
      broof = new ModelRenderer(this, 0, 10);
      broof.addBox(0F, 0F, 0F, 1, 4, 6);
      broof.setRotationPoint(3F, 10F, 3F);
      broof.setTextureSize(64, 64);
      broof.mirror = true;
      setRotation(broof, 0F, -1.570796F, -0.6108652F);
      lwall = new ModelRenderer(this, 0, 20);
      lwall.addBox(0F, 0F, 0F, 2, 4, 8);
      lwall.setRotationPoint(2F, 14F, -4F);
      lwall.setTextureSize(64, 64);
      lwall.mirror = true;
      setRotation(lwall, 0F, 0F, 0F);
      rwall = new ModelRenderer(this, 0, 20);
      rwall.addBox(0F, 0F, 0F, 2, 4, 8);
      rwall.setRotationPoint(-4F, 14F, -4F);
      rwall.setTextureSize(64, 64);
      rwall.mirror = true;
      setRotation(rwall, 0F, 0F, 0F);
      bwall = new ModelRenderer(this, 40, 38);
      bwall.addBox(0F, 0F, 0F, 2, 4, 4);
      bwall.setRotationPoint(-2F, 14F, 4F);
      bwall.setTextureSize(64, 64);
      bwall.mirror = true;
      setRotation(bwall, 0F, 1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    table.render(f5);
    firepan.render(f5);
    ubwall.render(f5);
    ulwall.render(f5);
    urwall.render(f5);
    troof.render(f5);
    lroof.render(f5);
    rroof.render(f5);
    froof.render(f5);
    broof.render(f5);
    lwall.render(f5);
    rwall.render(f5);
    bwall.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

  public void renderModel(float f){
      base.render(f);
      table.render(f);
      firepan.render(f);
      ubwall.render(f);
      ulwall.render(f);
      urwall.render(f);
      troof.render(f);
      lroof.render(f);
      rroof.render(f);
      froof.render(f);
      broof.render(f);
      lwall.render(f);
      rwall.render(f);
      bwall.render(f);
  }

}
