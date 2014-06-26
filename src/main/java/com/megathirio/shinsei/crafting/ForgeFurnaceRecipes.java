package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiIngots;

import com.megathirio.shinsei.items.ShinseiItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ForgeFurnaceRecipes {

	public ForgeFurnaceRecipes(){
		
	}
	
	public static ItemStack getForgeResult(Item item, Item item2, Item item3){
		
		return getOutput(item, item2, item3);
	}
	
	public static ItemStack getOutput(Item item, Item item2, Item item3){
		//Iron Ore Recipe
		if(item == Item.getItemFromBlock(Blocks.iron_ore) && item2 == ShinseiDusts.dustQuicklime && item3 == ShinseiDusts.dustQuicklime || item2 == Item.getItemFromBlock(Blocks.iron_ore) && item == ShinseiDusts.dustQuicklime && item3 == ShinseiDusts.dustQuicklime){
			return new ItemStack(Items.iron_ingot, 2);
		}
        return null;
	}
}
