package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiDusts {

	//Item Variables
		//Powders
		public static Item itemArsenicPowder;
        public static Item itemGraphitePowder;
        public static Item itemIridiumPowder;

//Item Initialization
	public static void init(){
		
	//Item Initialzation
		//Powders
		itemArsenicPowder = new ShinseiItem().setUnlocalizedName("arsenic_powder");
		GameRegistry.registerItem(itemArsenicPowder, "arsenic_powder");
		OreDictionary.registerOre("dustArsenic", new ItemStack(itemArsenicPowder));

        itemGraphitePowder = new ShinseiItem().setUnlocalizedName("graphite_powder");
        GameRegistry.registerItem(itemGraphitePowder, "graphite_powder");
        OreDictionary.registerOre("dustGraphite", new ItemStack(itemGraphitePowder));

        itemIridiumPowder = new ShinseiItem().setUnlocalizedName("iridium_powder");
        GameRegistry.registerItem(itemIridiumPowder, "iridium_powder");
        OreDictionary.registerOre("dustIridium", new ItemStack(itemIridiumPowder));
	}
}
