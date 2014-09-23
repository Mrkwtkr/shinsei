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

    int intQty = 1;

    public BlockChalk(){
        super(Material.rock);
        this.setBlockName(Names.Minerals.CHALK);
        this.setHardness(3.0f);
        this.setResistance(4.9f);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.chalkPowder; }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            intQty = 4;
        }else if(intWeight <= 50){
            intQty = 3;
        }else {
            intQty = 2;
        }
        return intQty;
    }
}
