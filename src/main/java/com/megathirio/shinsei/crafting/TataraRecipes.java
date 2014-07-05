package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.init.ShinseiFuels;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TataraRecipes {

	public TataraRecipes(){

	}

	public static ItemStack getTataraResult(Item item){

		return getOutput(item);
	}
	
	public static ItemStack getOutput(Item item){
        //Coke Recipe
        if(item == Items.coal){
            return new ItemStack(ShinseiFuels.fuelCoke, 1);
        }
            return null;
	}
}
