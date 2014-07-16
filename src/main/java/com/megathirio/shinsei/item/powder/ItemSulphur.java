package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemSulphur extends ItemShinsei {
    public ItemSulphur(){
        super();
        this.setUnlocalizedName(Names.Powders.SULPHUR);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
