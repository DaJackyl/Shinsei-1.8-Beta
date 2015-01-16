package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreChalcedony extends OreShinsei{

    private static String name = BlockNames.ores.CHALCEDONY_ORE;
    private static Material material = Material.rock;
    public OreChalcedony(){
        super(material, name);
        setHardness(6.0f);
        setResistance(9.7f);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return ShinseiItems.onyx_gem;
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (randomChance() <= 20){
            return 3;
        }else if(randomChance() <= 40){
            return 2;
        }else {
            return 1;
        }
    }

}
