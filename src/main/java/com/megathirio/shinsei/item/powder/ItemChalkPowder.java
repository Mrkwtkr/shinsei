package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemChalkPowder extends ItemShinsei {
    public ItemChalkPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.CHALK_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
