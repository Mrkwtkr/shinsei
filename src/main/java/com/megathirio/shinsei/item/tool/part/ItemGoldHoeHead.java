package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemGoldHoeHead extends ItemShinsei {
    public ItemGoldHoeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.GOLD_HOE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
