package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemIronSwordBlade extends ItemShinsei {
    public ItemIronSwordBlade(){
        super();
        this.setUnlocalizedName(Names.Tools.IRON_SWORD_BLADE);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
