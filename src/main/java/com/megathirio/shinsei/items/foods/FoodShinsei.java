package com.megathirio.shinsei.items.foods;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.items.ItemShinsei;
import com.megathirio.shinsei.reference.CoreRef;
import com.megathirio.shinsei.reference.names.ItemNames;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodShinsei extends ItemFood{

    public FoodShinsei(int intHeal, float fltSat, boolean boolWolf, String name) {
        super(intHeal, fltSat, boolWolf);
        this.setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ShinseiTabs.ITEMS_TAB);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CoreRef.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }


}
