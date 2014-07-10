package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemAluminumPowder extends ItemShinsei {
    public ItemAluminumPowder(){
        super();
        this.setUnlocalizedName(Names.Items.ALUMINUM_POWDER);
    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
