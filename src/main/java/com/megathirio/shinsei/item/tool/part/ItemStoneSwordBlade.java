package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemStoneSwordBlade extends ItemShinsei {
    public ItemStoneSwordBlade(){
        super();
        this.setUnlocalizedName(Names.Tools.STONE_SWORD_BLADE);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
