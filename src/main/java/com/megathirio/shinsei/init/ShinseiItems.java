package com.megathirio.shinsei.init;

import com.megathirio.shinsei.item.*;
import com.megathirio.shinsei.item.gem.*;
import com.megathirio.shinsei.item.powder.*;
import com.megathirio.shinsei.item.fuel.ItemCoke;
import com.megathirio.shinsei.item.fuel.ItemSplitWood;
import com.megathirio.shinsei.item.ingot.*;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiItems {

//Item Variables

    //Fuels
    public static ItemShinsei splitWood = new ItemSplitWood();
    public static ItemShinsei coke = new ItemCoke();

    //Powders
    public static ItemShinsei aluminumPowder = new ItemAluminumPowder();
    public static ItemShinsei antimonyPowder = new ItemAntimonyPowder();
    public static ItemShinsei arsenicPowder = new ItemArsenicPowder();
    public static ItemShinsei bariumPowder = new ItemBariumPowder();
    public static ItemShinsei bismuthPowder = new ItemBismuthPowder();
    public static ItemShinsei blackPowder = new ItemBlackPowder();
    public static ItemShinsei boraxPowder = new ItemBoraxPowder();
    public static ItemShinsei chromiumPowder = new ItemChromiumPowder();
    public static ItemShinsei cinnabarPowder = new ItemCinnabarPowder();
    public static ItemShinsei cobaltPowder = new ItemCobaltPowder();
    public static ItemShinsei copperPowder = new ItemCopperPowder();
    public static ItemShinsei cryolitePowder = new ItemCryolitePowder();
    public static ItemShinsei fluoritePowder = new ItemFluoritePowder();
    public static ItemShinsei graphitePowder = new ItemGraphitePowder();
    public static ItemShinsei iridiumPowder = new ItemIridiumPowder();
    public static ItemShinsei ironPowder = new ItemIronPowder();
    public static ItemShinsei leadPowder = new ItemLeadPowder();
    public static ItemShinsei magnesiumPowder = new ItemMagnesiumPowder();
    public static ItemShinsei molybdenumPowder = new ItemMolybdenumPowder();
    public static ItemShinsei nickelPowder = new ItemNickelPowder();
    public static ItemShinsei platinumPowder = new ItemPlatinumPowder();
    public static ItemShinsei quicklime = new ItemQuicklime();
    public static ItemShinsei silverPowder = new ItemSilverPowder();
    public static ItemShinsei sulphur = new ItemSulphur();
    public static ItemShinsei tantalumPowder = new ItemTantalumPowder();
    public static ItemShinsei tinPowder = new ItemTinPowder();
    public static ItemShinsei titaniumPowder = new ItemTitaniumPowder();

    //Ingots
    public static ItemShinsei aluminumIngot = new ItemAluminumIngot();
    public static ItemShinsei antimonyIngot = new ItemAntimonyIngot();
    public static ItemShinsei bismuthIngot = new ItemBismuthIngot();
    public static ItemShinsei cadmiumIngot = new ItemCadmiumIngot();
    public static ItemShinsei chromiumIngot = new ItemChromiumIngot();
    public static ItemShinsei cobaltIngot = new ItemCobaltIngot();
    public static ItemShinsei copperIngot = new ItemCopperIngot();
    public static ItemShinsei indiumIngot = new ItemIndiumIngot();
    public static ItemShinsei iridiumIngot = new ItemIridiumIngot();
    public static ItemShinsei leadIngot = new ItemLeadIngot();
    public static ItemShinsei magnesiumIngot = new ItemMagnesiumIngot();
    public static ItemShinsei molybdenumIngot = new ItemMolybdenumIngot();
    public static ItemShinsei nickelIngot = new ItemNickelIngot();
    public static ItemShinsei platinumIngot = new ItemPlatinumIngot();
    public static ItemShinsei silverIngot = new ItemSilverIngot();
    public static ItemShinsei tantalumIngot = new ItemTantalumIngot();
    public static ItemShinsei tinIngot = new ItemTinIngot();
    public static ItemShinsei titaniumIngot = new ItemTitaniumIngot();

    //Gems
    public static ItemShinsei amethystGem = new ItemAmethystGem();
    public static ItemShinsei aquamarineGem = new ItemAquamarineGem();
    public static ItemShinsei jadeGem = new ItemJadeGem();
    public static ItemShinsei scarletEmeraldGem = new ItemScarletEmeraldGem();

    public static ItemShinsei calciteCrystal = new ItemCalciteCrystal();
    public static ItemShinsei fluoriteCrystal = new ItemFluoriteCrystal();

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

        //Powders
        GameRegistry.registerItem(aluminumPowder, Names.Powders.ALUMINUM_POWDER);
        GameRegistry.registerItem(antimonyPowder, Names.Powders.ANTIMONY_POWDER);
        GameRegistry.registerItem(arsenicPowder, Names.Powders.ARSENIC_POWDER);
        GameRegistry.registerItem(bariumPowder, Names.Powders.BARIUM_POWDER);
        GameRegistry.registerItem(bismuthPowder, Names.Powders.BISMUTH_POWDER);
        GameRegistry.registerItem(blackPowder, Names.Powders.BLACK_POWDER);
        GameRegistry.registerItem(boraxPowder, Names.Powders.BORAX_POWDER);
        GameRegistry.registerItem(chromiumPowder, Names.Powders.CHROMIUM_POWDER);
        GameRegistry.registerItem(cinnabarPowder, Names.Powders.CINNABAR_POWDER);
        GameRegistry.registerItem(cobaltPowder, Names.Powders.COBALT_POWDER);
        GameRegistry.registerItem(copperPowder, Names.Powders.COPPER_POWDER);
        GameRegistry.registerItem(cryolitePowder, Names.Powders.CRYOLITE_POWDER);
        GameRegistry.registerItem(fluoritePowder, Names.Powders.FLUORITE_POWDER);
        GameRegistry.registerItem(graphitePowder, Names.Powders.GRAPHITE_POWDER);
        GameRegistry.registerItem(iridiumPowder, Names.Powders.IRIDIUM_POWDER);
        GameRegistry.registerItem(ironPowder, Names.Powders.IRON_POWDER);
        GameRegistry.registerItem(leadPowder, Names.Powders.LEAD_POWDER);
        GameRegistry.registerItem(magnesiumPowder, Names.Powders.MAGNESIUM_POWDER);
        GameRegistry.registerItem(molybdenumPowder, Names.Powders.MOLYBDENUM_POWDER);
        GameRegistry.registerItem(nickelPowder, Names.Powders.NICKEL_POWDER);
        GameRegistry.registerItem(platinumPowder, Names.Powders.PLATINUM_POWDER);
        GameRegistry.registerItem(quicklime, Names.Powders.QUICKLIME);
        GameRegistry.registerItem(silverPowder, Names.Powders.SILVER_POWDER);
        GameRegistry.registerItem(sulphur, Names.Powders.SULPHUR);
        GameRegistry.registerItem(tantalumPowder, Names.Powders.TANTALUM_POWDER);
        GameRegistry.registerItem(tinPowder, Names.Powders.TIN_POWDER);
        GameRegistry.registerItem(titaniumPowder, Names.Powders.TITANIUM_POWDER);

		//Mineral Drops
		GameRegistry.registerItem(silt, Names.Powders.SILT);
        GameRegistry.registerItem(salt, Names.Powders.SALT);

        //Ingots
        GameRegistry.registerItem(aluminumIngot, Names.Ingots.ALUMINUM_INGOT);
        GameRegistry.registerItem(antimonyIngot, Names.Ingots.ANTIMONY_INGOT);
        GameRegistry.registerItem(bismuthIngot, Names.Ingots.BISMUTH_INGOT);
        GameRegistry.registerItem(cadmiumIngot, Names.Ingots.CADMIUM_INGOT);
        GameRegistry.registerItem(chromiumIngot, Names.Ingots.CHROMIUM_INGOT);
        GameRegistry.registerItem(cobaltIngot, Names.Ingots.COBALT_INGOT);
        GameRegistry.registerItem(copperIngot, Names.Ingots.COPPER_INGOT);
        GameRegistry.registerItem(indiumIngot, Names.Ingots.INDIUM_INGOT);
        GameRegistry.registerItem(iridiumIngot, Names.Ingots.IRIDIUM_INGOT);
        GameRegistry.registerItem(leadIngot, Names.Ingots.LEAD_INGOT);
        GameRegistry.registerItem(magnesiumIngot, Names.Ingots.MAGNESIUM_INGOT);
        GameRegistry.registerItem(molybdenumIngot, Names.Ingots.MOLYBDENUM_INGOT);
        GameRegistry.registerItem(nickelIngot, Names.Ingots.NICKEL_INGOT);
        GameRegistry.registerItem(platinumIngot, Names.Ingots.PLATINUM_INGOT);
        GameRegistry.registerItem(silverIngot, Names.Ingots.SILVER_INGOT);
        GameRegistry.registerItem(tantalumIngot, Names.Ingots.TANTALUM_INGOT);
        GameRegistry.registerItem(tinIngot, Names.Ingots.TIN_INGOT);
        GameRegistry.registerItem(titaniumIngot, Names.Ingots.TITANIUM_INGOT);

        //Gems
        GameRegistry.registerItem(amethystGem, Names.Ingots.AMETHYST_GEM);
        GameRegistry.registerItem(aquamarineGem, Names.Ingots.AQUAMARINE_GEM);
        GameRegistry.registerItem(jadeGem, Names.Ingots.JADE_GEM);
        GameRegistry.registerItem(scarletEmeraldGem, Names.Ingots.SCARLET_EMERALD_GEM);

        GameRegistry.registerItem(calciteCrystal, Names.Ingots.CALCITE_CRYSTAL);
        GameRegistry.registerItem(fluoriteCrystal, Names.Ingots.FLUORITE_CRYSTAL);

        //General
        GameRegistry.registerItem(copperPlate, Names.Items.COPPER_PLATE);
        GameRegistry.registerItem(ironPlate, Names.Items.IRON_PLATE);
        GameRegistry.registerItem(copperHeatPlate, Names.Items.COPPER_HEAT_PLATE);
        GameRegistry.registerItem(ironHeatPlate, Names.Items.IRON_HEAT_PLATE);

	}
}
