package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemChromiumPowder extends ItemShinsei {
    public ItemChromiumPowder(){
        super();
        this.setUnlocalizedName(Names.Items.CHROMIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
