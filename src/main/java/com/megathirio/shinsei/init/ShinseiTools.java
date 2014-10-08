package com.megathirio.shinsei.init;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.item.tool.*;
import com.megathirio.shinsei.item.tool.part.*;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiTools {
//Tool Varriables

    //Tools
        //Axes
        public static AxeShinsei brassAxe = new ItemBrassAxe();
        public static AxeShinsei bronzeAxe = new ItemBronzeAxe();
        public static AxeShinsei copperAxe = new ItemCopperAxe();
        public static AxeShinsei silverAxe = new ItemSilverAxe();
        public static AxeShinsei stainlessSteelAxe = new ItemStainlessSteelAxe();
        public static AxeShinsei steelAxe = new ItemSteelAxe();
        public static AxeShinsei titaniumAxe = new ItemTitaniumAxe();

        //Hoes
        public static HoeShinsei brassHoe = new ItemBrassHoe();
        public static HoeShinsei bronzeHoe = new ItemBronzeHoe();
        public static HoeShinsei copperHoe = new ItemCopperHoe();
        public static HoeShinsei silverHoe = new ItemSilverHoe();
        public static HoeShinsei stainlessSteelHoe = new ItemStainlessSteelHoe();
        public static HoeShinsei steelHoe = new ItemSteelHoe();
        public static HoeShinsei titaniumHoe = new ItemTitaniumHoe();

        //Pickaxes
        public static PickaxeShinsei brassPickaxe = new ItemBrassPickaxe();
        public static PickaxeShinsei bronzePickaxe = new ItemBronzePickaxe();
        public static PickaxeShinsei copperPickaxe = new ItemCopperPickaxe();
        public static PickaxeShinsei silverPickaxe = new ItemSilverPickaxe();
        public static PickaxeShinsei stainlessSteelPickaxe = new ItemStainlessSteelPickaxe();
        public static PickaxeShinsei steelPickaxe = new ItemSteelPickaxe();
        public static PickaxeShinsei titaniumPickaxe = new ItemTitaniumPickaxe();

        //Shovels
        public static ShovelShinsei brassShovel = new ItemBrassShovel();
        public static ShovelShinsei bronzeShovel = new ItemBronzeShovel();
        public static ShovelShinsei copperShovel = new ItemCopperShovel();
        public static ShovelShinsei silverShovel = new ItemSilverShovel();
        public static ShovelShinsei stainlessSteelShovel = new ItemStainlessSteelShovel();
        public static ShovelShinsei steelShovel = new ItemSteelShovel();
        public static ShovelShinsei titaniumShovel = new ItemTitaniumShovel();

        //Swords
        public static SwordShinsei brassSword = new ItemBrassSword();
        public static SwordShinsei bronzeSword = new ItemBronzeSword();
        public static SwordShinsei copperSword = new ItemCopperSword();
        public static SwordShinsei silverSword = new ItemSilverSword();
        public static SwordShinsei stainlessSteelSword = new ItemStainlessSteelSword();
        public static SwordShinsei steelSword = new ItemSteelSword();
        public static SwordShinsei titaniumSword = new ItemTitaniumSword();

    //Tool Parts
        //Misc
        public static ItemShinsei woodToolHandle = new ItemWoodToolHandle();

        //Axes
        public static ItemShinsei brassAxeHead = new ItemBrassAxeHead();
        public static ItemShinsei bronzeAxeHead = new ItemBronzeAxeHead();
        public static ItemShinsei copperAxeHead = new ItemCopperAxeHead();
        public static ItemShinsei diamondAxeHead = new ItemDiamondAxeHead();
        public static ItemShinsei goldAxeHead = new ItemGoldAxeHead();
        public static ItemShinsei ironAxeHead = new ItemIronAxeHead();
        public static ItemShinsei silverAxeHead = new ItemSilverAxeHead();
        public static ItemShinsei stainlessSteelAxeHead = new ItemStainlessSteelAxeHead();
        public static ItemShinsei steelAxeHead = new ItemSteelAxeHead();
        public static ItemShinsei stoneAxeHead = new ItemStoneAxeHead();
        public static ItemShinsei titaniumAxeHead = new ItemTitaniumAxeHead();
        public static ItemShinsei woodAxeHead = new ItemWoodAxeHead();

        //Hoes
        public static ItemShinsei brassHoeHead = new ItemBrassHoeHead();
        public static ItemShinsei bronzeHoeHead = new ItemBronzeHoeHead();
        public static ItemShinsei copperHoeHead = new ItemCopperHoeHead();
        public static ItemShinsei diamondHoeHead = new ItemDiamondHoeHead();
        public static ItemShinsei goldHoeHead = new ItemGoldHoeHead();
        public static ItemShinsei ironHoeHead = new ItemIronHoeHead();
        public static ItemShinsei silverHoeHead = new ItemSilverHoeHead();
        public static ItemShinsei stainlessSteelHoeHead = new ItemStainlessSteelHoeHead();
        public static ItemShinsei steelHoeHead = new ItemSteelHoeHead();
        public static ItemShinsei stoneHoeHead = new ItemStoneHoeHead();
        public static ItemShinsei titaniumHoeHead = new ItemTitaniumHoeHead();
        public static ItemShinsei woodHoeHead = new ItemWoodHoeHead();

        //Pickaxes
        public static ItemShinsei brassPickaxeHead = new ItemBrassPickaxeHead();
        public static ItemShinsei bronzePickaxeHead = new ItemBronzePickaxeHead();
        public static ItemShinsei copperPickaxeHead = new ItemCopperPickaxeHead();
        public static ItemShinsei diamondPickaxeHead = new ItemDiamondPickaxeHead();
        public static ItemShinsei goldPickaxeHead = new ItemGoldPickaxeHead();
        public static ItemShinsei ironPickaxeHead = new ItemIronPickaxeHead();
        public static ItemShinsei silverPickaxeHead = new ItemSilverPickaxeHead();
        public static ItemShinsei stainlessSteelPickaxeHead = new ItemStainlessSteelPickaxeHead();
        public static ItemShinsei steelPickaxeHead = new ItemSteelPickaxeHead();
        public static ItemShinsei stonePickaxeHead = new ItemStonePickaxeHead();
        public static ItemShinsei titaniumPickaxeHead = new ItemTitaniumPickaxeHead();
        public static ItemShinsei woodPickaxeHead = new ItemWoodPickaxeHead();

        //Shovels
        public static ItemShinsei brassShovelHead = new ItemBrassShovelHead();
        public static ItemShinsei bronzeShovelHead = new ItemBronzeShovelHead();
        public static ItemShinsei copperShovelHead = new ItemCopperShovelHead();
        public static ItemShinsei diamondShovelHead = new ItemDiamondShovelHead();
        public static ItemShinsei goldShovelHead = new ItemGoldShovelHead();
        public static ItemShinsei ironShovelHead = new ItemIronShovelHead();
        public static ItemShinsei silverShovelHead = new ItemSilverShovelHead();
        public static ItemShinsei stainlessSteelShovelHead = new ItemStainlessSteelShovelHead();
        public static ItemShinsei steelShovelHead = new ItemSteelShovelHead();
        public static ItemShinsei stoneShovelHead = new ItemStoneShovelHead();
        public static ItemShinsei titaniumShovelHead = new ItemTitaniumShovelHead();
        public static ItemShinsei woodShovelHead = new ItemWoodShovelHead();

        //Swords
        public static ItemShinsei brassSwordBlade = new ItemBrassSwordBlade();
        public static ItemShinsei bronzeSwordBlade = new ItemBronzeSwordBlade();
        public static ItemShinsei copperSwordBlade = new ItemCopperSwordBlade();
        public static ItemShinsei diamondSwordBlade = new ItemDiamondSwordBlade();
        public static ItemShinsei goldSwordBlade = new ItemGoldSwordBlade();
        public static ItemShinsei ironSwordBlade = new ItemIronSwordBlade();
        public static ItemShinsei silverSwordBlade = new ItemSilverSwordBlade();
        public static ItemShinsei stainlessSteelSwordBlade = new ItemStainlessSteelSwordBlade();
        public static ItemShinsei steelSwordBlade = new ItemSteelSwordBlade();
        public static ItemShinsei stoneSwordBlade = new ItemStoneSwordBlade();
        public static ItemShinsei titaniumSwordBlade = new ItemTitaniumSwordBlade();
        public static ItemShinsei woodSwordBlade = new ItemWoodSwordBlade();

    //Tool Casts
        public static ItemShinsei axeCast = new ItemAxeCast();
        public static ItemShinsei hoeCast = new ItemHoeCast();
        public static ItemShinsei pickaxeCast = new ItemPickaxeCast();
        public static ItemShinsei shovelCast = new ItemShovelCast();
        public static ItemShinsei swordCast = new ItemSwordCast();

//Tool Initialization
	public static void init(){
    //Tools
        //Axes
        GameRegistry.registerItem(brassAxe, Names.Tools.BRASS_AXE);
        GameRegistry.registerItem(bronzeAxe, Names.Tools.BRONZE_AXE);
        GameRegistry.registerItem(copperAxe, Names.Tools.COPPER_AXE);
        GameRegistry.registerItem(silverAxe, Names.Tools.SILVER_AXE);
        GameRegistry.registerItem(stainlessSteelAxe, Names.Tools.STAINLESS_STEEL_AXE);
        GameRegistry.registerItem(steelAxe, Names.Tools.STEEL_AXE);
        GameRegistry.registerItem(titaniumAxe, Names.Tools.TITANIUM_AXE);

        //Hoes
        GameRegistry.registerItem(brassHoe, Names.Tools.BRASS_HOE);
        GameRegistry.registerItem(bronzeHoe, Names.Tools.BRONZE_HOE);
        GameRegistry.registerItem(copperHoe, Names.Tools.COPPER_HOE);
        GameRegistry.registerItem(silverHoe, Names.Tools.SILVER_HOE);
        GameRegistry.registerItem(stainlessSteelHoe, Names.Tools.STAINLESS_STEEL_HOE);
        GameRegistry.registerItem(steelHoe, Names.Tools.STEEL_HOE);
        GameRegistry.registerItem(titaniumHoe, Names.Tools.TITANIUM_HOE);

        //Pickaxes
        GameRegistry.registerItem(brassPickaxe, Names.Tools.BRASS_PICKAXE);
        GameRegistry.registerItem(bronzePickaxe, Names.Tools.BRONZE_PICKAXE);
        GameRegistry.registerItem(copperPickaxe, Names.Tools.COPPER_PICKAXE);
        GameRegistry.registerItem(silverPickaxe, Names.Tools.SILVER_PICKAXE);
        GameRegistry.registerItem(stainlessSteelPickaxe, Names.Tools.STAINLESS_STEEL_PICKAXE);
        GameRegistry.registerItem(steelPickaxe, Names.Tools.STEEL_PICKAXE);
        GameRegistry.registerItem(titaniumPickaxe, Names.Tools.TITANIUM_PICKAXE);

        //Shovels
        GameRegistry.registerItem(brassShovel, Names.Tools.BRASS_SHOVEL);
        GameRegistry.registerItem(bronzeShovel, Names.Tools.BRONZE_SHOVEL);
        GameRegistry.registerItem(copperShovel, Names.Tools.COPPER_SHOVEL);
        GameRegistry.registerItem(silverShovel, Names.Tools.SILVER_SHOVEL);
        GameRegistry.registerItem(stainlessSteelShovel, Names.Tools.STAINLESS_STEEL_SHOVEL);
        GameRegistry.registerItem(steelShovel, Names.Tools.STEEL_SHOVEL);
        GameRegistry.registerItem(titaniumShovel, Names.Tools.TITANIUM_SHOVEL);

        //Swords
        GameRegistry.registerItem(brassSword, Names.Tools.BRASS_SWORD);
        GameRegistry.registerItem(bronzeSword, Names.Tools.BRONZE_SWORD);
        GameRegistry.registerItem(copperSword, Names.Tools.COPPER_SWORD);
        GameRegistry.registerItem(silverSword, Names.Tools.SILVER_SWORD);
        GameRegistry.registerItem(stainlessSteelSword, Names.Tools.STAINLESS_STEEL_SWORD);
        GameRegistry.registerItem(steelSword, Names.Tools.STEEL_SWORD);
        GameRegistry.registerItem(titaniumSword, Names.Tools.TITANIUM_SWORD);

    //Tool Parts
        //Misc
        GameRegistry.registerItem(woodToolHandle, Names.Tools.WOOD_TOOL_HANDLE);

        //Axes
        GameRegistry.registerItem(brassAxeHead, Names.Tools.BRASS_AXE_HEAD);
        GameRegistry.registerItem(bronzeAxeHead, Names.Tools.BRONZE_AXE_HEAD);
        GameRegistry.registerItem(copperAxeHead, Names.Tools.COPPER_AXE_HEAD);
        GameRegistry.registerItem(diamondAxeHead, Names.Tools.DIAMOND_AXE_HEAD);
        GameRegistry.registerItem(goldAxeHead, Names.Tools.GOLD_AXE_HEAD);
        GameRegistry.registerItem(ironAxeHead, Names.Tools.IRON_AXE_HEAD);
        GameRegistry.registerItem(silverAxeHead, Names.Tools.SILVER_AXE_HEAD);
        GameRegistry.registerItem(stainlessSteelAxeHead, Names.Tools.STAINLESS_STEEL_AXE_HEAD);
        GameRegistry.registerItem(steelAxeHead, Names.Tools.STEEL_AXE_HEAD);
        GameRegistry.registerItem(stoneAxeHead, Names.Tools.STONE_AXE_HEAD);
        GameRegistry.registerItem(titaniumAxeHead, Names.Tools.TITANIUM_AXE_HEAD);
        GameRegistry.registerItem(woodAxeHead, Names.Tools.WOOD_AXE_HEAD);

        //Hoes
        GameRegistry.registerItem(brassHoeHead, Names.Tools.BRASS_HOE_HEAD);
        GameRegistry.registerItem(bronzeHoeHead, Names.Tools.BRONZE_HOE_HEAD);
        GameRegistry.registerItem(copperHoeHead, Names.Tools.COPPER_HOE_HEAD);
        GameRegistry.registerItem(diamondHoeHead, Names.Tools.DIAMOND_HOE_HEAD);
        GameRegistry.registerItem(goldHoeHead, Names.Tools.GOLD_HOE_HEAD);
        GameRegistry.registerItem(ironHoeHead, Names.Tools.IRON_HOE_HEAD);
        GameRegistry.registerItem(silverHoeHead, Names.Tools.SILVER_HOE_HEAD);
        GameRegistry.registerItem(stainlessSteelHoeHead, Names.Tools.STAINLESS_STEEL_HOE_HEAD);
        GameRegistry.registerItem(steelHoeHead, Names.Tools.STEEL_HOE_HEAD);
        GameRegistry.registerItem(stoneHoeHead, Names.Tools.STONE_HOE_HEAD);
        GameRegistry.registerItem(titaniumHoeHead, Names.Tools.TITANIUM_HOE_HEAD);
        GameRegistry.registerItem(woodHoeHead, Names.Tools.WOOD_HOE_HEAD);

        //Pickaxes
        GameRegistry.registerItem(brassPickaxeHead, Names.Tools.BRASS_PICKAXE_HEAD);
        GameRegistry.registerItem(bronzePickaxeHead, Names.Tools.BRONZE_PICKAXE_HEAD);
        GameRegistry.registerItem(copperPickaxeHead, Names.Tools.COPPER_PICKAXE_HEAD);
        GameRegistry.registerItem(diamondPickaxeHead, Names.Tools.DIAMOND_PICKAXE_HEAD);
        GameRegistry.registerItem(goldPickaxeHead, Names.Tools.GOLD_PICKAXE_HEAD);
        GameRegistry.registerItem(ironPickaxeHead, Names.Tools.IRON_PICKAXE_HEAD);
        GameRegistry.registerItem(silverPickaxeHead, Names.Tools.SILVER_PICKAXE_HEAD);
        GameRegistry.registerItem(stainlessSteelPickaxeHead, Names.Tools.STAINLESS_STEEL_PICKAXE_HEAD);
        GameRegistry.registerItem(steelPickaxeHead, Names.Tools.STEEL_PICKAXE_HEAD);
        GameRegistry.registerItem(stonePickaxeHead, Names.Tools.STONE_PICKAXE_HEAD);
        GameRegistry.registerItem(titaniumPickaxeHead, Names.Tools.TITANIUM_PICKAXE_HEAD);
        GameRegistry.registerItem(woodPickaxeHead, Names.Tools.WOOD_PICKAXE_HEAD);

        //Shovels
        GameRegistry.registerItem(brassShovelHead, Names.Tools.BRASS_SHOVEL_HEAD);
        GameRegistry.registerItem(bronzeShovelHead, Names.Tools.BRONZE_SHOVEL_HEAD);
        GameRegistry.registerItem(copperShovelHead, Names.Tools.COPPER_SHOVEL_HEAD);
        GameRegistry.registerItem(diamondShovelHead, Names.Tools.DIAMOND_SHOVEL_HEAD);
        GameRegistry.registerItem(goldShovelHead, Names.Tools.GOLD_SHOVEL_HEAD);
        GameRegistry.registerItem(ironShovelHead, Names.Tools.IRON_SHOVEL_HEAD);
        GameRegistry.registerItem(silverShovelHead, Names.Tools.SILVER_SHOVEL_HEAD);
        GameRegistry.registerItem(stainlessSteelShovelHead, Names.Tools.STAINLESS_STEEL_SHOVEL_HEAD);
        GameRegistry.registerItem(steelShovelHead, Names.Tools.STEEL_SHOVEL_HEAD);
        GameRegistry.registerItem(stoneShovelHead, Names.Tools.STONE_SHOVEL_HEAD);
        GameRegistry.registerItem(titaniumShovelHead, Names.Tools.TITANIUM_SHOVEL_HEAD);
        GameRegistry.registerItem(woodShovelHead, Names.Tools.WOOD_SHOVEL_HEAD);

        //Swords
        GameRegistry.registerItem(brassSwordBlade, Names.Tools.BRASS_SWORD_BLADE);
        GameRegistry.registerItem(bronzeSwordBlade, Names.Tools.BRONZE_SWORD_BLADE);
        GameRegistry.registerItem(copperSwordBlade, Names.Tools.COPPER_SWORD_BLADE);
        GameRegistry.registerItem(diamondSwordBlade, Names.Tools.DIAMOND_SWORD_BLADE);
        GameRegistry.registerItem(goldSwordBlade, Names.Tools.GOLD_SWORD_BLADE);
        GameRegistry.registerItem(ironSwordBlade, Names.Tools.IRON_SWORD_BLADE);
        GameRegistry.registerItem(silverSwordBlade, Names.Tools.SILVER_SWORD_BLADE);
        GameRegistry.registerItem(stainlessSteelSwordBlade, Names.Tools.STAINLESS_STEEL_SWORD_BLADE);
        GameRegistry.registerItem(steelSwordBlade, Names.Tools.STEEL_SWORD_BLADE);
        GameRegistry.registerItem(stoneSwordBlade, Names.Tools.STONE_SWORD_BLADE);
        GameRegistry.registerItem(titaniumSwordBlade, Names.Tools.TITANIUM_SWORD_BLADE);
        GameRegistry.registerItem(woodSwordBlade, Names.Tools.WOOD_SWORD_BLADE);

        //Tool Casts
        GameRegistry.registerItem(axeCast, Names.Tools.AXE_CAST);
        GameRegistry.registerItem(hoeCast, Names.Tools.HOE_CAST);
        GameRegistry.registerItem(pickaxeCast, Names.Tools.PICKAXE_CAST);
        GameRegistry.registerItem(shovelCast, Names.Tools.SHOVEL_CAST);
        GameRegistry.registerItem(swordCast, Names.Tools.SWORD_CAST);
    }
}
