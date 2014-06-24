package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.ShinseiDusts;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiMachines;
import com.megathirio.shinsei.items.ShinseiIngots;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;

import cpw.mods.fml.common.registry.GameRegistry;

public class ShinseiRecipes {
	
	public static void init(){

		//Override Recipes
		RecipeOverride.overrideCraftingRecipe();
//        RecipeOverride.overrideSmeltingRecipe();

		//Shapeless
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.bucketSlakedLime), ShinseiDusts.dustQuicklime, ShinseiDusts.dustQuicklime, ShinseiDusts.dustQuicklime, Items.water_bucket);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay), ShinseiItems.itemSilt, ShinseiItems.itemSilt, ShinseiItems.itemSilt, Blocks.dirt);
			GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotAluminum, 9), ShinseiBlocks.blockAluminum);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotAntimony, 9), ShinseiBlocks.blockAntimony);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotBismuth, 9), ShinseiBlocks.blockBismuth);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotCadmium, 9), ShinseiBlocks.blockCadmium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotChromium, 9), ShinseiBlocks.blockChromium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotCopper, 9), ShinseiBlocks.blockCopper);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotIndium, 9), ShinseiBlocks.blockIndium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotIridium, 9), ShinseiBlocks.blockIridium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.ingotLead, 9), ShinseiBlocks.blockLead);

		//Shaped
			//Machines
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.itemBellows, 1), "  @"," @#","$@@", '@', "stickWood", '#', Items.leather, '$', "ingotIron"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.itemPistonBellows, 1), "  @"," @#","$%@", '@', "stickWood", '#', Items.leather, '$', "ingotIron", '%', Blocks.piston));
            GameRegistry.addRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', Blocks.cobblestone);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockStone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockWoodFurnaceIdle, 1), "@@@","@#@","$%$", '@', "blockStone", '#', Blocks.glass_pane, '$', "ingotIron", '%', Blocks.iron_bars));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockForgeFurnaceIdle, 1), "@@@","@#@","$$$", '@', Blocks.brick_block, '#', Blocks.iron_bars, '$', "ingotIron"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockToolBench, 1), "@@@","# #","# #", '@', "plankWood", '#', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockMachinePress, 1), " @ ","@@@","@ @", '@', "ingotIron"));

            //Blocks
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockAluminum, 1), "@@@","@@@","@@@", '@', "ingotAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockAntimony, 1), "@@@","@@@","@@@", '@', "ingotAntimony"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockBismuth, 1), "@@@","@@@","@@@", '@', "ingotBismuth"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockCadmium, 1), "@@@","@@@","@@@", '@', "ingotCadmium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockChromium, 1), "@@@","@@@","@@@", '@', "ingotChromium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockCopper, 1), "@@@","@@@","@@@", '@', "ingotCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockIndium, 1), "@@@","@@@","@@@", '@', "ingotIndium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockIridium, 1), "@@@","@@@","@@@", '@', "ingotIridium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockLead, 1), "@@@","@@@","@@@", '@', "ingotLead"));

			//Tools Parts
				//Axe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "@@ ","@  ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "@@ ","@  ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodAxeHead, 1), "@@ ","@  ","   ", '@', Blocks.planks);

				//Hoe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " @ ","@  ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " @ ","@  ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodHoeHead, 1), " @ ","@  ","   ", '@', Blocks.planks);
				
				//Pickaxe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), " @ ","@ @","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), " @ ","@ @","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodPickaxeHead, 1), " @ ","@ @","   ", '@', Blocks.planks);
				
				//Shovel Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " @ ","   ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " @ ","   ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodShovelHead, 1), " @ ","   ","   ", '@', Blocks.planks);
				
				//Sword Blades
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " @ "," @ "," @ ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.planks);
			
		// Smelting
			GameRegistry.addSmelting(ShinseiBlocks.blockLimestone, new ItemStack(ShinseiDusts.dustQuicklime, 3), 1f);
            GameRegistry.addSmelting(ShinseiItems.bucketSlakedLime, new ItemStack(ShinseiBlocks.blockLimestone), 1f);
//            GameRegistry.addSmelting(ShinseiBlocks.oreChromite, new ItemStack(ShinseiIngots.ingotChromium), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.oreCopper, new ItemStack(ShinseiIngots.ingotCopper), 1f);
//			GameRegistry.addSmelting(ShinseiBlocks.oreStibnite, new ItemStack(ShinseiIngots.ingotAntimony), 1f);
//            GameRegistry.addSmelting(ShinseiBlocks.oreBismuth, new ItemStack(ShinseiIngots.ingotBismuth), 1f);
//            GameRegistry.addSmelting(ShinseiBlocks.oreLead, new ItemStack(ShinseiIngots.ingotLead), 1f);
//            GameRegistry.addSmelting(ShinseiBlocks.oreBauxite, new ItemStack(ShinseiIngots.ingotAluminum), 1f);
//            GameRegistry.addSmelting(ShinseiBlocks.oreIridium, new ItemStack(ShinseiIngots.ingotIridium), 1f);

	}

}
