package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemMagnesiumPowder extends ItemShinsei {
    public ItemMagnesiumPowder(){
        super();
        this.setUnlocalizedName(Names.Items.MAGNESIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
