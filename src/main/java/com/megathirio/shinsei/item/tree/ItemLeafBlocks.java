package com.megathirio.shinsei.item.tree;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLeafBlocks extends ItemBlock {

    public static final String[] leaves = new String[]{"sakura", "ume", "momiji", "matsu"};

    public ItemLeafBlocks(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack istack){
        int intI = istack.getItemDamage();
        if(intI < 0 || intI >= leaves.length){
            intI = 0;
        }
        return super.getUnlocalizedName() + "_" + leaves[intI];
    }

    public int getMetadata (int meta) {
        return meta;
    }
}
