package com.megathirio.shinsei.biome.features;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ShinseiLog extends BlockLog {
    public static final String[] logs = new String[] {"sakura", "ume", "momiji", "matsu"};

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list){
        for(int intI =0;intI < logs.length; intI++){
            list.add(new ItemStack(item, 1, intI));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister){
        this.field_150167_a = new IIcon[logs.length]; //side texture
        this.field_150166_b = new IIcon[logs.length]; //top/bot texture

        for(int intI = 0; intI < this.field_150167_a.length; intI++){
            this.field_150167_a[intI] = iconRegister.registerIcon(this.getTextureName() + logs[intI]);
            this.field_150166_b[intI] = iconRegister.registerIcon(this.getTextureName() + logs[intI] + "_top");

        }
    }
}
