package com.megathirio.shinsei.crafting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.init.ShinseiTools;

import com.megathirio.shinsei.item.tool.AxeShinsei;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.world.World;

public class ToolBenchCraftingManager
{
    /** The static instance of this class */
    private static final ToolBenchCraftingManager instance = new ToolBenchCraftingManager();
    /** A list of all the recipes added */
    private List recipes = new ArrayList();
    private static final String __OBFID = "CL_00000090";

    /**
     * Returns the static instance of this class
     */
    public static final ToolBenchCraftingManager getInstance()
    {
        /** The static instance of this class */
        return instance;
    }

    private ToolBenchCraftingManager()
    {
    	recipes = new ArrayList();

    //Items
        this.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(ShinseiTools.copperAxe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        this.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.wooden_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        this.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.stone_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        this.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.iron_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        this.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.golden_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);
        this.addRecipe(new ItemStack(ShinseiItems.splitWood, 2), "@", "#", '@', new ItemStack(Items.diamond_axe, 1, OreDictionary.WILDCARD_VALUE), '#', Blocks.log);

        //Tool Parts
    	//Handles
		this.addRecipe(new ItemStack(ShinseiTools.woodToolHandle, 1),new Object[] {"@","@", '@', Items.stick});

    	
    //Tools
		//Axes
		this.addRecipe(new ItemStack(ShinseiTools.copperAxe, 1),new Object[] {"@", "#", '@', ShinseiTools.copperAxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.stone_axe, 1),new Object[] {"@", "#", '@', ShinseiTools.stoneAxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.golden_axe, 1),new Object[] {"@", "#", '@', ShinseiTools.goldAxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.diamond_axe, 1),new Object[] {"@", "#", '@', ShinseiTools.diamondAxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.iron_axe, 1),new Object[] {"@", "#", '@', ShinseiTools.ironAxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.wooden_axe, 1),new Object[] {"@", "#", '@', ShinseiTools.woodAxeHead, '#', ShinseiTools.woodToolHandle});

 		//Hoes
		this.addRecipe(new ItemStack(ShinseiTools.copperHoe, 1),new Object[] {"@", "#", '@', ShinseiTools.copperHoeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.stone_hoe, 1),new Object[] {"@", "#", '@', ShinseiTools.stoneHoeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.golden_hoe, 1),new Object[] {"@", "#", '@', ShinseiTools.goldHoeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.diamond_hoe, 1),new Object[] {"@", "#", '@', ShinseiTools.diamondHoeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.iron_hoe, 1),new Object[] {"@", "#", '@', ShinseiTools.ironHoeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.wooden_hoe, 1),new Object[] {"@", "#", '@', ShinseiTools.woodHoeHead, '#', ShinseiTools.woodToolHandle});

 		//Pickaxes
		this.addRecipe(new ItemStack(ShinseiTools.copperPickaxe, 1),new Object[] {"@", "#", '@', ShinseiTools.copperPickaxeHead, '#', ShinseiTools.woodToolHandle});
		this.addRecipe(new ItemStack(Items.stone_pickaxe, 1),new Object[] {"@", "#", '@', ShinseiTools.stonePickaxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.golden_pickaxe, 1),new Object[] {"@", "#", '@', ShinseiTools.goldPickaxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.diamond_pickaxe, 1),new Object[] {"@", "#", '@', ShinseiTools.diamondPickaxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.iron_pickaxe, 1),new Object[] {"@", "#", '@', ShinseiTools.ironPickaxeHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.wooden_pickaxe, 1),new Object[] {"@", "#", '@', ShinseiTools.woodPickaxeHead, '#', ShinseiTools.woodToolHandle});

		//Shovels
		this.addRecipe(new ItemStack(ShinseiTools.copperShovel, 1),new Object[] {"@", "#", '@', ShinseiTools.copperShovelHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.stone_shovel, 1),new Object[] {"@", "#", '@', ShinseiTools.stoneShovelHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.golden_shovel, 1),new Object[] {"@", "#", '@', ShinseiTools.goldShovelHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.diamond_shovel, 1),new Object[] {"@", "#", '@', ShinseiTools.diamondShovelHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.iron_shovel, 1),new Object[] {"@", "#", '@', ShinseiTools.ironShovelHead, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.wooden_shovel, 1),new Object[] {"@", "#", '@', ShinseiTools.woodShovelHead, '#', ShinseiTools.woodToolHandle});

		//Swords
		this.addRecipe(new ItemStack(ShinseiTools.copperSword, 1),new Object[] {"@", "#", '@', ShinseiTools.copperSwordBlade, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.stone_sword, 1),new Object[] {"@", "#", '@', ShinseiTools.stoneSwordBlade, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.golden_sword, 1),new Object[] {"@", "#", '@', ShinseiTools.goldSwordBlade, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.diamond_sword, 1),new Object[] {"@", "#", '@', ShinseiTools.diamondSwordBlade, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.iron_sword, 1),new Object[] {"@", "#", '@', ShinseiTools.ironSwordBlade, '#', ShinseiTools.woodToolHandle});
 		this.addRecipe(new ItemStack(Items.wooden_sword, 1),new Object[] {"@", "#", '@', ShinseiTools.woodSwordBlade, '#', ShinseiTools.woodToolHandle});

 		//Misc
        this.addRecipe(new ItemStack(Blocks.planks, 4, 0), new Object[] {"@", '@', new ItemStack(Blocks.log, 1, 0)});
        this.addRecipe(new ItemStack(Blocks.planks, 4, 1), new Object[] {"@", '@', new ItemStack(Blocks.log, 1, 1)});
        this.addRecipe(new ItemStack(Blocks.planks, 4, 2), new Object[] {"@", '@', new ItemStack(Blocks.log, 1, 2)});
        this.addRecipe(new ItemStack(Blocks.planks, 4, 3), new Object[] {"@", '@', new ItemStack(Blocks.log, 1, 3)});
        this.addRecipe(new ItemStack(Blocks.planks, 4, 4), new Object[] {"@", '@', new ItemStack(Blocks.log2, 1, 0)});
        this.addRecipe(new ItemStack(Blocks.planks, 4, 5), new Object[] {"@", '@', new ItemStack(Blocks.log2, 1, 1)});
		this.addRecipe(new ItemStack(Items.stick, 4),new Object[] {"@","@", '@', Blocks.planks});
 		
        Collections.sort(this.recipes, new ToolBenchRecipeSorter(this));
      
    }

    public ToolBenchShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
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

        ToolBenchShapedRecipes shapedrecipes = new ToolBenchShapedRecipes(j, k, aitemstack, par1ItemStack);
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