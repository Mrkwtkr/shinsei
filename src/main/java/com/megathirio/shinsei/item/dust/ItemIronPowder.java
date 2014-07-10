package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemIronPowder extends ItemShinsei {
    public ItemIronPowder(){
        super();
        this.setUnlocalizedName(Names.Items.IRON_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
