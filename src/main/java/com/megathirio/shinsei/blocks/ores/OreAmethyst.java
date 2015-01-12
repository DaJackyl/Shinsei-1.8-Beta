package com.megathirio.shinsei.blocks.ores;

        import com.megathirio.shinsei.init.ShinseiItems;
        import com.megathirio.shinsei.reference.names.BlockNames;
        import net.minecraft.block.material.Material;
        import net.minecraft.block.state.IBlockState;
        import net.minecraft.item.Item;
        import java.util.Random;

public class OreAmethyst extends OreShinsei{

    private static String name = BlockNames.ores.AMETHYST_ORE;
    private static Material material = Material.rock;
    private static int dropQty = 1;

    public OreAmethyst(){
        super(material, name);
        setHardness(7.0f);
        setResistance(11.3f);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ShinseiItems.amethyst_gem;
    }

    @Override
    public int quantityDropped(Random random)
    {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            dropQty = 2;
        }else {
            dropQty = 1;
        }
        return dropQty;
    }

}