package com.megathirio.shinsei.blocks.ores;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class OreCorundum extends OreShinsei{

    private static String name = BlockNames.ores.CORUNDUM_ORE;
    private static Material material = Material.rock;
    private static int dropQty = 1;
    private static Item dropItem = null;
    private static int dropID = 0;
    public OreCorundum(){
        super(material, name);
        setHardness(9.0f);
        setResistance(14.6f);
        setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune)
    {
        if (randomChance() <= 25){
            dropID = 1;
            return ShinseiItems.ruby_gem;
        }else {
            dropID = 0;
            return ShinseiItems.sapphire_gem;
        }
    }

    @Override
    public int quantityDropped(Random random)
    {
        if (dropID == 1) {
            if (randomChance() <= 20) {
                return 2;
            } else {
                return 1;
            }
        }else{
            if (randomChance() <= 20) {
                return 2;
            } else {
                return 1;
            }
        }
    }
}
