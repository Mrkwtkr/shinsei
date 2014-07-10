package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemBariumPowder extends ItemShinsei {
    public ItemBariumPowder(){
        super();
        this.setUnlocalizedName(Names.Items.IRIDIUM_POWDER);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
