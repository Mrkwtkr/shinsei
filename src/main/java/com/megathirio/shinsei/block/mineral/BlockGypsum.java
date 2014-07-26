package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGypsum extends BlockShinsei {
    public BlockGypsum(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.GYPSUM);
        this.setHardness(1.5F);
        this.setResistance(2.0F);
        this.setHarvestLevel("pickaxe", 0);
    }
    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.gypsumPowder; }

    @Override
    public int quantityDropped(Random random){
        return (random.nextInt(6) + 3);
    }
}
