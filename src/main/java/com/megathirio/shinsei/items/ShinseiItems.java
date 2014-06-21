package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiItems {

//Item Variables
	//Fuels
	public static Item itemSplitWood;
	
	
	//Mineral Drops
	public static Item itemLimestoneShard;
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
		itemSplitWood = new ShinseiItem().setUnlocalizedName("split_wood");
		GameRegistry.registerItem(itemSplitWood, "split_wood");
		
		//Mineral Drops
		itemLimestoneShard = new ShinseiItem().setUnlocalizedName("limestone_shard");
		GameRegistry.registerItem(itemLimestoneShard, "limestone_shard");
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
