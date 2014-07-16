package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemAluminumPowder extends ItemShinsei {
    public ItemAluminumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.ALUMINUM_POWDER);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
