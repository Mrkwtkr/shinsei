package com.megathirio.shinsei.item;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBrickBlock extends ItemBlockWithMetadata{

	final static String[] subBlocks = new String[] {Names.Colors.GRAY, Names.Colors.TAN, Names.Colors.VARIEGATED};

	public ItemBrickBlock(Block block) {
		super(block, block);
	}

	public String getUnlocalizedName(ItemStack itemStack){
		
		int i = itemStack.getItemDamage();
		if(i < 0 || i >= subBlocks.length){
			i = 0;
		}
		
		return super.getUnlocalizedName() + subBlocks[i];
		
	}

	public int getMetaData(int meta){
		return meta;
	}
	
}
