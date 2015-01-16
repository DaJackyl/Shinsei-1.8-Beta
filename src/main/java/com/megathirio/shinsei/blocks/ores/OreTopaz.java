package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreTopaz extends OreShinsei{

    private static String name = BlockNames.ores.TOPAZ_ORE;
    private static Material material = Material.rock;

    public OreTopaz(){
        super(material, name);
        setHardness(8.0f);
        setResistance(12.9f);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return ShinseiItems.topaz_gem;
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (randomChance() <= 20){
            return 2;
        }else {
            return 1;
        }
    }
}
