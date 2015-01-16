package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreGraphite extends OreShinsei{

    private static String name = BlockNames.ores.GRAPHITE_ORE;
    private static Material material = Material.rock;
    private static int dropQty = 1;

    public OreGraphite(){
        super(material, name);
        setHardness(4.0f);
        setResistance(6.5f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ShinseiItems.graphite_dust;
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (randomChance() <= 20){
            return 4;
        }else if(randomChance() <= 50){
            return 3;
        }else {
            return 2;
        }
    }
}
