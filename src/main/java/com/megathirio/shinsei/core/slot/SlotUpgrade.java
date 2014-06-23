package com.megathirio.shinsei.core.slot;

import com.megathirio.shinsei.items.ShinseiItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotUpgrade extends Slot {

	public SlotUpgrade(EntityPlayer player, IInventory iInventory, int i, int j, int k) {
		super(iInventory, i, j, k);

	}

    @Override
    public boolean isItemValid(ItemStack itemstack) {
        if (itemstack.getItem() == ShinseiItems.itemBellows) {
            return true;
        }else if(itemstack.getItem() == ShinseiItems.itemPistonBellows) {
            return true;
        }else if(itemstack.getItem() == ShinseiItems.itemRetort) {
            return true;
        }else if(itemstack.getItem() == ShinseiItems.itemCopperHeatPlate) {
            return true;
        }else if(itemstack.getItem() == ShinseiItems.itemIronHeatPlate) {
            return true;
        }
        return false;
    }
}
