package com.megathirio.shinsei.init;

import com.megathirio.shinsei.block.mineral.BlockClaystone;
import com.megathirio.shinsei.block.mineral.BlockHalite;
import com.megathirio.shinsei.block.mineral.BlockLimestone;
import com.megathirio.shinsei.block.BlockMarble;
import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.block.mineral.BlockSiltstone;
import com.megathirio.shinsei.block.ore.*;

import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiBlocks {

//Block Variables
	//Ores
    public static OreShinsei acanthiteOre = new BlockAcanthiteOre();
	public static OreShinsei arsenicOre = new BlockArsenicOre();
	public static OreShinsei baryteOre = new BlockBaryteOre();
    public static OreShinsei berylOre = new BlockBerylOre();
    public static OreShinsei bauxiteOre = new BlockBauxiteOre();
    public static OreShinsei bismuthOre = new BlockBismuthOre();
    public static OreShinsei borniteOre = new BlockBorniteOre();
    public static OreShinsei cassiteriteOre = new BlockCassiteriteOre();
    public static OreShinsei chalcociteOre = new BlockChalcociteOre();
    public static OreShinsei chalcopyriteOre = new BlockChalcopyriteOre();
    public static OreShinsei chromiteOre = new BlockChromiteOre();
    public static OreShinsei cinnabarOre = new BlockCinnabarOre();
	public static OreShinsei copperOre = new BlockCopperOre();
    public static OreShinsei dolomiteOre = new BlockDolomiteOre();
    public static OreShinsei hematiteOre = new BlockHematiteOre();
    public static OreShinsei galenaOre = new BlockGalenaOre();
    public static OreShinsei graphiteOre = new BlockGraphiteOre();
    public static OreShinsei iridiumOre = new BlockIridiumOre();
    public static OreShinsei molybdeniteOre = new BlockMolybdeniteOre();
    public static OreShinsei pentlanditeOre = new BlockPentlanditeOre();
    public static OreShinsei stibniteOre = new BlockStibniteOre();

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
    public static BlockShinsei claystoneBlock = new BlockClaystone();
    public static BlockShinsei limestoneBlock = new BlockLimestone();
    public static BlockShinsei marbleBlock = new BlockMarble();
	public static BlockShinsei siltstoneBlock = new BlockSiltstone();
    public static BlockShinsei haliteBlock = new BlockHalite();

	public static void init(){
	
	//Block Initialization
        //Ore
        GameRegistry.registerBlock(acanthiteOre, Names.Blocks.ACANTHITE_ORE);
        GameRegistry.registerBlock(arsenicOre, Names.Blocks.ARSENIC_ORE);
        GameRegistry.registerBlock(baryteOre, Names.Blocks.BARYTE_ORE);
        GameRegistry.registerBlock(berylOre, Names.Blocks.BERYL_ORE);
        GameRegistry.registerBlock(bauxiteOre, Names.Blocks.BAUXITE_ORE);
        GameRegistry.registerBlock(bismuthOre, Names.Blocks.BISMUTH_ORE);
        GameRegistry.registerBlock(borniteOre, Names.Blocks.BORNITE_ORE);
        GameRegistry.registerBlock(cassiteriteOre, Names.Blocks.CASSITERITE_ORE);
        GameRegistry.registerBlock(chalcociteOre, Names.Blocks.CHALCOCITE_ORE);
        GameRegistry.registerBlock(chalcopyriteOre, Names.Blocks.CHALCOPYRITE_ORE);
        GameRegistry.registerBlock(chromiteOre, Names.Blocks.CHROMITE_ORE);
        GameRegistry.registerBlock(cinnabarOre, Names.Blocks.CINNABAR_ORE);
        GameRegistry.registerBlock(copperOre, Names.Blocks.COPPER_ORE);
        GameRegistry.registerBlock(dolomiteOre, Names.Blocks.DOLOMITE_ORE);
        GameRegistry.registerBlock(galenaOre, Names.Blocks.GALENA_ORE);
        GameRegistry.registerBlock(graphiteOre, Names.Blocks.GRAPHITE_ORE);
        GameRegistry.registerBlock(iridiumOre, Names.Blocks.IRIDIUM_ORE);
        GameRegistry.registerBlock(molybdeniteOre, Names.Blocks.MOLYBDENITE_ORE);
        GameRegistry.registerBlock(pentlanditeOre, Names.Blocks.PENTLANDITE_ORE);
        GameRegistry.registerBlock(stibniteOre, Names.Blocks.STIBNITE_ORE);

        //Mineral Blocks
        GameRegistry.registerBlock(claystoneBlock, Names.Blocks.CLAYSTONE);
        GameRegistry.registerBlock(limestoneBlock, Names.Blocks.LIMESTONE);
        GameRegistry.registerBlock(marbleBlock, Names.Blocks.MARBLE);
        GameRegistry.registerBlock(siltstoneBlock, Names.Blocks.SILTSTONE);
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
