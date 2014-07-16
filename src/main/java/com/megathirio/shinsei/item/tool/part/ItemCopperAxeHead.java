package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperAxeHead extends ItemShinsei {
    public ItemCopperAxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.COPPER_AXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
