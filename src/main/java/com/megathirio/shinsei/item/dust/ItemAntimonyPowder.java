package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemAntimonyPowder extends ItemShinsei {
    public ItemAntimonyPowder(){
        super();
        this.setUnlocalizedName(Names.Items.ANTIMONY_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
