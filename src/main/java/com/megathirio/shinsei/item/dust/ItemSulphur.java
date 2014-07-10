package com.megathirio.shinsei.item.dust;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.item.Item;

public class ItemSulphur extends ItemShinsei {
    public ItemSulphur(){
        super();
        this.setUnlocalizedName(Names.Items.SULPHUR);

    }

    @Override
    public boolean isPowder(){
        return true;
    }
}
