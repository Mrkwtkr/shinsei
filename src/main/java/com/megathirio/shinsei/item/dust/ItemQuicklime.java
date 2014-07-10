package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemQuicklime extends ItemShinsei {
    public ItemQuicklime(){
        super();
        this.setUnlocalizedName(Names.Items.QUICKLIME);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
