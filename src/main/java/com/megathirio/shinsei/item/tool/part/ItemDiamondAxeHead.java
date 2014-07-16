package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemDiamondAxeHead extends ItemShinsei {
    public ItemDiamondAxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.DIAMOND_AXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
