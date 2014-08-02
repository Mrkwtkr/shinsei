package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBorax extends BlockShinsei {
    public BlockBorax(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.BORAX);
        this.setHardness(2.0f);
        this.setResistance(3f);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.boraxPowder; }

    @Override
    public int quantityDropped(Random random){
        return (random.nextInt(5) + 2);
    }
}
