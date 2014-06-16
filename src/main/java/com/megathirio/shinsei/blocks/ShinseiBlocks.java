package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.items.ItemMarbleBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiBlocks {

//Block Variables
	//Native Element Minerals
	public static Block blockArsenicOre;
	public static Block blockBauxiteOre;
    public static Block blockBismuthOre;
	public static Block blockCopperOre;
    public static Block blockGraphiteOre;
	public static Block blockStibniteOre;

	//Resource Blocks
	public static Block blockAntimonyBlock;
	public static Block blockAluminumBlock;
    public static Block blockBismuthBlock;
	public static Block blockCopperBlock;
	
	
	//Mineral Blocks
	public static Block blockClaystone;
	public static Block blockLimestone;
	public static Block blockSiltstone;
	

	//Building Blocks
	public static Block blockMarble;
	
	public static void init(){
	
	//Block Initialization
		//Native element minerals
		//Bauxite(Aluminum) - processed in Pressurized Smelter
		blockBauxiteOre = new ShinseiOre(Material.rock).setBlockName("bauxite_ore");
		GameRegistry.registerBlock(blockBauxiteOre, "bauxite_ore");
		OreDictionary.registerOre("oreAluminum", new ItemStack(blockBauxiteOre));
		//Stibnite(Antimony) - processed in Furnaces
		blockStibniteOre = new ShinseiOre(Material.rock).setBlockName("stibnite_ore");
		GameRegistry.registerBlock(blockStibniteOre, "stibnite_ore");
		OreDictionary.registerOre("oreAntimony", new ItemStack(blockStibniteOre));
		//Arsenic - dropped as powder from ore block
		blockArsenicOre = new ShinseiOre(Material.rock).setBlockName("arsenic_ore");
		GameRegistry.registerBlock(blockArsenicOre, "arsenic_ore");
		OreDictionary.registerOre("oreArsenic", new ItemStack(blockArsenicOre));
        //Bismuth - processed in Furnaces
        blockBismuthOre = new ShinseiOre(Material.rock).setBlockName("bismuth_ore");
        GameRegistry.registerBlock(blockBismuthOre, "bismuth_ore");
        OreDictionary.registerOre("oreBismuth", new ItemStack(blockBismuthOre));
        //Graphite - dropped as powder from ore block
        blockGraphiteOre = new ShinseiOre(Material.rock).setBlockName("graphite_ore");
        GameRegistry.registerBlock(blockGraphiteOre, "graphite_ore");
        OreDictionary.registerOre("oreGraphite", new ItemStack(blockGraphiteOre));


		blockCopperOre = new ShinseiOre(Material.rock).setBlockName("copper_ore");
		GameRegistry.registerBlock(blockCopperOre, "copper_ore");
		OreDictionary.registerOre("oreCopper", new ItemStack(blockCopperOre));

		//Mineral Blocks
		blockClaystone = new ShinseiOre(Material.rock).setBlockName("claystone").setResistance(2F).setHardness(0.5F);
		blockClaystone.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockClaystone, "claystone");		 
		blockLimestone = new ShinseiOre(Material.rock).setBlockName("limestone");
		GameRegistry.registerBlock(blockLimestone, "limestone");
		OreDictionary.registerOre("blockStone", new ItemStack(blockLimestone));
		blockSiltstone = new ShinseiOre(Material.rock).setBlockName("siltstone").setResistance(2F).setHardness(0.5F);
		blockSiltstone.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockSiltstone, "siltstone");		 

		//Resource Blocks
		blockAluminumBlock = new ShinseiOre(Material.iron).setBlockName("aluminum_block").setHardness(4.0F).setResistance(10.0F);
		GameRegistry.registerBlock(blockAluminumBlock, "aluminum_block");
		OreDictionary.registerOre("blockAluminum", new ItemStack(blockAluminumBlock));

		blockAntimonyBlock = new ShinseiOre(Material.rock).setBlockName("antimony_block").setHardness(2.0F).setResistance(5.0F);
		GameRegistry.registerBlock(blockAntimonyBlock, "antimony_block");
		OreDictionary.registerOre("blockAntimony", new ItemStack(blockAntimonyBlock));

        blockBismuthBlock = new ShinseiOre(Material.rock).setBlockName("bismuth_block").setHardness(10.0F).setResistance(20.0F);
        GameRegistry.registerBlock(blockBismuthBlock, "bismuth_block");
        OreDictionary.registerOre("blockBismuth", new ItemStack(blockBismuthBlock));

		blockCopperBlock = new ShinseiOre(Material.rock).setBlockName("copper_block").setHardness(5.0F).setResistance(10.0F);
		GameRegistry.registerBlock(blockCopperBlock, "copper_block");

		//Brass - alloy of copper + zinc
		//Bronze - alloy of copper + tin
		//Carbon Fibre - composite of epoxy or nylon + aluminum + glass + carbon
		//Chromium
		//Cobalt - byproduct of copper, nickel
		//Copper
		//Lead
		//Nickel
		//Opal
		//Peridot

		//Platinum
		//Quartz
		//Shinzui
		//Silicon
		//SiliconCarbide
		//Silver
		//Steel
		//TitaniumCarbide
		//Tin
		//Titanium
		//Topaz
		//Tungsten
		//TungstenCarbide
		//Zinc

		//Building Blocks
		blockMarble = new BlockMarble().setBlockName("marble");
		GameRegistry.registerBlock(blockMarble, ItemMarbleBlock.class, "marble");
		
		OreDictionary.registerOre("blockStone", new ItemStack(Blocks.stone));

	}
}
