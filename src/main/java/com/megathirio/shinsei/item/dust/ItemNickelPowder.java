package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemNickelPowder extends ItemShinsei {
    public ItemNickelPowder(){
        super();
        this.setUnlocalizedName(Names.Items.NICKEL_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
