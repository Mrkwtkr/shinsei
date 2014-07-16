package com.megathirio.shinsei.init;

import com.megathirio.shinsei.fluid.*;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class ShinseiFluids {

    public static FluidShinsei slakedLimeFluid;
    public static BlockFluidShinsei slakedLimeBlock;
    public static BucketShinsei slakedLimeBucket = new BucketSlakedLime(ShinseiFluids.slakedLimeBlock);
    public static void init(){
    //Fluid Registration
        slakedLimeFluid = new FluidSlakedLime();

        //Fluid Bucket Registration
        GameRegistry.registerItem(slakedLimeBucket, Names.Fluids.SLAKED_LIME_BUCKET);

        //Fluid Block Registration
        slakedLimeBlock = new BlockSlakedLime(ShinseiFluids.slakedLimeFluid, Material.water);
        GameRegistry.registerBlock(slakedLimeBlock, Names.Fluids.SLAKED_LIME_BLOCK);

    }

}
