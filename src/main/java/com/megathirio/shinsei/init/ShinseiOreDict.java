package com.megathirio.shinsei.init;

import net.minecraftforge.oredict.OreDictionary;

public class ShinseiOreDict {

    public static void items(){
        //Ingots
        OreDictionary.registerOre("ingotAluminum", ShinseiItems.aluminumIngot);
        OreDictionary.registerOre("ingotBismuth", ShinseiItems.bismuthIngot);
        OreDictionary.registerOre("ingotCadmium", ShinseiItems.cadmiumIngot);
        OreDictionary.registerOre("ingotChromium", ShinseiItems.chromiumIngot);
        OreDictionary.registerOre("ingotCopper", ShinseiItems.copperIngot);
        OreDictionary.registerOre("ingotIndium", ShinseiItems.indiumIngot);
        OreDictionary.registerOre("ingotIridium", ShinseiItems.iridiumIngot);
        OreDictionary.registerOre("ingotLead", ShinseiItems.leadIngot);
        OreDictionary.registerOre("ingotNickel", ShinseiItems.nickelIngot);
        OreDictionary.registerOre("ingotMagnesium", ShinseiItems.magnesiumIngot);
        OreDictionary.registerOre("ingotSilver", ShinseiItems.silverIngot);
        OreDictionary.registerOre("ingotTin", ShinseiItems.tinIngot);

        //Liquids
        OreDictionary.registerOre("slakedLime", ShinseiItems.slakedLime);
        OreDictionary.registerOre("mercury", ShinseiItems.mercury);

        //Dusts
        OreDictionary.registerOre("dustAluminum", ShinseiItems.aluminumPowder);
        OreDictionary.registerOre("dustAntimony", ShinseiItems.antimonyPowder);
        OreDictionary.registerOre("dustArsenic", ShinseiItems.arsenicPowder);
        OreDictionary.registerOre("dustBarium", ShinseiItems.bariumPowder);
        OreDictionary.registerOre("dustBismuth", ShinseiItems.bismuthPowder);
        OreDictionary.registerOre("dustChromium", ShinseiItems.chromiumPowder);
        OreDictionary.registerOre("dustCinnabar", ShinseiItems.cinnabarPowder);
        OreDictionary.registerOre("dustCopper", ShinseiItems.copperPowder);
        OreDictionary.registerOre("dustGunPowder", ShinseiItems.blackPowder);
        OreDictionary.registerOre("dustGraphite", ShinseiItems.graphitePowder);
        OreDictionary.registerOre("dustIridium", ShinseiItems.iridiumPowder);
        OreDictionary.registerOre("dustIron", ShinseiItems.ironPowder);
        OreDictionary.registerOre("dustLead", ShinseiItems.leadPowder);
        OreDictionary.registerOre("dustMagnesium", ShinseiItems.magnesiumPowder);
        OreDictionary.registerOre("dustNickel", ShinseiItems.nickelPowder);
        OreDictionary.registerOre("dustQuicklime", ShinseiItems.quicklime);
        OreDictionary.registerOre("dustSilver", ShinseiItems.silverPowder);
        OreDictionary.registerOre("dustSulphur", ShinseiItems.sulphur);
        OreDictionary.registerOre("dustTin", ShinseiItems.tinPowder);
        OreDictionary.registerOre("dustSalt", ShinseiItems.salt);

        //Gems
        OreDictionary.registerOre("gemAquamarine", ShinseiItems.aquamarineGem);
        OreDictionary.registerOre("gemEmerald", ShinseiItems.scarletEmeraldGem);

        //General

    }

    public static void blocks(){
        //Ores
        OreDictionary.registerOre("oreAluminum", ShinseiBlocks.bauxiteOre);
        OreDictionary.registerOre("oreAntimony", ShinseiBlocks.stibniteOre);
        OreDictionary.registerOre("oreArsenic", ShinseiBlocks.arsenicOre);
        OreDictionary.registerOre("oreBaryte", ShinseiBlocks.baryteOre);
        OreDictionary.registerOre("oreBeryl", ShinseiBlocks.berylOre);
        OreDictionary.registerOre("oreBismuth", ShinseiBlocks.bismuthOre);
        OreDictionary.registerOre("oreChromite", ShinseiBlocks.chromiteOre);
        OreDictionary.registerOre("oreCinnabar", ShinseiBlocks.cinnabarOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.borniteOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.chalcociteOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.chalcopyriteOre);
        OreDictionary.registerOre("oreCopper", ShinseiBlocks.copperOre);
        OreDictionary.registerOre("oreGraphite", ShinseiBlocks.graphiteOre);
        OreDictionary.registerOre("oreIridium", ShinseiBlocks.iridiumOre);
//        OreDictionary.registerOre("oreIron", ShinseiBlocks.hematiteOre);
        OreDictionary.registerOre("oreLead", ShinseiBlocks.galenaOre);
        OreDictionary.registerOre("oreMagnesium", ShinseiBlocks.dolomiteOre);
        OreDictionary.registerOre("oreMolybdenite", ShinseiBlocks.molybdeniteOre);
        OreDictionary.registerOre("oreNickel", ShinseiBlocks.pentlanditeOre);
        OreDictionary.registerOre("oreSilver", ShinseiBlocks.acanthiteOre);
        OreDictionary.registerOre("oreTin", ShinseiBlocks.cassiteriteOre);

        //Minerals
        OreDictionary.registerOre("blockStone", ShinseiBlocks.limestoneBlock);
        OreDictionary.registerOre("blockClay", ShinseiBlocks.claystoneBlock);
        OreDictionary.registerOre("oreSalt", ShinseiBlocks.haliteBlock);
        OreDictionary.registerOre("blockSilt", ShinseiBlocks.siltstoneBlock);

    }
}
