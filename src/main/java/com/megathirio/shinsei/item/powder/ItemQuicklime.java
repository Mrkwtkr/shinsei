package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemQuicklime extends ItemShinsei {
    public ItemQuicklime(){
        super();
        this.setUnlocalizedName(Names.Powders.QUICKLIME);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
