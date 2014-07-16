package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemNickelPowder extends ItemShinsei {
    public ItemNickelPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.NICKEL_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
