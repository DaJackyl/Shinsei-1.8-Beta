package com.megathirio.shinsei.blocks.minerals;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class MineralSiltstone extends MineralShinsei {

    private static String name = BlockNames.minerals.SILTSTONE_BLOCK;
    private static Material material = Material.rock;
    public MineralSiltstone(){
        super(material, name);
        setHardness(0.5f);
        setResistance(0.8f);
        setHarvestLevel("pickaxe", 0);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ShinseiItems.silt;
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (randomChance() <= 10){
            return 5;
        }else if(randomChance() <= 25){
            return 4;
        }else if(randomChance() <= 50){
            return 3;
        }else {
            return 2;
        }
    }

}
