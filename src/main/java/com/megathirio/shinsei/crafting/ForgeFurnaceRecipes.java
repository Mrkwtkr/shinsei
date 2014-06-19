package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiIngots;

import com.megathirio.shinsei.items.ShinseiItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ForgeFurnaceRecipes {

	public ForgeFurnaceRecipes(){
		
	}
	
	public static ItemStack getForgeResult(Item item, Item item2, Item item3){
		
		return getOutput(item, item2, item3);
	}
	
	public static ItemStack getOutput(Item item, Item item2, Item item3){
		//Troll Recipe 1
		if(item == ShinseiIngots.ingotAluminum && item2 == ShinseiIngots.ingotChromium && item3 == ShinseiDusts.dustArsenic || item2 == ShinseiIngots.ingotAluminum && item == ShinseiIngots.ingotChromium && item3 == ShinseiDusts.dustArsenic){
			return new ItemStack(ShinseiDusts.dustIridium, 2);
		}
        //Troll Recipe 2
        if(item == ShinseiIngots.ingotIridium && item2 == ShinseiIngots.ingotLead && item3 == ShinseiDusts.dustGraphite || item2 == ShinseiIngots.ingotIridium && item == ShinseiIngots.ingotLead && item3 == ShinseiDusts.dustGraphite){
            return new ItemStack(Items.diamond, 1);
        }
        //Troll Recipe 3
        if(item == ShinseiItems.itemSplitWood && item2 == ShinseiItems.itemSilt && item3 == ShinseiDusts.dustIridium || item2 == ShinseiItems.itemSplitWood && item == ShinseiItems.itemSilt && item3 == ShinseiDusts.dustIridium){
            return new ItemStack(ShinseiBlocks.blockCopper, 64);
        }
            return null;
	}
}
