package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemGraphitePowder extends ItemShinsei {
    public ItemGraphitePowder(){
        super();
        this.setUnlocalizedName(Names.Items.GRAPHITE_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
