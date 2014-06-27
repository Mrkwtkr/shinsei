package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiOre;
import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiIngots;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PressureFurnaceRecipes {

	public PressureFurnaceRecipes(){
		
	}
	
	public static ItemStack getPressureResult(Item item, Item item2){
		
		return getOutput(item, item2);
	}
	
	public static ItemStack getOutput(Item item, Item item2){
		//Bauxite Ore Recipe
		if(item == Item.getItemFromBlock(ShinseiBlocks.oreBauxite) && item2 == ShinseiDusts.dustQuicklime || item2 == Item.getItemFromBlock(ShinseiBlocks.oreBauxite) && item == ShinseiDusts.dustQuicklime){
			return new ItemStack(ShinseiIngots.ingotAluminum, 1);
		}
        return null;
	}
}
