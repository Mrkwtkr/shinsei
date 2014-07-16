package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemIronAxeHead extends ItemShinsei {
    public ItemIronAxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.IRON_AXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
