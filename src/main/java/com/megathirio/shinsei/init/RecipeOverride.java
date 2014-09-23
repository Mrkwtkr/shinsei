package com.megathirio.shinsei.init;

import java.util.List;
import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

public class RecipeOverride {

    public static void overrideCraftingRecipe() {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

        Iterator<IRecipe> override = recipes.iterator();

        while (override.hasNext()) {
            ItemStack itemstack = override.next().getRecipeOutput();
            if (itemstack != null) {
                if (itemstack.getItem() == Items.iron_axe)override.remove();
                if (itemstack.getItem() == Items.iron_hoe)override.remove();
                if (itemstack.getItem() == Items.iron_pickaxe)override.remove();
                if (itemstack.getItem() == Items.iron_shovel)override.remove();
                if (itemstack.getItem() == Items.iron_sword)override.remove();
                if (itemstack.getItem() == Items.stone_axe)override.remove();
                if (itemstack.getItem() == Items.stone_hoe)override.remove();
                if (itemstack.getItem() == Items.stone_pickaxe)override.remove();
                if (itemstack.getItem() == Items.stone_shovel)override.remove();
                if (itemstack.getItem() == Items.stone_sword)override.remove();
                if (itemstack.getItem() == Items.wooden_axe)override.remove();
                if (itemstack.getItem() == Items.wooden_hoe)override.remove();
                if (itemstack.getItem() == Items.wooden_pickaxe)override.remove();
                if (itemstack.getItem() == Items.wooden_shovel)override.remove();
                if (itemstack.getItem() == Items.wooden_sword)override.remove();
                if (itemstack.getItem() == Item.getItemFromBlock(Blocks.furnace))override.remove();
                if (itemstack.getItem() == Item.getItemFromBlock(Blocks.emerald_block))override.remove();
            }
        }
    }
}