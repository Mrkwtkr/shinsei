package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemTitaniumPowder extends ItemShinsei {
    public ItemTitaniumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.TITANIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
