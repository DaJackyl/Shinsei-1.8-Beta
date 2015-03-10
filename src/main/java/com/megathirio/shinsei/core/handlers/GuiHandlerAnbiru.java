package com.megathirio.shinsei.core.handlers;

import com.megathirio.shinsei.core.containers.ContainerAnbiru;
import com.megathirio.shinsei.core.guis.GuiAnbiru;
import com.megathirio.shinsei.core.tileentities.TileEntityAnbiru;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerAnbiru implements IGuiHandler {

        private static final int GUIID_ANBIRU = 12;
        public static int getGuiID() {return GUIID_ANBIRU;}

        // Gets the server side element for the given gui id- this should return a container
        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            if (ID != getGuiID()) {
                System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
            }

            BlockPos xyz = new BlockPos(x, y, z);
            TileEntity tileEntity = world.getTileEntity(xyz);
//            if (tileEntity instanceof TileEntityAnbiru) {
//                TileEntityAnbiru teAnbiru = (TileEntityAnbiru) tileEntity;
//                return new ContainerAnbiru(player.inventory, teAnbiru);
//            }
            return null;
        }

        // Gets the client side element for the given gui id- this should return a gui
        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            if (ID != getGuiID()) {
                System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
            }

            BlockPos xyz = new BlockPos(x, y, z);
            TileEntity tileEntity = world.getTileEntity(xyz);
//            if (tileEntity instanceof TileEntityAnbiru) {
//                TileEntityAnbiru teAnbiru = (TileEntityAnbiru) tileEntity;
//                return new GuiAnbiru(player.inventory, teAnbiru);
//            }
            return null;
        }
}
