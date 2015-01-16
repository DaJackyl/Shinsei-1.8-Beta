package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreJadeite extends OreShinsei{

    private static String name = BlockNames.ores.JADEITE_ORE;
    private static Material material = Material.rock;

    public OreJadeite(){
        super(material, name);
        setHardness(7.0f);
        setResistance(11.3f);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return ShinseiItems.jade_gem;
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
