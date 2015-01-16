package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreMeteorite extends OreShinsei{

    private static int dropID = 0;
    private static String name = BlockNames.ores.METEORITE_ORE;
    private static Material material = Material.rock;
    public OreMeteorite(){
        super(material, name);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        if (randomChance() <= 5){
            dropID = 12;
            return ShinseiItems.barium_nugget;
        }else if(randomChance() <= 10){
            dropID = 11;
            return ShinseiItems.chromium_nugget;
        }else if(randomChance() <= 15){
            dropID = 10;
            return ShinseiItems.cobalt_nugget;
        }else if(randomChance() <= 20){
            dropID = 9;
            return Items.gold_nugget;
        }else if(randomChance() <= 25){
            dropID = 8;
            return ShinseiItems.graphite_dust;
        }else if(randomChance() <= 30){
            dropID = 7;
            return ShinseiItems.indium_nugget;
        }else if(randomChance() <= 35){
            dropID = 6;
            return ShinseiItems.iridium_nugget;
        }else if(randomChance() <= 40){
            dropID = 5;
            return ShinseiItems.platinum_nugget;
        }else if(randomChance() <= 45){
            dropID = 4;
            return ShinseiItems.silver_nugget;
        }else if(randomChance() <= 50){
            dropID = 3;
            return ShinseiItems.sulphur_dust;
        }else if(randomChance() <= 55){
            dropID = 2;
            return ShinseiItems.uranium_dust;
        }else if(randomChance() <= 75){
            dropID = 1;
            return ShinseiItems.nickel_nugget;
        }else {
            dropID = 0;
            return ShinseiItems.iron_nugget;
        }
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (randomChance() <= 20){
            return 4;
        }else if(randomChance() <= 40){
            return 3;
        }else if(randomChance() <= 60){
            return 2;
        }else {
            return 1;
        }
    }
}
