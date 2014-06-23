package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiFuels;
import com.megathirio.shinsei.items.ShinseiIngots;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.tileentity.TileEntityWoodFurnace;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WoodFurnaceRecipes {

    public static int stackSize = 2;
	public WoodFurnaceRecipes(){
		
	}
	
	public static ItemStack getWoodFurnaceResult(Item item){

		return getOutput(item);
	}
	
	public static ItemStack getOutput(Item item){
        //Recipe 1
        if(item == Items.coal){
            return new ItemStack(ShinseiFuels.fuelCoke, stackSize);
        }
            return null;
	}
}
