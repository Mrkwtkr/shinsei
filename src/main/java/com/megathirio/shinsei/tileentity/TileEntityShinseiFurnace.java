package com.megathirio.shinsei.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityShinseiFurnace extends TileEntity implements ISidedInventory{

    //Variables
    private String strName;

    private static final int[] slotsTop = new int[]{0};
    private static final int[] slotsBot = new int[]{2, 1};
    private static final int[] slotsSide = new int[]{1};

    private ItemStack[] istackSlots = new ItemStack[6];

    @Override
    public int[] getAccessibleSlotsFromSide(int intSlot) { return new int[0]; }

    @Override
    public boolean canInsertItem(int intSlot, ItemStack istackItem, int intSide) { return false; }

    @Override
    public boolean canExtractItem(int intSlot, ItemStack istackItem, int intSide) { return false; }

    @Override
    public int getSizeInventory() { return 0; }

    @Override
    public ItemStack getStackInSlot(int intSlot) { return null; }

    @Override
    public ItemStack decrStackSize(int intSlot, int intQty) { return null; }

    @Override
    public ItemStack getStackInSlotOnClosing(int intSlot) { return null; }

    @Override
    public void setInventorySlotContents(int intSlot, ItemStack istackItem) {  }

    @Override
    public String getInventoryName() { return null; }

    @Override
    public boolean hasCustomInventoryName() { return false; }

    @Override
    public int getInventoryStackLimit() { return 0; }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entPlayer) { return false; }

    @Override
    public void openInventory() {  }

    @Override
    public void closeInventory() {  }

    @Override
    public boolean isItemValidForSlot(int intSlot, ItemStack istackItem) { return false; }

}
