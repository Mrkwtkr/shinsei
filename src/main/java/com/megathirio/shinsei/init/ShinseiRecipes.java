package com.megathirio.shinsei.init;

import com.megathirio.shinsei.reference.ConfigValues;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.Random;

public class ShinseiRecipes {
	
	public static void init(){

		//Override Recipes
        if (ConfigValues.booToolValue == false) {
            RecipeOverride.overrideCraftingRecipe();
        }

        // Smelting
            //Ore -> Ingot
            GameRegistry.addSmelting(ShinseiBlocks.acanthiteOre, new ItemStack(ShinseiItems.silverIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.stibniteOre, new ItemStack(ShinseiItems.antimonyIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.borniteOre, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.cassiteriteOre, new ItemStack(ShinseiItems.tinIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chalcopyriteOre, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chromiteOre, new ItemStack(ShinseiItems.chromiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.cobaltiteOre, new ItemStack(ShinseiItems.cobaltIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.galenaOre, new ItemStack(ShinseiItems.leadIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.molybdeniteOre, new ItemStack(ShinseiItems.molybdenumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.pentlanditeOre, new ItemStack(ShinseiItems.nickelIngot, 1), 1f);

            //Powder -> Ingot
            GameRegistry.addSmelting(ShinseiItems.aluminumPowder, new ItemStack(ShinseiItems.aluminumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.antimonyPowder, new ItemStack(ShinseiItems.antimonyIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.bariumPowder, new ItemStack(ShinseiItems.bariumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.bismuthPowder, new ItemStack(ShinseiItems.bismuthIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.cadmiumPowder, new ItemStack(ShinseiItems.cadmiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.chromiumPowder, new ItemStack(ShinseiItems.chromiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.cobaltPowder, new ItemStack(ShinseiItems.cobaltIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.copperPowder, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.indiumPowder, new ItemStack(ShinseiItems.indiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.iridiumPowder, new ItemStack(ShinseiItems.iridiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.ironPowder, new ItemStack(Items.iron_ingot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.leadPowder, new ItemStack(ShinseiItems.leadIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.magnesiumPowder, new ItemStack(ShinseiItems.magnesiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.manganesePowder, new ItemStack(ShinseiItems.manganeseIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.molybdenumPowder, new ItemStack(ShinseiItems.molybdenumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.nickelPowder, new ItemStack(ShinseiItems.nickelIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.platinumPowder, new ItemStack(ShinseiItems.platinumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.silverPowder, new ItemStack(ShinseiItems.silverIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.stainlessSteelPowder, new ItemStack(ShinseiItems.stainlessSteelIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.steelPowder, new ItemStack(ShinseiItems.steelIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.tantalumPowder, new ItemStack(ShinseiItems.tantalumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.tinPowder, new ItemStack(ShinseiItems.tinIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.titaniumPowder, new ItemStack(ShinseiItems.titaniumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.tungstenPowder, new ItemStack(ShinseiItems.tungstenIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.vanadiumPowder, new ItemStack(ShinseiItems.vanadiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.zincPowder, new ItemStack(ShinseiItems.zincIngot, 1), 1f);

            //Ore -> Powder
            GameRegistry.addSmelting(ShinseiBlocks.dolomiteOre, new ItemStack(ShinseiItems.dolomitePowder, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.realgarOre, new ItemStack(ShinseiItems.arsenicPowder, 4), 1f);

            //Misc
            GameRegistry.addSmelting(ShinseiBlocks.limestoneBlock, new ItemStack(ShinseiItems.quicklime, 3), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chalkBlock, new ItemStack(ShinseiItems.quicklime, 3), 1f);
            GameRegistry.addSmelting(ShinseiItems.chalkPowder, new ItemStack(ShinseiItems.quicklime, 1), 1f);

        //Shapeless
            //Special Powders
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.causticPotash), "bucketSlakedLime", "dustPotash"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.yellowcakePowder), "dustCausticPotash", "dustUranium"));

            //Ingot -> Nugget
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumNugget, 9), "ingotAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.antimonyNugget, 9), "ingotAntimony"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumNugget, 9), "ingotBarium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthNugget, 9), "ingotBismuth"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumNugget, 9), "ingotChrome"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltNugget, 9), "ingotCobalt"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperNugget, 9), "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironNugget, 9), "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.leadNugget, 9), "ingotLead"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumNugget, 9), "ingotMagnesium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.manganeseNugget, 9), "ingotManganese"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.molybdenumNugget, 9), "ingotMolybdenum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.nickelNugget, 9), "ingotNickel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.platinumNugget, 9), "ingotPlatinum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverNugget, 9), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.stainlessSteelNugget, 9), "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.steelNugget, 9), "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tantalumNugget, 9), "ingotTantalum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinNugget, 9), "ingotTin"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.titaniumNugget, 9), "ingotTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tungstenNugget, 9), "ingotTungsten"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.vanadiumNugget, 9), "ingotVanadium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.zincNugget, 9), "ingotZinc"));

            //Block -> Ingot
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 9), "blockAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.antimonyIngot, 9), "blockAntimony"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 9), "blockBarite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthIngot, 9), "blockBismuth"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cadmiumIngot, 9), "blockCadmium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumIngot, 9), "blockChrome"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltIngot, 9), "blockCobalt"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperIngot, 9), "blockCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.indiumIngot, 9), "blockIndium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.iridiumIngot, 9), "blockIridium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_ingot, 9), "blockIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumIngot, 9), "blockMagnesium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.manganeseIngot, 9), "blockManganese"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.molybdenumIngot, 9), "blockMolybdenum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.nickelIngot, 9), "blockNickel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.leadIngot, 9), "blockLead"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.platinumIngot, 9), "blockPlatinum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverIngot, 9), "blockSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.stainlessSteelIngot, 9), "blockStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.steelIngot, 9), "blockSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tantalumIngot, 9), "blockTantalum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinIngot, 9), "blockTin"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.titaniumIngot, 9), "blockTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tungstenIngot, 9), "blockTungsten"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.vanadiumIngot, 9), "blockVanadium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.zincIngot, 9), "blockZinc"));

            //Block -> Gem/Crystal
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.apatiteCrystal, 9), "blockApatite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.amethystGem, 9), "blockAmethyst"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aquamarineGem, 9), "blockAquamarine"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.fluoriteCrystal, 9), "blockFluorite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.jadeGem, 9), "blockJade"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.onyxGem, 9), "blockOnyx"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.opalGem, 9), "blockOpal"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.peridotGem, 9), "blockPeridot"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.rubyGem, 9), "blockRuby"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.sapphireGem, 9), "blockSapphire"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.scarletEmeraldGem, 9), ShinseiBlocks.scarletEmeraldBlock));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.topazGem, 9), "blockTopaz"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.turquoiseGem, 9), "blockTurquoise"));

            //Machines
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockStone"));

            //Misc
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.clay), ShinseiItems.silt, ShinseiItems.silt, ShinseiItems.silt, Blocks.dirt));

		//Shaped
            //Vanilla
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.emerald_block, 1), "@@@","@@@","@@@", '@', Items.emerald));

            //Handles
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodToolHandle, 1), "@","@", '@', "stickWood"));

            //Ingot -> Block
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aluminumBlock, 1), "@@@","@@@","@@@", '@', "ingotAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.antimonyBlock, 1), "@@@","@@@","@@@", '@', "ingotAntimony"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bariumBlock, 1), "@@@","@@@","@@@", '@', "ingotBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bismuthBlock, 1), "@@@","@@@","@@@", '@', "ingotBismuth"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.chromiumBlock, 1), "@@@","@@@","@@@", '@', "ingotChrome"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.cobaltBlock, 1), "@@@","@@@","@@@", '@', "ingotCobalt"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.copperBlock, 1), "@@@","@@@","@@@", '@', "ingotCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.iron_block, 1), "@@@","@@@","@@@", '@', "ingotIron"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.leadBlock, 1), "@@@","@@@","@@@", '@', "ingotLead"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.magnesiumBlock, 1), "@@@","@@@","@@@", '@', "ingotMagnesium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.manganeseBlock, 1), "@@@","@@@","@@@", '@', "ingotManganese"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.molybdenumBlock, 1), "@@@","@@@","@@@", '@', "ingotMolybdenum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.nickelBlock, 1), "@@@","@@@","@@@", '@', "ingotNickel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.platinumBlock, 1), "@@@","@@@","@@@", '@', "ingotPlatinum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.silverBlock, 1), "@@@","@@@","@@@", '@', "ingotSilver"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.stainlessSteelBlock, 1), "@@@","@@@","@@@", '@', "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.steelBlock, 1), "@@@","@@@","@@@", '@', "ingotSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.tantalumBlock, 1), "@@@","@@@","@@@", '@', "ingotTantalum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.tinBlock, 1), "@@@","@@@","@@@", '@', "ingotTin"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.titaniumBlock, 1), "@@@","@@@","@@@", '@', "ingotTitanium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.tungstenBlock, 1), "@@@","@@@","@@@", '@', "ingotTungsten"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.vanadiumBlock, 1), "@@@","@@@","@@@", '@', "ingotVanadium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.zincBlock, 1), "@@@","@@@","@@@", '@', "ingotZinc"));

            //Gem/Crystal -> Block
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.amethystBlock, 1), "@@@","@@@","@@@", '@', "gemAmethyst"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.apatiteBlock, 1), "@@@","@@@","@@@", '@', "gemApatite"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aquamarineBlock, 1), "@@@","@@@","@@@", '@', "gemAquamarine"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.fluoriteBlock, 1), "@@@","@@@","@@@", '@', "gemFluorite"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.jadeBlock, 1), "@@@","@@@","@@@", '@', "gemJade"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.onyxBlock, 1), "@@@","@@@","@@@", '@', "gemOnyx"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.opalBlock, 1), "@@@","@@@","@@@", '@', "gemOpal"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.peridotBlock, 1), "@@@","@@@","@@@", '@', "gemPeridot"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.rubyBlock, 1), "@@@","@@@","@@@", '@', "gemRuby"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sapphireBlock, 1), "@@@","@@@","@@@", '@', "gemSapphire"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.scarletEmeraldBlock, 1), "@@@","@@@","@@@", '@', ShinseiItems.scarletEmeraldGem));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.topazBlock, 1), "@@@","@@@","@@@", '@', "gemTopaz"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.turquoiseBlock, 1), "@@@","@@@","@@@", '@', "gemTurquoise"));

            //Nugget -> Ingot
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 1), "@@@","@@@","@@@", '@', "nuggetAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.antimonyIngot, 1), "@@@","@@@","@@@", '@', "nuggetAntimony"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 1), "@@@","@@@","@@@", '@', "nuggetBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bismuthIngot, 1), "@@@","@@@","@@@", '@', "nuggetBismuth"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.chromiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetChrome"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.cobaltIngot, 1), "@@@","@@@","@@@", '@', "nuggetCobalt"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.copperIngot, 1), "@@@","@@@","@@@", '@', "nuggetCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot, 1), "@@@","@@@","@@@", '@', "nuggetIron"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.leadIngot, 1), "@@@","@@@","@@@", '@', "nuggetLead"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.magnesiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetMagnesium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.manganeseIngot, 1), "@@@","@@@","@@@", '@', "nuggetManganese"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.molybdenumIngot, 1), "@@@","@@@","@@@", '@', "nuggetMolybdenum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.nickelIngot, 1), "@@@","@@@","@@@", '@', "nuggetNickel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.platinumIngot, 1), "@@@","@@@","@@@", '@', "nuggetPlatinum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.silverIngot, 1), "@@@","@@@","@@@", '@', "nuggetSilver"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stainlessSteelIngot, 1), "@@@","@@@","@@@", '@', "nuggetStainlessSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.steelIngot, 1), "@@@","@@@","@@@", '@', "nuggetSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.tantalumIngot, 1), "@@@","@@@","@@@", '@', "nuggetTantalum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.tinIngot, 1), "@@@","@@@","@@@", '@', "nuggetTin"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.titaniumIngot, 1), "@@@","@@@","@@@", '@', "nuggetTitanium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.tungstenIngot, 1), "@@@","@@@","@@@", '@', "nuggetTungsten"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.vanadiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetVanadium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.zincIngot, 1), "@@@","@@@","@@@", '@', "nuggetZinc"));

        //Tools Parts
				//Axe Heads

				//Hoe Heads

				//Pickaxe Heads

				//Shovel Heads

				//Sword Blades

    //Temporary Recipes

        //Fuels
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(ShinseiTools.copperAxe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(ShinseiTools.stainlessSteelAxe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(ShinseiTools.steelAxe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.wooden_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.stone_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.iron_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.golden_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.diamond_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        GameRegistry.addSmelting(Items.coal, new ItemStack(ShinseiItems.coke, 1), 1f);

        //Calcium
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.copperPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.stainlessSteelPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.steelPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.wooden_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.stone_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.iron_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.golden_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.diamond_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.dolomiteOre);

        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.copperPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.stainlessSteelPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.steelPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.wooden_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.stone_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.iron_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.golden_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.diamond_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.gypsumBlock);

        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.copperPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.stainlessSteelPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(ShinseiTools.steelPickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.wooden_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.stone_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.iron_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.golden_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);
        GameRegistry.addRecipe(new ItemStack(ShinseiItems.calciumPowder, 2), "@", "#", '@', new ItemStack(Items.diamond_pickaxe, 1, OreDictionary.WILDCARD_VALUE), '#', ShinseiBlocks.limestoneBlock);

        //Powder -> Gem/Crystal
        GameRegistry.addSmelting(ShinseiItems.amethystPowder, new ItemStack(ShinseiItems.amethystGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.apatitePowder, new ItemStack(ShinseiItems.apatiteCrystal, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.aquamarinePowder, new ItemStack(ShinseiItems.aquamarineGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.fluoritePowder, new ItemStack(ShinseiItems.fluoriteCrystal, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.jadePowder, new ItemStack(ShinseiItems.jadeGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.onyxPowder, new ItemStack(ShinseiItems.onyxGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.opalPowder, new ItemStack(ShinseiItems.opalGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.peridotPowder, new ItemStack(ShinseiItems.peridotGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.platinumPowder, new ItemStack(ShinseiItems.platinumIngot, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.rubyPowder, new ItemStack(ShinseiItems.rubyGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.sapphirePowder, new ItemStack(ShinseiItems.sapphireGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.scarletEmeraldPowder, new ItemStack(ShinseiItems.scarletEmeraldGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.topazPowder, new ItemStack(ShinseiItems.topazGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.turquoisePowder, new ItemStack(ShinseiItems.turquoiseGem, 1), 1f);

        //Gem/Crystal -> Powder (Temporary)
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.apatitePowder, 1), "gemApatite", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.amethystPowder, 1), "gemAmethyst", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aquamarinePowder, 1), "gemAquamarine", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.fluoritePowder, 1), "gemFluorite", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.jadePowder, 1), "gemJade", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.fluoritePowder, 1), "gemFluorite", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.onyxPowder, 1), "gemOnyx", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.opalPowder, 1), "gemOpal", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.peridotPowder, 1), "gemPeridot", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.rubyPowder, 1), "gemRuby", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.sapphirePowder, 1), "gemSapphire", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.scarletEmeraldPowder, 1), ShinseiItems.scarletEmeraldGem, Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.topazPowder, 1), "gemTopaz", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.turquoisePowder, 1), "gemTurquoise", Items.flint));

        //Ingot -> Powder (Temporary)
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumPowder, 1), "ingotAluminum", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.antimonyPowder, 1), "ingotAntimony", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumPowder, 1), "ingotBarium", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthPowder, 1), "ingotBismuth", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumPowder, 1), "ingotChromium", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltPowder, 1), "ingotCobalt", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperPowder, 1), "ingotCopper", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.leadPowder, 1), "ingotLead", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironPowder, 1), "ingotIron", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.nickelPowder, 1), "ingotNickel", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumPowder, 1), "ingotMagnesium", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.manganesePowder, 1), "ingotManganese", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.molybdenumPowder, 1), "ingotMolybdenite", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.platinumPowder, 1), "ingotPlatinum", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverPowder, 1), "ingotSilver", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.stainlessSteelPowder, 1), "ingotStainlessSteel", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.steelPowder, 1), "ingotSteel", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tantalumPowder, 1), "ingotTantalum", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinPowder, 1), "ingotTin", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.titaniumPowder, 1), "ingotTitanium", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tungstenPowder, 1), "ingotTungsten", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.vanadiumPowder, 1), "ingotVanadium", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.zincPowder, 1), "ingotZinc", Items.flint));

        //Steel (Temporary)
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.pigIronIngot, 8), "@@@","@#@","@@@", '@', "oreIron", '#', "dustCoke"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.steelIngot, 8), "@@@","@#@","@@@", '@', "ingotPigIron", '#', "dustLime"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.stainlessSteelIngot, 1), "oreIron", "ingotChrome", "ingotNickel", Items.redstone));

        //Ore -> Powder (Temporary)
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.antimonyPowder, 2), "oreAntimony", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumPowder, 2), "oreBarite", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumPowder, 2), "oreChrome", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cinnabarPowder, 2), "oreCinnabar", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltPowder, 2), "oreCobalt", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperPowder, 2), "oreCopper", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cryolitePowder, 4), "oreCryolite", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.gypsumPowder, 4), "BlockGypsum", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.leadPowder, 2), "oreLead", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironPowder, 2), "oreIron", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ferrosiliconPowder, 2), "oreIron", "blockSand", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.nickelPowder, 2), "oreNickel", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.molybdenumPowder, 2), "oreMolybdenite", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.platinumPowder, 2), "orePlatinum", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.potashPowder, 2), "orePotash", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverPowder, 2), "oreSilver", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.sulphur, 2), "oreSulphur", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tantalumPowder, 2), "oreTantalite",  "dustSulphur", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinPowder, 2), "oreTin", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.titaniumPowder, 2), "oreTitanium",  "dustMagnesium", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tungstenPowder, 2), "oreTungsten", Items.flint));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.uraniumPowder, 2), "oreUranium", Items.flint));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumPowder, 2), "oreAluminum", "dustCryolite", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthPowder, 2), "oreBismuth", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthPowder, 4), "oreBismuth", "dustMagnesium", "dustCalcium"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumPowder, 2), "dustDolomite", "dustFerrosilicon"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.manganesePowder, 2), "oreManganese", "dustSulphur", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.zincPowder, 2), "oreZinc", Items.redstone));

        //Colored Stones
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 1), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 0)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 2), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 4)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 3), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 3)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 4), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 6)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 5), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 8)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 6), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 2)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 7), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 12)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 8), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 10)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 9), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 13)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 10), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 14)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 11), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 9)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 12), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 5)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 13), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 14), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 7)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 15), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0) ,new ItemStack(Items.dye, 1, 11)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 1), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 0)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 2), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 4)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 3), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 3)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 4), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 6)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 5), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 8)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 6), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 2)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 7), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 12)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 8), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 10)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 9), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 13)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 10), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 14)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 11), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 9)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 12), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 5)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 13), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 14), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 7)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 15), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0) ,new ItemStack(Items.dye, 1, 11)));

        //Dual Yield
//        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiRecipes.recipeRandomResult()), ShinseiBlocks.limestoneBlock, Items.flint));

        //Tool Recipes
            //Casts
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironPlate, 2), "blockIron", Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperPlate, 2), "blockCopper",  Items.flint));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperHeatPlate, 1), ShinseiItems.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironHeatPlate, 1), ShinseiItems.ironPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.axeCast, 1), ShinseiTools.stoneAxeHead, ShinseiItems.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.hoeCast, 1), ShinseiTools.stoneHoeHead, ShinseiItems.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.pickaxeCast, 1), ShinseiTools.stonePickaxeHead, ShinseiItems.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.shovelCast, 1), ShinseiTools.stoneShovelHead, ShinseiItems.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.swordCast, 1), ShinseiTools.stoneSwordBlade, ShinseiItems.copperPlate));

        //Tool Parts
            //Copper
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperAxeHead, 1), ShinseiTools.axeCast, "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperHoeHead, 1), ShinseiTools.hoeCast, "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperPickaxeHead, 1), ShinseiTools.pickaxeCast, "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperShovelHead, 1), ShinseiTools.shovelCast, "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperSwordBlade, 1), ShinseiTools.swordCast, "ingotCopper"));

            //Gold
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldAxeHead, 1), ShinseiTools.axeCast, "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldHoeHead, 1), ShinseiTools.hoeCast, "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldPickaxeHead, 1), ShinseiTools.pickaxeCast, "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldShovelHead, 1), ShinseiTools.shovelCast, "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldSwordBlade, 1), ShinseiTools.swordCast, "ingotGold"));

            //Diamond
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondAxeHead, 1), ShinseiTools.axeCast, Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondHoeHead, 1), ShinseiTools.hoeCast, Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondPickaxeHead, 1), ShinseiTools.pickaxeCast, Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondShovelHead, 1), ShinseiTools.shovelCast, Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondSwordBlade, 1), ShinseiTools.swordCast, Items.diamond));

            //Iron
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironAxeHead, 1), ShinseiTools.axeCast, "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironHoeHead, 1), ShinseiTools.hoeCast, "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironPickaxeHead, 1), ShinseiTools.pickaxeCast, "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironShovelHead, 1), ShinseiTools.shovelCast, "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironSwordBlade, 1), ShinseiTools.swordCast, "ingotIron"));

            //Stainless Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelAxeHead, 1), ShinseiTools.axeCast, "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelHoeHead, 1), ShinseiTools.hoeCast, "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelPickaxeHead, 1), ShinseiTools.pickaxeCast, "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelShovelHead, 1), ShinseiTools.shovelCast, "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelSwordBlade, 1), ShinseiTools.swordCast, "ingotStainlessSteel"));

            //Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelAxeHead, 1), ShinseiTools.axeCast, "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelHoeHead, 1), ShinseiTools.hoeCast, "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelPickaxeHead, 1), ShinseiTools.pickaxeCast, "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelShovelHead, 1), ShinseiTools.shovelCast, "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelSwordBlade, 1), ShinseiTools.swordCast, "ingotSteel"));

            //Stone
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneAxeHead, 1), "@@ ","@  ","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneAxeHead, 1), "@@ ","@  ","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneHoeHead, 1), " @ ","@  ","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneHoeHead, 1), " @ ","@  ","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stonePickaxeHead, 1), " @ ","@ @","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stonePickaxeHead, 1), " @ ","@ @","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneShovelHead, 1), " @ ","   ","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneShovelHead, 1), " @ ","   ","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneSwordBlade, 1), " @ "," @ "," @ ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneSwordBlade, 1), " @ "," @ "," @ ", '@', "blockStone"));

            //Wood
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodAxeHead, 1), "@@ ","@  ","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodHoeHead, 1), " @ ","@  ","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodPickaxeHead, 1), " @ ","@ @","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodShovelHead, 1), " @ ","   ","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodSwordBlade, 1), " @ "," @ "," @ ", '@', "plankWood"));

        //Tools
           //Copper
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperAxe, 1), ShinseiTools.copperAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperHoe, 1), ShinseiTools.copperHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperPickaxe, 1), ShinseiTools.copperPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperShovel, 1), ShinseiTools.copperShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperSword, 1), ShinseiTools.copperSwordBlade, ShinseiTools.woodToolHandle));

            //Diamond
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_axe, 1), ShinseiTools.diamondAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_hoe, 1), ShinseiTools.diamondHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_pickaxe, 1), ShinseiTools.diamondPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_shovel, 1), ShinseiTools.diamondShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_sword, 1), ShinseiTools.diamondSwordBlade, ShinseiTools.woodToolHandle));

            //Gold
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_axe, 1), ShinseiTools.goldAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_hoe, 1), ShinseiTools.goldHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_pickaxe, 1), ShinseiTools.goldPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_shovel, 1), ShinseiTools.goldShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_sword, 1), ShinseiTools.goldSwordBlade, ShinseiTools.woodToolHandle));

            //Iron
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_axe, 1), ShinseiTools.ironAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_hoe, 1), ShinseiTools.ironHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_pickaxe, 1), ShinseiTools.ironPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_shovel, 1), ShinseiTools.ironShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_sword, 1), ShinseiTools.ironSwordBlade, ShinseiTools.woodToolHandle));

            //Stainless Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelAxe, 1), ShinseiTools.stainlessSteelAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelHoe, 1), ShinseiTools.stainlessSteelHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelPickaxe, 1), ShinseiTools.stainlessSteelPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelShovel, 1), ShinseiTools.stainlessSteelShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelSword, 1), ShinseiTools.stainlessSteelSwordBlade, ShinseiTools.woodToolHandle));

            //Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelAxe, 1), ShinseiTools.steelAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelHoe, 1), ShinseiTools.steelHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelPickaxe, 1), ShinseiTools.steelPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelShovel, 1), ShinseiTools.steelShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelSword, 1), ShinseiTools.steelSwordBlade, ShinseiTools.woodToolHandle));

            //Stone
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_axe, 1), ShinseiTools.stoneAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_hoe, 1), ShinseiTools.stoneHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_pickaxe, 1), ShinseiTools.stonePickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_shovel, 1), ShinseiTools.stoneShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_sword, 1), ShinseiTools.stoneSwordBlade, ShinseiTools.woodToolHandle));

            //Wood
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_axe, 1), ShinseiTools.woodAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_hoe, 1), ShinseiTools.woodHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_pickaxe, 1), ShinseiTools.woodPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_shovel, 1), ShinseiTools.woodShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_sword, 1), ShinseiTools.woodSwordBlade, ShinseiTools.woodToolHandle));
    }
}