package com.megathirio.shinsei.tileentity;

import com.megathirio.shinsei.blocks.PressureFurnace;
import com.megathirio.shinsei.crafting.PressureFurnaceRecipes;
import com.megathirio.shinsei.items.ShinseiFuels;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPressureFurnace extends TileEntity implements ISidedInventory{

    private String customName;
    private ItemStack slots[];

    private static final int[] slots_top = new int[]{0, 1};
    private static final int[] slots_bottom = new int[]{3};
    private static final int[] slots_side = new int[]{2};

    public TileEntityPressureFurnace(){
        slots = new ItemStack[4];
    }

    public static final int pressureSpeed = 200;
    public static final int maxPower = 51200;
	public int dualPower;
	public int dualCookTime;

    public void setGuiDisplayName(String displayName){

        this.customName = displayName;
    }

    @Override
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.customName : "container.pressureFurnace";
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
    public int[] getAccessibleSlotsFromSide(int i) {
        return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_side);
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

        return i == 3 ? false : (i == 0 ? hasItemPower(itemstack) : true);
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
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return this.isItemValidForSlot(i, itemstack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return j != 0 || i != 1 || itemstack.getItem() == Items.bucket;
	}
	
	public int getPressureProgressScaled(int i){
		return (dualCookTime * i / this.pressureSpeed);
	}

	public int getPressurePowerRemainingScaled(int i){
		return (dualPower * i / maxPower);
	}

	private boolean canPressure(){

		if(slots[0] == null || slots[1] == null){
			return false;
		}
        ItemStack itemstack = PressureFurnaceRecipes.getPressureResult(slots[0].getItem(), slots[1].getItem());

     	if(itemstack == null){
			return false;
		}
		
		if(slots[2] == null){
			return true;
		}

		if(!slots[2].isItemEqual(itemstack)){
			return false;
		}

		if(slots[2].stackSize < getInventoryStackLimit() && slots[2].stackSize < slots[2].getMaxStackSize()){
			return true;
		}else{
			return slots[2].stackSize < itemstack.getMaxStackSize();
		}

	}

	private void pressureItem(){
		
		if(canPressure()){
			ItemStack itemstack = PressureFurnaceRecipes.getPressureResult(slots[0].getItem(), slots[1].getItem());

			if(slots[2] == null){
                slots[2] = itemstack.copy();
			}else if(slots[2].isItemEqual(itemstack)){
                slots[2].stackSize += itemstack.stackSize;
			}
			
			for(int i = 0; i < 2; i++){
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
            if(this.hasItemPower(this.slots[2]) && this.dualPower <(this.maxPower - this.getItemPower(this.slots[2]))) {
                this.dualPower += getItemPower(this.slots[2]);

                if(this.slots[2] != null){
                    flag1 = true;

                    this.slots[2].stackSize--;
                    if(this.slots[2].stackSize == 0){
                        this.slots[2] = this.slots[2].getItem().getContainerItem(this.slots[2]);
                    }
                }
            }

            if(hasPower() && canPressure()){

                dualCookTime++;

                if(this.dualCookTime == this.pressureSpeed){
                    this.dualCookTime =0;
                    this.pressureItem();
                    flag1 = true;
                }
            }else{
                dualCookTime = 0;
            }

            if(flag != this.hasPower()){
                flag1 = true;
                PressureFurnace.updatePressureFurnaceBlockState(this.isForging(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if(flag1){

            this.markDirty();
        }
	}

}
