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

public class AnbiruRecipes
{
    private static final AnbiruRecipes processingBase = new AnbiruRecipes();
    private Map processingList = Maps.newHashMap();
    private Map experienceList = Maps.newHashMap();

    public static AnbiruRecipes instance() { return processingBase; }

    private AnbiruRecipes()
    {
        this.addProcessingRecipe(new ItemStack(Blocks.sponge, 1, 1), new ItemStack(Blocks.sponge, 1, 0), 0.15F);
    }

    public void addProcessing(Item input, ItemStack stack, float experience)
    {
        this.addProcessingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    public void addProcessingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        this.processingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    public ItemStack getProcessingResult(ItemStack stack)
    {
        Iterator iterator = this.processingList.entrySet().iterator();
        Map.Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Map.Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map getProcessingList()
    {
        return this.processingList;
    }

    public float getProcessingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Map.Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Map.Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}