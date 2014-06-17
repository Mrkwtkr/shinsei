package com.megathirio.shinsei.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ShinseiMaterials {
	
	//Materials
	/* 
	 * eg.("name", harvestLevel[int], maxUses[int], efficiency[float], damage[float], enchantability[int])
		Harvest levels: Wood:0; Stone:1; Iron:2; Diamond:3; Gold:0
		maxUses: Wood:59; Stone:131; Iron:250; Diamond:1561; Gold:32
		efficiency: Wood:2.0F; Stone:4.0F; Iron:6.0F; Diamond:8.0F; Gold:12.0F
		damage: Wood:0.0F; Stone:1.0F; Iron:2.0F; Diamond:3.0F; Gold:0.0F
		enchantability: Wood:15; Stone:5; Iron:14; Diamond:10; Gold:22
	*/

	public static ToolMaterial materialAluminum = EnumHelper.addToolMaterial("materialAluminum", 2, 175, 5.0F, 1.5F, 16);
    public static ToolMaterial materialBismuth = EnumHelper.addToolMaterial("materialBismuth", 1, 500, 2.0F, 1.0F, 5);
	public static ToolMaterial materialCopper = EnumHelper.addToolMaterial("materialCopper", 2, 200, 6.0F, 1.5F, 16);

}
