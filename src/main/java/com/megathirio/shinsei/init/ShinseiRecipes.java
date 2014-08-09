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
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.clay), ShinseiItems.silt, ShinseiItems.silt, ShinseiItems.silt, Blocks.dirt));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumNugget, 9), "ingotAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 9), "blockAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.apatiteCrystal, 9), "blockApatite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.amethystGem, 9), "blockAmethyst"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aquamarineGem, 9), "blockAquamarine"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 9), "blockBarite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumNugget, 9), "ingotBarium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthIngot, 9), "blockBismuth"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthNugget, 9), "ingotBismuth"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumNugget, 9), "ingotChrome"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumIngot, 9), "blockChrome"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltNugget, 9), "ingotCobalt"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltIngot, 9), "blockCobalt"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperNugget, 9), "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperIngot, 9), "blockCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.onyxGem, 9), "blockOnyx"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.rubyGem, 9), "blockRuby"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.sapphireGem, 9), "blockSapphire"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.scarletEmeraldGem, 9), ShinseiBlocks.scarletEmeraldBlock));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverNugget, 9), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverIngot, 9), "blockSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinNugget, 9), "ingotTin"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinIngot, 9), "blockTin"));

		//Shaped
            //Vanilla
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.emerald_block, 1), "@@@","@@@","@@@", '@', Items.emerald));

            //Blocks
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aluminumBlock, 1), "@@@","@@@","@@@", '@', "ingotAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.amethystBlock, 1), "@@@","@@@","@@@", '@', "gemAmethyst"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.apatiteBlock, 1), "@@@","@@@","@@@", '@', "gemApatite"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aquamarineBlock, 1), "@@@","@@@","@@@", '@', "gemAquamarine"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bariumBlock, 1), "@@@","@@@","@@@", '@', "ingotBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bismuthBlock, 1), "@@@","@@@","@@@", '@', "ingotBismuth"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.chromiumBlock, 1), "@@@","@@@","@@@", '@', "ingotChrome"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.cobaltBlock, 1), "@@@","@@@","@@@", '@', "ingotCobalt"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.copperBlock, 1), "@@@","@@@","@@@", '@', "ingotCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.onyxBlock, 1), "@@@","@@@","@@@", '@', "gemOnyx"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.rubyBlock, 1), "@@@","@@@","@@@", '@', "gemRuby"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sapphireBlock, 1), "@@@","@@@","@@@", '@', "gemSapphire"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.scarletEmeraldBlock, 1), "@@@","@@@","@@@", '@', ShinseiItems.scarletEmeraldGem));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.silverBlock, 1), "@@@","@@@","@@@", '@', "ingotSilver"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.tinBlock, 1), "@@@","@@@","@@@", '@', "ingotTin"));

            //Ingots
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 1), "@@@","@@@","@@@", '@', "nuggetAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 1), "@@@","@@@","@@@", '@', "nuggetBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bismuthIngot, 1), "@@@","@@@","@@@", '@', "nuggetBismuth"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.chromiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetChrome"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.cobaltIngot, 1), "@@@","@@@","@@@", '@', "nuggetCobalt"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.copperIngot, 1), "@@@","@@@","@@@", '@', "nuggetCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.silverIngot, 1), "@@@","@@@","@@@", '@', "nuggetSilver"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.tinIngot, 1), "@@@","@@@","@@@", '@', "nuggetTin"));

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
            GameRegistry.addSmelting(ShinseiItems.bismuthPowder, new ItemStack(ShinseiItems.bismuthIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.chromiumPowder, new ItemStack(ShinseiItems.chromiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.cobaltPowder, new ItemStack(ShinseiItems.cobaltIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.copperPowder, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.dolomiteOre, new ItemStack(ShinseiItems.dolomitePowder, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.silverPowder, new ItemStack(ShinseiItems.silverIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.tinPowder, new ItemStack(ShinseiItems.tinIngot, 1), 1f);

            //Ores
            GameRegistry.addSmelting(ShinseiBlocks.acanthiteOre, new ItemStack(ShinseiItems.silverIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.borniteOre, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.borniteOre, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.cassiteriteOre, new ItemStack(ShinseiItems.tinIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chalcopyriteOre, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chromiteOre, new ItemStack(ShinseiItems.chromiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.cobaltiteOre, new ItemStack(ShinseiItems.cobaltIngot, 1), 1f);

        //Temp Recipes
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.apatitePowder, 1), "gemApatite", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.amethystPowder, 1), "gemAmethyst", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aquamarinePowder, 1), "gemAquamarine", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumPowder, 2), "oreBarite", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumPowder, 2), "oreChrome", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cinnabarPowder, 2), "oreCinnabar", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltPowder, 2), "oreCobalt", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperPowder, 2), "oreCopper", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cryolitePowder, 4), "oreCryolite", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironPowder, 2), "oreIron", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ferrosiliconPowder, 2), "oreIron", "blockSand", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.onyxPowder, 1), "gemOnyx", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.rubyPowder, 1), "gemRuby", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.sapphirePowder, 1), "gemSapphire", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.scarletEmeraldPowder, 1), ShinseiItems.scarletEmeraldGem, Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverPowder, 2), "oreSilver", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinPowder, 2), "oreTin", Items.flint));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumPowder, 2), "oreAluminum", ShinseiItems.cryolitePowder, Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthPowder, 2), "oreBismuth", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthPowder, 4), "oreBismuth", ShinseiItems.magnesiumPowder, ShinseiItems.calciumPowder));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumPowder, 2), "dustDolomite", "dustFerrosilicon"));

            GameRegistry.addSmelting(ShinseiItems.aluminumPowder, new ItemStack(ShinseiItems.aluminumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.copperPowder, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.cobaltPowder, new ItemStack(ShinseiItems.cobaltIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.ironPowder, new ItemStack(Items.iron_ingot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.amethystPowder, new ItemStack(ShinseiItems.amethystGem, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.apatitePowder, new ItemStack(ShinseiItems.apatiteCrystal, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.aquamarinePowder, new ItemStack(ShinseiItems.aquamarineGem, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.magnesiumPowder, new ItemStack(ShinseiItems.magnesiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.onyxPowder, new ItemStack(ShinseiItems.onyxGem, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.rubyPowder, new ItemStack(ShinseiItems.rubyGem, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.sapphirePowder, new ItemStack(ShinseiItems.sapphireGem, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.scarletEmeraldPowder, new ItemStack(ShinseiItems.scarletEmeraldGem, 1), 1f);

    }

}
