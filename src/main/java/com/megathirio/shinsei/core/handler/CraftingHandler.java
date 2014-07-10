package com.megathirio.shinsei.core.handler;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.init.ShinseiTools;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;


public class CraftingHandler {

    @SubscribeEvent
	public void onCrafting(ItemCraftedEvent event){
		
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++){
			if(event.craftMatrix.getStackInSlot(i) != null){

                ItemStack axeCast = event.craftMatrix.getStackInSlot(i);
                if(axeCast != null && axeCast.getItem() == ShinseiTools.itemAxeCast){
                    ItemStack k = new ItemStack(ShinseiTools.itemAxeCast, 2);

                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack pickaxeCast = event.craftMatrix.getStackInSlot(i);
                if(pickaxeCast != null && pickaxeCast.getItem() == ShinseiTools.itemPickaxeCast){
                    ItemStack k = new ItemStack(ShinseiTools.itemPickaxeCast, 2);

                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack hoeCast = event.craftMatrix.getStackInSlot(i);
                if(hoeCast != null && hoeCast.getItem() == ShinseiTools.itemHoeCast){
                    ItemStack k = new ItemStack(ShinseiTools.itemHoeCast, 2);

                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack shovelCast = event.craftMatrix.getStackInSlot(i);
                if(shovelCast != null && shovelCast.getItem() == ShinseiTools.itemShovelCast){
                    ItemStack k = new ItemStack(ShinseiTools.itemShovelCast, 2);

                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack swordCast = event.craftMatrix.getStackInSlot(i);
                if(swordCast != null && swordCast.getItem() == ShinseiTools.itemSwordCast){
                    ItemStack k = new ItemStack(ShinseiTools.itemSwordCast, 2);

                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeWood = event.craftMatrix.getStackInSlot(i);
                if(axeWood != null && axeWood.getItem() == Items.wooden_axe){
                    ItemStack k = new ItemStack(Items.wooden_axe, 2, (axeWood.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeStone = event.craftMatrix.getStackInSlot(i);
                if(axeStone != null && axeStone.getItem() == Items.stone_axe){
                    ItemStack k = new ItemStack(Items.stone_axe, 2, (axeStone.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeIron = event.craftMatrix.getStackInSlot(i);
                if(axeIron != null && axeIron.getItem() == Items.iron_axe){
                    ItemStack k = new ItemStack(Items.iron_axe, 2, (axeIron.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeGold = event.craftMatrix.getStackInSlot(i);
                if(axeGold != null && axeGold.getItem() == Items.golden_axe){
                    ItemStack k = new ItemStack(Items.golden_axe, 2, (axeGold.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeDiamond = event.craftMatrix.getStackInSlot(i);
                if(axeDiamond != null && axeDiamond.getItem() == Items.diamond_axe){
                    ItemStack k = new ItemStack(Items.diamond_axe, 2, (axeDiamond.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeCopper = event.craftMatrix.getStackInSlot(i);
                if(axeCopper != null && axeCopper.getItem() == ShinseiItems.copperAxe){
                    ItemStack k = new ItemStack(ShinseiItems.copperAxe, 2, (axeCopper.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

/*
ItemStack axeAluminum = event.craftMatrix.getStackInSlot(i);
if(axeAluminum != null && axeAluminum.getItem() == ShinseiTools.itemAluminumAxe){
ItemStack k = new ItemStack(ShinseiTools.itemAluminumAxe, 2, (axeAluminum.getItemDamage() + 2));

if(k.getItemDamage() >= k.getMaxDamage()){
k.stackSize--;
}
event.craftMatrix.setInventorySlotContents(i, k);
}
*/

            }
		}
	}

	
}
