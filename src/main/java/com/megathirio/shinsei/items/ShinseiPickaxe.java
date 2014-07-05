package com.megathirio.shinsei.items;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class ShinseiPickaxe extends ItemPickaxe {

	//Default Pickaxe Properties
	public ShinseiPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(ShinseiTabs.toolsTab);
	}

	//Sets Pickaxe Texture
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + this.getUnlocalizedName().substring(5));
	}

}