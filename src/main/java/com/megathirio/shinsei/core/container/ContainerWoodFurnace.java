package com.megathirio.shinsei.core.container;

import com.megathirio.shinsei.core.slot.SlotUpgrade;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.megathirio.shinsei.tileentity.TileEntityWoodFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerWoodFurnace extends Container{

	private TileEntityWoodFurnace woodFurnace;
	
	public int lastBurnTime; //Number of ticks that the furnace will keep burning 
	public int lastCurrentItemBurnTime; //Number of ticks that a fresh copy of the currently burning item would keep the furnace burning for 
	public int lastCookTime; //Number of ticks that the current item has been cooking for
	
	public ContainerWoodFurnace(InventoryPlayer invPlayer, TileEntityWoodFurnace tileEntity){
		
		this.woodFurnace = tileEntity;

		this.addSlotToContainer(new Slot(tileEntity, 0,  85, 36));//input slot
		this.addSlotToContainer(new Slot(tileEntity, 1,  35, 53));//fuel slot
		this.addSlotToContainer(new SlotFurnace(invPlayer.player, tileEntity, 2,  143, 35));//output slot
		this.addSlotToContainer(new SlotUpgrade(invPlayer.player, tileEntity,  3,  8, 17));//upgrade slot 1
		//this.addSlotToContainer(new Slot(tileentity, 4,  8, 35));//upgrade slot 2
		//this.addSlotToContainer(new Slot(tileentity, 5,  8, 53));//upgrade slot 3
		
		//Inventory Slots
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 9; j++){
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		//Hotbar Slots
		for(int i = 0; i < 9; i++){
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
		
	}
	
	public void addCraftingToCrafters (ICrafting icrafting){
		
		super.addCraftingToCrafters(icrafting);
		icrafting.sendProgressBarUpdate(this, 0, this.woodFurnace.cookTime);
		icrafting.sendProgressBarUpdate(this, 1, this.woodFurnace.burnTime);
		icrafting.sendProgressBarUpdate(this, 2, this.woodFurnace.currentItemBurnTime);
	}
	
	public void detectAndSendChanges(){
		
		super.detectAndSendChanges();
		for(int i = 0; i < this.crafters.size(); i++){
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			
			if(this.lastCookTime != this.woodFurnace.cookTime){
				icrafting.sendProgressBarUpdate(this, 0, this.woodFurnace.cookTime);
			}
			if(this.lastBurnTime != this.woodFurnace.burnTime){
				icrafting.sendProgressBarUpdate(this, 1, this.woodFurnace.burnTime);
			}
			if(this.lastCurrentItemBurnTime != this.woodFurnace.currentItemBurnTime){
				icrafting.sendProgressBarUpdate(this, 2, this.woodFurnace.currentItemBurnTime);
			}
		}
		
		this.lastCookTime = this.woodFurnace.cookTime;
		this.lastBurnTime = this.woodFurnace.burnTime;
		this.lastCurrentItemBurnTime = this.woodFurnace.currentItemBurnTime;
		
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2){
		
		if(par1 == 0){
			this.woodFurnace.cookTime = par2;
		}

		if(par1 == 1){
			this.woodFurnace.burnTime = par2;
		}

		if(par1 == 2){
			this.woodFurnace.currentItemBurnTime = par2;
		}

	}
	
	
	public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int i)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(i);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (i == 2) {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }else if (i == 3) {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }else if (i != 1 && i != 0) {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null) {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }else if (TileEntityWoodFurnace.isItemFuel(itemstack1)) {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }else if (TileEntityWoodFurnace.isItemFuel(itemstack1)) {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }else if (i >= 3 && i < 30){
                    if (!this.mergeItemStack(itemstack1, 30, 39, false)){
                        return null;
                    }
                }else if (i >= 30 && i < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)) {
                    return null;
            }
            }else if (!this.mergeItemStack(itemstack1, 3, 39, false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(entityPlayer, itemstack1);
        }

        return itemstack;
    }

	@Override
	public boolean canInteractWith(EntityPlayer i) {
		return true;
	}

}
