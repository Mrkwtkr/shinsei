package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemDiamondSwordBlade extends ItemShinsei {
    public ItemDiamondSwordBlade(){
        super();
        this.setUnlocalizedName(Names.Tools.DIAMOND_SWORD_BLADE);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
