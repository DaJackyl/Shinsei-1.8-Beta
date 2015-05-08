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
        //Minerals
        addOreSpawn(ShinseiBlocks.basalt_block, world, random, chunkX, chunkZ, 16, 16, 8 + random.nextInt(9), 20, 0, 65);
        addOreSpawn(ShinseiBlocks.borax_block, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(16), 15, 0, 256);
        addOreSpawn(ShinseiBlocks.chalk_block, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(8), 20, 50, 256);
        addOreSpawn(ShinseiBlocks.gypsum_block, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(8), 20, 45, 256);
        addOreSpawn(ShinseiBlocks.halite_block, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(8), 15, 25, 75);
        addOreSpawn(ShinseiBlocks.limestone_block, world, random, chunkX, chunkZ, 16, 16, 8 + random.nextInt(17), 25, 35, 128);
        addOreSpawn(ShinseiBlocks.siltstone_block, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(8), 20, 60, 75);
        //Ores
        addOreSpawn(ShinseiBlocks.acanthite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 20, 0, 256);
        addOreSpawn(ShinseiBlocks.amethyst_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(5), 10, 0, 64);
        addOreSpawn(ShinseiBlocks.apatite_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(5), 25, 0, 256);
        addOreSpawn(ShinseiBlocks.barite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 20, 0, 65);
        addOreSpawn(ShinseiBlocks.bauxite_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(5), 25, 40, 75);
        addOreSpawn(ShinseiBlocks.beryl_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt (4), 10, 0, 256);
        addOreSpawn(ShinseiBlocks.bismuth_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 20, 0, 128);
        addOreSpawn(ShinseiBlocks.bornite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 35, 0, 256);
        addOreSpawn(ShinseiBlocks.cassiterite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 25, 0, 256);
        addOreSpawn(ShinseiBlocks.chalcedony_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(4), 15, 0, 256);
        addOreSpawn(ShinseiBlocks.chalcopyrite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 40, 0, 256);
        addOreSpawn(ShinseiBlocks.chromite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 20, 0, 256);
        addOreSpawn(ShinseiBlocks.cinnabar_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 15, 0, 256);
        addOreSpawn(ShinseiBlocks.cobaltite_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(3), 10, 0, 64);
        addOreSpawn(ShinseiBlocks.corundum_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(3), 10, 0, 64);
        addOreSpawn(ShinseiBlocks.cryolite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 20, 0, 64);
        addOreSpawn(ShinseiBlocks.dolomite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(7), 20, 0, 75);
        addOreSpawn(ShinseiBlocks.fluorite_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(5), 20, 0, 256);
        addOreSpawn(ShinseiBlocks.galena_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(7), 25, 0, 256);
        addOreSpawn(ShinseiBlocks.graphite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 20, 0, 75);
        addOreSpawn(ShinseiBlocks.hematite_ore, world, random, chunkX, chunkZ, 16, 16, 3 + random.nextInt(6), 30, 0, 256);
        addOreSpawn(ShinseiBlocks.ilmenite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(4), 20, 0, 64);
        addOreSpawn(ShinseiBlocks.jadeite_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(3), 10, 0, 64);
        addOreSpawn(ShinseiBlocks.meteorite_ore, world, random, chunkX, chunkZ, 16, 16, 1, 25, 64, 256);
        addOreSpawn(ShinseiBlocks.molybdenite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(5), 40, 0, 256);
        addOreSpawn(ShinseiBlocks.olivine_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(3), 20, 0, 64);
        addOreSpawn(ShinseiBlocks.opal_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(4), 15, 0, 128);
        addOreSpawn(ShinseiBlocks.pentlandite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(6), 25, 0, 35);
        addOreSpawn(ShinseiBlocks.pyrolusite_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(5), 20, 0, 128);
        addOreSpawn(ShinseiBlocks.realgar_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(4), 25, 0, 64);
        addOreSpawn(ShinseiBlocks.rutile_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(4), 20, 0, 64);
        addOreSpawn(ShinseiBlocks.scheelite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(4), 15, 0, 35);
        addOreSpawn(ShinseiBlocks.sperrylite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(2), 15, 0, 35);
        addOreSpawn(ShinseiBlocks.sphalerite_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(5), 25, 0, 128);
        addOreSpawn(ShinseiBlocks.stibnite_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(4), 25, 0, 128);
        addOreSpawn(ShinseiBlocks.sulphur_ore, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(5), 25, 0, 256);
        addOreSpawn(ShinseiBlocks.sylvite_ore, world, random, chunkX, chunkZ, 16, 16, 2 + random.nextInt(6), 20, 0, 128);
        addOreSpawn(ShinseiBlocks.tantalite_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(4), 20, 0, 64);
        addOreSpawn(ShinseiBlocks.topaz_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(3), 15, 0, 64);
        addOreSpawn(ShinseiBlocks.turquoise_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(3), 20, 0, 128);
        addOreSpawn(ShinseiBlocks.uraninite_ore, world, random, chunkX, chunkZ, 16, 16, 1 + random.nextInt(5), 10, 0, 45);

//        addOreSpawn(ShinseiBlocks.woodCrateCache, world, random, chunkX, chunkZ, 16, 16, 1, 10, 64, 256);
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

/*
    public void addMeteorSpawn(Block block, World world, Random random, int chunkX, int chunkZ, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minYCoord, int maxYCoord) {

        for(int i = 0; i < chanceToSpawn; i++){

             int blockXCoord = chunkX + random.nextInt(maxX);
             int blockZCoord = chunkZ + random.nextInt(maxZ);
             int blockYCoord = minYCoord + random.nextInt(maxYCoord - minYCoord);
             BlockPos blockPos = new BlockPos(blockXCoord, blockYCoord, blockZCoord);

             (new ShinseiMeteorWorldGen(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
            }
     }
*/
}
