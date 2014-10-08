package com.megathirio.shinsei.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class ShinseiOreDict {

    public static void blocks(){
        //Vanilla
        OreDictionary.registerOre("blockSand", Blocks.sand);
        OreDictionary.registerOre("blockStone", Blocks.stone);
        OreDictionary.registerOre("blockCobble", Blocks.cobblestone);
        OreDictionary.registerOre("blockEmerald", Blocks.emerald_block);

        //Blocks - Ores
        OreDictionary.registerOre("oreAluminum", ShinseiBlocks.bauxiteOre);
        OreDictionary.registerOre("oreAmethyst", ShinseiBlocks.amethystOre);
        OreDictionary.registerOre("oreAntimony", ShinseiBlocks.stibniteOre);
        OreDictionary.registerOre("oreApatite", ShinseiBlocks.apatiteOre);
        OreDictionary.registerOre("oreArsenic", ShinseiBlocks.realgarOre);
        OreDictionary.registerOre("oreBarite", ShinseiBlocks.bariteOre);
        OreDictionary.registerOre("oreBeryl", ShinseiBlocks.berylOre);
        OreDictionary.registerOre("oreBismuth", ShinseiBlocks.bismuthOre);
        OreDictionary.registerOre("oreChalcedony", ShinseiBlocks.chalcedonyOre);
        OreDictionary.registerOre("oreChrome", ShinseiBlocks.chromiteOre);
        OreDictionary.registerOre("oreCinnabar", ShinseiBlocks.cinnabarOre);
        OreDictionary.registerOre("oreCobalt", ShinseiBlocks.cobaltiteOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.borniteOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.chalcopyriteOre);
        OreDictionary.registerOre("oreCorundum", ShinseiBlocks.corundumOre);
        OreDictionary.registerOre("oreCryolite", ShinseiBlocks.cryoliteOre);
        OreDictionary.registerOre("oreFluorite", ShinseiBlocks.fluoriteOre);
        OreDictionary.registerOre("oreGraphite", ShinseiBlocks.graphiteOre);
        OreDictionary.registerOre("oreIron", ShinseiBlocks.hematiteOre);
        OreDictionary.registerOre("oreJade", ShinseiBlocks.jadeiteOre);
        OreDictionary.registerOre("oreLead", ShinseiBlocks.galenaOre);
        OreDictionary.registerOre("oreMagnesium", ShinseiBlocks.dolomiteOre);
        OreDictionary.registerOre("oreManganese", ShinseiBlocks.pyrolusiteOre);
        OreDictionary.registerOre("oreMeteorite", ShinseiBlocks.meteoriteOre);
        OreDictionary.registerOre("oreMolybdenite", ShinseiBlocks.molybdeniteOre);
        OreDictionary.registerOre("oreNickel", ShinseiBlocks.pentlanditeOre);
        OreDictionary.registerOre("oreOpal", ShinseiBlocks.opalOre);
        OreDictionary.registerOre("orePeridot", ShinseiBlocks.olivineOre);
        OreDictionary.registerOre("orePlatinum", ShinseiBlocks.sperryliteOre);
        OreDictionary.registerOre("orePotash", ShinseiBlocks.sylviteOre);
        OreDictionary.registerOre("oreSilver", ShinseiBlocks.acanthiteOre);
        OreDictionary.registerOre("oreSulphur", ShinseiBlocks.sulphurOre);
        OreDictionary.registerOre("oreTantalite", ShinseiBlocks.tantaliteOre);
        OreDictionary.registerOre("oreTin", ShinseiBlocks.cassiteriteOre);
        OreDictionary.registerOre("oreTitanium", ShinseiBlocks.ilmeniteOre);
        OreDictionary.registerOre("oreTitanium", ShinseiBlocks.rutileOre);
        OreDictionary.registerOre("oreTopaz", ShinseiBlocks.topazOre);
        OreDictionary.registerOre("oreTungsten", ShinseiBlocks.scheeliteOre);
        OreDictionary.registerOre("oreTurquoise", ShinseiBlocks.turquoiseOre);
        OreDictionary.registerOre("oreUranium", ShinseiBlocks.uraniniteOre);
        OreDictionary.registerOre("oreZinc", ShinseiBlocks.sphaleriteOre);

        //Blocks - Metals
        OreDictionary.registerOre("blockAluminum", ShinseiBlocks.aluminumBlock);
        OreDictionary.registerOre("blockAntimony", ShinseiBlocks.antimonyBlock);
        OreDictionary.registerOre("blockBarium", ShinseiBlocks.bariumBlock);
        OreDictionary.registerOre("blockBismuth", ShinseiBlocks.bismuthBlock);
        OreDictionary.registerOre("blockBrass", ShinseiBlocks.brassBlock);
        OreDictionary.registerOre("blockBronze", ShinseiBlocks.bronzeBlock);
        OreDictionary.registerOre("blockChrome", ShinseiBlocks.chromiumBlock);
        OreDictionary.registerOre("blockCobalt", ShinseiBlocks.cobaltBlock);
        OreDictionary.registerOre("blockCopper", ShinseiBlocks.copperBlock);
        OreDictionary.registerOre("blockLead", ShinseiBlocks.leadBlock);
        OreDictionary.registerOre("blockMagnesium", ShinseiBlocks.magnesiumBlock);
        OreDictionary.registerOre("blockManganese", ShinseiBlocks.manganeseBlock);
        OreDictionary.registerOre("blockMolybdenum", ShinseiBlocks.molybdenumBlock);
        OreDictionary.registerOre("blockNickel", ShinseiBlocks.nickelBlock);
        OreDictionary.registerOre("blockPlatinum", ShinseiBlocks.platinumBlock);
        OreDictionary.registerOre("blockSilver", ShinseiBlocks.silverBlock);
        OreDictionary.registerOre("blockStainlessSteel", ShinseiBlocks.stainlessSteelBlock);
        OreDictionary.registerOre("blockSteel", ShinseiBlocks.steelBlock);
        OreDictionary.registerOre("blockTantalum", ShinseiBlocks.tantalumBlock);
        OreDictionary.registerOre("blockTin", ShinseiBlocks.tinBlock);
        OreDictionary.registerOre("blockTitanium", ShinseiBlocks.titaniumBlock);
        OreDictionary.registerOre("blockTungsten", ShinseiBlocks.tungstenBlock);
        OreDictionary.registerOre("blockVanadium", ShinseiBlocks.vanadiumBlock);
        OreDictionary.registerOre("blockZinc", ShinseiBlocks.zincBlock);

        //Blocks - Gems/Crystals
        OreDictionary.registerOre("blockAmethyst", ShinseiBlocks.amethystBlock);
        OreDictionary.registerOre("blockApatite", ShinseiBlocks.apatiteBlock);
        OreDictionary.registerOre("blockAquamarine", ShinseiBlocks.aquamarineBlock);
        OreDictionary.registerOre("blockFluorite", ShinseiBlocks.fluoriteBlock);
        OreDictionary.registerOre("blockJade", ShinseiBlocks.jadeBlock);
        OreDictionary.registerOre("blockOnyx", ShinseiBlocks.onyxBlock);
        OreDictionary.registerOre("blockOpal", ShinseiBlocks.opalBlock);
        OreDictionary.registerOre("blockPeridot", ShinseiBlocks.peridotBlock);
        OreDictionary.registerOre("blockRuby", ShinseiBlocks.rubyBlock);
        OreDictionary.registerOre("blockSapphire", ShinseiBlocks.sapphireBlock);
        OreDictionary.registerOre("blockEmerald", ShinseiBlocks.scarletEmeraldBlock);
        OreDictionary.registerOre("blockTopaz", ShinseiBlocks.topazBlock);
        OreDictionary.registerOre("blockTurquoise", ShinseiBlocks.turquoiseBlock);

        //Blocks - Minerals
        OreDictionary.registerOre("blockStone", ShinseiBlocks.basaltBlock);
        OreDictionary.registerOre("blockCobble", ShinseiBlocks.basaltCobble);
        OreDictionary.registerOre("blockBorax", ShinseiBlocks.boraxBlock);
        OreDictionary.registerOre("blockChalk", ShinseiBlocks.chalkBlock);
        OreDictionary.registerOre("blockGypsum", ShinseiBlocks.gypsumBlock);
        OreDictionary.registerOre("blockGranite", ShinseiBlocks.graniteBlock);
        OreDictionary.registerOre("blockSalt", ShinseiBlocks.haliteBlock);
        OreDictionary.registerOre("blockStone", ShinseiBlocks.limestoneBlock);
        OreDictionary.registerOre("blockMarble", ShinseiBlocks.marbleBlock);
        OreDictionary.registerOre("blockSilt", ShinseiBlocks.siltstoneBlock);

    }

    public static void items(){
        //Vanilla
        OreDictionary.registerOre("gemEmerald", Items.emerald);

        //Ingots
        OreDictionary.registerOre("ingotAluminum", ShinseiItems.aluminumIngot);
        OreDictionary.registerOre("ingotAntimony", ShinseiItems.antimonyIngot);
        OreDictionary.registerOre("ingotBarium", ShinseiItems.bariumIngot);
        OreDictionary.registerOre("ingotBismuth", ShinseiItems.bismuthIngot);
        OreDictionary.registerOre("ingotBrass", ShinseiItems.brassIngot);
        OreDictionary.registerOre("ingotBronze", ShinseiItems.bronzeIngot);
        OreDictionary.registerOre("ingotCadmium", ShinseiItems.cadmiumIngot);
        OreDictionary.registerOre("ingotChrome", ShinseiItems.chromiumIngot);
        OreDictionary.registerOre("ingotCobalt", ShinseiItems.cobaltIngot);
        OreDictionary.registerOre("ingotCopper", ShinseiItems.copperIngot);
        OreDictionary.registerOre("ingotIndium", ShinseiItems.indiumIngot);
        OreDictionary.registerOre("ingotIridium", ShinseiItems.iridiumIngot);
        OreDictionary.registerOre("ingotIron", Items.iron_ingot);
        OreDictionary.registerOre("ingotLead", ShinseiItems.leadIngot);
        OreDictionary.registerOre("ingotMagnesium", ShinseiItems.magnesiumIngot);
        OreDictionary.registerOre("ingotManganese", ShinseiItems.manganeseIngot);
        OreDictionary.registerOre("ingotMolybdenum", ShinseiItems.molybdenumIngot);
        OreDictionary.registerOre("ingotNickel", ShinseiItems.nickelIngot);
        OreDictionary.registerOre("ingotPigIron", ShinseiItems.pigIronIngot);
        OreDictionary.registerOre("ingotPlatinum", ShinseiItems.platinumIngot);
        OreDictionary.registerOre("ingotSilver", ShinseiItems.silverIngot);
        OreDictionary.registerOre("ingotStainlessSteel", ShinseiItems.stainlessSteelIngot);
        OreDictionary.registerOre("ingotSteel", ShinseiItems.steelIngot);
        OreDictionary.registerOre("ingotTantalum", ShinseiItems.tantalumIngot);
        OreDictionary.registerOre("ingotTin", ShinseiItems.tinIngot);
        OreDictionary.registerOre("ingotTitanium", ShinseiItems.titaniumIngot);
        OreDictionary.registerOre("ingotTungsten", ShinseiItems.tungstenIngot);
        OreDictionary.registerOre("ingotVanadium", ShinseiItems.vanadiumIngot);
        OreDictionary.registerOre("ingotZinc", ShinseiItems.zincIngot);

        //Nuggets
        OreDictionary.registerOre("nuggetAluminum", ShinseiItems.aluminumNugget);
        OreDictionary.registerOre("nuggetAntimony", ShinseiItems.antimonyNugget);
        OreDictionary.registerOre("nuggetBarium", ShinseiItems.bariumNugget);
        OreDictionary.registerOre("nuggetBismuth", ShinseiItems.bismuthNugget);
        OreDictionary.registerOre("nuggetBrass", ShinseiItems.brassNugget);
        OreDictionary.registerOre("nuggetBronze", ShinseiItems.bronzeNugget);
        OreDictionary.registerOre("nuggetCadmium", ShinseiItems.cadmiumNugget);
        OreDictionary.registerOre("nuggetChrome", ShinseiItems.chromiumNugget);
        OreDictionary.registerOre("nuggetCobalt", ShinseiItems.cobaltNugget);
        OreDictionary.registerOre("nuggetCopper", ShinseiItems.copperNugget);
        OreDictionary.registerOre("nuggetGold", Items.gold_nugget);
        OreDictionary.registerOre("nuggetIndium", ShinseiItems.indiumNugget);
        OreDictionary.registerOre("nuggetIridium", ShinseiItems.iridiumNugget);
        OreDictionary.registerOre("nuggetIron", ShinseiItems.ironNugget);
        OreDictionary.registerOre("nuggetLead", ShinseiItems.leadNugget);
        OreDictionary.registerOre("nuggetMagnesium", ShinseiItems.magnesiumNugget);
        OreDictionary.registerOre("nuggetManganese", ShinseiItems.manganeseNugget);
        OreDictionary.registerOre("nuggetMolybdenum", ShinseiItems.molybdenumNugget);
        OreDictionary.registerOre("nuggetNickel", ShinseiItems.nickelNugget);
        OreDictionary.registerOre("nuggetPlatinum", ShinseiItems.platinumNugget);
        OreDictionary.registerOre("nuggetSilver", ShinseiItems.silverNugget);
        OreDictionary.registerOre("nuggetStainlessSteel", ShinseiItems.stainlessSteelNugget);
        OreDictionary.registerOre("nuggetSteel", ShinseiItems.steelNugget);
        OreDictionary.registerOre("nuggetTantalum", ShinseiItems.tantalumNugget);
        OreDictionary.registerOre("nuggetTin", ShinseiItems.tinNugget);
        OreDictionary.registerOre("nuggetTitanium", ShinseiItems.titaniumNugget);
        OreDictionary.registerOre("nuggetTungsten", ShinseiItems.tungstenNugget);
        OreDictionary.registerOre("nuggetVanadium", ShinseiItems.vanadiumNugget);
        OreDictionary.registerOre("nuggetZinc", ShinseiItems.zincNugget);

        //Gems/Crystals
        OreDictionary.registerOre("gemAmethyst", ShinseiItems.amethystGem);
        OreDictionary.registerOre("gemApatite", ShinseiItems.apatiteCrystal);
        OreDictionary.registerOre("gemAquamarine", ShinseiItems.aquamarineGem);
        OreDictionary.registerOre("gemOnyx", ShinseiItems.onyxGem);
        OreDictionary.registerOre("gemOpal", ShinseiItems.opalGem);
        OreDictionary.registerOre("gemEmerald", ShinseiItems.scarletEmeraldGem);
        OreDictionary.registerOre("gemFluorite", ShinseiItems.fluoriteCrystal);
        OreDictionary.registerOre("gemJade", ShinseiItems.jadeGem);
        OreDictionary.registerOre("gemPeridot", ShinseiItems.peridotGem);
        OreDictionary.registerOre("gemRuby", ShinseiItems.rubyGem);
        OreDictionary.registerOre("gemSapphire", ShinseiItems.sapphireGem);
        OreDictionary.registerOre("gemTopaz", ShinseiItems.topazGem);
        OreDictionary.registerOre("gemTurquoise", ShinseiItems.turquoiseGem);

        //Powders - Metals
        OreDictionary.registerOre("dustAluminum", ShinseiItems.aluminumPowder);
        OreDictionary.registerOre("dustAntimony", ShinseiItems.antimonyPowder);
        OreDictionary.registerOre("dustArsenic", ShinseiItems.arsenicPowder);
        OreDictionary.registerOre("dustBarium", ShinseiItems.bariumPowder);
        OreDictionary.registerOre("dustBismuth", ShinseiItems.bismuthPowder);
        OreDictionary.registerOre("dustBrasa", ShinseiItems.brassPowder);
        OreDictionary.registerOre("dustBronze", ShinseiItems.bronzePowder);
        OreDictionary.registerOre("dustCadmium", ShinseiItems.cadmiumPowder);
        OreDictionary.registerOre("dustChrome", ShinseiItems.chromiumPowder);
        OreDictionary.registerOre("dustCinnabar", ShinseiItems.cinnabarPowder);
        OreDictionary.registerOre("dustCobalt", ShinseiItems.cobaltPowder);
        OreDictionary.registerOre("dustCopper", ShinseiItems.copperPowder);
        OreDictionary.registerOre("dustCryolite", ShinseiItems.cryolitePowder);
        OreDictionary.registerOre("dustDolomite", ShinseiItems.dolomitePowder);
        OreDictionary.registerOre("dustGraphite", ShinseiItems.graphitePowder);
        OreDictionary.registerOre("dustIndium", ShinseiItems.indiumPowder);
        OreDictionary.registerOre("dustIridium", ShinseiItems.iridiumPowder);
        OreDictionary.registerOre("dustIron", ShinseiItems.ironPowder);
        OreDictionary.registerOre("dustLead", ShinseiItems.leadPowder);
        OreDictionary.registerOre("dustMagnesium", ShinseiItems.magnesiumPowder);
        OreDictionary.registerOre("dustManganese", ShinseiItems.manganesePowder);
        OreDictionary.registerOre("dustMolybdenum", ShinseiItems.molybdenumPowder);
        OreDictionary.registerOre("dustNickel", ShinseiItems.nickelPowder);
        OreDictionary.registerOre("dustPlatinum", ShinseiItems.platinumPowder);
        OreDictionary.registerOre("dustSilver", ShinseiItems.silverPowder);
        OreDictionary.registerOre("dustStainlessSteel", ShinseiItems.stainlessSteelPowder);
        OreDictionary.registerOre("dustSteel", ShinseiItems.steelPowder);
        OreDictionary.registerOre("dustTantalum", ShinseiItems.tantalumPowder);
        OreDictionary.registerOre("dustTin", ShinseiItems.tinPowder);
        OreDictionary.registerOre("dustTitanium", ShinseiItems.titaniumPowder);
        OreDictionary.registerOre("dustTungsten", ShinseiItems.tungstenPowder);
        OreDictionary.registerOre("dustVanadium", ShinseiItems.vanadiumPowder);
        OreDictionary.registerOre("dustZinc", ShinseiItems.zincPowder);

        //Powders - Gems/Crystals
        OreDictionary.registerOre("dustAmethyst", ShinseiItems.amethystPowder);
        OreDictionary.registerOre("dustApatite", ShinseiItems.apatitePowder);
        OreDictionary.registerOre("dustAquamarine", ShinseiItems.aquamarinePowder);
        OreDictionary.registerOre("dustFluorite", ShinseiItems.fluoritePowder);
        OreDictionary.registerOre("dustJade", ShinseiItems.jadePowder);
        OreDictionary.registerOre("dustOnyx", ShinseiItems.onyxPowder);
        OreDictionary.registerOre("dustOpal", ShinseiItems.opalPowder);
        OreDictionary.registerOre("dustPeridot", ShinseiItems.peridotPowder);
        OreDictionary.registerOre("dustRuby", ShinseiItems.rubyPowder);
        OreDictionary.registerOre("dustSapphire", ShinseiItems.sapphirePowder);
        OreDictionary.registerOre("dustScarletEmerald", ShinseiItems.scarletEmeraldPowder);
        OreDictionary.registerOre("dustTopaz", ShinseiItems.topazPowder);
        OreDictionary.registerOre("dustTurquoise", ShinseiItems.turquoisePowder);

        //Powders - Minerals
        OreDictionary.registerOre("dustBorax", ShinseiItems.boraxPowder);
        OreDictionary.registerOre("dustCalcium", ShinseiItems.calciumPowder);
        OreDictionary.registerOre("dustChalk", ShinseiItems.chalkPowder);
        OreDictionary.registerOre("dustGypsum", ShinseiItems.gypsumPowder);
        OreDictionary.registerOre("dustLime", ShinseiItems.quicklime);
        OreDictionary.registerOre("dustSalt", ShinseiItems.salt);
        OreDictionary.registerOre("dustSilt", ShinseiItems.silt);
        OreDictionary.registerOre("dustSulphur", ShinseiItems.sulphur);

        //Powders - Misc
        OreDictionary.registerOre("dustCausticPotash", ShinseiItems.causticPotash);
        OreDictionary.registerOre("dustFerrosilicon", ShinseiItems.ferrosiliconPowder);
        OreDictionary.registerOre("dustPotash", ShinseiItems.potashPowder);
        OreDictionary.registerOre("dustUranium", ShinseiItems.uraniumPowder);
        OreDictionary.registerOre("dustYellowcake", ShinseiItems.yellowcakePowder);

        //Fuels
        OreDictionary.registerOre("dustCoke", ShinseiItems.coke);

        //Liquids
        OreDictionary.registerOre("bucketSlakedLime", ShinseiFluids.slakedLimeBucket);

        //General

    }
}