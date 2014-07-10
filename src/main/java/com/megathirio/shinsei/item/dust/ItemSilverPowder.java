package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemSilverPowder extends ItemShinsei {
    public ItemSilverPowder(){
        super();
        this.setUnlocalizedName(Names.Items.SILVER_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
