package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemBariumPowder extends ItemShinsei {
    public ItemBariumPowder(){
        super();
        this.setUnlocalizedName(Names.Powders.IRIDIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
