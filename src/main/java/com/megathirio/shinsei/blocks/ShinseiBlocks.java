package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.items.ItemMarbleBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiBlocks {

//Block Variables
	//Native Element Minerals
	public static Block blockArsenicOre;
	public static Block blockBauxiteOre;
    public static Block blockBismuthOre;
    public static Block blockChromiteOre;
	public static Block blockCopperOre;
    public static Block blockGraphiteOre;
	public static Block blockStibniteOre;
    public static Block blockIridiumOre;
    public static Block blockLeadOre;

	//Resource Blocks
	public static Block blockAntimonyBlock;
	public static Block blockAluminumBlock;
    public static Block blockBismuthBlock;
    public static Block blockCadmiumBlock;
    public static Block blockChromiumBlock;
	public static Block blockCopperBlock;
    public static Block blockIndiumBlock;
    public static Block blockIridiumBlock;
    public static Block blockLeadBlock;

	
	//Mineral Blocks
	public static Block blockClaystone;
	public static Block blockLimestone;
	public static Block blockSiltstone;
	

	//Building Blocks
	public static Block blockMarble;
	
	public static void init(){
	
	//Block Initialization

		//Native element minerals
        	//Harvest levels: Wood:0; Stone:1; Iron:2; Diamond:3; Gold:0

    		//Bauxite - processed in Pressurized Smelter
    		blockBauxiteOre = new ShinseiBlock(Material.rock).setBlockName("bauxite_ore");
            blockBauxiteOre.setHarvestLevel("pickaxe", 1);
    		GameRegistry.registerBlock(blockBauxiteOre, "bauxite_ore");
    		OreDictionary.registerOre("oreAluminum", new ItemStack(blockBauxiteOre));

	    	//Stibnite - processed in Furnaces
    		blockStibniteOre = new ShinseiBlock(Material.rock).setBlockName("stibnite_ore");
            blockStibniteOre.setHarvestLevel("pickaxe", 1);
    		GameRegistry.registerBlock(blockStibniteOre, "stibnite_ore");
    		OreDictionary.registerOre("oreAntimony", new ItemStack(blockStibniteOre));

    		//Arsenic Ore - drops Arsenic
    		blockArsenicOre = new ShinseiBlock(Material.rock).setBlockName("arsenic_ore");
            blockArsenicOre.setHarvestLevel("pickaxe", 1);
    		GameRegistry.registerBlock(blockArsenicOre, "arsenic_ore");
    		OreDictionary.registerOre("oreArsenic", new ItemStack(blockArsenicOre));

            //Bismuth Ore - processed in Furnaces
            blockBismuthOre = new ShinseiBlock(Material.rock).setBlockName("bismuth_ore");
            blockBismuthOre.setHarvestLevel("pickaxe", 1);
            GameRegistry.registerBlock(blockBismuthOre, "bismuth_ore");
            OreDictionary.registerOre("oreBismuth", new ItemStack(blockBismuthOre));

            //Graphite Ore - drops Graphite
            blockGraphiteOre = new ShinseiBlock(Material.rock).setBlockName("graphite_ore");
            blockGraphiteOre.setHarvestLevel("pickaxe", 1);
            GameRegistry.registerBlock(blockGraphiteOre, "graphite_ore");
            OreDictionary.registerOre("oreGraphite", new ItemStack(blockGraphiteOre));

            //Chromite Ore - processed in Furnaces
            blockChromiteOre = new ShinseiBlock(Material.rock).setBlockName("chromite_ore");
            blockChromiteOre.setHarvestLevel("pickaxe", 1);
            GameRegistry.registerBlock(blockChromiteOre, "chromite_ore");
            OreDictionary.registerOre("oreChromite", new ItemStack(blockChromiteOre));

            //Copper Ore - processed in Furnaces
    		blockCopperOre = new ShinseiBlock(Material.rock).setBlockName("copper_ore");
            blockCopperOre.setHarvestLevel("pickaxe", 1);
    		GameRegistry.registerBlock(blockCopperOre, "copper_ore");
    		OreDictionary.registerOre("oreCopper", new ItemStack(blockCopperOre));

            //Iridium Ore - processed in hydrochloric acid
            blockIridiumOre = new ShinseiBlock(Material.rock).setBlockName("iridium_ore");
            blockIridiumOre.setHarvestLevel("pickaxe", 1);
            GameRegistry.registerBlock(blockIridiumOre, "iridium_ore");
            OreDictionary.registerOre("oreIridium", new ItemStack(blockIridiumOre));

            //Lead Ore - processed in furnaces
            blockLeadOre = new ShinseiBlock(Material.rock).setBlockName("lead_ore");
            blockLeadOre.setHarvestLevel("pickaxe", 1);
            GameRegistry.registerBlock(blockLeadOre, "lead_ore");
            OreDictionary.registerOre("oreLead", new ItemStack(blockLeadOre));

        //Mineral Blocks
    		blockClaystone = new ShinseiBlock(Material.clay).setBlockName("claystone").setResistance(2F).setHardness(0.5F);
    		blockClaystone.setHarvestLevel("shovel", 0);
    		GameRegistry.registerBlock(blockClaystone, "claystone");
            OreDictionary.registerOre("blockClay", new ItemStack(blockClaystone));

    		blockLimestone = new ShinseiBlock(Material.rock).setBlockName("limestone");
            blockLimestone.setHarvestLevel("pickaxe", 0);
    		GameRegistry.registerBlock(blockLimestone, "limestone");
    		OreDictionary.registerOre("blockStone", new ItemStack(blockLimestone));

    		blockSiltstone = new ShinseiBlock(Material.clay).setBlockName("siltstone").setResistance(2F).setHardness(0.5F);
    		blockSiltstone.setHarvestLevel("shovel", 0);
    		GameRegistry.registerBlock(blockSiltstone, "siltstone");
            OreDictionary.registerOre("blockSilt", new ItemStack(blockSiltstone));

    		//Resource Blocks
    		blockAluminumBlock = new ShinseiBlock(Material.iron).setBlockName("aluminum_block").setHardness(2.75F).setResistance(5.5F);
            blockAluminumBlock.setHarvestLevel("pickaxe", 2);
    		GameRegistry.registerBlock(blockAluminumBlock, "aluminum_block");
    		OreDictionary.registerOre("blockAluminum", new ItemStack(blockAluminumBlock));

    		blockAntimonyBlock = new ShinseiBlock(Material.iron).setBlockName("antimony_block").setHardness(2.0F).setResistance(5.0F);
            blockAntimonyBlock.setHarvestLevel("pickaxe", 2);
    		GameRegistry.registerBlock(blockAntimonyBlock, "antimony_block");
    		OreDictionary.registerOre("blockAntimony", new ItemStack(blockAntimonyBlock));

            blockBismuthBlock = new ShinseiBlock(Material.iron).setBlockName("bismuth_block").setHardness(10.0F).setResistance(20.0F);
            blockBismuthBlock.setHarvestLevel("pickaxe", 2);
            GameRegistry.registerBlock(blockBismuthBlock, "bismuth_block");
            OreDictionary.registerOre("blockBismuth", new ItemStack(blockBismuthBlock));

            blockCadmiumBlock = new ShinseiBlock(Material.iron).setBlockName("cadmium_block").setHardness(2.0F).setResistance(5.0F);
            blockCadmiumBlock.setHarvestLevel("pickaxe", 2);
            GameRegistry.registerBlock(blockCadmiumBlock, "cadmium_block");
            OreDictionary.registerOre("blockCadmium", new ItemStack(blockCadmiumBlock));

            blockChromiumBlock = new ShinseiBlock(Material.iron).setBlockName("chromium_block").setHardness(8.5F).setResistance(15.0F);
            blockChromiumBlock.setHarvestLevel("pickaxe", 2);
            GameRegistry.registerBlock(blockChromiumBlock, "chromium_block");
            OreDictionary.registerOre("blockChromium", new ItemStack(blockChromiumBlock));

    		blockCopperBlock = new ShinseiBlock(Material.iron).setBlockName("copper_block").setHardness(5.0F).setResistance(10.0F);
            blockCopperBlock.setHarvestLevel("pickaxe", 2);
    		GameRegistry.registerBlock(blockCopperBlock, "copper_block");
            OreDictionary.registerOre("blockCopper", new ItemStack(blockCopperBlock));

            blockIndiumBlock = new ShinseiBlock(Material.iron).setBlockName("indium_block").setHardness(2.0F).setResistance(5.0F);
            blockIndiumBlock.setHarvestLevel("pickaxe", 2);
            GameRegistry.registerBlock(blockIndiumBlock, "indium_block");
            OreDictionary.registerOre("blockIndium", new ItemStack(blockIndiumBlock));

            blockIridiumBlock = new ShinseiBlock(Material.iron).setBlockName("iridium_block").setHardness(2.0F).setResistance(5.0F);
            blockIridiumBlock.setHarvestLevel("pickaxe", 2);
            GameRegistry.registerBlock(blockIridiumBlock, "iridium_block");
            OreDictionary.registerOre("blockIridium", new ItemStack(blockIridiumBlock));

            blockLeadBlock = new ShinseiBlock(Material.iron).setBlockName("lead_block").setHardness(2.0F).setResistance(5.0F);
            blockLeadBlock.setHarvestLevel("pickaxe", 2);
            GameRegistry.registerBlock(blockLeadBlock, "lead_block");
            OreDictionary.registerOre("blockLead", new ItemStack(blockLeadBlock));

        //Building Blocks
    		blockMarble = new BlockMarble().setBlockName("marble");
            blockMarble.setHarvestLevel("pickaxe", 2);
    		GameRegistry.registerBlock(blockMarble, ItemMarbleBlock.class, "marble");
    		OreDictionary.registerOre("blockStone", new ItemStack(Blocks.stone));

	}
}
