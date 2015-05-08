package com.megathirio.shinsei.core.crafting;

public class ShinseiCraftingManager {
    public static void init(){
        ToolRecipes.addParts();
        ToolRecipes.addTools();
        BookRecipes.addToolBooks();
        FormRecipes.addIngots();
        SmeltingRecipes.addOres();
        FoodRecipes.addFoods();
    }
}
