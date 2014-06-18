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
	public static Block oreArsenic;
	public static Block oreBauxite;
    public static Block oreBismuth;
    public static Block oreChromite;
	public static Block oreCopper;
    public static Block oreGraphite;
	public static Block oreStibnite;
    public static Block oreIridium;
    public static Block oreLead;

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
    		oreBauxite = new ShinseiOre(Material.rock).setBlockName("bauxite_ore");
    		GameRegistry.registerBlock(oreBauxite, "bauxite_ore");
    		OreDictionary.registerOre("oreAluminum", new ItemStack(oreBauxite));

	    	//Stibnite - processed in Furnaces
    		oreStibnite = new ShinseiOre(Material.rock).setBlockName("stibnite_ore");
    		OreDictionary.registerOre("oreAntimony", new ItemStack(oreStibnite));

    		//Arsenic Ore - drops Arsenic
    		oreArsenic = new ShinseiOre(Material.rock).setBlockName("arsenic_ore");
    		GameRegistry.registerBlock(oreArsenic, "arsenic_ore");
    		OreDictionary.registerOre("oreArsenic", new ItemStack(oreArsenic));

            //Bismuth Ore - processed in Furnaces
            oreBismuth = new ShinseiOre(Material.rock).setBlockName("bismuth_ore");
            GameRegistry.registerBlock(oreBismuth, "bismuth_ore");
            OreDictionary.registerOre("oreBismuth", new ItemStack(oreBismuth));

            //Graphite Ore - drops Graphite
            oreGraphite = new ShinseiOre(Material.rock).setBlockName("graphite_ore");
            GameRegistry.registerBlock(oreGraphite, "graphite_ore");
            OreDictionary.registerOre("oreGraphite", new ItemStack(oreGraphite));

            //Chromite Ore - processed in Furnaces
            oreChromite = new ShinseiOre(Material.rock).setBlockName("chromite_ore");
            GameRegistry.registerBlock(oreChromite, "chromite_ore");
            OreDictionary.registerOre("oreChromite", new ItemStack(oreChromite));

            //Copper Ore - processed in Furnaces
    		oreCopper = new ShinseiOre(Material.rock).setBlockName("copper_ore");
    		GameRegistry.registerBlock(oreCopper, "copper_ore");
    		OreDictionary.registerOre("oreCopper", new ItemStack(oreCopper));

            //Iridium Ore - processed in
            oreIridium = new ShinseiOre(Material.rock).setBlockName("iridium_ore");
            GameRegistry.registerBlock(oreIridium, "iridium_ore");
            OreDictionary.registerOre("oreIridium", new ItemStack(oreIridium));

            //Lead Ore - processed in Furnaces
            oreLead = new ShinseiOre(Material.rock).setBlockName("lead_ore");
            GameRegistry.registerBlock(oreLead, "lead_ore");
            OreDictionary.registerOre("oreLead", new ItemStack(oreLead));

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
    		blockAluminum = new ShinseiBlock(Material.iron).setBlockName("aluminum_block").setHardness(2.75F).setResistance(5.5F);
    		GameRegistry.registerBlock(blockAluminum, "aluminum_block");
    		OreDictionary.registerOre("blockAluminum", new ItemStack(blockAluminum));

    		blockAntimony = new ShinseiBlock(Material.iron).setBlockName("antimony_block");
    		GameRegistry.registerBlock(blockAntimony, "antimony_block");
    		OreDictionary.registerOre("blockAntimony", new ItemStack(blockAntimony));

            blockBismuth = new ShinseiBlock(Material.iron).setBlockName("bismuth_block").setHardness(10.0F).setResistance(20.0F);
            GameRegistry.registerBlock(blockBismuth, "bismuth_block");
            OreDictionary.registerOre("blockBismuth", new ItemStack(blockBismuth));

            blockCadmium = new ShinseiBlock(Material.iron).setBlockName("cadmium_block");
            GameRegistry.registerBlock(blockCadmium, "cadmium_block");
            OreDictionary.registerOre("blockCadmium", new ItemStack(blockCadmium));

            blockChromium = new ShinseiBlock(Material.iron).setBlockName("chromium_block").setHardness(8.5F).setResistance(15.0F);
            GameRegistry.registerBlock(blockChromium, "chromium_block");
            OreDictionary.registerOre("blockChromium", new ItemStack(blockChromium));

    		blockCopper = new ShinseiBlock(Material.iron).setBlockName("copper_block").setHardness(5.0F).setResistance(10.0F);
    		GameRegistry.registerBlock(blockCopper, "copper_block");
            OreDictionary.registerOre("blockCopper", new ItemStack(blockCopper));

            blockIndium = new ShinseiBlock(Material.iron).setBlockName("indium_block");
            GameRegistry.registerBlock(blockIndium, "indium_block");
            OreDictionary.registerOre("blockIndium", new ItemStack(blockIndium));

            blockIridium = new ShinseiBlock(Material.iron).setBlockName("iridium_block");
            GameRegistry.registerBlock(blockIridium, "iridium_block");
            OreDictionary.registerOre("blockIridium", new ItemStack(blockIridium));

            blockLead = new ShinseiBlock(Material.iron).setBlockName("lead_block");
            GameRegistry.registerBlock(blockLead, "lead_block");
            OreDictionary.registerOre("blockLead", new ItemStack(blockLead));

        //Building Blocks
    		blockMarble = new BlockMarble().setBlockName("marble");
    		GameRegistry.registerBlock(blockMarble, ItemMarbleBlock.class, "marble");
    		OreDictionary.registerOre("blockStone", new ItemStack(Blocks.stone));

	}
}
