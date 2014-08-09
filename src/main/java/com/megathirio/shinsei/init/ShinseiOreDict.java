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

        //Blocks
        OreDictionary.registerOre("blockAluminum", ShinseiBlocks.aluminumBlock);
        OreDictionary.registerOre("blockAmethyst", ShinseiBlocks.amethystBlock);
        OreDictionary.registerOre("blockApatite", ShinseiBlocks.apatiteBlock);
        OreDictionary.registerOre("blockAquamarine", ShinseiBlocks.aquamarineBlock);
        OreDictionary.registerOre("blockBarium", ShinseiBlocks.bariumBlock);
        OreDictionary.registerOre("blockBismuth", ShinseiBlocks.bismuthBlock);
        OreDictionary.registerOre("blockChrome", ShinseiBlocks.chromiumBlock);
        OreDictionary.registerOre("blockCopper", ShinseiBlocks.copperBlock);
        OreDictionary.registerOre("blockMagnesium", ShinseiBlocks.magnesiumBlock);
        OreDictionary.registerOre("blockOnyx", ShinseiBlocks.onyxBlock);
        OreDictionary.registerOre("blockRuby", ShinseiBlocks.rubyBlock);
        OreDictionary.registerOre("blockSapphire", ShinseiBlocks.sapphireBlock);
        OreDictionary.registerOre("blockSilver", ShinseiBlocks.silverBlock);
        OreDictionary.registerOre("blockTin", ShinseiBlocks.tinBlock);
        OreDictionary.registerOre("blockEmerald", ShinseiBlocks.scarletEmeraldBlock);

        //Ores
        OreDictionary.registerOre("oreSilver", ShinseiBlocks.acanthiteOre);
        OreDictionary.registerOre("oreApatite", ShinseiBlocks.apatiteOre);
        OreDictionary.registerOre("oreBarite", ShinseiBlocks.bariteOre);
        OreDictionary.registerOre("oreAmethyst", ShinseiBlocks.amethystOre);
        OreDictionary.registerOre("oreAluminum", ShinseiBlocks.bauxiteOre);
        OreDictionary.registerOre("oreBeryl", ShinseiBlocks.berylOre);
        OreDictionary.registerOre("oreBismuth", ShinseiBlocks.bismuthOre);
        OreDictionary.registerOre("oreChrome", ShinseiBlocks.chromiteOre);
        OreDictionary.registerOre("oreCinnabar", ShinseiBlocks.cinnabarOre);
        OreDictionary.registerOre("oreCobalt", ShinseiBlocks.cobaltiteOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.borniteOre);
        OreDictionary.registerOre("oreCryolite", ShinseiBlocks.cryoliteOre);
        OreDictionary.registerOre("oreTin", ShinseiBlocks.cassiteriteOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.chalcopyriteOre);
        OreDictionary.registerOre("oreMagnesium", ShinseiBlocks.dolomiteOre);

        //Minerals
        OreDictionary.registerOre("blockStone", ShinseiBlocks.basaltBlock);
        OreDictionary.registerOre("blockCobble", ShinseiBlocks.basaltCobble);
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
        OreDictionary.registerOre("ingotBarium", ShinseiItems.bariumIngot);
        OreDictionary.registerOre("ingotBismuth", ShinseiItems.bismuthIngot);
        OreDictionary.registerOre("ingotChrome", ShinseiItems.chromiumIngot);
        OreDictionary.registerOre("ingotCobalt", ShinseiItems.cobaltIngot);
        OreDictionary.registerOre("ingotCopper", ShinseiItems.copperIngot);
        OreDictionary.registerOre("ingotMagnesium", ShinseiItems.magnesiumIngot);
        OreDictionary.registerOre("ingotSilver", ShinseiItems.silverIngot);
        OreDictionary.registerOre("ingotTin", ShinseiItems.tinIngot);

        //Nuggets
        OreDictionary.registerOre("nuggetAluminum", ShinseiItems.aluminumNugget);
        OreDictionary.registerOre("nuggetBarium", ShinseiItems.bariumNugget);
        OreDictionary.registerOre("nuggetBismuth", ShinseiItems.bismuthNugget);
        OreDictionary.registerOre("nuggetChrome", ShinseiItems.chromiumNugget);
        OreDictionary.registerOre("nuggetCobalt", ShinseiItems.cobaltNugget);
        OreDictionary.registerOre("nuggetCopper", ShinseiItems.copperNugget);
        OreDictionary.registerOre("nuggetMagnesium", ShinseiItems.magnesiumNugget);
        OreDictionary.registerOre("nuggetSilver", ShinseiItems.silverNugget);
        OreDictionary.registerOre("nuggetTin", ShinseiItems.tinNugget);

        //Powders
        OreDictionary.registerOre("dustCalcium", ShinseiItems.calciumPowder);
        OreDictionary.registerOre("dustChalk", ShinseiItems.chalkPowder);
        OreDictionary.registerOre("dustSalt", ShinseiItems.salt);
        OreDictionary.registerOre("dustGypsum", ShinseiItems.gypsumPowder);
        OreDictionary.registerOre("dustOnyx", ShinseiItems.onyxPowder);
        OreDictionary.registerOre("dustLime", ShinseiItems.quicklime);

        OreDictionary.registerOre("dustAluminum", ShinseiItems.aluminumPowder);
        OreDictionary.registerOre("dustAmethyst", ShinseiItems.amethystPowder);
        OreDictionary.registerOre("dustApatite", ShinseiItems.apatitePowder);
        OreDictionary.registerOre("dustBarium", ShinseiItems.bariumPowder);
        OreDictionary.registerOre("dustBismuth", ShinseiItems.bismuthPowder);
        OreDictionary.registerOre("dustChrome", ShinseiItems.chromiumPowder);
        OreDictionary.registerOre("dustCinnabar", ShinseiItems.cinnabarPowder);
        OreDictionary.registerOre("dustCobalt", ShinseiItems.cobaltPowder);
        OreDictionary.registerOre("dustCopper", ShinseiItems.copperPowder);
        OreDictionary.registerOre("dustCryolite", ShinseiItems.cryolitePowder);
        OreDictionary.registerOre("dustDolomite", ShinseiItems.dolomitePowder);
        OreDictionary.registerOre("dustFerrosilicon", ShinseiItems.ferrosiliconPowder);
        OreDictionary.registerOre("dustIron", ShinseiItems.ironPowder);
        OreDictionary.registerOre("dustMagnesium", ShinseiItems.magnesiumPowder);
        OreDictionary.registerOre("dustRuby", ShinseiItems.rubyPowder);
        OreDictionary.registerOre("dustSapphire", ShinseiItems.sapphirePowder);
        OreDictionary.registerOre("dustSilver", ShinseiItems.silverPowder);
        OreDictionary.registerOre("dustTin", ShinseiItems.tinPowder);

        //Gems
        OreDictionary.registerOre("gemAmethyst", ShinseiItems.amethystGem);
        OreDictionary.registerOre("gemApatite", ShinseiItems.apatiteCrystal);
        OreDictionary.registerOre("gemAquamarine", ShinseiItems.aquamarineGem);
        OreDictionary.registerOre("gemOnyx", ShinseiItems.onyxGem);
        OreDictionary.registerOre("gemEmerald", ShinseiItems.scarletEmeraldGem);
        OreDictionary.registerOre("gemRuby", ShinseiItems.rubyGem);
        OreDictionary.registerOre("gemSapphire", ShinseiItems.sapphireGem);

        //Liquids

        //General

    }
}