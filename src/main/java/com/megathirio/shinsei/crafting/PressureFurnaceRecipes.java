package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.ShinseiFuels;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PressureFurnaceRecipes {

    public static int stackSize = 2;
	public PressureFurnaceRecipes(){
		
	}
	
	public static ItemStack getPressureFurnaceResult(Item item){

		return getOutput(item);
	}
	
	public static ItemStack getOutput(Item item){
        //Recipe 1
        if(item == Items.coal){
            return new ItemStack(ShinseiFuels.fuelCoke, 1);
        }
            return null;
	}
}
