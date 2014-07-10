package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemArsenicPowder extends ItemShinsei {
    public ItemArsenicPowder(){
        super();
        this.setUnlocalizedName(Names.Items.ARSENIC_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
