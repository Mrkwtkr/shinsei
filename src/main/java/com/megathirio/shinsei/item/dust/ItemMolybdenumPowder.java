package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemMolybdenumPowder extends ItemShinsei {
    public ItemMolybdenumPowder(){
        super();
        this.setUnlocalizedName(Names.Items.MOLYBDENUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
