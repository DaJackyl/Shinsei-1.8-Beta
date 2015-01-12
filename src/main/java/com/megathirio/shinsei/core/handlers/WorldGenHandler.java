package com.megathirio.shinsei.core.handlers;

import com.megathirio.shinsei.init.ShinseiBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenHandler implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch(world.provider.getDimensionId()){
            case 0:
                generateSurface(world, random, chunkX*16, chunkZ*16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    public void generateSurface(World world, Random random, int chunkX, int chunkZ){
        //this.addOreSpawn(ShinseBlocks.Blockname, world, random, chunkX, chunkZ, maxX, maxZ, maxVeinSize, chanceToSpawn, minYCoord, maxYCoord);
        addOreSpawn(ShinseiBlocks.acanthite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 20, 0, 256);
        addOreSpawn(ShinseiBlocks.amethyst_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(5), 10, 0, 64);
        addOreSpawn(ShinseiBlocks.apatite_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(5), 25, 0, 256);
    }

    public void generateEnd(World world, Random random, int chunkX, int chunkZ){

    }

    public void generateNether(World world, Random random, int chunkX, int chunkZ){

    }

    public void addOreSpawn(Block block, World world, Random random, int chunkX, int chunkZ, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minYCoord, int maxYCoord) {

        for(int i = 0; i < chanceToSpawn; i++){

            int blockXCoord = chunkX + random.nextInt(maxX);
            int blockZCoord = chunkZ + random.nextInt(maxZ);
            int blockYCoord = minYCoord + random.nextInt(maxYCoord - minYCoord);
            BlockPos blockPos = new BlockPos(blockXCoord, blockYCoord, blockZCoord);
            (new WorldGenMinable(block.getDefaultState(), maxVeinSize)).generate(world, random, blockPos);
        }
    }
}
