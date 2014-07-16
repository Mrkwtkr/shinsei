package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemStoneShovelHead extends ItemShinsei {
    public ItemStoneShovelHead(){
        super();
        this.setUnlocalizedName(Names.Tools.STONE_SHOVEL_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
