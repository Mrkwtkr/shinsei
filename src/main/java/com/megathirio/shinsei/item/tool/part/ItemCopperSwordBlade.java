package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperSwordBlade extends ItemShinsei {
    public ItemCopperSwordBlade(){
        super();
        this.setUnlocalizedName(Names.Tools.COPPER_SWORD_BLADE);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
