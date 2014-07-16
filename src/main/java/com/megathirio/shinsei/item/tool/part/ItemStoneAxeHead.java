package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemStoneAxeHead extends ItemShinsei {
    public ItemStoneAxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.STONE_AXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
