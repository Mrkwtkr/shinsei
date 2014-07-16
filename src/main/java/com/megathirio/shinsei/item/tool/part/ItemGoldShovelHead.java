package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemGoldShovelHead extends ItemShinsei {
    public ItemGoldShovelHead(){
        super();
        this.setUnlocalizedName(Names.Tools.GOLD_SHOVEL_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
