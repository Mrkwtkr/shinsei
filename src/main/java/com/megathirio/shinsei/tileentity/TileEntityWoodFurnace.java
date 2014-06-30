/*package com.megathirio.shinsei.tileentity;

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

    private String strName;

    //slot = 0:Input slot - slot = 1:Fuel slot - slot = 2:Output slot - slot = 3, 4, 5:Upgrade slots
    public static final int[] slotsInputs = new int[1]; //sets # of slots for Inputs
    public static final int[] slotsFuels = new int[1]; //sets # of slots for Fuels
    public static final int[] slotsOutputs = new int[1]; //sets # of slots for Outputs
    public static final int[] slotsUpgrades = new int[3]; //sets # of slots for Upgrades
    public static final int slotsTotal = slotsInputs.length + slotsOutputs.length + slotsFuels.length + slotsUpgrades.length; //sets total # of slots
    public static final int sltFuelStart = slotsInputs.length; //sets the number for the start of the Fuel slot #s
    public static final int sltOutStart = slotsInputs.length + slotsFuels.length; //sets the number for the start of the Output slot #s
    public static final int sltUpStart = slotsInputs.length + slotsOutputs.length + slotsFuels.length; //sets the number for the start of the Upgrade slot #s

    private ItemStack[] slots = new ItemStack[slotsTotal]; //Sets a new ItemStack array for the all of the slots

    public int intSpeed = 200; //Number of ticks that determines when item is smelted
    public int intBurnTime; //Number of ticks that the furnace will keep burning
    public int intCurrentBurnTime; //Number of ticks that a fresh copy of the currently burning item would keep the furnace burning for
    public int intCookTime; //Number of ticks that the current item has been cooking for
    public int intEff = 0; //variable used for Efficiency Upgrades
    public boolean booRetort = false; //Variable used for Speed Upgrades
    boolean booCustomSmelt = false;

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
    public boolean canInsertItem(int intSlot, ItemStack istackItem, int intSide) { return this.isItemValidForSlot(intSlot, istackItem); }

    @Override
    public boolean canExtractItem(int intSlot, ItemStack istackItem, int intSide) {
        boolean booFlag = true;
        for(int i = 0; i < slotsFuels.length; i++) {
            if (intSlot == i + sltFuelStart) {
                booFlag = false;
            }
        }
        for(int i = 0; i < slotsInputs.length; i++) {
            if (intSlot == i) {
                booFlag = false;
            }
        }
        if (intSide == 1) booFlag = false;
        if(istackItem.getItem() == Items.bucket) booFlag = false;
        return booFlag;
    }

    public int getSizeInventory() { return this.slotsTotal; }

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

    public String getInventoryName() { return this.hasCustomInventoryName() ? this.strName : "container.woodFurnace"; }

    public boolean hasCustomInventoryName() { return this.strName != null && this.strName.length() > 0; }

    public void setGuiDisplayName(String strDisplay) { this.strName = strDisplay; }

    @Override
    public int getInventoryStackLimit() { return 64; }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entPlayer) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entPlayer.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {  }

    public void closeInventory() {  }

    @Override
    public boolean isItemValidForSlot(int intSlot, ItemStack istackItem) {
        boolean booFlag = true;
        for(int i = 0; i < slotsFuels.length; i++) {
            if (intSlot == i + sltFuelStart) {
                if(isItemFuel(istackItem) != true){
                    booFlag = false;
                }
            }
        }
        for(int i = 0; i < slotsOutputs.length; i++) {
            if (intSlot == i + sltOutStart) {
                booFlag = false;
            }
        }
        return booFlag;
    }

    public static boolean isItemFuel(ItemStack istackItem) { return getItemBurnTime(istackItem) > 0; }

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

    public boolean isBurning() { return this.intBurnTime > 0; }

    public void updateEntity() {
        boolean booFlag = this.intBurnTime > 0;
        boolean booFlag1 = false;

        if (this.isBurning()) {
            this.intBurnTime--; //decrements the currently burning fuel time
        }
        if (!this.worldObj.isRemote) {
            if (this.intBurnTime == 0 && this.canSmelt() && (getItemBurnTime(this.slots[0 + sltFuelStart]) != 0 )) {
                //Resets the burn times to the next fuel item when current fuel has finished burning
                this.intCurrentBurnTime = this.intBurnTime = getItemBurnTime(this.slots[0 + sltFuelStart]) + this.furnaceEfficiencyUpgrade();

                if (this.isBurning()) {
                    booFlag1 = true;

                    if (this.slots[0 + sltFuelStart] != null) {
                        //decrements the stack size of fuel slot when current fuel has finished burning
                        this.slots[0 + sltFuelStart].stackSize--;

                        if (this.slots[0 + sltFuelStart].stackSize == 0) {
                            this.slots[0 + sltFuelStart] = this.slots[0 + sltFuelStart].getItem().getContainerItem(this.slots[0 + sltFuelStart]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt()) {
                this.intCookTime++;
                //This is called when item has finished smelting
                if (this.intCookTime == this.furnaceSpeedUpgrade()) {
                    this.intCookTime = 0;
                    this.smeltItem();
                    booFlag1 = true;
                }
            } else {
                this.intCookTime = 0;
            }

            if (booFlag != this.isBurning()) {

                booFlag1 = true;
                WoodFurnace.updateWoodFurnaceBlockState(this.intBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (booFlag1) {
            this.markDirty();
        }
    }

    public boolean canSmelt() {
        booRetort = furnaceRetortUpgrade();
        ItemStack[] istackInputs = new ItemStack[slotsInputs.length];
        ItemStack[] istackOutputs = new ItemStack[slotsOutputs.length];
        ItemStack[] istackUpgrades = new ItemStack[slotsUpgrades.length];
        boolean booFlag = false;
        for(int intSlot = 0; intSlot < slotsInputs.length; intSlot++) {
            istackUpgrades[intSlot] = getStackInSlot(intSlot);
            if (istackInputs[intSlot] != null) { // Checks if the input slots are empty
                ItemStack istackResult = null;
                //Checks for the Retort upgrade and if the input slot contains coal - if both are true it will get the recipe result for coal into coke
                if(istackInputs[intSlot].getItem() == Items.coal){
                    if(booRetort == true) {
                        booFlag = true;
                        booCustomSmelt = true;
                    }else{
                        booFlag = false;
                        booCustomSmelt = false;
                    }
                }else{
                    ItemStack istackResult0 = FurnaceRecipes.smelting().getSmeltingResult(istackInputs[0]);
                    istackResult = istackResult0;
                    booCustomSmelt = false;
                }

                if(istackResult == null) booFlag = false;
                for(int intSlot0 = 0; intSlot < slotsOutputs.length; intSlot0++) {
                    istackOutputs[intSlot0] = getStackInSlot(intSlot0);
                    if(istackOutputs[intSlot0] == null) return true;
                    if(!istackOutputs[intSlot0].isItemEqual(istackResult)) return false;
                    int intResult = istackOutputs[intSlot0].stackSize + istackResult.stackSize;
                    if(intResult <= getInventoryStackLimit() && intResult <= istackResult.getMaxStackSize()){
                        booFlag = true;
                    }else{
                        booFlag = false;
                    }
                }
                return booFlag;
            }
        }
        return booFlag;
    }

    public void smeltItem(){
        if(this.canSmelt()) {
        ItemStack[] istackInputs = new ItemStack[slotsInputs.length];
        ItemStack[] istackOutputs = new ItemStack[slotsOutputs.length];
        ItemStack[] istackUpgrades = new ItemStack[slotsUpgrades.length];
        ItemStack istackResult = null;
        for(int intSlot = 0; intSlot < slotsInputs.length; intSlot++) {
            istackInputs[intSlot] = getStackInSlot(intSlot);
            if (booCustomSmelt) {
                ItemStack istackResult0 = WoodFurnaceRecipes.getWoodFurnaceResult(istackInputs[intSlot].getItem());
                istackResult = istackResult0;
            } else {
                ItemStack istackResult1 = FurnaceRecipes.smelting().getSmeltingResult(istackInputs[intSlot]);
                istackResult = istackResult1;
            }
        }

            if (this.slots[2] == null) {
                this.slots[2] = istackResult.copy();
            } else if (this.slots[2].isItemEqual(istackResult)) {
                this.slots[2].stackSize += istackResult.stackSize;
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0) {
                this.slots[0] = null;
            }
        }
    }

    public int getBurnTimeRemainingScaled(int i) {
        if (this.intCurrentBurnTime == 0) {
            this.intCurrentBurnTime = this.furnaceSpeedUpgrade() + this.furnaceEfficiencyUpgrade();
        }

        return this.intBurnTime * i / this.intCurrentBurnTime;

    }

    public int getCookProgressScaled(int i) {
        return this.intCookTime * i / this.furnaceSpeedUpgrade();
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
}

*/
package com.megathirio.shinsei.tileentity;

import com.megathirio.shinsei.blocks.WoodFurnace;
import com.megathirio.shinsei.crafting.WoodFurnaceRecipes;
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
    public int intBurnTime; //Number of ticks that the furnace will keep burning
    public int intCurrentItemBurnTime; //Number of ticks that a fresh copy of the currently burning item would keep the furnace burning for
    public int intCookTime; //Number of ticks that the current item has been cooking for
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
        return this.intBurnTime > 0;
    }

    public void updateEntity() {
        upEff = furnaceEfficiencyUpgrade();
        boolean flag = this.intBurnTime > 0;
        boolean flag1 = false;

        if (this.isBurning()) {
            --this.intBurnTime;
        }
        if (!this.worldObj.isRemote) {
            if (this.intBurnTime == 0 && this.canSmelt()) {
                this.intCurrentItemBurnTime = this.intBurnTime = getItemBurnTime(this.slots[1]);

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
                ++this.intCookTime;
                if (this.intCookTime == this.furnaceSpeedUpgrade()) {
                    this.intCookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            } else {
                this.intCookTime = 0;
            }

            if (flag != this.isBurning()) {

                flag1 = true;
                WoodFurnace.updateWoodFurnaceBlockState(this.intBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
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
        if (this.intCurrentItemBurnTime == 0) {
            this.intCurrentItemBurnTime = this.furnaceSpeedUpgrade();
        }

        return this.intBurnTime * i / this.intCurrentItemBurnTime;

    }

    public int getCookProgressScaled(int i) {
        return this.intCookTime * i / this.furnaceSpeedUpgrade();
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
        this.intCurrentItemBurnTime = (int) nbt.getShort("CurrentBurnTime");

        if (nbt.hasKey("CustomName")) {
            this.customName = nbt.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);

        nbt.setShort("BurnTime", (short) this.intBurnTime);
        nbt.setShort("CookTime", (short) this.intCookTime);
        nbt.setShort("CurrentBurnTime", (short) this.intCurrentItemBurnTime);

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
                    this.intBurnTime = this.intBurnTime - 1;
                }else if(item == ShinseiItems.itemPistonBellows) {
                    upSpeed = upSpeed - 100;
                    this.intBurnTime = this.intBurnTime - 3;
                    --this.intCurrentItemBurnTime;
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

