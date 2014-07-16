package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemDiamondHoeHead extends ItemShinsei {
    public ItemDiamondHoeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.DIAMOND_HOE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
