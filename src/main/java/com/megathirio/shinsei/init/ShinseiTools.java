package com.megathirio.shinsei.init;

import com.megathirio.shinsei.items.*;
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
	
	
//Tools
	//Axes
	public static Item itemAluminumAxe;
	public static Item itemCopperAxe;

	//Hoes
	public static Item itemAluminumHoe;
	public static Item itemCopperHoe;

	//Pickaxes
	public static Item itemAluminumPickaxe;
	public static Item itemCopperPickaxe;

	//Shovels
	public static Item itemAluminumShovel;
	public static Item itemCopperShovel;

	//Swords
	public static Item itemAluminumSword;
	public static Item itemCopperSword;

	//Tool Initialization
	public static void init(){
		
		//Casts
		itemAxeCast = new ShinseiItem().setUnlocalizedName("axe_cast");
		GameRegistry.registerItem(itemAxeCast, "axe_cast");

		itemHoeCast = new ShinseiItem().setUnlocalizedName("hoe_cast");
		GameRegistry.registerItem(itemHoeCast, "hoe_cast");

		itemPickaxeCast = new ShinseiItem().setUnlocalizedName("pickaxe_cast");
		GameRegistry.registerItem(itemPickaxeCast, "pickaxe_cast");

		itemShovelCast = new ShinseiItem().setUnlocalizedName("shovel_cast");
		GameRegistry.registerItem(itemShovelCast, "shovel_cast");

		itemSwordCast = new ShinseiItem().setUnlocalizedName("sword_cast");
		GameRegistry.registerItem(itemSwordCast, "sword_cast");


		//Tool Parts		
		itemWoodToolHandle = new ShinseiItem().setUnlocalizedName("wood_tool_handle").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemWoodToolHandle, "wood_tool_handle");
		
		
		//Axes
		itemAluminumAxeHead = new ShinseiItem().setUnlocalizedName("aluminum_axe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemAluminumAxeHead, "aluminum_axe_head");
		itemCopperAxeHead = new ShinseiItem().setUnlocalizedName("copper_axe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemCopperAxeHead, "copper_axe_head");
		itemStoneAxeHead = new ShinseiItem().setUnlocalizedName("stone_axe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemStoneAxeHead, "stone_axe_head");
		itemGoldAxeHead = new ShinseiItem().setUnlocalizedName("gold_axe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemGoldAxeHead, "gold_axe_head");
		itemDiamondAxeHead = new ShinseiItem().setUnlocalizedName("diamond_axe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemDiamondAxeHead, "diamond_axe_head");
		itemIronAxeHead = new ShinseiItem().setUnlocalizedName("iron_axe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemIronAxeHead, "iron_axe_head");
		itemWoodAxeHead = new ShinseiItem().setUnlocalizedName("wood_axe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemWoodAxeHead, "wood_axe_head");

		
		//Hoes
		itemAluminumHoeHead = new ShinseiItem().setUnlocalizedName("aluminum_hoe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemAluminumHoeHead, "aluminum_hoe_head");
		itemCopperHoeHead = new ShinseiItem().setUnlocalizedName("copper_hoe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemCopperHoeHead, "copper_hoe_head");
		itemStoneHoeHead = new ShinseiItem().setUnlocalizedName("stone_hoe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemStoneHoeHead, "stone_hoe_head");
		itemGoldHoeHead = new ShinseiItem().setUnlocalizedName("gold_hoe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemGoldHoeHead, "gold_hoe_head");
		itemDiamondHoeHead = new ShinseiItem().setUnlocalizedName("diamond_hoe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemDiamondHoeHead, "diamond_hoe_head");
		itemIronHoeHead = new ShinseiItem().setUnlocalizedName("iron_hoe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemIronHoeHead, "iron_hoe_head");
		itemWoodHoeHead = new ShinseiItem().setUnlocalizedName("wood_hoe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemWoodHoeHead, "wood_hoe_head");
		
		
		//Pickaxes
		itemAluminumPickaxeHead = new ShinseiItem().setUnlocalizedName("aluminum_pickaxe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemAluminumPickaxeHead, "aluminum_pickaxe_head");
		itemCopperPickaxeHead = new ShinseiItem().setUnlocalizedName("copper_pickaxe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemCopperPickaxeHead, "copper_pickaxe_head");
		itemStonePickaxeHead = new ShinseiItem().setUnlocalizedName("stone_pickaxe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemStonePickaxeHead, "stone_pickaxe_head");
		itemGoldPickaxeHead = new ShinseiItem().setUnlocalizedName("gold_pickaxe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemGoldPickaxeHead, "gold_pickaxe_head");
		itemDiamondPickaxeHead = new ShinseiItem().setUnlocalizedName("diamond_pickaxe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemDiamondPickaxeHead, "diamond_pickaxe_head");
		itemIronPickaxeHead = new ShinseiItem().setUnlocalizedName("iron_pickaxe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemIronPickaxeHead, "iron_pickaxe_head");
		itemWoodPickaxeHead = new ShinseiItem().setUnlocalizedName("wood_pickaxe_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemWoodPickaxeHead, "wood_pickaxe_head");

		
		//Shovels
		itemAluminumShovelHead = new ShinseiItem().setUnlocalizedName("aluminum_shovel_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemAluminumShovelHead, "aluminum_shovel_head");
		itemCopperShovelHead = new ShinseiItem().setUnlocalizedName("copper_shovel_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemCopperShovelHead, "copper_shovel_head");
		itemStoneShovelHead = new ShinseiItem().setUnlocalizedName("stone_shovel_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemStoneShovelHead, "stone_shovel_head");
		itemGoldShovelHead = new ShinseiItem().setUnlocalizedName("gold_shovel_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemGoldShovelHead, "gold_shovel_head");
		itemDiamondShovelHead = new ShinseiItem().setUnlocalizedName("diamond_shovel_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemDiamondShovelHead, "diamond_shovel_head");
		itemIronShovelHead = new ShinseiItem().setUnlocalizedName("iron_shovel_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemIronShovelHead, "iron_shovel_head");
		itemWoodShovelHead = new ShinseiItem().setUnlocalizedName("wood_shovel_head").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemWoodShovelHead, "wood_shovel_head");

		
		
		//Swords
		itemAluminumSwordBlade = new ShinseiItem().setUnlocalizedName("aluminum_sword_blade").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemAluminumSwordBlade, "aluminum_sword_blade");
		itemCopperSwordBlade = new ShinseiItem().setUnlocalizedName("copper_sword_blade").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemCopperSwordBlade, "copper_sword_blade");
		itemStoneSwordBlade = new ShinseiItem().setUnlocalizedName("stone_sword_blade").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemStoneSwordBlade, "stone_sword_blade");
		itemGoldSwordBlade = new ShinseiItem().setUnlocalizedName("gold_sword_blade").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemGoldSwordBlade, "gold_sword_blade");
		itemDiamondSwordBlade = new ShinseiItem().setUnlocalizedName("diamond_sword_blade").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemDiamondSwordBlade, "diamond_sword_blade");
		itemIronSwordBlade = new ShinseiItem().setUnlocalizedName("iron_sword_blade").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemIronSwordBlade, "iron_sword_blade");
		itemWoodSwordBlade = new ShinseiItem().setUnlocalizedName("wood_sword_blade").setCreativeTab(ShinseiTabs.toolsTab);
		GameRegistry.registerItem(itemWoodSwordBlade, "wood_sword_blade");
		
		
	
	//Tools		
		//Axes
		itemAluminumAxe = new ShinseiAxe(ShinseiMaterials.materialAluminum).setUnlocalizedName("aluminum_axe");
		GameRegistry.registerItem(itemAluminumAxe, "aluminum_axe");
		itemCopperAxe = new ShinseiAxe(ShinseiMaterials.materialCopper).setUnlocalizedName("copper_axe");
		GameRegistry.registerItem(itemCopperAxe, "copper_axe");

		//Hoes
		itemAluminumHoe = new ShinseiHoe(ShinseiMaterials.materialAluminum).setUnlocalizedName("aluminum_hoe");
		GameRegistry.registerItem(itemAluminumHoe, "aluminum_hoe");
		itemCopperHoe = new ShinseiHoe(ShinseiMaterials.materialCopper).setUnlocalizedName("copper_hoe");
		GameRegistry.registerItem(itemCopperHoe, "copper_hoe");

		//Pickaxes
		itemAluminumPickaxe = new ShinseiPickaxe(ShinseiMaterials.materialAluminum).setUnlocalizedName("aluminum_pickaxe");
		GameRegistry.registerItem(itemAluminumPickaxe, "aluminum_pickaxe");
		itemCopperPickaxe = new ShinseiPickaxe(ShinseiMaterials.materialCopper).setUnlocalizedName("copper_pickaxe");
		GameRegistry.registerItem(itemCopperPickaxe, "copper_pickaxe");

		//Shovel
		itemAluminumShovel = new ShinseiShovel(ShinseiMaterials.materialAluminum).setUnlocalizedName("aluminum_shovel");
		GameRegistry.registerItem(itemAluminumShovel, "aluminum_shovel");
		itemCopperShovel = new ShinseiShovel(ShinseiMaterials.materialCopper).setUnlocalizedName("copper_shovel");
		GameRegistry.registerItem(itemCopperShovel, "copper_shovel");

		//Swords
		itemAluminumSword = new ShinseiSword(ShinseiMaterials.materialAluminum).setUnlocalizedName("aluminum_sword");
		GameRegistry.registerItem(itemAluminumSword, "aluminum_sword");
		itemCopperSword = new ShinseiSword(ShinseiMaterials.materialCopper).setUnlocalizedName("copper_sword");
		GameRegistry.registerItem(itemCopperSword, "copper_sword");

	}
}
