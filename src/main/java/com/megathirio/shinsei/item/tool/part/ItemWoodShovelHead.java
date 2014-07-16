package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemWoodShovelHead extends ItemShinsei {
    public ItemWoodShovelHead(){
        super();
        this.setUnlocalizedName(Names.Tools.WOOD_SHOVEL_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
