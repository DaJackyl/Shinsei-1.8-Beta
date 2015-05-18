package com.megathirio.shinsei.blocks.minerals;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.items.itemblocks.IMetaBlockName;
import com.megathirio.shinsei.items.itemblocks.ItemBlockMeta;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;
import java.util.Random;

import static com.megathirio.shinsei.core.utilities.MathHelper.randomChance;

public class MineralMarble extends MineralShinsei implements IMetaBlockName {

    private static String name = BlockNames.minerals.MARBLE_BLOCK;
    private static Material material = Material.rock;

    public static final PropertyEnum TYPE = PropertyEnum.create("type", MineralMarble.EnumType.class);
    public MineralMarble(){
        super(material, name);
        setHardness(0.5f);
        setResistance(0.8f);
        setHarvestLevel("pickaxe", 0);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.WHITE));
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[] { TYPE });
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(TYPE, meta == 0 ? EnumType.WHITE : EnumType.BLACK);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumType type = (EnumType) state.getValue(TYPE);
        return type.getID();
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, 0)); //Meta 0
        list.add(new ItemStack(itemIn, 1, 1)); //Meta 1
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return stack.getItemDamage() == 0 ? "_white" : "_black";
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }

/*
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ShinseiBlocks.marble_block;
    }
*/

    @Override
    public int quantityDropped(Random random)
    {
        return 1;
    }

    public enum EnumType implements IStringSerializable {
        WHITE(0, "_white"),
        BLACK(1, "_black");

        private int ID;
        private String meta;

        private EnumType(int ID, String meta) {
            this.ID = ID;
            this.meta = meta;

        }

        @Override
        public String getName() {
            return name + meta;
        }

        @Override
        public String toString() {
            return getName();
        }

        public int getID() {
            return ID;
        }
    }
}
