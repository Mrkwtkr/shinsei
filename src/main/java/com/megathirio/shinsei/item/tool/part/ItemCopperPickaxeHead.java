package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperPickaxeHead extends ItemShinsei {
    public ItemCopperPickaxeHead(){
        super();
        this.setUnlocalizedName(Names.Tools.COPPER_PICKAXE_HEAD);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
