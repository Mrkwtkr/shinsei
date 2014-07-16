package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCryolitePowder extends ItemShinsei {
    public ItemCryolitePowder(){
        super();
        this.setUnlocalizedName(Names.Powders.CRYOLITE_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
