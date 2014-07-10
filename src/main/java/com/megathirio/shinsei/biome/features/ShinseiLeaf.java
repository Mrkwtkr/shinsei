package com.megathirio.shinsei.biome.features;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class ShinseiLeaf extends BlockLeaves{

    public static final String[][] leaftypes = new String[][] {{"leaf_sakura", "leaf_ume", "leaf_momiji", "leaf_matsu"}, {"leaf_sakura_opaque", "leaf_ume_opaque", "leaf_momiji_opaque", "leaf_matsu_opaque"}};
    public static final String[] leaves = new String[]{"sakura", "ume", "momiji", "matsu"};

    protected void func_150124_c(World world, int intX, int intY, int intZ, int intSide, int intMeta)
    {
        if ((intSide & 3) == 1 && world.rand.nextInt(intMeta) == 0)
        {
            this.dropBlockAsItem(world, intX, intY, intZ, new ItemStack(Items.apple, 1, 0));
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int intI)
    {
        return super.damageDropped(intI) + 4;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World world, int intX, int intY, int intZ)
    {
        return world.getBlockMetadata(intX, intY, intZ) & 3;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int intSide, int intMeta)
    {
        return (intMeta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : this.field_150129_M[this.field_150127_b][0];
    }

    /**
     * returns a list of block with the same ID, but different meta (eg: wood returns 4 block)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for(int intI =0;intI < leaves.length; intI++){
            list.add(new ItemStack(item, 1, intI));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < leaftypes.length; ++i)
        {
            this.field_150129_M[i] = new IIcon[leaftypes[i].length];

            for (int j = 0; j < leaftypes[i].length; ++j)
            {
                this.field_150129_M[i][j] = iconRegister.registerIcon(leaftypes[i][j]);
            }
        }
    }

    @Override
    public String[] func_150125_e() {
        return leaves;
    }
}
