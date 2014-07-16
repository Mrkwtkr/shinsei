package com.megathirio.shinsei.fluid;

import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidShinsei extends Fluid{

    public FluidShinsei(String name) {
        super(name);

        setDensity(10);
        setViscosity(1000);
        FluidRegistry.registerFluid(this);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
