package com.megathirio.shinsei.blocks.machines;

import com.megathirio.shinsei.Shinsei;
import com.megathirio.shinsei.blocks.BlockShinsei;
import com.megathirio.shinsei.core.handlers.GuiHandlerAnbiru;
import com.megathirio.shinsei.core.tileentities.TileEntityAnbiru;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class MachineAnbiru extends MachineShinsei {

    private static String name = BlockNames.machines.ANBIRU;
    private static Material material = Material.rock;
    public MachineAnbiru(){
        super(material, name);
        setBlockBounds(1/16.0F, 0, 1/16.0F, 15/16.0F, 8/16.0F, 15/16.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityAnbiru();
    }

    // Called when the block is right clicked
    // In this block it is used to open the blocks gui when right clicked by a player
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        // Uses the gui handler registered to your mod to open the gui for the given gui id
        // open on the server side only  (not sure why you shouldn't open client side too... vanilla doesn't, so we better not either)
        if (worldIn.isRemote) return true;

        playerIn.openGui(Shinsei.instance, GuiHandlerAnbiru.getGuiID(), worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }

}
