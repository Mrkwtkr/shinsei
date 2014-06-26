package com.megathirio.shinsei.core.container;

import com.megathirio.shinsei.core.slot.SlotForgeFurnace;
import com.megathirio.shinsei.core.slot.SlotUpgrade;
import com.megathirio.shinsei.tileentity.TileEntityForgeFurnace;
import com.megathirio.shinsei.tileentity.TileEntityWoodFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerForgeFurnace extends Container {

    private TileEntityForgeFurnace forgeFurnace;
    private int dualCookTime;
    private int dualPower;
    private int lastItemBurnTime;

    public ContainerForgeFurnace(InventoryPlayer invPlayer, TileEntityForgeFurnace teForgeFurnace){
        dualCookTime = 0;
        dualPower = 0;
        lastItemBurnTime = 0;

        forgeFurnace = teForgeFurnace;

        this.addSlotToContainer(new Slot(teForgeFurnace, 0, 85, 17));//Input Slot 1
        this.addSlotToContainer(new Slot(teForgeFurnace, 1, 85, 35));//Input Slot 2
        this.addSlotToContainer(new Slot(teForgeFurnace, 2, 85, 53));//Input Slot 3
        this.addSlotToContainer(new Slot(teForgeFurnace, 3, 35, 53));//Fuel Slot
        this.addSlotToContainer(new SlotForgeFurnace(invPlayer.player, teForgeFurnace, 4, 143, 35));//Output Slot
//        this.addSlotToContainer(new SlotUpgrade(invPlayer.player, teForgeFurnace, 3,  8, 17));//upgrade slot 1
//        this.addSlotToContainer(new SlotUpgrade(invPlayer.player, teForgeFurnace, 4,  8, 35));//upgrade slot 2
//        this.addSlotToContainer(new SlotUpgrade(invPlayer.player, teForgeFurnace, 5,  8, 53));//upgrade slot 3

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

    public void addCraftingToCrafters(ICrafting crafting){

        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.forgeFurnace.dualCookTime);
        crafting.sendProgressBarUpdate(this, 1, this.forgeFurnace.dualPower);
    }

    public ItemStack transferStackInSlot(EntityPlayer player, int i)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(i);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (i == 2) {
                if (!this.mergeItemStack(itemstack1, 3, 39, true)) {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (i != 1 && i != 0) {
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
                }else if (i >= 3 && i < 30){
                    if (!this.mergeItemStack(itemstack1, 30, 39, false)){
                        return null;
                    }
                }else if (i >= 30 && i < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)) {
                    return null;
                }
            } else if (!this.mergeItemStack(itemstack1, 3, 39, false)) {
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

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }


    @Override
    public boolean canInteractWith(EntityPlayer player) {

        return forgeFurnace.isUseableByPlayer(player);
    }

    public void detectAndSendChanges(){
        super.detectAndSendChanges();

        for(int i = 0; i < this.crafters.size(); i++){
            ICrafting par1 = (ICrafting)this.crafters.get(i);

            if(this.dualCookTime != this.forgeFurnace.dualCookTime){
                par1.sendProgressBarUpdate(this, 0, this.forgeFurnace.dualCookTime);
            }

            if(this.dualPower != this.forgeFurnace.dualPower){
                par1.sendProgressBarUpdate(this, 1, this.forgeFurnace.dualPower);
            }
        }

        this.dualCookTime = this.forgeFurnace.dualCookTime;
        this.dualPower = this.forgeFurnace.dualPower;
    }

    public void updateProgressBar(int i, int j){
        if(i == 0){
            forgeFurnace.dualCookTime = j;
        }

        if(i == 1){
            forgeFurnace.dualPower = j;
        }

    }
}
