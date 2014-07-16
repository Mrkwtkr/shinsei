package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemWoodSwordBlade extends ItemShinsei {
    public ItemWoodSwordBlade(){
        super();
        this.setUnlocalizedName(Names.Tools.WOOD_SWORD_BLADE);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
