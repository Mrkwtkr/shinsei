package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperPowder extends ItemShinsei {
    public ItemCopperPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.COPPER_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
