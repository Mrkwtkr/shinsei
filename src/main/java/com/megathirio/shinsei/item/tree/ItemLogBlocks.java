package com.megathirio.shinsei.item.tree;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLogBlocks extends ItemBlock {

    public static final String[] logs = new String[]{"sakura", "ume", "momiji", "matsu"};

    public ItemLogBlocks(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack istack){
        int intI = istack.getItemDamage();
        if(intI < 0 || intI >= logs.length){
            intI = 0;
        }
        return super.getUnlocalizedName() + "_" + logs[intI];
    }

    public int getMetadata (int meta) {
        return meta;
    }
}
