package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemWoodHoeHead extends ItemShinsei {
    public ItemWoodHoeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.WOOD_HOE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
