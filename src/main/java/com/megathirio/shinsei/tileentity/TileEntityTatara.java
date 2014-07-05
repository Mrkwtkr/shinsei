package com.megathirio.shinsei.tileentity;

import com.megathirio.shinsei.init.ShinseiFuels;
import com.megathirio.shinsei.init.ShinseiTools;
import cpw.mods.fml.common.registry.GameRegistry;
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

public class TileEntityTatara extends TileEntity implements ISidedInventory {

    private String strName;

    //Input slot = 0 :Fuel slot = 1 :Output slot = 2
    private static final int[] slotsTop = new int[]{0};
    private static final int[] slotsBot = new int[]{2, 1};
    private static final int[] slotsSide = new int[]{1};

    private ItemStack[] slots = new ItemStack[3]; //sets # of slots for Tatara

    public int intSpeed = 200; //number of ticks to complete smelting of an item
    public int intBurnTime; //Number of ticks that the furnace will keep burning
    public int intCurrentBurnTime; //Number of ticks that a fresh copy of the currently burning item would keep the furnace burning for
    public int intCookTime; //Number of ticks that the current item has been cooking for

    @Override
    public int[] getAccessibleSlotsFromSide(int intSide) {

        //Bottom Side = 0: Top Side = 1: North Side = 2: South Side = 3: West Side = 4: East Side = 5
        return intSide == 0 ? slotsBot : (intSide == 1 ? slotsTop : slotsSide);
    }

    @Override
    public boolean canInsertItem(int intSlot, ItemStack istackItem, int intSide) { return this.isItemValidForSlot(intSlot, istackItem); }

    @Override
    public boolean canExtractItem(int intSlot, ItemStack istackItem, int intSide) {
        return intSide != 0 || intSlot != 1 || istackItem.getItem() == Items.bucket;
    }

    public int getSizeInventory() { return this.slots.length; }

    @Override
    public ItemStack getStackInSlot(int intSlot) { return this.slots[intSlot]; }

    @Override
    public ItemStack decrStackSize(int intSlot, int intQty) {

        if (this.slots[intSlot] != null) {
            ItemStack istackItem;
            if (this.slots[intSlot].stackSize <= intQty) {
                istackItem = this.slots[intSlot];
                this.slots[intSlot] = null;
                return istackItem;
            } else {
                istackItem = this.slots[intSlot].splitStack(intQty);

                if (this.slots[intSlot].stackSize == 0) {
                    this.slots[intSlot] = null;
                }
                return istackItem;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int intSlot) {
        if (this.slots[intSlot] != null) {
            ItemStack istackItem = this.slots[intSlot];
            this.slots[intSlot] = null;
            return istackItem;
        }

        return null;
    }

    @Override
    public void setInventorySlotContents(int intSlot, ItemStack istackItem) {

        this.slots[intSlot] = istackItem;

        if (istackItem != null && istackItem.stackSize > this.getInventoryStackLimit()) {
            istackItem.stackSize = this.getInventoryStackLimit();
        }

    }

    public String getInventoryName() { return this.hasCustomInventoryName() ? this.strName : "container.tatara"; }

    public boolean hasCustomInventoryName() { return this.strName != null && this.strName.length() > 0; }

    public void setGuiDisplayName(String strDisplay) { this.strName = strDisplay; }

    @Override
    public int getInventoryStackLimit() { return 64; }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entPlayer) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entPlayer.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }

    @Override
    public boolean isItemValidForSlot(int intSlot, ItemStack istackItem) {
        return intSlot == 2 ? false : (intSlot == 1 ?isItemFuel(istackItem) : true);
    }

    public static boolean isItemFuel(ItemStack istackItem) { return getItemBurnTime(istackItem) > 0; }

    public static int getItemBurnTime (ItemStack itemstack) {
        if (itemstack == null) {
            return 0;
        } else {
            Item item = itemstack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.sapling) return 100;
                if (block.getMaterial() == Material.wood) return 300;
                if (block == Blocks.wooden_slab) return 300;
                if (block == Blocks.coal_block) return 14400;

            }

            if (item == ShinseiFuels.fuelSplitWood) return 800;
            if (item == ShinseiTools.itemWoodToolHandle) return 200;
            if (item == ShinseiTools.itemWoodAxeHead) return 200;
            if (item == ShinseiTools.itemWoodHoeHead) return 200;
            if (item == ShinseiTools.itemWoodPickaxeHead) return 200;
            if (item == ShinseiTools.itemWoodShovelHead) return 200;
            if (item == ShinseiTools.itemWoodSwordBlade) return 200;
            if (item == Items.stick) return 100;
            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD")) return 200;
            if(item == Items.coal) return 1600;
            if(item == Items.lava_bucket) return 20000;
            if(item == Items.blaze_rod) return 2400;

        }
        return GameRegistry.getFuelValue(itemstack);
    }

    public boolean isBurning() { return this.intBurnTime > 0; }

    public void updateEntity() {
        boolean booFlag = this.intBurnTime > 0;
        boolean booFlag1 = false;

        if (this.isBurning()) {
            this.intBurnTime--; //decrements the currently burning fuel time
        }
        if (!this.worldObj.isRemote) {
            if (this.intBurnTime == 0 && this.canSmelt()) {
                //Resets the burn times to the next fuel item when current fuel has finished burning
                this.intCurrentBurnTime = this.intBurnTime = getItemBurnTime(this.slots[1]);

                if (this.isBurning()) {
                    booFlag1 = true;

                    if (this.slots[1] != null) {
                        //decrements the stack size of fuel slot when current fuel has finished burning
                        this.slots[1].stackSize--;

                        if (this.slots[1].stackSize == 0) {
                            this.slots[1] = this.slots[1].getItem().getContainerItem(this.slots[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt()) {
                this.intCookTime++;
                //This is called when item has finished smelting
                if (this.intCookTime == this.intSpeed){
                    this.intCookTime = 0;
                    this.smeltItem();
                    booFlag1 = true;
                }
            } else {
                this.intCookTime = 0;
            }

            if (booFlag != this.isBurning()) {

                booFlag1 = true;
//                Tatara.updateTataraFurnaceBlockState(this.intBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (booFlag1) {
            this.markDirty();
        }
    }

    public boolean canSmelt() {
        if (this.slots[0] == null) {
            return false;
        }else{
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

            if(itemstack == null) return false;
            if(this.slots[2] == null) return true;
            if(!this.slots[2].isItemEqual(itemstack)) return false;

            int result = this.slots[2].stackSize + itemstack.stackSize;

            return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
        }
    }

    public void smeltItem(){
//        booRetort = furnaceRetortUpgrade();
        if(this.canSmelt()){
                ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

            if(this.slots[2] == null){
                this.slots[2] = itemstack.copy();
            }else if(this.slots[2].isItemEqual(itemstack)){
                this.slots[2].stackSize += itemstack.stackSize;
            }

            --this.slots[0].stackSize;

            if(this.slots[0].stackSize <= 0) {
                this.slots[0] = null;
            }

        }
    }

    public int getBurnTimeRemainingScaled(int i) {
        if (this.intCurrentBurnTime == 0) {
            this.intCurrentBurnTime = this.intBurnTime;
        }

        return this.intBurnTime * i / this.intCurrentBurnTime;

    }

    public int getCookProgressScaled(int i) {
        return this.intCookTime * i / this.intSpeed;
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

        this.intBurnTime = (int) nbt.getShort("BurnTime");
        this.intCookTime = (int) nbt.getShort("CookTime");
        this.intCurrentBurnTime = (int) nbt.getShort("CurrentBurnTime");

        if (nbt.hasKey("CustomName")) {
            this.strName = nbt.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);

        nbt.setShort("BurnTime", (short) this.intBurnTime);
        nbt.setShort("CookTime", (short) this.intCookTime);
        nbt.setShort("CurrentBurnTime", (short) this.intCurrentBurnTime);

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
            nbt.setString("CustomName", this.strName);
        }
    }
/*
    public int furnaceSpeedUpgrade() {
        int intUpSpeed = this.intSpeed;
        ItemStack[] istackUpgrades = new ItemStack[slotsUpgrades.length];
        for(int intSlot = 0; intSlot < slotsUpgrades.length; intSlot++) {
            istackUpgrades[intSlot] = getStackInSlot(intSlot + sltUpStart);
            if(istackUpgrades[intSlot] != null){
                Item itemUpgrade = istackUpgrades[intSlot].getItem();
                if (itemUpgrade == ShinseiItems.itemBellows) {
                    intUpSpeed -= 75;
                    this.intBurnTime = this.intBurnTime - 1;
                }else if(itemUpgrade == ShinseiItems.itemPistonBellows) {
                    intUpSpeed -= 100;
                    this.intBurnTime = this.intBurnTime - 3;
                    --this.intCurrentBurnTime;
                }
            }
        }
        return intUpSpeed;
    }

    public boolean furnaceRetortUpgrade(){
        ItemStack[] istackUpgrades = new ItemStack[slotsUpgrades.length];
        for(int intSlot = 0; intSlot < slotsUpgrades.length; intSlot++) {
            istackUpgrades[intSlot] = getStackInSlot(intSlot + sltUpStart);
            if(istackUpgrades[intSlot] != null){
                Item itemUpgrade = istackUpgrades[intSlot].getItem();
                if (itemUpgrade == ShinseiItems.itemRetort) {
                    booRetort = true;
                }
            }
        }
        return booRetort;
    }

    public int furnaceEfficiencyUpgrade(){
        ItemStack[] istackUpgrades = new ItemStack[slotsUpgrades.length];
        for(int intSlot = 0; intSlot < slotsUpgrades.length; intSlot++) {
            istackUpgrades[intSlot] = getStackInSlot(intSlot + sltUpStart);
            if(istackUpgrades[intSlot] != null){
                Item itemUpgrade = istackUpgrades[intSlot].getItem();
                if (itemUpgrade == ShinseiItems.itemIronHeatPlate) {
                    intEff += 600;
                }else if(itemUpgrade == ShinseiItems.itemCopperHeatPlate) {
                    intEff += 1200;
                }
            }
        }
        return intEff;
    }
*/
}

