package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCadmiumPowder extends ItemShinsei {
    public ItemCadmiumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.CADMIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
