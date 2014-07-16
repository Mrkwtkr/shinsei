package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemTinPowder extends ItemShinsei {
    public ItemTinPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.TIN_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
