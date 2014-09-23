package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBorax extends BlockShinsei {

    int intQty = 1;

    public BlockBorax(){
        super(Material.rock);
        this.setBlockName(Names.Minerals.BORAX);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.boraxPowder; }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 10){
            intQty = 5;
        }else if(intWeight <= 25){
            intQty = 4;
        }else if(intWeight <= 50){
            intQty = 3;
        }else {
            intQty = 2;
        }
        return intQty;
    }
}
