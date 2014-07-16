package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemIronPowder extends ItemShinsei {
    public ItemIronPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.IRON_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
