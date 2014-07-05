package com.megathirio.shinsei.items;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class ShinseiHoe extends ItemHoe {

	//Default Hoe Properties
	public ShinseiHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(ShinseiTabs.toolsTab);
	}

	//Sets Hoe Texture
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + this.getUnlocalizedName().substring(5));
	}

}
