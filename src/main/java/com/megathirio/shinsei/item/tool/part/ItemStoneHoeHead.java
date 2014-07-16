package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemStoneHoeHead extends ItemShinsei {
    public ItemStoneHoeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.STONE_HOE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
