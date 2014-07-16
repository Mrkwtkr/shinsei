package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemArsenicPowder extends ItemShinsei {
    public ItemArsenicPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.ARSENIC_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
