package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCinnabarPowder extends ItemShinsei {
    public ItemCinnabarPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.CINNABAR_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
