package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemLeadPowder extends ItemShinsei {
    public ItemLeadPowder(){
        super();
        this.setUnlocalizedName(Names.Items.LEAD_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
