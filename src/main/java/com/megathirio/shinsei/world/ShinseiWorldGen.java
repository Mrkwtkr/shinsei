package com.megathirio.shinsei.world;

import java.util.Random;

import com.megathirio.shinsei.Main;
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
//        this.addOreSpawn(ShinseiBlocks.arsenicOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
        if(ConfigValues.booBauxiteValue == true){this.addOreSpawn(ShinseiBlocks.bauxiteOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);}
        this.addOreSpawn(ShinseiBlocks.bismuthOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
        this.addOreSpawn(ShinseiBlocks.stibniteOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
        this.addOreSpawn(ShinseiBlocks.chromiteOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
        this.addOreSpawn(ShinseiBlocks.iridiumOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
        if(ConfigValues.booCopperValue == true){this.addOreSpawn(ShinseiBlocks.copperOre, world, random, x, z, 16, 16, 4 + random.nextInt(8), 35, 0, 60);}
        this.addOreSpawn(ShinseiBlocks.graphiteOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
        if(ConfigValues.booLeadValue == true){this.addOreSpawn(ShinseiBlocks.blockLead, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);}
        this.addOreSpawn(ShinseiBlocks.siltstoneBlock, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 64, 128);
        this.addOreSpawn(ShinseiBlocks.claystoneBlock, world, random, x, z, 16, 16, 4+random.nextInt(8), 30, 60, 256);
        this.addOreSpawn(ShinseiBlocks.limestoneBlock, world, random, x, z, 16, 16, 6+random.nextInt(16), 40, 0, 256);
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
	
	

}
