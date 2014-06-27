package com.megathirio.shinsei.tileentity;

import com.megathirio.shinsei.blocks.WoodFurnace;
import com.megathirio.shinsei.crafting.WoodFurnaceRecipes;
import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiFuels;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityWoodFurnace extends TileEntity implements ISidedInventory {

    private String customName;

    //slot = 0:Input slot - slot = 1:Fuel slot - slot = 2:Output slot - slot = 3, 4, 5:Upgrade slots
    public static final int[] slotsInputs = new int[1];
    public static final int[] slotsFuels = new int[1];
    public static final int[] slotsOutputs = new int[1];
    public static final int[] slotsUpgrades = new int[3];
    public static final int slotsTotal = slotsInputs.length + slotsOutputs.length + slotsFuels.length + slotsUpgrades.length;
    public static final int sltFuelStart = slotsInputs.length;
    public static final int sltOutStart = slotsInputs.length + slotsFuels.length;
    public static final int sltUpStart = slotsInputs.length + slotsOutputs.length + slotsFuels.length;

    private ItemStack[] slots = new ItemStack[slotsTotal];

    public int intSpeed = 200; //Number of ticks that determines when item is smelted
    public int burnTime; //Number of ticks that the furnace will keep burning
    public int currentItemBurnTime; //Number of ticks that a fresh copy of the currently burning item would keep the furnace burning for
    public int cookTime; //Number of ticks that the current item has been cooking for
    public int upEff = 0;
    public boolean upRetort = false;

    @Override
    public int[] getAccessibleSlotsFromSide(int intSide) {
        int[] slotsTop = new int[slotsInputs.length];
        int[] slotsBot = new int[slotsFuels.length + slotsOutputs.length];
        int[] slotsSide = new int[slotsFuels.length];

        for(int i = 0; i < slotsInputs.length ; i++){
            slotsTop[i] = i;
        }
        for(int i = 0; i < slotsFuels.length ; i++){
            slotsSide[i] = i + sltFuelStart;
        }
        for(int i = 0; i < slotsOutputs.length ; i++){
            slotsBot[i] = i + sltOutStart;
        }


        //intSide = 0: Bottom Side - intSide = 1: Top Side - intSide = 2: North Side - intSide = 3: South Side - intSide = 4: West Side - intSide = 5: East Side
        return intSide == 0 ? slotsBot : (intSide == 1 ? slotsTop : slotsSide);
    }

    @Override
    public boolean canInsertItem(int intSlot, ItemStack istackItem, int intSide) {

        return this.isItemValidForSlot(intSlot, istackItem);
    }

    @Override
    public boolean canExtractItem(int intSlot, ItemStack istackItem, int intSide) {

        return intSide != 1 || intSlot != 1 || istackItem.getItem() == Items.bucket;
    }

    public int getSizeInventory() { return this.slots.length; }

    public void setGuiDisplayName(String displayName) {

        this.customName = displayName;
    }

    public String getInventoryName() {

        return this.hasCustomInventoryName() ? this.customName : "container.woodFurnace";
    }

    public boolean hasCustomInventoryName() {

        return this.customName != null && this.customName.length() > 0;
    }

    @Override
    public ItemStack getStackInSlot(int intSlot) { return this.slots[intSlot]; }

    @Override
    public ItemStack decrStackSize(int i, int j) {

        if (this.slots[i] != null) {
            ItemStack itemstack;
            if (this.slots[i].stackSize <= j) {
                itemstack = this.slots[i];
                this.slots[i] = null;
                return itemstack;
            } else {
                itemstack = this.slots[i].splitStack(j);

                if (this.slots[i].stackSize == 0) {
                    this.slots[i] = null;
                }
                return itemstack;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        if (this.slots[i] != null) {
            ItemStack itemstack = this.slots[i];
            this.slots[i] = null;
            return itemstack;
        }

        return null;
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack) {

        this.slots[i] = itemstack;

        if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
            itemstack.stackSize = this.getInventoryStackLimit();
        }

    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entityplayer.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {

        return i == 2 ? true : (i == 1 ? isItemFuel(itemstack) : false);
    }
    public static boolean isItemFuel(ItemStack itemstack) {

        return getItemBurnTime(itemstack) > 0;
    }

    public static int getItemBurnTime (ItemStack itemstack) {
        if (itemstack == null) {
            return 0;
        } else {
            Item item = itemstack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.sapling) return 200;
                if (block.getMaterial() == Material.wood) return 600;
                if (block == Blocks.wooden_slab) return 300;

            }

            if (item == ShinseiFuels.fuelSplitWood) return 1600;
            if (item == ShinseiTools.itemWoodToolHandle) return 400;
            if (item == ShinseiTools.itemWoodAxeHead) return 400;
            if (item == ShinseiTools.itemWoodHoeHead) return 400;
            if (item == ShinseiTools.itemWoodPickaxeHead) return 400;
            if (item == ShinseiTools.itemWoodShovelHead) return 400;
            if (item == ShinseiTools.itemWoodSwordBlade) return 400;
            if (item == Items.stick) return 200;
            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD")) return 400;

        }
        return 0;
    }

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    public void updateEntity() {
        upEff = furnaceEfficiencyUpgrade();
        boolean flag = this.burnTime > 0;
        boolean flag1 = false;

        if (this.isBurning()) {
            --this.burnTime;
        }
        if (!this.worldObj.isRemote) {
            if (this.burnTime == 0 && this.canSmelt()) {
                this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                if (this.isBurning()) {
                    flag1 = true;

                    if (this.slots[1] != null) {
                        --this.slots[1].stackSize;

                        if (this.slots[1].stackSize == 0) {
                            this.slots[1] = this.slots[1].getItem().getContainerItem(this.slots[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt()) {
                ++this.cookTime;
                if (this.cookTime == this.furnaceSpeedUpgrade()) {
                    this.cookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            } else {
                this.cookTime = 0;
            }

            if (flag != this.isBurning()) {

                flag1 = true;
                WoodFurnace.updateWoodFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }

    public boolean canSmelt() {
        upRetort = furnaceRetortUpgrade();
        if (this.slots[0] == null) {
            return false;
        }else{
            ItemStack itemstack;
            if(upRetort == true && this.slots[0].getItem() == Items.coal) {
                ItemStack itemstack0 = WoodFurnaceRecipes.getWoodFurnaceResult(this.slots[0].getItem());
                itemstack = itemstack0;
            }else {
                ItemStack itemstack1 = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
                itemstack = itemstack1;
            }

            if(itemstack == null) return false;
            if(this.slots[2] == null) return true;
            if(!this.slots[2].isItemEqual(itemstack)) return false;

            int result = this.slots[2].stackSize + itemstack.stackSize;

            return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
        }
    }

    public void smeltItem(){
        upRetort = furnaceRetortUpgrade();
        if(this.canSmelt()){
            ItemStack itemstack;
            if(upRetort == true && this.slots[0].getItem() == Items.coal) {
                ItemStack itemstack0 = WoodFurnaceRecipes.getWoodFurnaceResult(this.slots[0].getItem());
                itemstack = itemstack0;
            }else {
                ItemStack itemstack1 = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
                itemstack = itemstack1;
            }

            if(this.slots[2] == null){
                this.slots[2] = itemstack.copy();
/*                if (furnaceOutputUpgrade())
                {
                    ++this.slots[2].stackSize;
                }*/
            }else if(this.slots[2].isItemEqual(itemstack)){
/*                if(furnaceOutputUpgrade() == true){
                    this.slots[2].stackSize += itemstack.stackSize;
                }*/
                this.slots[2].stackSize += itemstack.stackSize;
            }

            --this.slots[0].stackSize;

            if(this.slots[0].stackSize <= 0) {
                this.slots[0] = null;
            }

        }
    }

    public int getBurnTimeRemainingScaled(int i) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = this.furnaceSpeedUpgrade();
        }

        return this.burnTime * i / this.currentItemBurnTime;

    }

    public int getCookProgressScaled(int i) {
        return this.cookTime * i / this.furnaceSpeedUpgrade();
    }

    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);

        NBTTagList list = nbt.getTagList("Items", 10);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound compound = (NBTTagCompound) list.getCompoundTagAt(i);
            byte b = compound.getByte("Slot");

            if (b >= 0 && b < this.slots.length) {
                this.slots[b] = ItemStack.loadItemStackFromNBT(compound);
            }
        }

        this.burnTime = (int) nbt.getShort("BurnTime");
        this.cookTime = (int) nbt.getShort("CookTime");
        this.currentItemBurnTime = (int) nbt.getShort("CurrentBurnTime");

        if (nbt.hasKey("CustomName")) {
            this.customName = nbt.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);

        nbt.setShort("BurnTime", (short) this.burnTime);
        nbt.setShort("CookTime", (short) this.cookTime);
        nbt.setShort("CurrentBurnTime", (short) this.currentItemBurnTime);

        NBTTagList list = new NBTTagList();

        for (int i = 0; i < this.slots.length; i++) {
            if (this.slots[i] != null) {
                NBTTagCompound compound = new NBTTagCompound();
                compound.setByte("Slot", (byte) i);
                this.slots[i].writeToNBT(compound);
                list.appendTag(compound);
            }
        }

        nbt.setTag("Items", list);

        if (this.hasCustomInventoryName()) {
            nbt.setString("CustomName", this.customName);
        }
    }

    public int furnaceSpeedUpgrade() {
        ItemStack[] upSlots = new ItemStack[3];
        int upSpeed = this.intSpeed;
        for (int i = 0; i < 3; i++) {
            upSlots[i] = this.slots[i + 3];
            if (upSlots[i] != null) {
                Item item = upSlots[i].getItem();
                if (item == ShinseiItems.itemBellows) {
                    upSpeed = upSpeed - 75;
                    this.burnTime = this.burnTime - 1;
                }else if(item == ShinseiItems.itemPistonBellows) {
                    upSpeed = upSpeed - 100;
                    this.burnTime = this.burnTime - 3;
                    --this.currentItemBurnTime;
                }
            }
        }
    return upSpeed;
    }

    public boolean furnaceRetortUpgrade(){
        ItemStack[] upSlots = new ItemStack[3];
        for (int i = 0; i < 3; i++) {
            upSlots[i] = this.slots[i + 3];
            if (upSlots[i] != null) {
                Item item = upSlots[i].getItem();
                if (item == ShinseiItems.itemRetort) {
                    upRetort = true;
                }
            }
        }
        return upRetort;
    }

    public int furnaceEfficiencyUpgrade(){
        ItemStack[] upSlots = new ItemStack[3];
        for (int i = 0; i < 3; i++) {
            upSlots[i] = this.slots[i + 3];
            if (upSlots[i] != null) {
                Item item = upSlots[i].getItem();
                if (item == ShinseiItems.itemIronHeatPlate) {
                    upEff += 400;
                }else if(item == ShinseiItems.itemCopperHeatPlate) {
                    upEff += 1200;
                }
            }
        }
        return upEff;
    }

}

