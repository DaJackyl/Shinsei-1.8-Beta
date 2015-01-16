package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class BlockChalk extends BlockShinsei {

    private static String name = BlockNames.blocks.CHALK_BLOCK;
    private static Material material = Material.rock;
    public BlockChalk(){
        super(material, name);
        setHardness(3.0f);
        setResistance(4.9f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ShinseiItems.chalk_dust;
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (randomChance() <= 20){
            return 3;
        }else if(randomChance() <= 50){
            return 2;
        }else {
            return 1;
        }
    }
}
