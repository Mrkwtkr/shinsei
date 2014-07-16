package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemSilverPowder extends ItemShinsei {
    public ItemSilverPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.SILVER_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
