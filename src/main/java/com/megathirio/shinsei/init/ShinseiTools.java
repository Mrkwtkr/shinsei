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
        public static AxeShinsei copperAxe = new ItemCopperAxe();

        //Hoes
        public static HoeShinsei copperHoe = new ItemCopperHoe();

        //Pickaxes
        public static PickaxeShinsei copperPickaxe = new ItemCopperPickaxe();

        //Shovels
        public static ShovelShinsei copperShovel = new ItemCopperShovel();

        //Swords
        public static SwordShinsei copperSword = new ItemCopperSword();

    //Tool Parts
        //Misc
        public static ItemShinsei woodToolHandle = new ItemWoodToolHandle();

        //Axes
        public static ItemShinsei copperAxeHead = new ItemCopperAxeHead();
        public static ItemShinsei diamondAxeHead = new ItemDiamondAxeHead();
        public static ItemShinsei goldAxeHead = new ItemGoldAxeHead();
        public static ItemShinsei ironAxeHead = new ItemIronAxeHead();
        public static ItemShinsei stoneAxeHead = new ItemStoneAxeHead();
        public static ItemShinsei woodAxeHead = new ItemWoodAxeHead();

        //Hoes
        public static ItemShinsei copperHoeHead = new ItemCopperHoeHead();
        public static ItemShinsei diamondHoeHead = new ItemDiamondHoeHead();
        public static ItemShinsei goldHoeHead = new ItemGoldHoeHead();
        public static ItemShinsei ironHoeHead = new ItemIronHoeHead();
        public static ItemShinsei stoneHoeHead = new ItemStoneHoeHead();
        public static ItemShinsei woodHoeHead = new ItemWoodHoeHead();

        //Pickaxes
        public static ItemShinsei copperPickaxeHead = new ItemCopperPickaxeHead();
        public static ItemShinsei diamondPickaxeHead = new ItemDiamondPickaxeHead();
        public static ItemShinsei goldPickaxeHead = new ItemGoldPickaxeHead();
        public static ItemShinsei ironPickaxeHead = new ItemIronPickaxeHead();
        public static ItemShinsei stonePickaxeHead = new ItemStonePickaxeHead();
        public static ItemShinsei woodPickaxeHead = new ItemWoodPickaxeHead();

        //Shovels
        public static ItemShinsei copperShovelHead = new ItemCopperShovelHead();
        public static ItemShinsei diamondShovelHead = new ItemDiamondShovelHead();
        public static ItemShinsei goldShovelHead = new ItemGoldShovelHead();
        public static ItemShinsei ironShovelHead = new ItemIronShovelHead();
        public static ItemShinsei stoneShovelHead = new ItemStoneShovelHead();
        public static ItemShinsei woodShovelHead = new ItemWoodShovelHead();

        //Swords
        public static ItemShinsei copperSwordBlade = new ItemCopperSwordBlade();
        public static ItemShinsei diamondSwordBlade = new ItemDiamondSwordBlade();
        public static ItemShinsei goldSwordBlade = new ItemGoldSwordBlade();
        public static ItemShinsei ironSwordBlade = new ItemIronSwordBlade();
        public static ItemShinsei stoneSwordBlade = new ItemStoneSwordBlade();
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
        GameRegistry.registerItem(copperAxe, Names.Tools.COPPER_AXE);

        //Hoes
        GameRegistry.registerItem(copperHoe, Names.Tools.COPPER_HOE);

        //Pickaxes
        GameRegistry.registerItem(copperPickaxe, Names.Tools.COPPER_PICKAXE);

        //Shovels
        GameRegistry.registerItem(copperShovel, Names.Tools.COPPER_SHOVEL);

        //Swords
        GameRegistry.registerItem(copperSword, Names.Tools.COPPER_SWORD);

    //Tool Parts
        //Misc
        GameRegistry.registerItem(woodToolHandle, Names.Tools.WOOD_TOOL_HANDLE);

        //Axes
        GameRegistry.registerItem(copperAxeHead, Names.Tools.COPPER_AXE_HEAD);
        GameRegistry.registerItem(diamondAxeHead, Names.Tools.DIAMOND_AXE_HEAD);
        GameRegistry.registerItem(goldAxeHead, Names.Tools.GOLD_AXE_HEAD);
        GameRegistry.registerItem(ironAxeHead, Names.Tools.IRON_AXE_HEAD);
        GameRegistry.registerItem(stoneAxeHead, Names.Tools.STONE_AXE_HEAD);
        GameRegistry.registerItem(woodAxeHead, Names.Tools.WOOD_AXE_HEAD);

        //Hoes
        GameRegistry.registerItem(copperHoeHead, Names.Tools.COPPER_HOE_HEAD);
        GameRegistry.registerItem(diamondHoeHead, Names.Tools.DIAMOND_HOE_HEAD);
        GameRegistry.registerItem(goldHoeHead, Names.Tools.GOLD_HOE_HEAD);
        GameRegistry.registerItem(ironHoeHead, Names.Tools.IRON_HOE_HEAD);
        GameRegistry.registerItem(stoneHoeHead, Names.Tools.STONE_HOE_HEAD);
        GameRegistry.registerItem(woodHoeHead, Names.Tools.WOOD_HOE_HEAD);

        //Pickaxes
        GameRegistry.registerItem(copperPickaxeHead, Names.Tools.COPPER_PICKAXE_HEAD);
        GameRegistry.registerItem(diamondPickaxeHead, Names.Tools.DIAMOND_PICKAXE_HEAD);
        GameRegistry.registerItem(goldPickaxeHead, Names.Tools.GOLD_PICKAXE_HEAD);
        GameRegistry.registerItem(ironPickaxeHead, Names.Tools.IRON_PICKAXE_HEAD);
        GameRegistry.registerItem(stonePickaxeHead, Names.Tools.STONE_PICKAXE_HEAD);
        GameRegistry.registerItem(woodPickaxeHead, Names.Tools.WOOD_PICKAXE_HEAD);

        //Shovels
        GameRegistry.registerItem(copperShovelHead, Names.Tools.COPPER_SHOVEL_HEAD);
        GameRegistry.registerItem(diamondShovelHead, Names.Tools.DIAMOND_SHOVEL_HEAD);
        GameRegistry.registerItem(goldShovelHead, Names.Tools.GOLD_SHOVEL_HEAD);
        GameRegistry.registerItem(ironShovelHead, Names.Tools.IRON_SHOVEL_HEAD);
        GameRegistry.registerItem(stoneShovelHead, Names.Tools.STONE_SHOVEL_HEAD);
        GameRegistry.registerItem(woodShovelHead, Names.Tools.WOOD_SHOVEL_HEAD);

        //Swords
        GameRegistry.registerItem(copperSwordBlade, Names.Tools.COPPER_SWORD_BLADE);
        GameRegistry.registerItem(diamondSwordBlade, Names.Tools.DIAMOND_SWORD_BLADE);
        GameRegistry.registerItem(goldSwordBlade, Names.Tools.GOLD_SWORD_BLADE);
        GameRegistry.registerItem(ironSwordBlade, Names.Tools.IRON_SWORD_BLADE);
        GameRegistry.registerItem(stoneSwordBlade, Names.Tools.STONE_SWORD_BLADE);
        GameRegistry.registerItem(woodSwordBlade, Names.Tools.WOOD_SWORD_BLADE);

        //Tool Casts
        GameRegistry.registerItem(axeCast, Names.Tools.AXE_CAST);
        GameRegistry.registerItem(hoeCast, Names.Tools.HOE_CAST);
        GameRegistry.registerItem(pickaxeCast, Names.Tools.PICKAXE_CAST);
        GameRegistry.registerItem(shovelCast, Names.Tools.SHOVEL_CAST);
        GameRegistry.registerItem(swordCast, Names.Tools.SWORD_CAST);

    }
}
