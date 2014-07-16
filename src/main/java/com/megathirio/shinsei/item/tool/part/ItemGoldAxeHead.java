package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemGoldAxeHead extends ItemShinsei {
    public ItemGoldAxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.GOLD_AXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
