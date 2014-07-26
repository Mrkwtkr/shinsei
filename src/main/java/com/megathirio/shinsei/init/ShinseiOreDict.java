package com.megathirio.shinsei.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class ShinseiOreDict {

    public static void items(){
        //Vanilla
        OreDictionary.registerOre("gemEmerald", Items.emerald);

        //Ingots
        OreDictionary.registerOre("ingotAluminum", ShinseiItems.aluminumIngot);
        OreDictionary.registerOre("ingotBarium", ShinseiItems.bariumIngot);
        OreDictionary.registerOre("ingotSilver", ShinseiItems.silverIngot);

        //Nuggets
        OreDictionary.registerOre("nuggetAluminum", ShinseiItems.aluminumNugget);
        OreDictionary.registerOre("nuggetBarium", ShinseiItems.bariumNugget);
        OreDictionary.registerOre("nuggetSilver", ShinseiItems.silverNugget);

        //Gems

        //Powders
        OreDictionary.registerOre("dustChalk", ShinseiItems.chalkPowder);
        OreDictionary.registerOre("dustSalt", ShinseiItems.salt);
        OreDictionary.registerOre("dustGypsum", ShinseiItems.gypsumPowder);
        OreDictionary.registerOre("dustLime", ShinseiItems.quicklime);

        OreDictionary.registerOre("dustAluminum", ShinseiItems.aluminumPowder);
        OreDictionary.registerOre("dustAmethyst", ShinseiItems.amethystPowder);
        OreDictionary.registerOre("dustApatite", ShinseiItems.apatitePowder);
        OreDictionary.registerOre("dustBarium", ShinseiItems.bariumPowder);
        OreDictionary.registerOre("dustSilver", ShinseiItems.silverPowder);

        //Gems
        OreDictionary.registerOre("gemAmethyst", ShinseiItems.amethystGem);
        OreDictionary.registerOre("gemApatite", ShinseiItems.apatiteCrystal);
        OreDictionary.registerOre("gemAquamarine", ShinseiItems.aquamarineGem);
        OreDictionary.registerOre("gemEmerald", ShinseiItems.scarletEmeraldGem);

        //Liquids

        //General

    }

    public static void blocks(){
        //Vanilla
        OreDictionary.registerOre("blockStone", Blocks.stone);
        OreDictionary.registerOre("blockCobble", Blocks.cobblestone);
        OreDictionary.registerOre("blockEmerald", Blocks.emerald_block);

        //Blocks
        OreDictionary.registerOre("blockAluminum", ShinseiBlocks.aluminumBlock);
        OreDictionary.registerOre("blockAmethyst", ShinseiBlocks.amethystBlock);
        OreDictionary.registerOre("blockApatite", ShinseiBlocks.apatiteBlock);
        OreDictionary.registerOre("blockAquamarine", ShinseiBlocks.aquamarineBlock);
        OreDictionary.registerOre("blockBarium", ShinseiBlocks.bariumBlock);
        OreDictionary.registerOre("blockSilver", ShinseiBlocks.silverBlock);
        OreDictionary.registerOre("blockEmerald", ShinseiBlocks.scarletEmeraldBlock);

        //Ores
        OreDictionary.registerOre("oreAluminum", ShinseiBlocks.bauxiteOre);
        OreDictionary.registerOre("oreApatite", ShinseiBlocks.apatiteOre);
        OreDictionary.registerOre("oreSilver", ShinseiBlocks.acanthiteOre);
        OreDictionary.registerOre("oreBarite", ShinseiBlocks.bariteOre);

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

        //Minerals
        OreDictionary.registerOre("blockStone", ShinseiBlocks.basaltBlock);

    }
}
