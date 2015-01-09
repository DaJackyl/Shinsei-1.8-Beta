package com.megathirio.shinsei.items;

import com.megathirio.shinsei.reference.CoreRef;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemShinsei extends Item{

    public ItemShinsei(String name){
        super();
        this.setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabFood);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CoreRef.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
