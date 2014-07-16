package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemBoraxPowder extends ItemShinsei {
    public ItemBoraxPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.BORAX_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
