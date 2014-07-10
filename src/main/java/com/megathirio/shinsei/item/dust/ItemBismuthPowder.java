package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemBismuthPowder extends ItemShinsei {
    public ItemBismuthPowder(){
        super();
        this.setUnlocalizedName(Names.Items.BISMUTH_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
