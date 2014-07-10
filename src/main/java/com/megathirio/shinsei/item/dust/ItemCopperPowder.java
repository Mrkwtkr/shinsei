package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemCopperPowder extends ItemShinsei {
    public ItemCopperPowder(){
        super();
        this.setUnlocalizedName(Names.Items.COPPER_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
