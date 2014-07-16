package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.init.*;
import com.megathirio.shinsei.reference.ConfigValues;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import cpw.mods.fml.common.registry.GameRegistry;

public class ShinseiRecipes {
	
	public static void init(){


		//Override Recipes
        if (ConfigValues.booToolValue == false) {
            RecipeOverride.overrideCraftingRecipe();
        }
		//Shapeless
//            GameRegistry.addShapelessRecipe(new ItemStack(ShinseiLiquids.slakedLimeBucket), ShinseiItems.quicklime, ShinseiItems.quicklime, ShinseiItems.quicklime, Items.water_bucket);
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
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneAxeHead, 1), "@@ ","@  ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.stoneAxeHead, 1), "@@ ","@  ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.woodAxeHead, 1), "@@ ","@  ","   ", '@', Blocks.planks);

				//Hoe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneHoeHead, 1), " @ ","@  ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.stoneHoeHead, 1), " @ ","@  ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.woodHoeHead, 1), " @ ","@  ","   ", '@', Blocks.planks);
				
				//Pickaxe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stonePickaxeHead, 1), " @ ","@ @","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.stonePickaxeHead, 1), " @ ","@ @","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.woodPickaxeHead, 1), " @ ","@ @","   ", '@', Blocks.planks);
				
				//Shovel Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneShovelHead, 1), " @ ","   ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.stoneShovelHead, 1), " @ ","   ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.woodShovelHead, 1), " @ ","   ","   ", '@', Blocks.planks);
				
				//Sword Blades
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneSwordBlade, 1), " @ "," @ "," @ ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.stoneSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.woodSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.planks);
			
		// Smelting
			GameRegistry.addSmelting(ShinseiBlocks.limestoneBlock, new ItemStack(ShinseiItems.quicklime, 3), 1f);

	}

}
