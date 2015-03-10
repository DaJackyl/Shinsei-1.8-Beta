package com.megathirio.shinsei.core.crafting;

import com.google.common.collect.Maps;
import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.Map;

public class AnbiruRecipes {
    private static final AnbiruRecipes processingBase = new AnbiruRecipes();
    private Map processingList = Maps.newHashMap();
    private Map experienceList = Maps.newHashMap();

    public static AnbiruRecipes instance() {
        return processingBase;
    }

    private AnbiruRecipes() {
//        addProcessing(new ItemStack(Items.iron_ingot), new ItemStack(ShinseiItems.book_axe), new ItemStack(ShinseiItems.iron_axe_blade), 0.15F);
    }

    public void addProcessing(ItemStack bookItem, ItemStack inputItem, ItemStack stackOut, float experience) {
        ItemStack[] recipeStack = {bookItem, inputItem};

        processingList.put(recipeStack, stackOut);
        experienceList.put(stackOut, 0.15F);

    }

    public ItemStack getProcessingResult(ItemStack[] stack) {
        return (ItemStack)processingList.get(stack);
    }

    public Map getProcessingList() {
        return processingList;
    }

}