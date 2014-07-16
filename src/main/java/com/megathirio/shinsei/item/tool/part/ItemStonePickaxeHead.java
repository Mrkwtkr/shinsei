package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemStonePickaxeHead extends ItemShinsei {
    public ItemStonePickaxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.STONE_PICKAXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
