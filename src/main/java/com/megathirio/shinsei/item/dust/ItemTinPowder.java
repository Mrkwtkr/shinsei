package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemTinPowder extends ItemShinsei {
    public ItemTinPowder(){
        super();
        this.setUnlocalizedName(Names.Items.TIN_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
