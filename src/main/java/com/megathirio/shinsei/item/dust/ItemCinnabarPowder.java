package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemCinnabarPowder extends ItemShinsei {
    public ItemCinnabarPowder(){
        super();
        this.setUnlocalizedName(Names.Items.CINNABAR_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
