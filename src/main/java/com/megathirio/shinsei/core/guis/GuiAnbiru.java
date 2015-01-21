package com.megathirio.shinsei.core.guis;

import com.megathirio.shinsei.core.containers.ContainerAnbiru;
import com.megathirio.shinsei.core.tileentities.TileEntityAnbiru;
import com.megathirio.shinsei.reference.CoreRef;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;

@SideOnly(Side.CLIENT)
public class GuiAnbiru extends GuiContainer {

    //Location for the background image
    private static final ResourceLocation background = new ResourceLocation(CoreRef.RESOURCE_PREFIX + "textures/gui/anbiru_gui.png");
    private TileEntityAnbiru teAnbiru;

    public GuiAnbiru(InventoryPlayer invPlayer, TileEntityAnbiru tile){
        super(new ContainerAnbiru(invPlayer, tile));
        teAnbiru = tile;
        //Sets width and height of gui
        xSize = 176;
        ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        //Bind the image texture of the container
        Minecraft.getMinecraft().getTextureManager().bindTexture(background);
        //Draw the image
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    //Draw the foreground for the GUI
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
        final int LABEL_XPOS = 5;
        final int LABEL_YPOS = 5;
        fontRendererObj.drawString(teAnbiru.getDisplayName().getUnformattedText(), LABEL_XPOS, LABEL_YPOS, Color.darkGray.getRGB());
    }
}
