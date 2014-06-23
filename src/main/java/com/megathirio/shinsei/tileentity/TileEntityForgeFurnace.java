package com.megathirio.shinsei.tileentity;

import com.megathirio.shinsei.blocks.ForgeFurnace;
import com.megathirio.shinsei.crafting.ForgeFurnaceRecipes;
import com.megathirio.shinsei.items.ShinseiFuels;
import com.megathirio.shinsei.items.ShinseiItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityForgeFurnace extends TileEntity implements ISidedInventory{

    private String customName;

    private static final int[] slots_top = new int[]{0, 1, 2};
    private static final int[] slots_bottom = new int[]{4};
    private static final int[] slots_side = new int[]{3};

	private ItemStack slots[] = new ItemStack[5];

    public static final int forgeSpeed = 50;
    public static final int maxPower = 60000;
	public int dualPower;
	public int dualCookTime;

    public void setGuiDisplayName(String displayName){

        this.customName = displayName;
    }

    @Override
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.customName : "container.forgeFurnace";
    }

    @Override
    public boolean hasCustomInventoryName() {

        return this.customName != null && this.customName.length() > 0;
    }

    @Override
    public int getSizeInventory() {

        return slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int i) {

        return slots[i];
    }

    @Override
    public ItemStack decrStackSize(int i, int j) {

        if(this.slots[i] != null){
            ItemStack itemstack;
            if(slots[i].stackSize <= j){
                itemstack = this.slots[i];
                slots[i] = null;
                return itemstack;
            }else {
                itemstack = this.slots[i].splitStack(j);

                if (this.slots[i].stackSize == 0) {
                    this.slots[i] = null;
                }
                return itemstack;
            }
        }else{
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        if(this.slots[i] != null){
            ItemStack itemstack = this.slots[i];
            this.slots[i] = null;
            return itemstack;
        }
            return null;
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack) {

        this.slots[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()){
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }


    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entityplayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {}

    public void closeInventory() {}

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {

        return i == 4 ? false : (i == 1 ? hasItemPower(itemstack) : true);
    }

	public boolean hasItemPower(ItemStack itemstack){

        return getItemPower(itemstack) > 0;
	}
	
	private static int getItemPower(ItemStack itemstack){
		
		if(itemstack == null){
			return 0;
		}else{
			Item item = itemstack.getItem();
			if(item == ShinseiFuels.fuelCoke) return 3200;
			return 0;
		}
	}
	
	public void readFromNBT(NBTTagCompound nbt){
		
		super.readFromNBT(nbt);
		NBTTagList list = nbt.getTagList("Items", 10);
		slots = new ItemStack[getSizeInventory()];
		for(int i = 0; i < list.tagCount(); i++){
			NBTTagCompound nbt1 = (NBTTagCompound)list.getCompoundTagAt(i);
			byte b0 = nbt1.getByte("Slot");
			if(b0 >= 0 && b0 < slots.length){
				slots[b0] = ItemStack.loadItemStackFromNBT(nbt1);
			}
		}
		dualPower = nbt.getShort("PowerTime");
		dualCookTime = nbt.getShort("CookTime");
	}
	
	public void writeToNBT(NBTTagCompound nbt){
		
		super.writeToNBT(nbt);
		nbt.setShort("PowerTime", (short)dualPower);
		nbt.setShort("CookTime", (short)dualCookTime);
		NBTTagList list = new NBTTagList();
		for(int i = 0; i < slots.length; i++){
			if(slots[i] != null){
				NBTTagCompound nbt1 = new NBTTagCompound();
				nbt1.setByte("Slot", (byte)i);
				slots[i].writeToNBT(nbt1);
				list.appendTag(nbt1);
			}
		}
		nbt.setTag("Items", list);
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int i) {
		return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_side);
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return this.isItemValidForSlot(i, itemstack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return j != 0 || i != 1 || itemstack.getItem() == Items.bucket;
	}
	
	public int getForgeProgressScaled(int i){
		return (dualCookTime * i / this.forgeSpeed);
	}

	public int getForgePowerRemainingScaled(int i){
		return (dualPower * i / maxPower);
	}

	private boolean canForge(){

		if(slots[0] == null || slots[1] == null || slots[2] == null){
			return false;
		}
        ItemStack itemstack = ForgeFurnaceRecipes.getForgeResult(slots[0].getItem(), slots[1].getItem(), slots[2].getItem());

     	if(itemstack == null){
			return false;
		}
		
		if(slots[4] == null){
			return true;
		}

		if(!slots[4].isItemEqual(itemstack)){
			return false;
		}

		if(slots[4].stackSize < getInventoryStackLimit() && slots[4].stackSize < slots[4].getMaxStackSize()){
			return true;
		}else{
			return slots[4].stackSize < itemstack.getMaxStackSize();
		}

	}

	private void forgeItem(){
		
		if(canForge()){
			ItemStack itemstack = ForgeFurnaceRecipes.getForgeResult(slots[0].getItem(), slots[1].getItem(), slots[2].getItem());

			if(slots[4] == null){
				slots[4] = itemstack.copy();
			}else if(slots[4].isItemEqual(itemstack)){
				slots[4].stackSize += itemstack.stackSize;
			}
			
			for(int i = 0; i < 4; i++){
				if(slots[i].stackSize <= 0){
					slots[i] = new ItemStack(slots[i].getItem().setFull3D());
				}else{
					slots[i].stackSize--;
				}
				
				if(slots[i].stackSize <= 0){
					slots[i] = null;
				}
			}
		}
	}

    public boolean hasPower(){

        return dualPower > 0;
    }

    public boolean isForging(){

        return this.dualCookTime > 0;
    }

	public void updateEntity(){

        boolean flag = this.hasPower();
        boolean flag1 = false;

        if(hasPower() && this.isForging()){
            this.dualPower--;
        }

        if(!worldObj.isRemote){
            if(this.hasItemPower(this.slots[3]) && this.dualPower <(this.maxPower - this.getItemPower(this.slots[3]))) {
                this.dualPower += getItemPower(this.slots[3]);

                if(this.slots[3] != null){
                    flag1 = true;

                    this.slots[3].stackSize--;
                    if(this.slots[3].stackSize == 0){
                        this.slots[3] = this.slots[3].getItem().getContainerItem(this.slots[3]);
                    }
                }
            }

            if(hasPower() && canForge()){

                dualCookTime++;

                if(this.dualCookTime == this.forgeSpeed){
                    this.dualCookTime =0;
                    this.forgeItem();
                    flag1 = true;
                }
            }else{
                dualCookTime = 0;
            }

            if(flag != this.hasPower()){
                flag1 = true;
                ForgeFurnace.updateForgeFurnaceBlockState(this.isForging(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if(flag1){

            this.markDirty();
        }
	}

    public TileEntityForgeFurnace(){
        slots = new ItemStack[5];
    }


}
