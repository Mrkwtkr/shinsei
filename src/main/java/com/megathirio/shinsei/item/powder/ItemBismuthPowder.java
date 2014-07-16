package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemBismuthPowder extends ItemShinsei {
    public ItemBismuthPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.BISMUTH_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
