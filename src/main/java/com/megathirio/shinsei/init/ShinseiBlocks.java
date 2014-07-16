package com.megathirio.shinsei.init;

import com.megathirio.shinsei.block.mineral.*;
import com.megathirio.shinsei.block.BlockMarble;
import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.block.ore.*;

import com.megathirio.shinsei.item.ItemMarbleBlock;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiBlocks {

//Block Variables
	//Ores
    public static OreShinsei acanthiteOre = new BlockAcanthiteOre();
    public static OreShinsei amethystOre = new BlockAmethystOre();
    public static OreShinsei apatiteOre = new BlockApatiteOre();
	public static OreShinsei bariteOre = new BlockBariteOre();
    public static OreShinsei berylOre = new BlockBerylOre();
    public static OreShinsei bauxiteOre = new BlockBauxiteOre();
    public static OreShinsei bismuthOre = new BlockBismuthOre();
    public static OreShinsei boraxOre = new BlockBoraxOre();
    public static OreShinsei borniteOre = new BlockBorniteOre();
    public static OreShinsei cassiteriteOre = new BlockCassiteriteOre();
    public static OreShinsei chalcopyriteOre = new BlockChalcopyriteOre();
    public static OreShinsei chromiteOre = new BlockChromiteOre();
    public static OreShinsei cinnabarOre = new BlockCinnabarOre();
    public static OreShinsei cobaltiteOre = new BlockCobaltiteOre();
    public static OreShinsei cryoliteOre = new BlockCryoliteOre();
    public static OreShinsei dolomiteOre = new BlockDolomiteOre();
    public static OreShinsei hematiteOre = new BlockHematiteOre();
    public static OreShinsei fluoriteOre = new BlockFluoriteOre();
    public static OreShinsei galenaOre = new BlockGalenaOre();
    public static OreShinsei graphiteOre = new BlockGraphiteOre();
    public static OreShinsei molybdeniteOre = new BlockMolybdeniteOre();
    public static OreShinsei pentlanditeOre = new BlockPentlanditeOre();
    public static OreShinsei platinumOre = new BlockPlatinumOre();
    public static OreShinsei realgarOre = new BlockRealgarOre();
    public static OreShinsei rutileOre = new BlockRutileOre();
    public static OreShinsei stibniteOre = new BlockStibniteOre();
    public static OreShinsei tantaliteOre = new BlockTantaliteOre();

	//Resource Blocks
	public static Block blockAntimony;
	public static Block blockAluminum;
    public static Block blockBismuth;
    public static Block blockCadmium;
    public static Block blockChromium;
	public static Block blockCopper;
    public static Block blockIndium;
    public static Block blockIridium;
    public static Block blockLead;

	//Minerals
    public static BlockShinsei chalkBlock = new BlockChalk();
    public static BlockShinsei basaltBlock = new BlockBasalt();
    public static BlockShinsei claystoneBlock = new BlockClaystone();
    public static BlockShinsei limestoneBlock = new BlockLimestone();
    public static BlockShinsei marbleBlock = new BlockMarble();
	public static BlockShinsei siltstoneBlock = new BlockSiltstone();
    public static BlockShinsei graniteBlock = new BlockGranite();
    public static BlockShinsei gypsumBlock = new BlockGypsum();
    public static BlockShinsei haliteBlock = new BlockHalite();

    public static BlockFluidClassic slakedLimeBlock;

 	public static void init(){
	
	//Block Initialization
        //Ore
        GameRegistry.registerBlock(acanthiteOre, Names.Ores.ACANTHITE_ORE);
        GameRegistry.registerBlock(amethystOre, Names.Ores.AMETHYST_ORE);
        GameRegistry.registerBlock(apatiteOre, Names.Ores.APATITE_ORE);
        GameRegistry.registerBlock(bariteOre, Names.Ores.BARITE_ORE);
        GameRegistry.registerBlock(berylOre, Names.Ores.BERYL_ORE);

        GameRegistry.registerBlock(bauxiteOre, Names.Ores.BAUXITE_ORE);
        GameRegistry.registerBlock(bismuthOre, Names.Ores.BISMUTH_ORE);
        GameRegistry.registerBlock(boraxOre, Names.Ores.BORAX_ORE);
        GameRegistry.registerBlock(borniteOre, Names.Ores.BORNITE_ORE);
        GameRegistry.registerBlock(cassiteriteOre, Names.Ores.CASSITERITE_ORE);
        GameRegistry.registerBlock(chalcopyriteOre, Names.Ores.CHALCOPYRITE_ORE);
        GameRegistry.registerBlock(chromiteOre, Names.Ores.CHROMITE_ORE);
        GameRegistry.registerBlock(cinnabarOre, Names.Ores.CINNABAR_ORE);
        GameRegistry.registerBlock(cobaltiteOre, Names.Ores.COBALTITE_ORE);
        GameRegistry.registerBlock(cryoliteOre, Names.Ores.CRYOLITE_ORE);
        GameRegistry.registerBlock(dolomiteOre, Names.Ores.DOLOMITE_ORE);
        GameRegistry.registerBlock(galenaOre, Names.Ores.GALENA_ORE);
        GameRegistry.registerBlock(fluoriteOre, Names.Ores.FLUORITE_ORE);
        GameRegistry.registerBlock(graphiteOre, Names.Ores.GRAPHITE_ORE);
        GameRegistry.registerBlock(hematiteOre, Names.Ores.HEMATITE_ORE);
        GameRegistry.registerBlock(molybdeniteOre, Names.Ores.MOLYBDENITE_ORE);
        GameRegistry.registerBlock(pentlanditeOre, Names.Ores.PENTLANDITE_ORE);
        GameRegistry.registerBlock(platinumOre, Names.Ores.PLATINUM_ORE);
        GameRegistry.registerBlock(realgarOre, Names.Ores.REALGAR_ORE);
        GameRegistry.registerBlock(rutileOre, Names.Ores.RUTILE_ORE);
        GameRegistry.registerBlock(stibniteOre, Names.Ores.STIBNITE_ORE);
        GameRegistry.registerBlock(tantaliteOre, Names.Ores.TANTALITE_ORE);

        //Mineral Blocks
        GameRegistry.registerBlock(basaltBlock, Names.Blocks.BASALT);
        GameRegistry.registerBlock(chalkBlock, Names.Blocks.CHALK);
        GameRegistry.registerBlock(claystoneBlock, Names.Blocks.CLAYSTONE);
        GameRegistry.registerBlock(limestoneBlock, Names.Blocks.LIMESTONE);
        GameRegistry.registerBlock(marbleBlock, ItemMarbleBlock.class, Names.Blocks.MARBLE);
        GameRegistry.registerBlock(siltstoneBlock, Names.Blocks.SILTSTONE);
        GameRegistry.registerBlock(graniteBlock, Names.Blocks.GRANITE);
        GameRegistry.registerBlock(gypsumBlock, Names.Blocks.GYPSUM);
        GameRegistry.registerBlock(haliteBlock, Names.Blocks.HALITE);

    		//Resource Blocks
    		blockAluminum = new BlockShinsei(Material.iron).setBlockName("aluminum_block").setHardness(2.75F).setResistance(5.5F);
    		GameRegistry.registerBlock(blockAluminum, "aluminum_block");

    		blockAntimony = new BlockShinsei(Material.iron).setBlockName("antimony_block");
    		GameRegistry.registerBlock(blockAntimony, "antimony_block");

            blockBismuth = new BlockShinsei(Material.iron).setBlockName("bismuth_block").setHardness(10.0F).setResistance(20.0F);
            GameRegistry.registerBlock(blockBismuth, "bismuth_block");

            blockCadmium = new BlockShinsei(Material.iron).setBlockName("cadmium_block");
            GameRegistry.registerBlock(blockCadmium, "cadmium_block");

            blockChromium = new BlockShinsei(Material.iron).setBlockName("chromium_block").setHardness(8.5F).setResistance(15.0F);
            GameRegistry.registerBlock(blockChromium, "chromium_block");

    		blockCopper = new BlockShinsei(Material.iron).setBlockName("copper_block").setHardness(5.0F).setResistance(10.0F);
    		GameRegistry.registerBlock(blockCopper, "copper_block");

            blockIndium = new BlockShinsei(Material.iron).setBlockName("indium_block");
            GameRegistry.registerBlock(blockIndium, "indium_block");

            blockIridium = new BlockShinsei(Material.iron).setBlockName("iridium_block");
            GameRegistry.registerBlock(blockIridium, "iridium_block");

            blockLead = new BlockShinsei(Material.iron).setBlockName("lead_block");
            GameRegistry.registerBlock(blockLead, "lead_block");

	}
}
