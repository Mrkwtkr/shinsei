package com.megathirio.shinsei.item.liquid;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemMercury extends ItemShinsei {
    public ItemMercury(){
        super();
        this.setUnlocalizedName(Names.Items.MERCURY);
        this.setMaxStackSize(1);
    }

    public boolean isLiquid(){ return true; }

}
