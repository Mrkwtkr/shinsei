package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemTantalumPowder extends ItemShinsei {
    public ItemTantalumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.TANTALUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
