package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemChromiumPowder extends ItemShinsei {
    public ItemChromiumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.CHROMIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
