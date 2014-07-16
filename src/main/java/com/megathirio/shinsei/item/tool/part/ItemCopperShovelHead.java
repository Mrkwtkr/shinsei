package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperShovelHead extends ItemShinsei {
    public ItemCopperShovelHead(){
        super();
        this.setUnlocalizedName(Names.Tools.COPPER_SHOVEL_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
