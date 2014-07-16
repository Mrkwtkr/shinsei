package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemPlatinumPowder extends ItemShinsei {
    public ItemPlatinumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.PLATINUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
