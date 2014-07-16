package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemIronShovelHead extends ItemShinsei {
    public ItemIronShovelHead(){
        super();
        this.setUnlocalizedName(Names.Tools.IRON_SHOVEL_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
