package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBasalt extends BlockShinsei {
    public BlockBasalt(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.BASALT);
        this.setHardness(8.0f);
        this.setResistance(20f);
        this.setHarvestLevel("pickaxe", 2);
    }
    @Override
    public Item getItemDropped(int intX, Random random, int intY) { return Item.getItemFromBlock(ShinseiBlocks.basaltCobble); }

    @Override
    public int quantityDropped(Random random) { return 1; }
}
