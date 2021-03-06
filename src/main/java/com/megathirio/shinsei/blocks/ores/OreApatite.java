package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreApatite extends OreShinsei{

    private static String name = BlockNames.ores.APATITE_ORE;
    private static Material material = Material.rock;
    private static int dropQty = 1;

    public OreApatite(){
        super(material, name);
        setHardness(5.0f);
        setResistance(8.1f);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ShinseiItems.apatite_gem;
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (randomChance() <= 10){
            return 4;
        }else if(randomChance() <= 25){
            return 3;
        }else if(randomChance() <= 50){
            return 2;
        }else {
            return 1;
        }
    }

}
