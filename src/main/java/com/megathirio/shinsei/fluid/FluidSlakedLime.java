package com.megathirio.shinsei.fluid;

import com.megathirio.shinsei.reference.Names;

public class FluidSlakedLime extends FluidShinsei {

    public FluidSlakedLime() {
        super(Names.Fluids.SLAKED_LIME);

        setDensity(20);
        setViscosity(2000);
        this.setUnlocalizedName(Names.Fluids.SLAKED_LIME);
    }
}
