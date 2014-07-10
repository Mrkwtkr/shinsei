package com.megathirio.shinsei.init;

import com.megathirio.shinsei.item.*;
import com.megathirio.shinsei.item.dust.*;
import com.megathirio.shinsei.item.fuel.ItemCoke;
import com.megathirio.shinsei.item.fuel.ItemSplitWood;
import com.megathirio.shinsei.item.gem.ItemAquamarineGem;
import com.megathirio.shinsei.item.gem.ItemScarletEmeraldGem;
import com.megathirio.shinsei.item.ingot.*;
import com.megathirio.shinsei.item.liquid.ItemMercury;
import com.megathirio.shinsei.item.liquid.ItemSlakedLime;
import com.megathirio.shinsei.item.tool.*;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiItems {

//Item Variables

    //Fuels
    public static ItemShinsei splitWood = new ItemSplitWood();
    public static ItemShinsei coke = new ItemCoke();

    //Liquids
    public static ItemShinsei slakedLime = new ItemSlakedLime();
    public static ItemShinsei mercury = new ItemMercury();

    //Dusts
    public static ItemShinsei aluminumPowder = new ItemAluminumPowder();
    public static ItemShinsei antimonyPowder = new ItemAntimonyPowder();
    public static ItemShinsei arsenicPowder = new ItemArsenicPowder();
    public static ItemShinsei bariumPowder = new ItemBariumPowder();
    public static ItemShinsei bismuthPowder = new ItemBismuthPowder();
    public static ItemShinsei blackPowder = new ItemBlackPowder();
    public static ItemShinsei chromiumPowder = new ItemChromiumPowder();
    public static ItemShinsei cinnabarPowder = new ItemCinnabarPowder();
    public static ItemShinsei copperPowder = new ItemCopperPowder();
    public static ItemShinsei graphitePowder = new ItemGraphitePowder();
    public static ItemShinsei iridiumPowder = new ItemIridiumPowder();
    public static ItemShinsei ironPowder = new ItemIronPowder();
    public static ItemShinsei leadPowder = new ItemLeadPowder();
    public static ItemShinsei magnesiumPowder = new ItemMagnesiumPowder();
    public static ItemShinsei molybdenumPowder = new ItemMolybdenumPowder();
    public static ItemShinsei nickelPowder = new ItemNickelPowder();
    public static ItemShinsei quicklime = new ItemQuicklime();
    public static ItemShinsei silverPowder = new ItemSilverPowder();
    public static ItemShinsei sulphur = new ItemSulphur();
    public static ItemShinsei tinPowder = new ItemTinPowder();

    //Ingots
    public static ItemShinsei aluminumIngot = new ItemAluminumIngot();
    public static ItemShinsei antimonyIngot = new ItemAntimonyIngot();
    public static ItemShinsei bismuthIngot = new ItemBismuthIngot();
    public static ItemShinsei cadmiumIngot = new ItemCadmiumIngot();
    public static ItemShinsei chromiumIngot = new ItemChromiumIngot();
    public static ItemShinsei copperIngot = new ItemCopperIngot();
    public static ItemShinsei indiumIngot = new ItemIndiumIngot();
    public static ItemShinsei iridiumIngot = new ItemIridiumIngot();
    public static ItemShinsei leadIngot = new ItemLeadIngot();
    public static ItemShinsei magnesiumIngot = new ItemMagnesiumIngot();
    public static ItemShinsei molybdenumIngot = new ItemMolybdenumIngot();
    public static ItemShinsei nickelIngot = new ItemNickelIngot();
    public static ItemShinsei silverIngot = new ItemSilverIngot();
    public static ItemShinsei tinIngot = new ItemTinIngot();

    //Gems
    public static ItemShinsei aquamarineGem = new ItemAquamarineGem();
    public static ItemShinsei scarletEmeraldGem = new ItemScarletEmeraldGem();

    //Tools
    public static AxeShinsei copperAxe = new ItemCopperAxe();
    public static HoeShinsei copperHoe = new ItemCopperHoe();
    public static PickaxeShinsei copperPickaxe = new ItemCopperPickaxe();
    public static ShovelShinsei copperShovel = new ItemCopperShovel();
    public static SwordShinsei copperSword = new ItemCopperSword();

    //Mineral Drops
    public static ItemShinsei silt = new ItemSilt();
    public static ItemShinsei salt = new ItemSalt();

    //General
    public static ItemShinsei copperPlate = new ItemCopperPlate();
    public static ItemShinsei ironPlate = new ItemIronPlate();
    public static ItemShinsei copperHeatPlate = new ItemCopperHeatPlate();
    public static ItemShinsei ironHeatPlate = new ItemIronHeatPlate();

    //Item Initialization
	public static void init(){
		
	//Item Initialzation
        //Fuels
        GameRegistry.registerItem(splitWood, Names.Items.SPLIT_WOOD);
        GameRegistry.registerItem(coke, Names.Items.COKE);

        //Liquids
        GameRegistry.registerItem(slakedLime, Names.Items.SLAKED_LIME);
        GameRegistry.registerItem(mercury, Names.Items.MERCURY);

        //Dusts
        GameRegistry.registerItem(aluminumPowder, Names.Items.ALUMINUM_POWDER);
        GameRegistry.registerItem(antimonyPowder, Names.Items.ANTIMONY_POWDER);
        GameRegistry.registerItem(arsenicPowder, Names.Items.ARSENIC_POWDER);
        GameRegistry.registerItem(bariumPowder, Names.Items.BARIUM_POWDER);
        GameRegistry.registerItem(bismuthPowder, Names.Items.BISMUTH_POWDER);
        GameRegistry.registerItem(blackPowder, Names.Items.BLACK_POWDER);
        GameRegistry.registerItem(chromiumPowder, Names.Items.CHROMIUM_POWDER);
        GameRegistry.registerItem(cinnabarPowder, Names.Items.CINNABAR_POWDER);
        GameRegistry.registerItem(copperPowder, Names.Items.COPPER_POWDER);
        GameRegistry.registerItem(graphitePowder, Names.Items.GRAPHITE_POWDER);
        GameRegistry.registerItem(iridiumPowder, Names.Items.IRIDIUM_POWDER);
        GameRegistry.registerItem(ironPowder, Names.Items.IRON_POWDER);
        GameRegistry.registerItem(leadPowder, Names.Items.LEAD_POWDER);
        GameRegistry.registerItem(magnesiumPowder, Names.Items.MAGNESIUM_POWDER);
        GameRegistry.registerItem(molybdenumPowder, Names.Items.MOLYBDENUM_POWDER);
        GameRegistry.registerItem(nickelPowder, Names.Items.NICKEL_POWDER);
        GameRegistry.registerItem(quicklime, Names.Items.QUICKLIME);
        GameRegistry.registerItem(silverPowder, Names.Items.SILVER_POWDER);
        GameRegistry.registerItem(sulphur, Names.Items.SULPHUR);
        GameRegistry.registerItem(tinPowder, Names.Items.TIN_POWDER);

		//Mineral Drops
		GameRegistry.registerItem(silt, Names.Items.SILT);
        GameRegistry.registerItem(salt, Names.Items.SALT);

        //Ingots
        GameRegistry.registerItem(aluminumIngot, Names.Items.ALUMINUM_INGOT);
        GameRegistry.registerItem(antimonyIngot, Names.Items.ANTIMONY_INGOT);
        GameRegistry.registerItem(bismuthIngot, Names.Items.BISMUTH_INGOT);
        GameRegistry.registerItem(cadmiumIngot, Names.Items.CADMIUM_INGOT);
        GameRegistry.registerItem(chromiumIngot, Names.Items.CHROMIUM_INGOT);
        GameRegistry.registerItem(indiumIngot, Names.Items.INDIUM_INGOT);
        GameRegistry.registerItem(iridiumIngot, Names.Items.IRIDIUM_INGOT);
        GameRegistry.registerItem(copperIngot, Names.Items.COPPER_INGOT);
        GameRegistry.registerItem(leadIngot, Names.Items.LEAD_INGOT);
        GameRegistry.registerItem(magnesiumIngot, Names.Items.MAGNESIUM_INGOT);
        GameRegistry.registerItem(molybdenumIngot, Names.Items.MOLYBDENUM_INGOT);
        GameRegistry.registerItem(nickelIngot, Names.Items.NICKEL_INGOT);
        GameRegistry.registerItem(silverIngot, Names.Items.SILVER_INGOT);
        GameRegistry.registerItem(tinIngot, Names.Items.TIN_INGOT);

        //Gems
        GameRegistry.registerItem(aquamarineGem, Names.Items.AQUAMARINE_GEM);
        GameRegistry.registerItem(scarletEmeraldGem, Names.Items.SCARLET_EMERALD_GEM);

        //Tools
        GameRegistry.registerItem(copperAxe, Names.Items.COPPER_AXE);
        GameRegistry.registerItem(copperHoe, Names.Items.COPPER_HOE);
        GameRegistry.registerItem(copperPickaxe, Names.Items.COPPER_PICKAXE);
        GameRegistry.registerItem(copperShovel, Names.Items.COPPER_SHOVEL);
        GameRegistry.registerItem(copperSword, Names.Items.COPPER_SWORD);

        //General
        GameRegistry.registerItem(copperPlate, Names.Items.COPPER_PLATE);
        GameRegistry.registerItem(ironPlate, Names.Items.IRON_PLATE);
        GameRegistry.registerItem(copperHeatPlate, Names.Items.COPPER_HEAT_PLATE);
        GameRegistry.registerItem(ironHeatPlate, Names.Items.IRON_HEAT_PLATE);

	}
}
