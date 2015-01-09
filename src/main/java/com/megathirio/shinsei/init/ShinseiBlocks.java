package com.megathirio.shinsei.init;

import com.megathirio.shinsei.blocks.BlockShinsei;
import com.megathirio.shinsei.reference.CoreRef;
import com.megathirio.shinsei.reference.names.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShinseiBlocks {

    public static Block acanthite_ore;

    public static void init(){
        acanthite_ore = new BlockShinsei(Material.rock).setUnlocalizedName(BlockNames.ores.ACANTHITE_ORE);
    }

    public static void register(){
        GameRegistry.registerBlock(acanthite_ore, acanthite_ore.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(acanthite_ore);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CoreRef.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
