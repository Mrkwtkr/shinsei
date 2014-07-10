package com.megathirio.shinsei.item.liquid;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemSlakedLime extends ItemShinsei {
    public ItemSlakedLime(){
        super();
        this.setUnlocalizedName(Names.Items.SLAKED_LIME);
        this.setMaxStackSize(1);
    }

    public boolean isLiquid(){ return true; }

}
