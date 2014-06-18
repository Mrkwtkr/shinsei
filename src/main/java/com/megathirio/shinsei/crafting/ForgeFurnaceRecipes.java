package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiIngots;

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
		//Recipe 1
		if(item == ShinseiIngots.itemAluminumIngot && item2 == ShinseiIngots.itemChromiumIngot && item3 == ShinseiDusts.itemArsenicPowder || item2 == ShinseiIngots.itemAluminumIngot && item == ShinseiIngots.itemChromiumIngot && item3 == ShinseiDusts.itemArsenicPowder){
			return new ItemStack(ShinseiIngots.itemIndiumIngot, 2);
		}
            return null;
	}
}
