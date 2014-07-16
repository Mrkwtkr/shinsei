package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCobaltPowder extends ItemShinsei {
    public ItemCobaltPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.COBALT_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
