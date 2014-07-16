package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemGoldPickaxeHead extends ItemShinsei {
    public ItemGoldPickaxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.GOLD_PICKAXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
