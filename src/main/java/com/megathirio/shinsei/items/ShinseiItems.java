package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiItems {

//Item Variables
	//Fuels
	public static Item fuelSplitWood;
    public static Item fuelCoke;

	
	//Mineral Drops
	public static Item itemLime;
    public static Item itemQuicklime;
    public static Item itemSlakedLime;
	public static Item itemSilt;

    //Upgrades
    public static Item itemBellows;
    public static Item itemPistonBellows;
    public static Item itemCopperPlate;
    public static Item itemIronPlate;
    public static Item itemCopperHeatPlate;
    public static Item itemIronHeatPlate;

	//Item Initialization
	public static void init(){
		
	//Item Initialzation
		//Fuels
		fuelSplitWood = new ShinseiItem().setUnlocalizedName("split_wood");
		GameRegistry.registerItem(fuelSplitWood, "split_wood");

        fuelCoke = new ShinseiItem().setUnlocalizedName("coke");
        GameRegistry.registerItem(fuelCoke, "coke");

		//Mineral Drops
		itemLime = new ShinseiItem().setUnlocalizedName("lime");
		GameRegistry.registerItem(itemLime, "lime");

        itemQuicklime = new ShinseiItem().setUnlocalizedName("quicklime");
        GameRegistry.registerItem(itemLime, "quicklime");

        itemSlakedLime = new ShinseiItem().setUnlocalizedName("slaked_lime");
        GameRegistry.registerItem(itemSlakedLime, "slaked_lime");

        itemSilt = new ShinseiItem().setUnlocalizedName("silt");
		GameRegistry.registerItem(itemSilt, "silt");

        //Upgrades
        itemBellows = new ShinseiItem().setUnlocalizedName("bellows").setMaxStackSize(1);
        GameRegistry.registerItem(itemBellows, "bellows");

        itemPistonBellows = new ShinseiItem().setUnlocalizedName("bellows_piston").setMaxStackSize(1);
        GameRegistry.registerItem(itemPistonBellows, "bellows_piston");

        itemCopperPlate = new ShinseiItem().setUnlocalizedName("copper_plate");
        GameRegistry.registerItem(itemCopperPlate, "copper_plate");

        itemIronPlate = new ShinseiItem().setUnlocalizedName("iron_plate");
        GameRegistry.registerItem(itemIronPlate, "iron_plate");

        itemCopperHeatPlate = new ShinseiItem().setUnlocalizedName("copper_heat_plate");
        GameRegistry.registerItem(itemCopperHeatPlate, "copper_heat_plate");

        itemIronHeatPlate = new ShinseiItem().setUnlocalizedName("iron_heat_plate");
        GameRegistry.registerItem(itemIronHeatPlate, "iron_heat_plate");

	}
}
