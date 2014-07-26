package com.megathirio.shinsei.item;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemGraniteBlock extends ItemBlockWithMetadata{

	final static String[] subBlocks = new String[] {Names.Colors.WHITE, Names.Colors.BLACK, Names.Colors.BLUE, Names.Colors.BROWN, Names.Colors.CYAN, Names.Colors.GRAY, Names.Colors.GREEN, Names.Colors.LT_BLUE, Names.Colors.LIME, Names.Colors.MAGENTA, Names.Colors.ORANGE, Names.Colors.PINK, Names.Colors.PURPLE, Names.Colors.RED, Names.Colors.SILVER, Names.Colors.YELLOW};

	public ItemGraniteBlock(Block block) {
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
