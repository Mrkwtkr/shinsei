package com.megathirio.shinsei.item.tool.part;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemWoodToolHandle extends ItemShinsei {
    public ItemWoodToolHandle(){
        super();
        this.setUnlocalizedName(Names.Tools.WOOD_TOOL_HANDLE);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
