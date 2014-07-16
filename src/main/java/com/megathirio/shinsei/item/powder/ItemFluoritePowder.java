package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemFluoritePowder extends ItemShinsei {
    public ItemFluoritePowder(){
        super();
        this.setUnlocalizedName(Names.Powders.FLUORITE_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
