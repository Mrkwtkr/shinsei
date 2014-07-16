package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemWoodAxeHead extends ItemShinsei {
    public ItemWoodAxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.WOOD_AXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
