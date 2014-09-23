package com.megathirio.shinsei.item;

import com.megathirio.shinsei.reference.Names;
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

	public static ToolMaterial materialCopper = EnumHelper.addToolMaterial(Names.Tools.COPPER_MATERIAL, 2, 150, 7.0F, 1.5F, 20);
    public static ToolMaterial materialStainlessSteel = EnumHelper.addToolMaterial(Names.Tools.STAINLESS_STEEL_MATERIAL, 3, 1000, 8.0F, 2.5F, 14);
    public static ToolMaterial materialSteel = EnumHelper.addToolMaterial(Names.Tools.STEEL_MATERIAL, 2, 400, 7.0F, 1.75F, 12);

}
