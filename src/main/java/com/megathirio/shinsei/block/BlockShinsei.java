package com.megathirio.shinsei.block;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Reference;

import com.megathirio.shinsei.tileentity.TileEntityShinsei;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class BlockShinsei extends Block{

	//Default Block Properties
	public BlockShinsei(Material material){
		
		super(material);

		this.setHardness(3.0f);
		this.setResistance(5f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeStone);
        this.enableStats = true;
        this.setCreativeTab(ShinseiTabs.BLOCKS_TAB);
	}

    public BlockShinsei(){
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public void breakBlock(World world, int intX, int intY, int intZ, Block block, int intMeta){
        dropInventory(world, intX, intY, intZ);
        super.breakBlock(world, intX, intY, intZ, block, intMeta);
    }

    @Override
    public void onBlockPlacedBy(World world, int intX, int intY, int intZ, EntityLivingBase entityLiving, ItemStack istack){
        if (world.getTileEntity(intX, intY, intZ) instanceof TileEntityShinsei){
            int direction = 0;
            int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

            if (facing == 0){
                direction = ForgeDirection.NORTH.ordinal();
            }else if (facing == 1){
                direction = ForgeDirection.EAST.ordinal();
            }else if (facing == 2){
                direction = ForgeDirection.SOUTH.ordinal();
            }else if (facing == 3){
                direction = ForgeDirection.WEST.ordinal();
            }

            if (istack.hasDisplayName()){
                ((TileEntityShinsei) world.getTileEntity(intX, intY, intZ)).setCustomName(istack.getDisplayName());
            }

            ((TileEntityShinsei) world.getTileEntity(intX, intY, intZ)).setOrientation(direction);
        }
    }

    protected void dropInventory(World world, int intX, int intY, int intZ){
        TileEntity tileEntity = world.getTileEntity(intX, intY, intZ);
        if(!(tileEntity instanceof IInventory)){
            return;
        }

        IInventory inventory = (IInventory) tileEntity;

        for (int intI = 0; intI < inventory.getSizeInventory(); intI ++){
            ItemStack istack = inventory.getStackInSlot(intI);

            if (istack != null && istack.stackSize > 0){
                Random rand = new Random();

                float fltDX = rand.nextFloat() + 0.8F + 0.1F;
                float fltDY = rand.nextFloat() + 0.8F + 0.1F;
                float fltDZ = rand.nextFloat() + 0.8F + 0.1F;

                EntityItem entityItem = new EntityItem(world, intX + fltDX, intY + fltDY, intZ + fltDZ, istack.copy());

                if (istack.hasTagCompound()){
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) istack.getTagCompound().copy());
                }

                float fltFactor = 0.5F;
                entityItem.motionX = rand.nextGaussian() * fltFactor;
                entityItem.motionY = rand.nextGaussian() * fltFactor + 0.2F;
                entityItem.motionZ = rand.nextGaussian() * fltFactor;
                world.spawnEntityInWorld(entityItem);
                istack.stackSize =0;
            }
        }
    }

    public boolean isOre(){ return false;}
    public boolean isMachine(){ return false;}
}
