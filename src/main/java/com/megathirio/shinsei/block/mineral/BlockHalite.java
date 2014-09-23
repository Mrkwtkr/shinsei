package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockHalite extends BlockShinsei {

    int intQty = 1;

    public BlockHalite(){
        super(Material.rock);
        this.setBlockName(Names.Minerals.HALITE);
        this.setHardness(2.5F);
        this.setResistance(4.0f);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.salt; }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 10){
            intQty = 6;
        }else if(intWeight <= 25){
            intQty = 5;
        }else if(intWeight <= 50){
            intQty = 4;
        }else {
            intQty = 3;
        }
        return intQty;
    }
}
