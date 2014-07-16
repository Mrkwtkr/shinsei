package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemIronHoeHead extends ItemShinsei {
    public ItemIronHoeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.IRON_HOE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
