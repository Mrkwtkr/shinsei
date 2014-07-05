package com.megathirio.shinsei.crafting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.items.ShinseiIngots;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.init.ShinseiTools;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class MachinePressCraftingManager
{
    /** The static instance of this class */
    private static final MachinePressCraftingManager instance = new MachinePressCraftingManager();
    /** A list of all the recipes added */
    private List recipes = new ArrayList();
    private static final String __OBFID = "CL_00000090";

    /**
     * Returns the static instance of this class
     */
    public static final MachinePressCraftingManager getInstance()
    {
        /** The static instance of this class */
        return instance;
    }

    private MachinePressCraftingManager()
    {
        recipes = new ArrayList();
    	
		//Tool Parts
    		//Casts

            this.addRecipe(new ItemStack(ShinseiItems.itemCopperPlate, 3), "@"," ", '@', ShinseiBlocks.blockCopper);
            this.addRecipe(new ItemStack(ShinseiItems.itemIronPlate, 3), "@"," ", '@', Blocks.iron_block);
            this.addRecipe(new ItemStack(ShinseiItems.itemCopperHeatPlate, 1), "@","@", '@', ShinseiItems.itemCopperPlate);
            this.addRecipe(new ItemStack(ShinseiItems.itemIronHeatPlate, 1), "@","@", '@', ShinseiItems.itemIronPlate);
            this.addRecipe(new ItemStack(ShinseiTools.itemAxeCast, 1), "@","#", '@', ShinseiTools.itemStoneAxeHead, '#', ShinseiItems.itemCopperPlate);
            this.addRecipe(new ItemStack(ShinseiTools.itemHoeCast, 1), "@","#", '@', ShinseiTools.itemStoneHoeHead, '#', ShinseiItems.itemCopperPlate);
       		this.addRecipe(new ItemStack(ShinseiTools.itemPickaxeCast, 1), "@","#", '@', ShinseiTools.itemStonePickaxeHead, '#', ShinseiItems.itemCopperPlate);
       		this.addRecipe(new ItemStack(ShinseiTools.itemShovelCast, 1), "@","#", '@', ShinseiTools.itemStoneShovelHead, '#', ShinseiItems.itemCopperPlate);
       		this.addRecipe(new ItemStack(ShinseiTools.itemSwordCast, 1), "@","#", '@', ShinseiTools.itemStoneSwordBlade, '#', ShinseiItems.itemCopperPlate);


    		//Axe Heads
            this.addRecipe(new ItemStack(ShinseiTools.itemAluminumAxeHead, 1), "@", "#", '@', ShinseiIngots.ingotAluminum, '#', new ItemStack(ShinseiTools.itemAxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemCopperAxeHead, 1), "@", "#", '@', ShinseiIngots.ingotCopper, '#', new ItemStack(ShinseiTools.itemAxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemGoldAxeHead, 1), "@", "#", '@', Items.gold_ingot, '#', new ItemStack(ShinseiTools.itemAxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemDiamondAxeHead, 1), "@", "#", '@', Items.diamond, '#', new ItemStack(ShinseiTools.itemAxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemIronAxeHead, 1), "@", "#", '@', Items.iron_ingot, '#', new ItemStack(ShinseiTools.itemAxeCast, 1, OreDictionary.WILDCARD_VALUE));

			//Hoe Heads
            this.addRecipe(new ItemStack(ShinseiTools.itemAluminumHoeHead, 1), "@", "#", '@', ShinseiIngots.ingotAluminum, '#', new ItemStack(ShinseiTools.itemHoeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemCopperHoeHead, 1), "@", "#", '@', ShinseiIngots.ingotCopper, '#', new ItemStack(ShinseiTools.itemHoeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemGoldHoeHead, 1), "@", "#", '@', Items.gold_ingot, '#', new ItemStack(ShinseiTools.itemHoeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemDiamondHoeHead, 1), "@", "#", '@', Items.diamond, '#', new ItemStack(ShinseiTools.itemHoeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemIronHoeHead, 1), "@", "#", '@', Items.iron_ingot, '#', new ItemStack(ShinseiTools.itemHoeCast, 1, OreDictionary.WILDCARD_VALUE));
		
			//Pickaxe Heads
            this.addRecipe(new ItemStack(ShinseiTools.itemAluminumPickaxeHead, 1), "@", "#", '@', ShinseiIngots.ingotAluminum, '#', new ItemStack(ShinseiTools.itemPickaxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemCopperPickaxeHead, 1), "@", "#", '@', ShinseiIngots.ingotCopper, '#', new ItemStack(ShinseiTools.itemPickaxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemGoldPickaxeHead, 1), "@", "#", '@', Items.gold_ingot, '#', new ItemStack(ShinseiTools.itemPickaxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemDiamondPickaxeHead, 1), "@", "#", '@', Items.diamond, '#', new ItemStack(ShinseiTools.itemPickaxeCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemIronPickaxeHead, 1), "@", "#", '@', Items.iron_ingot, '#', new ItemStack(ShinseiTools.itemPickaxeCast, 1, OreDictionary.WILDCARD_VALUE));
		
			//Shovel Heads
            this.addRecipe(new ItemStack(ShinseiTools.itemAluminumShovelHead, 1), "@", "#", '@', ShinseiIngots.ingotAluminum, '#', new ItemStack(ShinseiTools.itemShovelCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemCopperShovelHead, 1), "@", "#", '@', ShinseiIngots.ingotCopper, '#', new ItemStack(ShinseiTools.itemShovelCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemGoldShovelHead, 1), "@", "#", '@', Items.gold_ingot, '#', new ItemStack(ShinseiTools.itemShovelCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemDiamondShovelHead, 1), "@", "#", '@', Items.diamond, '#', new ItemStack(ShinseiTools.itemShovelCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemIronShovelHead, 1), "@", "#", '@', Items.iron_ingot, '#', new ItemStack(ShinseiTools.itemShovelCast, 1, OreDictionary.WILDCARD_VALUE));
 		
			//Sword Blades
            this.addRecipe(new ItemStack(ShinseiTools.itemAluminumSwordBlade, 1), "@", "#", '@', ShinseiIngots.ingotAluminum, '#', new ItemStack(ShinseiTools.itemSwordCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemCopperSwordBlade, 1), "@", "#", '@', ShinseiIngots.ingotCopper, '#', new ItemStack(ShinseiTools.itemSwordCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemGoldSwordBlade, 1), "@", "#", '@', Items.gold_ingot, '#', new ItemStack(ShinseiTools.itemSwordCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemDiamondSwordBlade, 1), "@", "#", '@', Items.diamond, '#', new ItemStack(ShinseiTools.itemSwordCast, 1, OreDictionary.WILDCARD_VALUE));
            this.addRecipe(new ItemStack(ShinseiTools.itemIronSwordBlade, 1), "@", "#", '@', Items.iron_ingot, '#', new ItemStack(ShinseiTools.itemSwordCast, 1, OreDictionary.WILDCARD_VALUE));

    	Collections.sort(this.recipes, new MachinePressRecipeSorter(this));
      
    }

    public MachinePressShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (par2ArrayOfObj[i] instanceof String[])
        {
            String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (par2ArrayOfObj[i] instanceof String)
            {
                String s2 = (String)par2ArrayOfObj[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
        {
            Character character = (Character)par2ArrayOfObj[i];
            ItemStack itemstack1 = null;

            if (par2ArrayOfObj[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
            }
            else if (par2ArrayOfObj[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
            }
            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        MachinePressShapedRecipes shapedrecipes = new MachinePressShapedRecipes(j, k, aitemstack, par1ItemStack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = par2ArrayOfObj;
        int i = par2ArrayOfObj.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipe!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
        {
            Item item = itemstack.getItem();
            int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int l = j1 + k + item.getMaxDamage() * 5 / 100;
            int i1 = item.getMaxDamage() - l;

            if (i1 < 0)
            {
                i1 = 0;
            }

            return new ItemStack(itemstack.getItem(), 1, i1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }

    /**
     * returns the List<> of all recipes
     */
    public List getRecipeList()
    {
        return this.recipes;
    }
}