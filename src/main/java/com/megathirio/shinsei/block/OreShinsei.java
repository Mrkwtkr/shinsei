package com.megathirio.shinsei.block;

import com.megathirio.shinsei.init.ShinseiTabs;
import net.minecraft.block.material.Material;

public class OreShinsei extends BlockShinsei{

	//Default Block Properties
	public OreShinsei(Material material){
		
		super(material);

		this.setHardness(1f);
		this.setResistance(3f);
	    this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
        this.setCreativeTab(ShinseiTabs.ORES_TAB);
        this.enableStats = true;

	}
}
