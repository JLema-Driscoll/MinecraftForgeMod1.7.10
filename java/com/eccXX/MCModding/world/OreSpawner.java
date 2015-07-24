package com.eccXX.MCModding.world;

import java.util.Random;

import com.eccXX.MCModding.blocks.ModBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreSpawner implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random random, int i, int j) {}

	private void generateSurface(World world, Random random, int i, int j) {
         for(int t =0; t<50; t++){
        	 int chuckX1 = i +random.nextInt(16);
        	 int chuckY1 = random.nextInt(90);
        	 int chuckZ1 = j + random.nextInt(16);
        	 (new WorldGenMinable(ModBlocks.tutorialBlock,13)).generate(world, random, chuckX1, chuckY1, chuckZ1);
        	 
         }
	}

	private void generateNether(World world, Random random, int i, int j) {}
}


