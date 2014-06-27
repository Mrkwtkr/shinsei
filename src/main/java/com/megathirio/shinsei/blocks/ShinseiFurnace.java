package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.Main;
import com.megathirio.shinsei.creativetab.ShinseiTabs;
import com.megathirio.shinsei.lib.References;
import com.megathirio.shinsei.tileentity.TileEntityShinseiFurnace;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class ShinseiFurnace extends BlockContainer {

    //Variables
    private final boolean isActive;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;

    @SideOnly(Side.CLIENT)
    private IIcon iconBot;

    @SideOnly(Side.CLIENT)
    private IIcon iconTest;

    public static boolean keepInventory;
    private Random rand = new Random();

    public ShinseiFurnace(boolean booBlockState) {
        super(Material.iron);
        this.setCreativeTab(ShinseiTabs.machinesTab);
        this.isActive = booBlockState;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int intI) { return new TileEntityShinseiFurnace(); }

    //Gets the texture PNGs for all the sides
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){

        this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(6));
        this.iconFront = iconRegister.registerIcon(References.MODID + ":" + (this.isActive ? this.getUnlocalizedName().substring(6) + "_front_acti" : this.getUnlocalizedName().substring(6) + "_front_idle"));
        this.iconTop = iconRegister.registerIcon(References.MODID + ":" + (this.isActive ? this.getUnlocalizedName().substring(6) + "_top_acti" : this.getUnlocalizedName().substring(6) + "_top_idle"));
        this.iconBot = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(6) + "_bot");
        this.iconTest = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(6) + "_test");

    }

    //Sets the textures for multiple sides
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata){
        return side == 4 ? this.iconTest : this.blockIcon;
    }

    public Item getItem(){ return Item.getItemFromBlock(ShinseiMachines.blockShinseiFurnaceIdle); }

    public void onBlockAdded(World world, int x, int y, int z){
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }

    public void setDefaultDirection(World world, int x, int y, int z){
        if (!world.isRemote){

            Block blk1 = world.getBlock(x, y, z - 1);
            Block blk2 = world.getBlock(x, y, z + 1);
            Block blk3 = world.getBlock(x - 1, y, z);
            Block blk4 = world.getBlock(x + 1, y, z);

            byte byt0 = 3;

            if(blk1.func_149730_j() && !blk2.func_149730_j()){ byt0 = 3; }
            if(blk2.func_149730_j() && !blk1.func_149730_j()){ byt0 = 2; }
            if(blk3.func_149730_j() && !blk4.func_149730_j()){ byt0 = 5; }
            if(blk4.func_149730_j() && !blk3.func_149730_j()){ byt0 = 4; }

            world.setBlockMetadataWithNotify(x, y, z, byt0, 2);
        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
            FMLNetworkHandler.openGui(player, Main.instance, ShinseiMachines.guiIDShinseiFurnace, world, x, y, z);
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random){
        if(this.isActive){
            int intDirection = world.getBlockMetadata(x, y, z);

            float fltX1 = (float)x + 0.5F;
            float fltY1 = (float)y + random.nextFloat();
            float fltZ1 = (float)z + 0.5F;

            float fltF = 0.52F;
            float fltF1 = random.nextFloat() * 0.6F - 0.3F;

            if(intDirection == 4){
                world.spawnParticle("smoke", (double)(fltX1 - fltF), (double)(fltY1), (double)(fltZ1 + fltF1), 0D, 0D, 0D);
                world.spawnParticle("flame", (double)(fltX1 - fltF), (double)(fltY1), (double)(fltZ1 + fltF1), 0D, 0D, 0D);
            }
            if(intDirection == 5){
                world.spawnParticle("smoke", (double)(fltX1 + fltF), (double)(fltY1), (double)(fltZ1 + fltF1), 0D, 0D, 0D);
                world.spawnParticle("flame", (double)(fltX1 + fltF), (double)(fltY1), (double)(fltZ1 + fltF1), 0D, 0D, 0D);
            }
            if(intDirection == 2){
                world.spawnParticle("smoke", (double)(fltX1 + fltF1), (double)(fltY1), (double)(fltZ1 - fltF), 0D, 0D, 0D);
                world.spawnParticle("flame", (double)(fltX1 + fltF1), (double)(fltY1), (double)(fltZ1 - fltF), 0D, 0D, 0D);
            }
            if(intDirection == 3){
                world.spawnParticle("smoke", (double)(fltX1 + fltF1), (double)(fltY1), (double)(fltZ1 + fltF), 0D, 0D, 0D);
                world.spawnParticle("flame", (double)(fltX1 + fltF1), (double)(fltY1), (double)(fltZ1 + fltF), 0D, 0D, 0D);
            }
        }
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityPlayer, ItemStack itemStack){
        int l = MathHelper.floor_double((double) (entityPlayer.rotationYaw * 4.0F / 360.F) + 0.5D) & 3;

        if(l == 0){
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if(l == 1){
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if(l == 2){
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if(l == 3){
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

//        if(itemStack.hasDisplayName()){
//            ((TileEntityShinseiFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(itemStack.getDisplayName());
//        }
    }

    public static void updateWoodFurnaceBlockState(boolean active, World worldObj, int xCoord, int yCoord, int zCoord) {

        int i = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);

        TileEntity tileEntity = worldObj.getTileEntity(xCoord, yCoord, zCoord);
        keepInventory = true;

        if(active){
            worldObj.setBlock(xCoord, yCoord, zCoord, ShinseiMachines.blockShinseiFurnaceActi);
        }else{
            worldObj.setBlock(xCoord, yCoord, zCoord, ShinseiMachines.blockShinseiFurnaceIdle);

        }

        keepInventory = false;
        worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);

        if(tileEntity != null){
            tileEntity.validate();
            worldObj.setTileEntity(xCoord, yCoord, zCoord, tileEntity);
        }
    }

    public void breakBlock(World world, int x, int y, int z, Block oldBlock, int oldMetadata){

        if(!keepInventory){
            TileEntityShinseiFurnace tileEntity = (TileEntityShinseiFurnace) world.getTileEntity(x, y, z);

            if(tileEntity != null){

                for(int i = 0; i < tileEntity.getSizeInventory(); i++){

                    ItemStack itemStack = tileEntity.getStackInSlot(i);

                    if(itemStack != null){
                        float fltF = this.rand.nextFloat() * 0.8F + 0.1F;
                        float fltF1 = this.rand.nextFloat() * 0.8F + 0.1F;
                        float fltF2 = this.rand.nextFloat() * 0.8F + 0.1F;

                        while(itemStack.stackSize > 0){

                            int j = this.rand.nextInt(21) + 10;

                            if(j > itemStack.stackSize){
                                j = itemStack.stackSize;
                            }

                            itemStack.stackSize -= j;

                            EntityItem item = new EntityItem(world, (double)((float)x + fltF), (double)((float)y + fltF1), (double)((float)z + fltF2), new ItemStack(itemStack.getItem(), j, itemStack.getItemDamage()));

                            if(itemStack.hasTagCompound()){
                                item.getEntityItem().setTagCompound((NBTTagCompound)itemStack.getTagCompound().copy());
                            }

                            world.spawnEntityInWorld(item);
                        }
                    }
                }

                world.func_147453_f(x, y, z, oldBlock);
            }
        }

        super.breakBlock(world, x, y, z, oldBlock, oldMetadata);
    }

    public Item getItem(World world, int x, int y, int z){

        return Item.getItemFromBlock(ShinseiMachines.blockShinseiFurnaceIdle);
    }
}
