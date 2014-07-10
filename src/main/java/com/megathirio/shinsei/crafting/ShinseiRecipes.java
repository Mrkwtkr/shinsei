package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.ConfigValues;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiMachines;
import com.megathirio.shinsei.init.ShinseiTools;

import cpw.mods.fml.common.registry.GameRegistry;

public class ShinseiRecipes {
	
	public static void init(){


		//Override Recipes
        if (ConfigValues.booToolValue == false) {
            RecipeOverride.overrideCraftingRecipe();
        }
		//Shapeless
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.slakedLime), ShinseiItems.quicklime, ShinseiItems.quicklime, ShinseiItems.quicklime, Items.water_bucket);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay), ShinseiItems.silt, ShinseiItems.silt, ShinseiItems.silt, Blocks.dirt);
			GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.aluminumIngot, 9), ShinseiBlocks.blockAluminum);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.antimonyIngot, 9), ShinseiBlocks.blockAntimony);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.bismuthIngot, 9), ShinseiBlocks.blockBismuth);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.cadmiumIngot, 9), ShinseiBlocks.blockCadmium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.chromiumIngot, 9), ShinseiBlocks.blockChromium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.copperIngot, 9), ShinseiBlocks.blockCopper);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.indiumIngot, 9), ShinseiBlocks.blockIndium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.iridiumIngot, 9), ShinseiBlocks.blockIridium);
            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiItems.leadIngot, 9), ShinseiBlocks.blockLead);

		//Shaped
			//Machines
            GameRegistry.addRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', Blocks.cobblestone);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockStone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockTataraIdle, 1), "@@@","@ @","@#@", '@', "blockClay", '#', Blocks.furnace));
//			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockToolBench, 1), "@@@","# #","# #", '@', "plankWood", '#', "stickWood"));
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
			GameRegistry.addSmelting(ShinseiBlocks.limestoneBlock, new ItemStack(ShinseiItems.quicklime, 3), 1f);
            GameRegistry.addSmelting(ShinseiItems.slakedLime, new ItemStack(ShinseiBlocks.limestoneBlock), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.copperOre, new ItemStack(ShinseiItems.copperIngot), 1f);

	}

}
