package com.megathirio.shinsei.world;

import java.util.Random;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ShinseiWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch(world.provider.dimensionId){
		
		case 0: generateSurface(random, chunkX*16, chunkZ*16, world); break;

		case 1: generateEnd(random, chunkX*16, chunkZ*16, world); break;

		case -1: generateNether(random, chunkX*16, chunkZ*16, world); break;

		}
	}

	public void generateNether(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

	public void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

	public void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		//addOreSpawn(Block name, world, random, X Pos, Z Pos, Min Vein Size, Max Vein Size, Spawn Chances, Min Y Pos, Max Y Pos); 
		addOreSpawn(ShinseiBlocks.blockArsenicOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
		addOreSpawn(ShinseiBlocks.blockBauxiteOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
        addOreSpawn(ShinseiBlocks.blockBismuthOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
		addOreSpawn(ShinseiBlocks.blockStibniteOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
        addOreSpawn(ShinseiBlocks.blockChromiteOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
        addOreSpawn(ShinseiBlocks.blockIridiumOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
		addOreSpawn(ShinseiBlocks.blockCopperOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
        addOreSpawn(ShinseiBlocks.blockGraphiteOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
        addOreSpawn(ShinseiBlocks.blockLeadOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
		addOreSpawn(ShinseiBlocks.blockClaystone, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
		addOreSpawn(ShinseiBlocks.blockLimestone, world, random, chunkX, chunkZ, 4, 16, 20, 0, 256);
	}

	public void addOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY) {
	
		for(int i = 0; i < chancesToSpawn; i++){
			
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(16);
			new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), Blocks.stone).generate(world, random, posX, posY, posZ);
			
		}
	}
	
	

}
