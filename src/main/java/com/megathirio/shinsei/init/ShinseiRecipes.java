package com.megathirio.shinsei.init;

import com.megathirio.shinsei.crafting.RecipeOverride;
import com.megathirio.shinsei.init.*;
import com.megathirio.shinsei.reference.ConfigValues;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ShinseiRecipes {
	
	public static void init(){


		//Override Recipes
        if (ConfigValues.booToolValue == false) {
            RecipeOverride.overrideCraftingRecipe();
        }
		//Shapeless
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay), ShinseiItems.silt, ShinseiItems.silt, ShinseiItems.silt, Blocks.dirt);
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumNugget, 9), "ingotAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 9), "blockAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.apatiteCrystal, 9), "blockApatite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.amethystGem, 9), "blockAmethyst"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aquamarineGem, 9), "blockAquamarine"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 9), "blockBarite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.scarletEmeraldGem, 9), ShinseiBlocks.scarletEmeraldBlock));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverNugget, 9), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverIngot, 9), "blockSilver"));

		//Shaped
            //Vanilla
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.emerald_block, 1), "@@@","@@@","@@@", '@', Items.emerald));

            //Blocks
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aluminumBlock, 1), "@@@","@@@","@@@", '@', "ingotAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.amethystBlock, 1), "@@@","@@@","@@@", '@', "gemAmethyst"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.apatiteBlock, 1), "@@@","@@@","@@@", '@', "gemApatite"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aquamarineBlock, 1), "@@@","@@@","@@@", '@', "gemAquamarine"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.scarletEmeraldBlock, 1), "@@@","@@@","@@@", '@', ShinseiItems.scarletEmeraldGem));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bariumBlock, 1), "@@@","@@@","@@@", '@', "ingotBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.silverBlock, 1), "@@@","@@@","@@@", '@', "ingotSilver"));

            //Ingots
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 1), "@@@","@@@","@@@", '@', "nuggetAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 1), "@@@","@@@","@@@", '@', "nuggetBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.silverIngot, 1), "@@@","@@@","@@@", '@', "nuggetSilver"));

            //Machines
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockCobble"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockStone"));

			//Tools Parts
				//Axe Heads

				//Hoe Heads

				//Pickaxe Heads

				//Shovel Heads

				//Sword Blades

		// Smelting
			GameRegistry.addSmelting(ShinseiBlocks.limestoneBlock, new ItemStack(ShinseiItems.quicklime, 3), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chalkBlock, new ItemStack(ShinseiItems.quicklime, 3), 1f);
            GameRegistry.addSmelting(ShinseiItems.chalkPowder, new ItemStack(ShinseiItems.quicklime, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.bariumPowder, new ItemStack(ShinseiItems.bariumIngot, 1), 1f);

            //Ores
            GameRegistry.addSmelting(ShinseiBlocks.acanthiteOre, new ItemStack(ShinseiItems.silverIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.silverPowder, new ItemStack(ShinseiItems.silverIngot, 1), 1f);

        //Temp Recipes
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.apatitePowder, 1), "gemApatite", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.amethystPowder, 1), "gemAmethyst", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aquamarinePowder, 1), "gemAquamarine", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.scarletEmeraldPowder, 1), ShinseiItems.scarletEmeraldGem, Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumPowder, 1), "oreBarite", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverPowder, 1), "oreSilver", Items.flint));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumPowder, 1), "oreAluminum", Items.redstone));

            GameRegistry.addSmelting(ShinseiItems.aluminumPowder, new ItemStack(ShinseiItems.aluminumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.amethystPowder, new ItemStack(ShinseiItems.amethystGem, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.apatitePowder, new ItemStack(ShinseiItems.apatiteCrystal, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.aquamarinePowder, new ItemStack(ShinseiItems.aquamarineGem, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.scarletEmeraldPowder, new ItemStack(ShinseiItems.scarletEmeraldGem, 1), 1f);

    }

}
