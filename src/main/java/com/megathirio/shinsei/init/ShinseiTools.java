package com.megathirio.shinsei.init;

import com.megathirio.shinsei.item.*;
import com.megathirio.shinsei.item.tool.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ShinseiTools {

//Tool Variables
	//Casts
	public static Item itemAxeCast;
	public static Item itemHoeCast;
	public static Item itemPickaxeCast;
	public static Item itemShovelCast;
	public static Item itemSwordCast;

	//Tool Parts
	public static Item itemWoodToolHandle;
	
	//Axes
	public static Item itemAluminumAxeHead;
	public static Item itemCopperAxeHead;
	public static Item itemStoneAxeHead;
	public static Item itemDiamondAxeHead;
	public static Item itemGoldAxeHead;
	public static Item itemIronAxeHead;
	public static Item itemWoodAxeHead;
	
	//Hoes
	public static Item itemAluminumHoeHead;
	public static Item itemCopperHoeHead;
	public static Item itemStoneHoeHead;
	public static Item itemDiamondHoeHead;
	public static Item itemGoldHoeHead;
	public static Item itemIronHoeHead;
	public static Item itemWoodHoeHead;
	
	//Pickaxes
	public static Item itemAluminumPickaxeHead;
	public static Item itemCopperPickaxeHead;
	public static Item itemStonePickaxeHead;
	public static Item itemDiamondPickaxeHead;
	public static Item itemGoldPickaxeHead;
	public static Item itemIronPickaxeHead;
	public static Item itemWoodPickaxeHead;
	
	//Shovels
	public static Item itemAluminumShovelHead;
	public static Item itemCopperShovelHead;
	public static Item itemStoneShovelHead;
	public static Item itemDiamondShovelHead;
	public static Item itemGoldShovelHead;
	public static Item itemIronShovelHead;
	public static Item itemWoodShovelHead;
	
	//Swords
	public static Item itemAluminumSwordBlade;
	public static Item itemCopperSwordBlade;
	public static Item itemStoneSwordBlade;
	public static Item itemDiamondSwordBlade;
	public static Item itemGoldSwordBlade;
	public static Item itemIronSwordBlade;
	public static Item itemWoodSwordBlade;
	
	
	//Tool Initialization
	public static void init(){
		
		//Casts
		itemAxeCast = new ItemShinsei().setUnlocalizedName("axe_cast");
		GameRegistry.registerItem(itemAxeCast, "axe_cast");

		itemHoeCast = new ItemShinsei().setUnlocalizedName("hoe_cast");
		GameRegistry.registerItem(itemHoeCast, "hoe_cast");

		itemPickaxeCast = new ItemShinsei().setUnlocalizedName("pickaxe_cast");
		GameRegistry.registerItem(itemPickaxeCast, "pickaxe_cast");

		itemShovelCast = new ItemShinsei().setUnlocalizedName("shovel_cast");
		GameRegistry.registerItem(itemShovelCast, "shovel_cast");

		itemSwordCast = new ItemShinsei().setUnlocalizedName("sword_cast");
		GameRegistry.registerItem(itemSwordCast, "sword_cast");


		//Tool Parts		
		itemWoodToolHandle = new ItemShinsei().setUnlocalizedName("wood_tool_handle").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemWoodToolHandle, "wood_tool_handle");
		
		
		//Axes
		itemAluminumAxeHead = new ItemShinsei().setUnlocalizedName("aluminum_axe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemAluminumAxeHead, "aluminum_axe_head");
		itemCopperAxeHead = new ItemShinsei().setUnlocalizedName("copper_axe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemCopperAxeHead, "copper_axe_head");
		itemStoneAxeHead = new ItemShinsei().setUnlocalizedName("stone_axe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemStoneAxeHead, "stone_axe_head");
		itemGoldAxeHead = new ItemShinsei().setUnlocalizedName("gold_axe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemGoldAxeHead, "gold_axe_head");
		itemDiamondAxeHead = new ItemShinsei().setUnlocalizedName("diamond_axe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemDiamondAxeHead, "diamond_axe_head");
		itemIronAxeHead = new ItemShinsei().setUnlocalizedName("iron_axe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemIronAxeHead, "iron_axe_head");
		itemWoodAxeHead = new ItemShinsei().setUnlocalizedName("wood_axe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemWoodAxeHead, "wood_axe_head");

		
		//Hoes
		itemAluminumHoeHead = new ItemShinsei().setUnlocalizedName("aluminum_hoe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemAluminumHoeHead, "aluminum_hoe_head");
		itemCopperHoeHead = new ItemShinsei().setUnlocalizedName("copper_hoe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemCopperHoeHead, "copper_hoe_head");
		itemStoneHoeHead = new ItemShinsei().setUnlocalizedName("stone_hoe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemStoneHoeHead, "stone_hoe_head");
		itemGoldHoeHead = new ItemShinsei().setUnlocalizedName("gold_hoe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemGoldHoeHead, "gold_hoe_head");
		itemDiamondHoeHead = new ItemShinsei().setUnlocalizedName("diamond_hoe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemDiamondHoeHead, "diamond_hoe_head");
		itemIronHoeHead = new ItemShinsei().setUnlocalizedName("iron_hoe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemIronHoeHead, "iron_hoe_head");
		itemWoodHoeHead = new ItemShinsei().setUnlocalizedName("wood_hoe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemWoodHoeHead, "wood_hoe_head");
		
		
		//Pickaxes
		itemAluminumPickaxeHead = new ItemShinsei().setUnlocalizedName("aluminum_pickaxe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemAluminumPickaxeHead, "aluminum_pickaxe_head");
		itemCopperPickaxeHead = new ItemShinsei().setUnlocalizedName("copper_pickaxe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemCopperPickaxeHead, "copper_pickaxe_head");
		itemStonePickaxeHead = new ItemShinsei().setUnlocalizedName("stone_pickaxe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemStonePickaxeHead, "stone_pickaxe_head");
		itemGoldPickaxeHead = new ItemShinsei().setUnlocalizedName("gold_pickaxe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemGoldPickaxeHead, "gold_pickaxe_head");
		itemDiamondPickaxeHead = new ItemShinsei().setUnlocalizedName("diamond_pickaxe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemDiamondPickaxeHead, "diamond_pickaxe_head");
		itemIronPickaxeHead = new ItemShinsei().setUnlocalizedName("iron_pickaxe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemIronPickaxeHead, "iron_pickaxe_head");
		itemWoodPickaxeHead = new ItemShinsei().setUnlocalizedName("wood_pickaxe_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemWoodPickaxeHead, "wood_pickaxe_head");

		
		//Shovels
		itemAluminumShovelHead = new ItemShinsei().setUnlocalizedName("aluminum_shovel_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemAluminumShovelHead, "aluminum_shovel_head");
		itemCopperShovelHead = new ItemShinsei().setUnlocalizedName("copper_shovel_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemCopperShovelHead, "copper_shovel_head");
		itemStoneShovelHead = new ItemShinsei().setUnlocalizedName("stone_shovel_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemStoneShovelHead, "stone_shovel_head");
		itemGoldShovelHead = new ItemShinsei().setUnlocalizedName("gold_shovel_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemGoldShovelHead, "gold_shovel_head");
		itemDiamondShovelHead = new ItemShinsei().setUnlocalizedName("diamond_shovel_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemDiamondShovelHead, "diamond_shovel_head");
		itemIronShovelHead = new ItemShinsei().setUnlocalizedName("iron_shovel_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemIronShovelHead, "iron_shovel_head");
		itemWoodShovelHead = new ItemShinsei().setUnlocalizedName("wood_shovel_head").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemWoodShovelHead, "wood_shovel_head");

		
		
		//Swords
		itemAluminumSwordBlade = new ItemShinsei().setUnlocalizedName("aluminum_sword_blade").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemAluminumSwordBlade, "aluminum_sword_blade");
		itemCopperSwordBlade = new ItemShinsei().setUnlocalizedName("copper_sword_blade").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemCopperSwordBlade, "copper_sword_blade");
		itemStoneSwordBlade = new ItemShinsei().setUnlocalizedName("stone_sword_blade").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemStoneSwordBlade, "stone_sword_blade");
		itemGoldSwordBlade = new ItemShinsei().setUnlocalizedName("gold_sword_blade").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemGoldSwordBlade, "gold_sword_blade");
		itemDiamondSwordBlade = new ItemShinsei().setUnlocalizedName("diamond_sword_blade").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemDiamondSwordBlade, "diamond_sword_blade");
		itemIronSwordBlade = new ItemShinsei().setUnlocalizedName("iron_sword_blade").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemIronSwordBlade, "iron_sword_blade");
		itemWoodSwordBlade = new ItemShinsei().setUnlocalizedName("wood_sword_blade").setCreativeTab(ShinseiTabs.BLOCKS_TAB);
		GameRegistry.registerItem(itemWoodSwordBlade, "wood_sword_blade");
		
	}
}
