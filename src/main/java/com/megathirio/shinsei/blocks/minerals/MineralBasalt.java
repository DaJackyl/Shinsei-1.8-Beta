package com.megathirio.shinsei.blocks.minerals;

import com.megathirio.shinsei.blocks.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class MineralBasalt extends MineralShinsei {

    private static String name = BlockNames.minerals.BASALT_BLOCK;
    private static Material material = Material.rock;
    public MineralBasalt(){
        super(material, name);
        setHardness(8.0f);
        setResistance(12.9f);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        return Item.getItemFromBlock(ShinseiBlocks.basalt_cobble_block);
    }

    @Override
    public int quantityDropped(Random random)
    {
            return 1;
    }
}
