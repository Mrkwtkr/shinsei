package com.megathirio.shinsei.world;

import java.util.Random;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.reference.ConfigValues;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ShinseiWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch(world.provider.dimensionId){
		
		case 0:
            generateSurface(world, random, chunkX*16, chunkZ*16);

		case 1:
            generateEnd(world, random, chunkX*16, chunkZ*16);

		case -1:
            generateNether(world, random, chunkX*16, chunkZ*16);

		}
	}

    public void generateSurface(World world, Random random, int x, int z) {
        //this.addOreSpawn(ShinseBlocks.Blockname, world, random, xPos, zPos, maxX, maxZ, maxVeinSize, chanceToSpawn, minY, maxY);
        if(ConfigValues.booBasaltValue == true){this.addOreSpawn(ShinseiBlocks.basaltBlock, world, random, x, z, 16, 16, 6 + random.nextInt(12), 45, 2, 65);}
        if(ConfigValues.booChalkValue == true){this.addOreSpawn(ShinseiBlocks.chalkBlock, world, random, x, z, 16, 16, 6 + random.nextInt(12), 45, 50, 256);}
        if(ConfigValues.booGraniteValue == true){this.addOreSpawn(ShinseiBlocks.graniteBlock, world, random, x, z, 16, 16, 6 + random.nextInt(12), 45, 0, 256);}
        if(ConfigValues.booGypsumValue == true){this.addOreSpawn(ShinseiBlocks.gypsumBlock, world, random, x, z, 16, 16, 6 + random.nextInt(12), 45, 45, 256);}
        if(ConfigValues.booSaltValue == true){this.addOreSpawn(ShinseiBlocks.haliteBlock, world, random, x, z, 16, 16, 4 + random.nextInt(8), 35, 25, 75);}
        if(ConfigValues.booLimestoneValue == true){this.addOreSpawn(ShinseiBlocks.limestoneBlock, world, random, x, z, 16, 16, 2 + random.nextInt(6), 30, 35, 128);}
        if(ConfigValues.booSiltValue == true){this.addOreSpawn(ShinseiBlocks.siltstoneBlock, world, random, x, z, 16, 16, 4 + random.nextInt(8), 40, 60, 75);}

        if(ConfigValues.booAmethystValue == true){this.addOreSpawn(ShinseiBlocks.amethystOre, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 0, 64);}
        if(ConfigValues.booApatiteValue == true){this.addOreSpawn(ShinseiBlocks.apatiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 35, 0, 256);}
        if(ConfigValues.booSilverValue == true){this.addOreSpawn(ShinseiBlocks.acanthiteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 20, 0, 256);}
        if(ConfigValues.booBariteValue == true){this.addOreSpawn(ShinseiBlocks.bariteOre, world, random, x, z, 16, 16, 2 + random.nextInt(7), 20, 0, 65);}
        if(ConfigValues.booAluminumValue == true){this.addOreSpawn(ShinseiBlocks.bauxiteOre, world, random, x, z, 16, 16, 4 + random.nextInt(8), 40, 40, 75);}
        this.addOreSpawn(ShinseiBlocks.berylOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 5, 0, 35);

//        this.addOreSpawn(ShinseiBlocks.bismuthOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.boraxOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.borniteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.cassiteriteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.chalcopyriteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.chromiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.cinnabarOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.cobaltiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.corundumOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.cryoliteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.dolomiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.fluoriteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        if(ConfigValues.booLeadValue == true){this.addOreSpawn(ShinseiBlocks.galenaOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);}
//        this.addOreSpawn(ShinseiBlocks.goethiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.graphiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.hematiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.ilmeniteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.magnetiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.malachiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.molybdeniteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.olivineOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.opalOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.pentlanditeOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.platinumOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.pyrolusiteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.realgarOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.rutileOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.scheeliteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.sperryliteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.sphaleriteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.stibniteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.sulfurOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.sylviteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.tantaliteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.topazOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.turquoiseOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);
//        this.addOreSpawn(ShinseiBlocks.uraniniteOre, world, random, x, z, 16, 16, 6+random.nextInt(8), 50, 0, 256);

        this.addMeteorSpawn(ShinseiBlocks.meteoriteOre, world, random, x, z, 16, 16, 1 + random.nextInt(6), 5, 0, 256);
    }

    public void generateNether(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	public void generateEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	public void addOreSpawn(Block block, World world, Random random, int xPos, int zPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
	
		for(int i = 0; i < chanceToSpawn; i++){
			
			int posX = xPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = zPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}

    public void addMeteorSpawn(Block block, World world, Random random, int xPos, int zPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

        for(int i = 0; i < chanceToSpawn; i++){

            int posX = xPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = zPos + random.nextInt(maxZ);
            (new ShinseiMeteorWorldGen(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }


}
