package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemDiamondShovelHead extends ItemShinsei {
    public ItemDiamondShovelHead(){
        super();
        this.setUnlocalizedName(Names.Tools.DIAMOND_SHOVEL_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
