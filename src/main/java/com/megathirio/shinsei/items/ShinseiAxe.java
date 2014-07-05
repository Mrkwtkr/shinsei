package com.megathirio.shinsei.items;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class ShinseiAxe extends ItemAxe {

	//Default Axe Properties
	public ShinseiAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(ShinseiTabs.toolsTab);
	}

	
	//Set Axe Texture
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + this.getUnlocalizedName().substring(5));
	}

}
