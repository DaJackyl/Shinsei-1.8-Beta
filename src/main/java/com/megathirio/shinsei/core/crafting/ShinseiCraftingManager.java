package com.megathirio.shinsei.core.crafting;

import com.megathirio.shinsei.init.ShinseiItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ShinseiCraftingManager {
    public static void init(){
    //Tool Parts
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_tool_handle, 1), "@","@", '@', "stickWood"));

       //Iron
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.iron_chisel_blade, 1), "@@ ","  @","   ", '@', "ingotIron"));

        //Stone
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_axe_blade, 1), "@@ ","@  ","   ", '@', "blockCobble"));
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_axe_blade, 1), "@@ ","@  ","   ", '@', "blockStone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_chisel_blade, 1), "@@ ","  @","   ", '@', Blocks.cobblestone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_chisel_blade, 1), "@@ ","  @","   ", '@', Blocks.stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_hoe_blade, 1), " @ ","@  ","   ", '@', Blocks.cobblestone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_hoe_blade, 1), " @ ","@  ","   ", '@', Blocks.stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_pickaxe_blade, 1), " @ ","@ @","   ", '@', Blocks.cobblestone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_pickaxe_blade, 1), " @ ", "@ @", "   ", '@', Blocks.stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_shovel_blade, 1), " @ ","   ","   ", '@', Blocks.cobblestone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_shovel_blade, 1), " @ ","   ","   ", '@', Blocks.stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_sword_blade, 1), " @ "," @ "," @ ", '@', Blocks.cobblestone));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stone_sword_blade, 1), " @ "," @ "," @ ", '@', Blocks.stone));

        //Wood
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_axe_blade, 1), "@@ ","@  ","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_hoe_blade, 1), " @ ","@  ","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_pickaxe_blade, 1), " @ ","@ @","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_shovel_blade, 1), " @ ","   ","   ", '@', "plankWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.wood_sword_blade, 1), " @ "," @ "," @ ", '@', "plankWood"));

    //Tools
        //Iron
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.iron_chisel, 1), ShinseiItems.iron_chisel_blade, ShinseiItems.wood_tool_handle));

        //Stone
//        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_axe, 1), ShinseiItems.stone_axe_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.stone_chisel, 1), ShinseiItems.stone_chisel_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_hoe, 1), ShinseiItems.stone_hoe_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_pickaxe, 1), ShinseiItems.stone_pickaxe_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_shovel, 1), ShinseiItems.stone_shovel_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_sword, 1), ShinseiItems.stone_sword_blade, ShinseiItems.wood_tool_handle));

        //Wood
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_axe, 1), ShinseiItems.wood_axe_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_hoe, 1), ShinseiItems.wood_hoe_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_pickaxe, 1), ShinseiItems.wood_pickaxe_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_shovel, 1), ShinseiItems.wood_shovel_blade, ShinseiItems.wood_tool_handle));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_sword, 1), ShinseiItems.wood_sword_blade, ShinseiItems.wood_tool_handle));

        ToolRecipes.addParts();
        ToolRecipes.addTools();
    }
}
