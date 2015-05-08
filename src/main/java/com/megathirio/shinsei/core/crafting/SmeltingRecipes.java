package com.megathirio.shinsei.core.crafting;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class SmeltingRecipes {

    private static HashMap<Item[], Float[]> furnaceRecipes = new HashMap<Item[], Float[]>();

    public static void addOres(){
    //Furnace Recipes
        //Ore -> ingot
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.acanthite_ore), ShinseiItems.silver_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.stibnite_ore), ShinseiItems.antimony_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.bornite_ore), ShinseiItems.copper_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.cassiterite_ore), ShinseiItems.tin_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.chalcopyrite_ore), ShinseiItems.copper_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.chromite_ore), ShinseiItems.chromium_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.cobaltite_ore), ShinseiItems.cobalt_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.galena_ore), ShinseiItems.lead_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.hematite_ore), Items.iron_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.molybdenite_ore), ShinseiItems.molybdenum_ingot}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.pentlandite_ore), ShinseiItems.nickel_ingot}, new Float[]{1f,1f});

        //Ore -> dust
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.dolomite_ore), ShinseiItems.dolomite_dust}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.realgar_ore), ShinseiItems.arsenic_dust}, new Float[]{4f,1f});

        //Misc
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.basalt_cobble_block), Item.getItemFromBlock(ShinseiBlocks.basalt_block)}, new Float[]{1f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.limestone_block), ShinseiItems.quicklime}, new Float[]{2f,1f});
        furnaceRecipes.put(new Item[]{Item.getItemFromBlock(ShinseiBlocks.chalk_block), ShinseiItems.quicklime}, new Float[]{2f,1f});
        furnaceRecipes.put(new Item[]{ShinseiItems.chalk_dust, ShinseiItems.quicklime}, new Float[]{1f,1f});

        //Furnace Recipe Pattern
        for(Map.Entry<Item[], Float[]> entry : furnaceRecipes.entrySet()){
                    GameRegistry.addSmelting(new ItemStack(entry.getKey()[0]), new ItemStack(entry.getKey()[1], Math.round(entry.getValue()[0])), entry.getValue()[1]);
            }
        }
}
