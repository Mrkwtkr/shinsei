package com.megathirio.shinsei.init;

import com.megathirio.shinsei.items.ShinseiItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiFuels {

	//Item Variables
		//Powders
		public static Item fuelSplitWood;
        public static Item fuelCoke;

//Item Initialization
	public static void init(){
		
	//Item Initialzation
        //Fuels
        fuelSplitWood = new ShinseiItem().setUnlocalizedName("split_wood");
        GameRegistry.registerItem(fuelSplitWood, "split_wood");

        fuelCoke = new ShinseiItem().setUnlocalizedName("coke");
        GameRegistry.registerItem(fuelCoke, "coke");

	}
}
