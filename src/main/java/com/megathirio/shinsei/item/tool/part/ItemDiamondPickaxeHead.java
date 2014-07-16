package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemDiamondPickaxeHead extends ItemShinsei {
    public ItemDiamondPickaxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.DIAMOND_PICKAXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
