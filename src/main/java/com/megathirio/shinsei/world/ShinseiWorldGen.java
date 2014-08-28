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
        if(ConfigValues.booBasaltValue == true){this.addOreSpawn(ShinseiBlocks.basaltBlock, world, random, x, z, 16, 16, 4 + random.nextInt(11), 45, 2, 65);}
        this.addOreSpawn(ShinseiBlocks.boraxBlock, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 256);
        if(ConfigValues.booChalkValue == true){this.addOreSpawn(ShinseiBlocks.chalkBlock, world, random, x, z, 16, 16, 4 + random.nextInt(11), 45, 50, 256);}
        if(ConfigValues.booGraniteValue == true){this.addOreSpawn(ShinseiBlocks.graniteBlock, world, random, x, z, 16, 16, 4 + random.nextInt(11), 45, 0, 256);}
        if(ConfigValues.booMarbleValue == true){this.addOreSpawn(ShinseiBlocks.marbleBlock, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 256);}
        if(ConfigValues.booGypsumValue == true){this.addOreSpawn(ShinseiBlocks.gypsumBlock, world, random, x, z, 16, 16, 4 + random.nextInt(11), 45, 45, 256);}
        if(ConfigValues.booSaltValue == true){this.addOreSpawn(ShinseiBlocks.haliteBlock, world, random, x, z, 16, 16, 4 + random.nextInt(5), 35, 25, 75);}
        if(ConfigValues.booLimestoneValue == true){this.addOreSpawn(ShinseiBlocks.limestoneBlock, world, random, x, z, 16, 16, 4 + random.nextInt(11), 30, 35, 128);}
        if(ConfigValues.booSiltValue == true){this.addOreSpawn(ShinseiBlocks.siltstoneBlock, world, random, x, z, 16, 16, 4 + random.nextInt(8), 40, 60, 75);}

        if(ConfigValues.booAmethystValue == true){this.addOreSpawn(ShinseiBlocks.amethystOre, world, random, x, z, 16, 16, 1 + random.nextInt(5), 25, 0, 64);}
        if(ConfigValues.booApatiteValue == true){this.addOreSpawn(ShinseiBlocks.apatiteOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 45, 0, 256);}
        if(ConfigValues.booSilverValue == true){this.addOreSpawn(ShinseiBlocks.acanthiteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 256);}
        if(ConfigValues.booBariteValue == true){this.addOreSpawn(ShinseiBlocks.bariteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 65);}
        if(ConfigValues.booAluminumValue == true){this.addOreSpawn(ShinseiBlocks.bauxiteOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 40, 40, 75);}
        this.addOreSpawn(ShinseiBlocks.berylOre, world, random, x, z, 16, 16, 1 + random.nextInt (4), 20, 0, 256);
        this.addOreSpawn(ShinseiBlocks.bismuthOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 128);
        if(ConfigValues.booCopperValue == true){this.addOreSpawn(ShinseiBlocks.borniteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 256);}
        if(ConfigValues.booTinValue == true){this.addOreSpawn(ShinseiBlocks.cassiteriteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 40, 0, 256);}
        this.addOreSpawn(ShinseiBlocks.chalcedonyOre, world, random, x, z, 16, 16, 1 + random.nextInt(4), 20, 0, 256);
        if(ConfigValues.booCopperValue == true){this.addOreSpawn(ShinseiBlocks.chalcopyriteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 35, 0, 256);}
        this.addOreSpawn(ShinseiBlocks.chromiteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 256);
        if(ConfigValues.booCinnabarValue == true){this.addOreSpawn(ShinseiBlocks.cinnabarOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 256);}
        if(ConfigValues.booCobaltValue == true){this.addOreSpawn(ShinseiBlocks.cobaltiteOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 25, 0, 64);}
        this.addOreSpawn(ShinseiBlocks.corundumOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 20, 0, 64);
        this.addOreSpawn(ShinseiBlocks.cryoliteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 25, 0, 64);
        this.addOreSpawn(ShinseiBlocks.dolomiteOre, world, random, x, z, 16, 16, 2 + random.nextInt(7), 35, 0, 75);
        this.addOreSpawn(ShinseiBlocks.fluoriteOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 50, 0, 256);
        if(ConfigValues.booLeadValue == true){this.addOreSpawn(ShinseiBlocks.galenaOre, world, random, x, z, 16, 16, 2 + random.nextInt(7), 40, 0, 256);}
        this.addOreSpawn(ShinseiBlocks.graphiteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 30, 0, 75);
        if(ConfigValues.booIronValue == true){this.addOreSpawn(ShinseiBlocks.hematiteOre, world, random, x, z, 16, 16, 3 + random.nextInt(6), 40, 0, 256);}
        this.addOreSpawn(ShinseiBlocks.ilmeniteOre, world, random, x, z, 16, 16, 2 + random.nextInt(4), 30, 0, 64);
        this.addOreSpawn(ShinseiBlocks.jadeiteOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 20, 0, 64);
        this.addOreSpawn(ShinseiBlocks.olivineOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 25, 0, 64);
        this.addOreSpawn(ShinseiBlocks.opalOre, world, random, x, z, 16, 16, 2 + random.nextInt(4), 30, 0, 128);
        this.addOreSpawn(ShinseiBlocks.pentlanditeOre, world, random, x, z, 16, 16, 2 + random.nextInt(6), 40, 0, 35);
        this.addOreSpawn(ShinseiBlocks.pyrolusiteOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 35, 0, 128);
        this.addOreSpawn(ShinseiBlocks.realgarOre, world, random, x, z, 16, 16, 4 + random.nextInt(4), 40, 0, 64);
        this.addOreSpawn(ShinseiBlocks.rutileOre, world, random, x, z, 16, 16, 2 + random.nextInt(4), 30, 0, 64);
        this.addOreSpawn(ShinseiBlocks.scheeliteOre, world, random, x, z, 16, 16, 2 + random.nextInt(4), 25, 0, 35);
        this.addOreSpawn(ShinseiBlocks.sperryliteOre, world, random, x, z, 16, 16, 2 + random.nextInt(2), 20, 0, 35);
        this.addOreSpawn(ShinseiBlocks.sphaleriteOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 45, 0, 128);
        this.addOreSpawn(ShinseiBlocks.stibniteOre, world, random, x, z, 16, 16, 1 + random.nextInt(4), 45, 0, 128);
        this.addOreSpawn(ShinseiBlocks.sulphurOre, world, random, x, z, 16, 16, 4 + random.nextInt(5), 50, 0, 256);
        this.addOreSpawn(ShinseiBlocks.sylviteOre, world, random, x, z, 16, 16, 2 + random.nextInt(6), 40, 0, 128);
        this.addOreSpawn(ShinseiBlocks.tantaliteOre, world, random, x, z, 16, 16, 1 + random.nextInt(4), 30, 0, 64);
        this.addOreSpawn(ShinseiBlocks.topazOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 25, 0, 64);
        this.addOreSpawn(ShinseiBlocks.turquoiseOre, world, random, x, z, 16, 16, 1 + random.nextInt(3), 30, 0, 128);
        this.addOreSpawn(ShinseiBlocks.uraniniteOre, world, random, x, z, 16, 16, 1 + random.nextInt(5), 25, 0, 45);

        this.addMeteorSpawn(ShinseiBlocks.meteoriteOre, world, random, x, z, 16, 16, 1 + random.nextInt(6), 15, 0, 256);
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
