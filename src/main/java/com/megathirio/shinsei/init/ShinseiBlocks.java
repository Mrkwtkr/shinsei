package com.megathirio.shinsei.init;

import com.megathirio.shinsei.block.*;
import com.megathirio.shinsei.block.mineral.*;
import com.megathirio.shinsei.block.mineral.BlockMarble;
import com.megathirio.shinsei.block.ore.*;

import com.megathirio.shinsei.item.ItemBrickBlock;
import com.megathirio.shinsei.item.ItemGraniteBlock;
import com.megathirio.shinsei.item.ItemMarbleBlock;
import com.megathirio.shinsei.item.ItemSidingBlock;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.BlockFluidClassic;

import java.util.Random;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiBlocks {

//Block Variables
	//Ores
    public static OreShinsei acanthiteOre = new BlockAcanthiteOre();
    public static OreShinsei amethystOre = new BlockAmethystOre();
    public static OreShinsei apatiteOre = new BlockApatiteOre();
	public static OreShinsei bariteOre = new BlockBariteOre();
    public static OreShinsei bauxiteOre = new BlockBauxiteOre();
    public static OreShinsei berylOre = new BlockBerylOre();
    public static OreShinsei bismuthOre = new BlockBismuthOre();
    public static OreShinsei borniteOre = new BlockBorniteOre();
    public static OreShinsei cassiteriteOre = new BlockCassiteriteOre();
    public static OreShinsei chalcedonyOre = new BlockChalcedonyOre();
    public static OreShinsei chalcopyriteOre = new BlockChalcopyriteOre();
    public static OreShinsei chromiteOre = new BlockChromiteOre();
    public static OreShinsei cinnabarOre = new BlockCinnabarOre();
    public static OreShinsei cobaltiteOre = new BlockCobaltiteOre();
    public static OreShinsei corundumOre = new BlockCorundumOre();
    public static OreShinsei cryoliteOre = new BlockCryoliteOre();
    public static OreShinsei dolomiteOre = new BlockDolomiteOre();
    public static OreShinsei fluoriteOre = new BlockFluoriteOre();
    public static OreShinsei galenaOre = new BlockGalenaOre();
    public static OreShinsei graphiteOre = new BlockGraphiteOre();
    public static OreShinsei hematiteOre = new BlockHematiteOre();
    public static OreShinsei ilmeniteOre = new BlockIlmeniteOre();
    public static OreShinsei jadeiteOre = new BlockJadeiteOre();
    public static OreShinsei meteoriteOre = new BlockMeteoriteOre();
    public static OreShinsei molybdeniteOre = new BlockMolybdeniteOre();
    public static OreShinsei olivineOre = new BlockOlivineOre();
    public static OreShinsei opalOre = new BlockOpalOre();
    public static OreShinsei pentlanditeOre = new BlockPentlanditeOre();
    public static OreShinsei pyrolusiteOre = new BlockPyrolusiteOre();
    public static OreShinsei realgarOre = new BlockRealgarOre();
    public static OreShinsei rutileOre = new BlockRutileOre();
    public static OreShinsei scheeliteOre = new BlockScheeliteOre();
    public static OreShinsei sperryliteOre = new BlockSperryliteOre();
    public static OreShinsei sphaleriteOre = new BlockSphaleriteOre();
    public static OreShinsei stibniteOre = new BlockStibniteOre();
    public static OreShinsei sulphurOre = new BlockSulphurOre();
    public static OreShinsei sylviteOre = new BlockSylviteOre();
    public static OreShinsei tantaliteOre = new BlockTantaliteOre();
    public static OreShinsei topazOre = new BlockTopazOre();
    public static OreShinsei turquoiseOre = new BlockTurquoiseOre();
    public static OreShinsei uraniniteOre = new BlockUraniniteOre();

    //Metals
    public static BlockShinsei aluminumBlock = new BlockAluminumBlock();
    public static BlockShinsei antimonyBlock = new BlockAntimonyBlock();
    public static BlockShinsei bariumBlock = new BlockBariumBlock();
    public static BlockShinsei bismuthBlock = new BlockBismuthBlock();
    public static BlockShinsei brassBlock = new BlockBrassBlock();
    public static BlockShinsei bronzeBlock = new BlockBronzeBlock();
    public static BlockShinsei chromiumBlock = new BlockChromiumBlock();
    public static BlockShinsei cobaltBlock = new BlockCobaltBlock();
    public static BlockShinsei copperBlock = new BlockCopperBlock();
    public static BlockShinsei leadBlock = new BlockLeadBlock();
    public static BlockShinsei magnesiumBlock = new BlockMagnesiumBlock();
    public static BlockShinsei manganeseBlock = new BlockManganeseBlock();
    public static BlockShinsei molybdenumBlock = new BlockMolybdenumBlock();
    public static BlockShinsei nickelBlock = new BlockNickelBlock();
    public static BlockShinsei platinumBlock = new BlockPlatinumBlock();
    public static BlockShinsei silverBlock = new BlockSilverBlock();
    public static BlockShinsei stainlessSteelBlock = new BlockStainlessSteelBlock();
    public static BlockShinsei steelBlock = new BlockSteelBlock();
    public static BlockShinsei tantalumBlock = new BlockTantalumBlock();
    public static BlockShinsei tinBlock = new BlockTinBlock();
    public static BlockShinsei titaniumBlock = new BlockTitaniumBlock();
    public static BlockShinsei tungstenBlock = new BlockTungstenBlock();
    public static BlockShinsei vanadiumBlock = new BlockVanadiumBlock();
    public static BlockShinsei zincBlock = new BlockZincBlock();

    //Gems/Crystals
    public static BlockShinsei amethystBlock = new BlockAmethystBlock();
    public static BlockShinsei apatiteBlock = new BlockApatiteBlock();
    public static BlockShinsei aquamarineBlock = new BlockAquamarineBlock();
    public static BlockShinsei fluoriteBlock = new BlockFluoriteBlock();
    public static BlockShinsei jadeBlock = new BlockJadeBlock();
    public static BlockShinsei opalBlock = new BlockOpalBlock();
    public static BlockShinsei onyxBlock = new BlockOnyxBlock();
    public static BlockShinsei peridotBlock = new BlockPeridotBlock();
    public static BlockShinsei rubyBlock = new BlockRubyBlock();
    public static BlockShinsei sapphireBlock = new BlockSapphireBlock();
    public static BlockShinsei topazBlock = new BlockTopazBlock();
    public static BlockShinsei turquoiseBlock = new BlockTurquoiseBlock();
    public static BlockShinsei scarletEmeraldBlock = new BlockScarletEmeraldBlock();

    //Minerals
    public static BlockShinsei chalkBlock = new BlockChalk();
    public static BlockShinsei basaltBlock = new BlockBasalt();
    public static BlockShinsei basaltCobble = new BlockBasaltCobble();
    public static BlockShinsei boraxBlock = new BlockBorax();
    public static BlockShinsei limestoneBlock = new BlockLimestone();
    public static BlockShinsei marbleBlock = new BlockMarble();
	public static BlockShinsei siltstoneBlock = new BlockSiltstone();
    public static BlockShinsei graniteBlock = new BlockGranite();
    public static BlockShinsei gypsumBlock = new BlockGypsum();
    public static BlockShinsei haliteBlock = new BlockHalite();

    public static BlockShinsei brickBlock = new BlockBrick();
    public static BlockShinsei sidingBlock = new BlockSiding();
    public static BlockShinsei stuccoBlock = new BlockStuccoBlock();

    public static BlockFluidClassic slakedLimeBlock;

 	public static void init(){
	
	//Block Initialization
        //Ores
        GameRegistry.registerBlock(acanthiteOre, Names.Ores.ACANTHITE_ORE);
        GameRegistry.registerBlock(amethystOre, Names.Ores.AMETHYST_ORE);
        GameRegistry.registerBlock(apatiteOre, Names.Ores.APATITE_ORE);
        GameRegistry.registerBlock(bariteOre, Names.Ores.BARITE_ORE);
        GameRegistry.registerBlock(bauxiteOre, Names.Ores.BAUXITE_ORE);
        GameRegistry.registerBlock(berylOre, Names.Ores.BERYL_ORE);
        GameRegistry.registerBlock(bismuthOre, Names.Ores.BISMUTH_ORE);
        GameRegistry.registerBlock(borniteOre, Names.Ores.BORNITE_ORE);
        GameRegistry.registerBlock(cassiteriteOre, Names.Ores.CASSITERITE_ORE);
        GameRegistry.registerBlock(chalcedonyOre, Names.Ores.CHALCEDONY_ORE);
        GameRegistry.registerBlock(chalcopyriteOre, Names.Ores.CHALCOPYRITE_ORE);
        GameRegistry.registerBlock(chromiteOre, Names.Ores.CHROMITE_ORE);
        GameRegistry.registerBlock(cinnabarOre, Names.Ores.CINNABAR_ORE);
        GameRegistry.registerBlock(cobaltiteOre, Names.Ores.COBALTITE_ORE);
        GameRegistry.registerBlock(cryoliteOre, Names.Ores.CRYOLITE_ORE);
        GameRegistry.registerBlock(corundumOre, Names.Ores.CORUNDUM_ORE);
        GameRegistry.registerBlock(dolomiteOre, Names.Ores.DOLOMITE_ORE);
        GameRegistry.registerBlock(fluoriteOre, Names.Ores.FLUORITE_ORE);
        GameRegistry.registerBlock(galenaOre, Names.Ores.GALENA_ORE);
        GameRegistry.registerBlock(graphiteOre, Names.Ores.GRAPHITE_ORE);
        GameRegistry.registerBlock(hematiteOre, Names.Ores.HEMATITE_ORE);
        GameRegistry.registerBlock(ilmeniteOre, Names.Ores.ILMENITE_ORE);
        GameRegistry.registerBlock(jadeiteOre, Names.Ores.JADEITE_ORE);
        GameRegistry.registerBlock(meteoriteOre, Names.Ores.METEORITE_ORE);
        GameRegistry.registerBlock(molybdeniteOre, Names.Ores.MOLYBDENITE_ORE);
        GameRegistry.registerBlock(olivineOre, Names.Ores.OLIVINE_ORE);
        GameRegistry.registerBlock(opalOre, Names.Ores.OPAL_ORE);
        GameRegistry.registerBlock(pentlanditeOre, Names.Ores.PENTLANDITE_ORE);
        GameRegistry.registerBlock(pyrolusiteOre, Names.Ores.PYROLUSITE_ORE);
        GameRegistry.registerBlock(realgarOre, Names.Ores.REALGAR_ORE);
        GameRegistry.registerBlock(rutileOre, Names.Ores.RUTILE_ORE);
        GameRegistry.registerBlock(scheeliteOre, Names.Ores.SCHEELITE_ORE);
        GameRegistry.registerBlock(sperryliteOre, Names.Ores.SPERRYLITE_ORE);
        GameRegistry.registerBlock(sphaleriteOre, Names.Ores.SPHALERITE_ORE);
        GameRegistry.registerBlock(stibniteOre, Names.Ores.STIBNITE_ORE);
        GameRegistry.registerBlock(sulphurOre, Names.Ores.SULFUR_ORE);
        GameRegistry.registerBlock(sylviteOre, Names.Ores.SYLVITE_ORE);
        GameRegistry.registerBlock(tantaliteOre, Names.Ores.TANTALITE_ORE);
        GameRegistry.registerBlock(topazOre, Names.Ores.TOPAZ_ORE);
        GameRegistry.registerBlock(turquoiseOre, Names.Ores.TURQUOISE_ORE);
        GameRegistry.registerBlock(uraniniteOre, Names.Ores.URANINITE_ORE);

        //Metals
        GameRegistry.registerBlock(aluminumBlock, Names.Blocks.ALUMINUM_BLOCK);
        GameRegistry.registerBlock(antimonyBlock, Names.Blocks.ANTIMONY_BLOCK);
        GameRegistry.registerBlock(bariumBlock, Names.Blocks.BARIUM_BLOCK);
        GameRegistry.registerBlock(bismuthBlock, Names.Blocks.BISMUTH_BLOCK);
        GameRegistry.registerBlock(brassBlock, Names.Blocks.BRASS_BLOCK);
        GameRegistry.registerBlock(bronzeBlock, Names.Blocks.BRONZE_BLOCK);
        GameRegistry.registerBlock(chromiumBlock, Names.Blocks.CHROMIUM_BLOCK);
        GameRegistry.registerBlock(cobaltBlock, Names.Blocks.COBALT_BLOCK);
        GameRegistry.registerBlock(copperBlock, Names.Blocks.COPPER_BLOCK);
        GameRegistry.registerBlock(leadBlock, Names.Blocks.LEAD_BLOCK);
        GameRegistry.registerBlock(magnesiumBlock, Names.Blocks.MAGNESIUM_BLOCK);
        GameRegistry.registerBlock(manganeseBlock, Names.Blocks.MANGANESE_BLOCK);
        GameRegistry.registerBlock(molybdenumBlock, Names.Blocks.MOLYBDENUM_BLOCK);
        GameRegistry.registerBlock(nickelBlock, Names.Blocks.NICKEL_BLOCK);
        GameRegistry.registerBlock(platinumBlock, Names.Blocks.PLATINUM_BLOCK);
        GameRegistry.registerBlock(silverBlock, Names.Blocks.SILVER_BLOCK);
        GameRegistry.registerBlock(stainlessSteelBlock, Names.Blocks.STAINLESS_STEEL_BLOCK);
        GameRegistry.registerBlock(steelBlock, Names.Blocks.STEEL_BLOCK);
        GameRegistry.registerBlock(tantalumBlock, Names.Blocks.TANTALUM_BLOCK);
        GameRegistry.registerBlock(tinBlock, Names.Blocks.TIN_BLOCK);
        GameRegistry.registerBlock(titaniumBlock, Names.Blocks.TITANIUM_BLOCK);
        GameRegistry.registerBlock(tungstenBlock, Names.Blocks.TUNGSTEN_BLOCK);
        GameRegistry.registerBlock(vanadiumBlock, Names.Blocks.VANADIUM_BLOCK);
        GameRegistry.registerBlock(zincBlock, Names.Blocks.ZINC_BLOCK);

        //Gems/Crystals
        GameRegistry.registerBlock(amethystBlock, Names.Blocks.AMETHYST_BLOCK);
        GameRegistry.registerBlock(apatiteBlock, Names.Blocks.APATITE_BLOCK);
        GameRegistry.registerBlock(aquamarineBlock, Names.Blocks.AQUAMARINE_BLOCK);
        GameRegistry.registerBlock(fluoriteBlock, Names.Blocks.FLUORITE_BLOCK);
        GameRegistry.registerBlock(jadeBlock, Names.Blocks.JADE_BLOCK);
        GameRegistry.registerBlock(onyxBlock, Names.Blocks.ONYX_BLOCK);
        GameRegistry.registerBlock(opalBlock, Names.Blocks.OPAL_BLOCK);
        GameRegistry.registerBlock(peridotBlock, Names.Blocks.PERIDOT_BLOCK);
        GameRegistry.registerBlock(rubyBlock, Names.Blocks.RUBY_BLOCK);
        GameRegistry.registerBlock(sapphireBlock, Names.Blocks.SAPPHIRE_BLOCK);
        GameRegistry.registerBlock(scarletEmeraldBlock, Names.Blocks.SCARLET_EMERALD_BLOCK);
        GameRegistry.registerBlock(topazBlock, Names.Blocks.TOPAZ_BLOCK);
        GameRegistry.registerBlock(turquoiseBlock, Names.Blocks.TURQUOISE_BLOCK);

        //Mineral Blocks
        GameRegistry.registerBlock(basaltBlock, Names.Minerals.BASALT);
        GameRegistry.registerBlock(basaltCobble, Names.Minerals.BASALT_COBBLE);
        GameRegistry.registerBlock(boraxBlock, Names.Minerals.BORAX);
        GameRegistry.registerBlock(chalkBlock, Names.Minerals.CHALK);
        GameRegistry.registerBlock(limestoneBlock, Names.Minerals.LIMESTONE);
        GameRegistry.registerBlock(marbleBlock, ItemMarbleBlock.class, Names.Minerals.MARBLE);
        GameRegistry.registerBlock(siltstoneBlock, Names.Minerals.SILTSTONE);
        GameRegistry.registerBlock(graniteBlock, ItemGraniteBlock.class, Names.Minerals.GRANITE);
        GameRegistry.registerBlock(gypsumBlock, Names.Minerals.GYPSUM);
        GameRegistry.registerBlock(haliteBlock, Names.Minerals.HALITE);

        GameRegistry.registerBlock(brickBlock, ItemBrickBlock.class, Names.Blocks.BRICK);
        GameRegistry.registerBlock(sidingBlock, ItemSidingBlock.class, Names.Blocks.SIDING);
        GameRegistry.registerBlock(stuccoBlock, Names.Blocks.STUCCO_BLOCK);
	}
}
