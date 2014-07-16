package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperHoeHead extends ItemShinsei {
    public ItemCopperHoeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.COPPER_HOE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
