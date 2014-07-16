package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemWoodPickaxeHead extends ItemShinsei {
    public ItemWoodPickaxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.WOOD_PICKAXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
