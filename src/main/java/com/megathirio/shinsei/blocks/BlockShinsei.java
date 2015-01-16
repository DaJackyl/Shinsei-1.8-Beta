package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.CoreRef;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockShinsei extends Block {

    public BlockShinsei(Material material, String name){
        super(material);
        setUnlocalizedName(name);
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(ShinseiTabs.BLOCKS_TAB);
        GameRegistry.registerBlock(this, name);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CoreRef.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
