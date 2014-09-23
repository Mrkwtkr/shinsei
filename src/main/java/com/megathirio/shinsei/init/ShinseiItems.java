package com.megathirio.shinsei.init;

import com.megathirio.shinsei.item.*;
import com.megathirio.shinsei.item.gem.*;
import com.megathirio.shinsei.item.nugget.*;
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

    // Ingots
    public static ItemShinsei aluminumIngot = new ItemAluminumIngot();
    public static ItemShinsei antimonyIngot = new ItemAntimonyIngot();
    public static ItemShinsei bariumIngot = new ItemBariumIngot();
    public static ItemShinsei bismuthIngot = new ItemBismuthIngot();
    public static ItemShinsei cadmiumIngot = new ItemCadmiumIngot();
    public static ItemShinsei chromiumIngot = new ItemChromiumIngot();
    public static ItemShinsei cobaltIngot = new ItemCobaltIngot();
    public static ItemShinsei copperIngot = new ItemCopperIngot();
    public static ItemShinsei indiumIngot = new ItemIndiumIngot();
    public static ItemShinsei iridiumIngot = new ItemIridiumIngot();
    public static ItemShinsei leadIngot = new ItemLeadIngot();
    public static ItemShinsei magnesiumIngot = new ItemMagnesiumIngot();
    public static ItemShinsei manganeseIngot = new ItemManganeseIngot();
    public static ItemShinsei molybdenumIngot = new ItemMolybdenumIngot();
    public static ItemShinsei nickelIngot = new ItemNickelIngot();
    public static ItemShinsei platinumIngot = new ItemPlatinumIngot();
    public static ItemShinsei pigIronIngot = new ItemPigIronIngot();
    public static ItemShinsei silverIngot = new ItemSilverIngot();
    public static ItemShinsei stainlessSteelIngot = new ItemStainlessSteelIngot();
    public static ItemShinsei steelIngot = new ItemSteelIngot();
    public static ItemShinsei tantalumIngot = new ItemTantalumIngot();
    public static ItemShinsei tinIngot = new ItemTinIngot();
    public static ItemShinsei titaniumIngot = new ItemTitaniumIngot();
    public static ItemShinsei tungstenIngot = new ItemTungstenIngot();
    public static ItemShinsei vanadiumIngot = new ItemVanadiumIngot();
    public static ItemShinsei zincIngot = new ItemZincIngot();

    //Nuggets
    public static ItemShinsei aluminumNugget = new ItemAluminumNugget();
    public static ItemShinsei antimonyNugget = new ItemAntimonyNugget();
    public static ItemShinsei bariumNugget = new ItemBariumNugget();
    public static ItemShinsei bismuthNugget = new ItemBismuthNugget();
    public static ItemShinsei cadmiumNugget = new ItemCadmiumNugget();
    public static ItemShinsei chromiumNugget = new ItemChromiumNugget();
    public static ItemShinsei cobaltNugget = new ItemCobaltNugget();
    public static ItemShinsei copperNugget = new ItemCopperNugget();
    public static ItemShinsei indiumNugget = new ItemIndiumNugget();
    public static ItemShinsei iridiumNugget = new ItemIridiumNugget();
    public static ItemShinsei ironNugget = new ItemIronNugget();
    public static ItemShinsei leadNugget = new ItemLeadNugget();
    public static ItemShinsei magnesiumNugget = new ItemMagnesiumNugget();
    public static ItemShinsei manganeseNugget = new ItemManganeseNugget();
    public static ItemShinsei molybdenumNugget = new ItemMolybdenumNugget();
    public static ItemShinsei nickelNugget = new ItemNickelNugget();
    public static ItemShinsei platinumNugget = new ItemPlatinumNugget();
    public static ItemShinsei silverNugget = new ItemSilverNugget();
    public static ItemShinsei stainlessSteelNugget = new ItemStainlessSteelNugget();
    public static ItemShinsei steelNugget = new ItemSteelNugget();
    public static ItemShinsei tantalumNugget = new ItemTantalumNugget();
    public static ItemShinsei tinNugget = new ItemTinNugget();
    public static ItemShinsei titaniumNugget = new ItemTitaniumNugget();
    public static ItemShinsei tungstenNugget = new ItemTungstenNugget();
    public static ItemShinsei vanadiumNugget = new ItemVanadiumNugget();
    public static ItemShinsei zincNugget = new ItemZincNugget();

    //Gems/Crystals
    public static ItemShinsei amethystGem = new ItemAmethystGem();
    public static ItemShinsei apatiteCrystal = new ItemApatiteCrystal();
    public static ItemShinsei aquamarineGem = new ItemAquamarineGem();
    public static ItemShinsei fluoriteCrystal = new ItemFluoriteCrystal();
    public static ItemShinsei jadeGem = new ItemJadeGem();
    public static ItemShinsei onyxGem = new ItemOnyxGem();
    public static ItemShinsei opalGem = new ItemOpalGem();
    public static ItemShinsei peridotGem = new ItemPeridotGem();
    public static ItemShinsei rubyGem = new ItemRubyGem();
    public static ItemShinsei scarletEmeraldGem = new ItemScarletEmeraldGem();
    public static ItemShinsei sapphireGem = new ItemSapphireGem();
    public static ItemShinsei topazGem = new ItemTopazGem();
    public static ItemShinsei turquoiseGem = new ItemTurquoiseGem();

    //Powders - Metals
    public static ItemShinsei aluminumPowder = new ItemAluminumPowder();
    public static ItemShinsei antimonyPowder = new ItemAntimonyPowder();
    public static ItemShinsei arsenicPowder = new ItemArsenicPowder();
    public static ItemShinsei bariumPowder = new ItemBariumPowder();
    public static ItemShinsei bismuthPowder = new ItemBismuthPowder();
    public static ItemShinsei cadmiumPowder = new ItemCadmiumPowder();
    public static ItemShinsei chromiumPowder = new ItemChromiumPowder();
    public static ItemShinsei cinnabarPowder = new ItemCinnabarPowder();
    public static ItemShinsei cobaltPowder = new ItemCobaltPowder();
    public static ItemShinsei copperPowder = new ItemCopperPowder();
    public static ItemShinsei cryolitePowder = new ItemCryolitePowder();
    public static ItemShinsei dolomitePowder = new ItemDolomitePowder();
    public static ItemShinsei graphitePowder = new ItemGraphitePowder();
    public static ItemShinsei indiumPowder = new ItemIndiumPowder();
    public static ItemShinsei iridiumPowder = new ItemIridiumPowder();
    public static ItemShinsei ironPowder = new ItemIronPowder();
    public static ItemShinsei leadPowder = new ItemLeadPowder();
    public static ItemShinsei magnesiumPowder = new ItemMagnesiumPowder();
    public static ItemShinsei manganesePowder = new ItemManganesePowder();
    public static ItemShinsei molybdenumPowder = new ItemMolybdenumPowder();
    public static ItemShinsei nickelPowder = new ItemNickelPowder();
    public static ItemShinsei platinumPowder = new ItemPlatinumPowder();
    public static ItemShinsei silverPowder = new ItemSilverPowder();
    public static ItemShinsei stainlessSteelPowder = new ItemStainlessSteelPowder();
    public static ItemShinsei steelPowder = new ItemSteelPowder();
    public static ItemShinsei tantalumPowder = new ItemTantalumPowder();
    public static ItemShinsei tinPowder = new ItemTinPowder();
    public static ItemShinsei titaniumPowder = new ItemTitaniumPowder();
    public static ItemShinsei tungstenPowder = new ItemTungstenPowder();
    public static ItemShinsei vanadiumPowder = new ItemVanadiumPowder();
    public static ItemShinsei zincPowder = new ItemZincPowder();

    //Powders - Gems/Crystals
    public static ItemShinsei amethystPowder = new ItemAmethystPowder();
    public static ItemShinsei apatitePowder = new ItemApatitePowder();
    public static ItemShinsei aquamarinePowder = new ItemAquamarinePowder();
    public static ItemShinsei fluoritePowder = new ItemFluoridePowder();
    public static ItemShinsei jadePowder = new ItemJadePowder();
    public static ItemShinsei onyxPowder = new ItemOnyxPowder();
    public static ItemShinsei opalPowder = new ItemOpalPowder();
    public static ItemShinsei peridotPowder = new ItemPeridotPowder();
    public static ItemShinsei rubyPowder = new ItemRubyPowder();
    public static ItemShinsei sapphirePowder = new ItemSapphirePowder();
    public static ItemShinsei scarletEmeraldPowder = new ItemScarletEmeraldPowder();
    public static ItemShinsei topazPowder = new ItemTopazPowder();
    public static ItemShinsei turquoisePowder = new ItemTurquoisePowder();

    //Powders - Minerals
    public static ItemShinsei boraxPowder = new ItemBoraxPowder();
    public static ItemShinsei chalkPowder = new ItemChalkPowder();
    public static ItemShinsei calciumPowder = new ItemCalciumPowder();
    public static ItemShinsei gypsumPowder = new ItemGypsumPowder();
    public static ItemShinsei quicklime = new ItemQuicklime();
    public static ItemShinsei salt = new ItemSalt();
    public static ItemShinsei silt = new ItemSilt();
    public static ItemShinsei sulphur = new ItemSulphur();

    //Powders - Misc
    public static ItemShinsei causticPotash = new ItemCausticPotash();
    public static ItemShinsei ferrosiliconPowder = new ItemFerrosiliconPowder();
    public static ItemShinsei potashPowder = new ItemPotashPowder();
    public static ItemShinsei redcakePowder = new ItemRedcakePowder();
    public static ItemShinsei uraniumPowder = new ItemUraniumPowder();
    public static ItemShinsei yellowcakePowder = new ItemYellowcakePowder();

    //Fuels
    public static ItemShinsei splitWood = new ItemSplitWood();
    public static ItemShinsei coke = new ItemCoke();

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

        //Powders - Metals
        GameRegistry.registerItem(aluminumPowder, Names.Powders.ALUMINUM_POWDER);
        GameRegistry.registerItem(antimonyPowder, Names.Powders.ANTIMONY_POWDER);
        GameRegistry.registerItem(arsenicPowder, Names.Powders.ARSENIC_POWDER);
        GameRegistry.registerItem(bariumPowder, Names.Powders.BARIUM_POWDER);
        GameRegistry.registerItem(bismuthPowder, Names.Powders.BISMUTH_POWDER);
        GameRegistry.registerItem(chromiumPowder, Names.Powders.CHROMIUM_POWDER);
        GameRegistry.registerItem(cinnabarPowder, Names.Powders.CINNABAR_POWDER);
        GameRegistry.registerItem(cobaltPowder, Names.Powders.COBALT_POWDER);
        GameRegistry.registerItem(copperPowder, Names.Powders.COPPER_POWDER);
        GameRegistry.registerItem(cryolitePowder, Names.Powders.CRYOLITE_POWDER);
        GameRegistry.registerItem(dolomitePowder, Names.Powders.DOLOMITE_POWDER);
        GameRegistry.registerItem(graphitePowder, Names.Powders.GRAPHITE_POWDER);
        GameRegistry.registerItem(indiumPowder, Names.Powders.INDIUM_POWDER);
        GameRegistry.registerItem(iridiumPowder, Names.Powders.IRIDIUM_POWDER);
        GameRegistry.registerItem(ironPowder, Names.Powders.IRON_POWDER);
        GameRegistry.registerItem(leadPowder, Names.Powders.LEAD_POWDER);
        GameRegistry.registerItem(magnesiumPowder, Names.Powders.MAGNESIUM_POWDER);
        GameRegistry.registerItem(manganesePowder, Names.Powders.MANGANESE_POWDER);
        GameRegistry.registerItem(molybdenumPowder, Names.Powders.MOLYBDENUM_POWDER);
        GameRegistry.registerItem(nickelPowder, Names.Powders.NICKEL_POWDER);
        GameRegistry.registerItem(platinumPowder, Names.Powders.PLATINUM_POWDER);
        GameRegistry.registerItem(silverPowder, Names.Powders.SILVER_POWDER);
        GameRegistry.registerItem(stainlessSteelPowder, Names.Powders.STAINLESS_STEEL_POWDER);
        GameRegistry.registerItem(steelPowder, Names.Powders.STEEL_POWDER);
        GameRegistry.registerItem(tantalumPowder, Names.Powders.TANTALUM_POWDER);
        GameRegistry.registerItem(tinPowder, Names.Powders.TIN_POWDER);
        GameRegistry.registerItem(titaniumPowder, Names.Powders.TITANIUM_POWDER);
        GameRegistry.registerItem(tungstenPowder, Names.Powders.TUNGSTEN_POWDER);
        GameRegistry.registerItem(vanadiumPowder, Names.Powders.VANADIUM_POWDER);
        GameRegistry.registerItem(zincPowder, Names.Powders.ZINC_POWDER);

        //Powders - Gems/Crystals
        GameRegistry.registerItem(amethystPowder, Names.Powders.AMETHYST_POWDER);
        GameRegistry.registerItem(apatitePowder, Names.Powders.APATITE_POWDER);
        GameRegistry.registerItem(aquamarinePowder, Names.Powders.AQUAMARINE_POWDER);
        GameRegistry.registerItem(fluoritePowder, Names.Powders.FLUORIDE_POWDER);
        GameRegistry.registerItem(jadePowder, Names.Powders.JADE_POWDER);
        GameRegistry.registerItem(onyxPowder, Names.Powders.ONYX_POWDER);
        GameRegistry.registerItem(opalPowder, Names.Powders.OPAL_POWDER);
        GameRegistry.registerItem(peridotPowder, Names.Powders.PERIDOT_POWDER);
        GameRegistry.registerItem(rubyPowder, Names.Powders.RUBY_POWDER);
        GameRegistry.registerItem(sapphirePowder, Names.Powders.SAPPHIRE_POWDER);
        GameRegistry.registerItem(scarletEmeraldPowder, Names.Powders.SCARLET_EMERALD_POWDER);
        GameRegistry.registerItem(topazPowder, Names.Powders.TOPAZ_POWDER);
        GameRegistry.registerItem(turquoisePowder, Names.Powders.TURQUOISE_POWDER);

        //Powders - Minerals
        GameRegistry.registerItem(boraxPowder, Names.Powders.BORAX_POWDER);
        GameRegistry.registerItem(chalkPowder, Names.Powders.CHALK_POWDER);
        GameRegistry.registerItem(calciumPowder, Names.Powders.CALCIUM_POWDER);
        GameRegistry.registerItem(gypsumPowder, Names.Powders.GYPSUM_POWDER);
        GameRegistry.registerItem(quicklime, Names.Powders.QUICKLIME);
        GameRegistry.registerItem(salt, Names.Powders.SALT);
        GameRegistry.registerItem(silt, Names.Powders.SILT);
        GameRegistry.registerItem(sulphur, Names.Powders.SULPHUR);

        //Powders - Misc
        GameRegistry.registerItem(causticPotash, Names.Powders.CAUSTIC_POTASH);
        GameRegistry.registerItem(ferrosiliconPowder, Names.Powders.FERROSILICON_POWDER);
        GameRegistry.registerItem(potashPowder, Names.Powders.POTASH_POWDER);
        GameRegistry.registerItem(redcakePowder, Names.Powders.REDCAKE_POWDER);
        GameRegistry.registerItem(uraniumPowder, Names.Powders.URANIUM_POWDER);
        GameRegistry.registerItem(yellowcakePowder, Names.Powders.YELLOWCAKE_POWDER);

        //Ingots
        GameRegistry.registerItem(aluminumIngot, Names.Ingots.ALUMINUM_INGOT);
        GameRegistry.registerItem(antimonyIngot, Names.Ingots.ANTIMONY_INGOT);
        GameRegistry.registerItem(bariumIngot, Names.Ingots.BARIUM_INGOT);
        GameRegistry.registerItem(bismuthIngot, Names.Ingots.BISMUTH_INGOT);
        GameRegistry.registerItem(cadmiumIngot, Names.Ingots.CADMIUM_INGOT);
        GameRegistry.registerItem(chromiumIngot, Names.Ingots.CHROMIUM_INGOT);
        GameRegistry.registerItem(cobaltIngot, Names.Ingots.COBALT_INGOT);
        GameRegistry.registerItem(copperIngot, Names.Ingots.COPPER_INGOT);
        GameRegistry.registerItem(indiumIngot, Names.Ingots.INDIUM_INGOT);
        GameRegistry.registerItem(iridiumIngot, Names.Ingots.IRIDIUM_INGOT);
        GameRegistry.registerItem(leadIngot, Names.Ingots.LEAD_INGOT);
        GameRegistry.registerItem(magnesiumIngot, Names.Ingots.MAGNESIUM_INGOT);
        GameRegistry.registerItem(manganeseIngot, Names.Ingots.MANGANESE_INGOT);
        GameRegistry.registerItem(molybdenumIngot, Names.Ingots.MOLYBDENUM_INGOT);
        GameRegistry.registerItem(nickelIngot, Names.Ingots.NICKEL_INGOT);
        GameRegistry.registerItem(pigIronIngot, Names.Ingots.PIG_IRON_INGOT);
        GameRegistry.registerItem(platinumIngot, Names.Ingots.PLATINUM_INGOT);
        GameRegistry.registerItem(silverIngot, Names.Ingots.SILVER_INGOT);
        GameRegistry.registerItem(stainlessSteelIngot, Names.Ingots.STAINLESS_STEEL_INGOT);
        GameRegistry.registerItem(steelIngot, Names.Ingots.STEEL_INGOT);
        GameRegistry.registerItem(tantalumIngot, Names.Ingots.TANTALUM_INGOT);
        GameRegistry.registerItem(tinIngot, Names.Ingots.TIN_INGOT);
        GameRegistry.registerItem(titaniumIngot, Names.Ingots.TITANIUM_INGOT);
        GameRegistry.registerItem(tungstenIngot, Names.Ingots.TUNGSTEN_INGOT);
        GameRegistry.registerItem(vanadiumIngot, Names.Ingots.VANADIUM_INGOT);
        GameRegistry.registerItem(zincIngot, Names.Ingots.ZINC_INGOT);

        //Nuggets
        GameRegistry.registerItem(aluminumNugget, Names.Nuggets.ALUMINUM_NUGGET);
        GameRegistry.registerItem(antimonyNugget, Names.Nuggets.ANTIMONY_NUGGET);
        GameRegistry.registerItem(bariumNugget, Names.Nuggets.BARIUM_NUGGET);
        GameRegistry.registerItem(bismuthNugget, Names.Nuggets.BISMUTH_NUGGET);
        GameRegistry.registerItem(chromiumNugget, Names.Nuggets.CHROMIUM_NUGGET);
        GameRegistry.registerItem(cobaltNugget, Names.Nuggets.COBALT_NUGGET);
        GameRegistry.registerItem(copperNugget, Names.Nuggets.COPPER_NUGGET);
        GameRegistry.registerItem(indiumNugget, Names.Nuggets.INDIUM_NUGGET);
        GameRegistry.registerItem(iridiumNugget, Names.Nuggets.IRIDIUM_NUGGET);
        GameRegistry.registerItem(ironNugget, Names.Nuggets.IRON_NUGGET);
        GameRegistry.registerItem(leadNugget, Names.Nuggets.LEAD_NUGGET);
        GameRegistry.registerItem(magnesiumNugget, Names.Nuggets.MAGNESIUM_NUGGET);
        GameRegistry.registerItem(manganeseNugget, Names.Nuggets.MANGANESE_NUGGET);
        GameRegistry.registerItem(molybdenumNugget, Names.Nuggets.MOLYBDENUM_NUGGET);
        GameRegistry.registerItem(nickelNugget, Names.Nuggets.NICKEL_NUGGET);
        GameRegistry.registerItem(platinumNugget, Names.Nuggets.PLATINUM_NUGGET);
        GameRegistry.registerItem(silverNugget, Names.Nuggets.SILVER_NUGGET);
        GameRegistry.registerItem(stainlessSteelNugget, Names.Nuggets.STAINLESS_STEEL_NUGGET);
        GameRegistry.registerItem(steelNugget, Names.Nuggets.STEEL_NUGGET);
        GameRegistry.registerItem(tinNugget, Names.Nuggets.TIN_NUGGET);
        GameRegistry.registerItem(tantalumNugget, Names.Nuggets.TANTALUM_NUGGET);
        GameRegistry.registerItem(titaniumNugget, Names.Nuggets.TITANIUM_NUGGET);
        GameRegistry.registerItem(tungstenNugget, Names.Nuggets.TUNGSTEN_NUGGET);
        GameRegistry.registerItem(vanadiumNugget, Names.Nuggets.VANADIUM_NUGGET);
        GameRegistry.registerItem(zincNugget, Names.Nuggets.ZINC_NUGGET);

        //Gems/Crystals
        GameRegistry.registerItem(amethystGem, Names.Gems.AMETHYST_GEM);
        GameRegistry.registerItem(apatiteCrystal, Names.Gems.APATITE_CRYSTAL);
        GameRegistry.registerItem(aquamarineGem, Names.Gems.AQUAMARINE_GEM);
        GameRegistry.registerItem(fluoriteCrystal, Names.Gems.FLUORITE_CRYSTAL);
        GameRegistry.registerItem(jadeGem, Names.Gems.JADE_GEM);
        GameRegistry.registerItem(onyxGem, Names.Gems.ONYX_GEM);
        GameRegistry.registerItem(opalGem, Names.Gems.OPAL_GEM);
        GameRegistry.registerItem(peridotGem, Names.Gems.PERIDOT_GEM);
        GameRegistry.registerItem(rubyGem, Names.Gems.RUBY_GEM);
        GameRegistry.registerItem(scarletEmeraldGem, Names.Gems.SCARLET_EMERALD_GEM);
        GameRegistry.registerItem(sapphireGem, Names.Gems.SAPPHIRE_GEM);
        GameRegistry.registerItem(topazGem, Names.Gems.TOPAZ_GEM);
        GameRegistry.registerItem(turquoiseGem, Names.Gems.TURQUOISE_GEM);

        //General
        GameRegistry.registerItem(copperPlate, Names.Items.COPPER_PLATE);
        GameRegistry.registerItem(ironPlate, Names.Items.IRON_PLATE);
        GameRegistry.registerItem(copperHeatPlate, Names.Items.COPPER_HEAT_PLATE);
        GameRegistry.registerItem(ironHeatPlate, Names.Items.IRON_HEAT_PLATE);
	}
}
