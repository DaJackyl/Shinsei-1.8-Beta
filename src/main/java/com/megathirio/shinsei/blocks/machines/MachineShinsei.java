package com.megathirio.shinsei.blocks.machines;

import com.megathirio.shinsei.blocks.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.CoreRef;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class MachineShinsei extends BlockContainer {

    public MachineShinsei(Material material, String name) {
        super(material);
        setUnlocalizedName(name);
        setHardness(3.5f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeMetal);
        setCreativeTab(ShinseiTabs.MACHINES_TAB);
        GameRegistry.registerBlock(this, name);

    }

    // This is where you can do something when the block is broken. In this case drop the inventory's contents
    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {

        IInventory inventory = worldIn.getTileEntity(pos) instanceof IInventory ? (IInventory)worldIn.getTileEntity(pos) : null;

        if (inventory != null){
            // For each slot in the inventory
            for (int i = 0; i < inventory.getSizeInventory(); i++){
                // If the slot is not empty
                if (inventory.getStackInSlot(i) != null)
                {
                    // Create a new entity item with the item stack in the slot
                    EntityItem item = new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, inventory.getStackInSlot(i));

                    // Apply some random motion to the item
                    float multiplier = 0.1f;
                    float motionX = worldIn.rand.nextFloat() - 0.5f;
                    float motionY = worldIn.rand.nextFloat() - 0.5f;
                    float motionZ = worldIn.rand.nextFloat() - 0.5f;

                    item.motionX = motionX * multiplier;
                    item.motionY = motionY * multiplier;
                    item.motionZ = motionZ * multiplier;

                    // Spawn the item in the world
                    worldIn.spawnEntityInWorld(item);
                }
            }

            // Clear the inventory so nothing else (such as another mod) can do anything with the items
            inventory.clear();
        }

        // Super MUST be called last because it removes the tile entity
        super.breakBlock(worldIn, pos, state);
    }


    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return this.quantityDropped(random) + random.nextInt(fortune + 1);
    }

    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }

    @Override
    public int getExpDrop(net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        if (this.getItemDropped(world.getBlockState(pos), RANDOM, fortune) != Item.getItemFromBlock(this))
        {
            return 1 + RANDOM.nextInt(5);
        }
        return 0;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CoreRef.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }

    // the block will render in the SOLID layer.  See http://greyminecraftcoder.blogspot.co.at/2014/12/block-rendering-18.html for more information.
    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.SOLID;
    }

    // used by the renderer to control lighting and visibility of other blocks.
    // set to false because this block doesn't fill the entire 1x1x1 space
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    // used by the renderer to control lighting and visibility of other blocks, also by
    // (eg) wall or fence to control whether the fence joins itself to this block
    // set to false because this block doesn't fill the entire 1x1x1 space
    @Override
    public boolean isFullCube() {
        return false;
    }

    // render using a BakedModel
    // not strictly required because the default (super method) is 3.
    @Override
    public int getRenderType() {
        return 3;
    }

}
