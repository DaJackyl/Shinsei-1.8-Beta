package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreBeryl extends OreShinsei{

    private static int dropID = 0;
    private static String name = BlockNames.ores.BERYL_ORE;
    private static Material material = Material.rock;
    public OreBeryl(){
        super(material, name);
        setHardness(7.5f);
        setResistance(12.1f);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        if (randomChance() <= 5){
            dropID = 1;
            return ShinseiItems.scarlet_emerald_gem;
        }else if(randomChance() <= 25){
            dropID = 2;
            return Items.emerald;
        }else {
            dropID = 0;
            return ShinseiItems.aquamarine_gem;
        }
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (dropID == 2) {
            if (randomChance() <= 20) {
                return 2;
            } else {
                return 1;
            }
        }else if(dropID == 1) {
            if (randomChance() <= 20) {
                return 2;
            } else {
                return 1;
            }
        }else{
            if (randomChance() <= 5) {
                return 4;
            } else if (randomChance() <= 15) {
                return 3;
            } else if (randomChance() <= 25) {
                return 2;
            } else {
                return 1;
            }
        }
    }
}
