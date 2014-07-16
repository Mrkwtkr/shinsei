package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemAntimonyPowder extends ItemShinsei {
    public ItemAntimonyPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.ANTIMONY_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
