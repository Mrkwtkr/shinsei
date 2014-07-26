package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockChalk extends BlockShinsei {
    public BlockChalk(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.CHALK);
        this.setHardness(3.0f);
        this.setResistance(5f);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.chalkPowder; }

    @Override
    public int quantityDropped(Random random){
        return (random.nextInt(3) + 2);
    }
}
