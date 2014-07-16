package com.megathirio.shinsei.fluid;

import com.megathirio.shinsei.init.ShinseiFluids;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class BucketSlakedLime extends BucketShinsei {
    public BucketSlakedLime(Block block) {
        super(block);

        this.setUnlocalizedName(Names.Fluids.SLAKED_LIME_BUCKET);
    }
}
