package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemIronPickaxeHead extends ItemShinsei {
    public ItemIronPickaxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.IRON_PICKAXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
