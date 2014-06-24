package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiDusts {

	//Item Variables
		//Powders
		public static Item dustArsenic;
        public static Item dustGraphite;
        public static Item dustIridium;
        public static Item dustQuicklime;


    //Item Initialization
	public static void init(){
		
	//Item Initialzation
		//Powders
        dustArsenic = new ShinseiItem().setUnlocalizedName("arsenic_powder");
		GameRegistry.registerItem(dustArsenic, "arsenic_powder");
		OreDictionary.registerOre("dustArsenic", new ItemStack(dustArsenic));

        dustGraphite = new ShinseiItem().setUnlocalizedName("graphite_powder");
        GameRegistry.registerItem(dustGraphite, "graphite_powder");
        OreDictionary.registerOre("dustGraphite", new ItemStack(dustGraphite));

        dustIridium = new ShinseiItem().setUnlocalizedName("iridium_powder");
        GameRegistry.registerItem(dustIridium, "iridium_powder");
        OreDictionary.registerOre("dustIridium", new ItemStack(dustIridium));

        dustQuicklime = new ShinseiItem().setUnlocalizedName("quicklime");
        GameRegistry.registerItem(dustQuicklime, "quicklime");
        OreDictionary.registerOre("dustQuicklime", new ItemStack(dustQuicklime));

	}
}
