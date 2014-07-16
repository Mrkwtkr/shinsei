package com.megathirio.shinsei.fluid;

import com.megathirio.shinsei.init.ShinseiFluids;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockSlakedLime extends BlockFluidShinsei{

    public BlockSlakedLime(Fluid fluid, Material material) {
        super(fluid, material);
        this.setBlockName(Names.Fluids.SLAKED_LIME_BLOCK);
    }
}
