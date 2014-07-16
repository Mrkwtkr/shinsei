package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemIndiumPowder extends ItemShinsei {
    public ItemIndiumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.INDIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
