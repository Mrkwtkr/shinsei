package com.megathirio.shinsei.core.handler;

import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	//Fuel Setup
	@Override
	public int getBurnTime(ItemStack fuel) {
		
		/*
		 Vanilla Burn Times: 
	 	 Wooden Slab - 150
	 	 Wood - 300
	 	 Coal Block - 16000
	 	 Wooden Tools - 200
	 	 Stick - 100
	 	 Coal - 1600
	 	 Lava Bucket 20000
	 	 Sapling - 100
	 	 Blaze Rod - 2400
		*/	 
		//Fuel Burn Times
		if(fuel.getItem() == ShinseiItems.splitWood) return 800;
        if(fuel.getItem() == ShinseiItems.coke) return 2400;

		return 0;
	}

}
