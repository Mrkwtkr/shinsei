package com.megathirio.shinsei.core.container;

import com.megathirio.shinsei.tileentity.TileEntityTatara;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerTatara extends Container{

    private TileEntityTatara tatara;

    public int lastBurnTime; //Number of ticks that the furnace will keep burning
    public int lastCurrentItemBurnTime; //Number of ticks that a fresh copy of the currently burning item would keep the furnace burning for
    public int lastCookTime; //Number of ticks that the current item has been cooking for

    public ContainerTatara(InventoryPlayer invPlayer, TileEntityTatara teTatara){

        this.tatara = teTatara;

        this.addSlotToContainer(new Slot(teTatara, 0,  85, 36));//input slot
        this.addSlotToContainer(new Slot(teTatara, 1,  35, 53));//fuel slot
        this.addSlotToContainer(new SlotFurnace(invPlayer.player, teTatara, 2,  143, 35));//output slot

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
        icrafting.sendProgressBarUpdate(this, 0, this.tatara.intCookTime);
        icrafting.sendProgressBarUpdate(this, 1, this.tatara.intBurnTime);
        icrafting.sendProgressBarUpdate(this, 2, this.tatara.intCurrentBurnTime);
    }

    public void detectAndSendChanges(){

        super.detectAndSendChanges();
        for(int i = 0; i < this.crafters.size(); i++){
            ICrafting icrafting = (ICrafting) this.crafters.get(i);

            if(this.lastCookTime != this.tatara.intCookTime){
                icrafting.sendProgressBarUpdate(this, 0, this.tatara.intCookTime);
            }
            if(this.lastBurnTime != this.tatara.intBurnTime){
                icrafting.sendProgressBarUpdate(this, 1, this.tatara.intBurnTime);
            }
            if(this.lastCurrentItemBurnTime != this.tatara.intCurrentBurnTime){
                icrafting.sendProgressBarUpdate(this, 2, this.tatara.intCurrentBurnTime);
            }
        }

        this.lastCookTime = this.tatara.intCookTime;
        this.lastBurnTime = this.tatara.intBurnTime;
        this.lastCurrentItemBurnTime = this.tatara.intCurrentBurnTime;

    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2){

        if(par1 == 0){
            this.tatara.intCookTime = par2;
        }

        if(par1 == 1){
            this.tatara.intBurnTime = par2;
        }

        if(par1 == 2){
            this.tatara.intCurrentBurnTime = par2;
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
                if (!this.mergeItemStack(itemstack1, 3, 39, true)) {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }else if (i != 1 && i != 0) {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null) {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }else if (TileEntityTatara.isItemFuel(itemstack1)) {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }else if (i >= 3 && i < 30) {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
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
