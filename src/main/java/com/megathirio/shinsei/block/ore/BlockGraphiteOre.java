package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGraphiteOre extends OreShinsei {

    int intQty = 1;

    public BlockGraphiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.GRAPHITE_ORE);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.graphitePowder; }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            intQty = 5;
        }else if(intWeight <= 50){
            intQty = 4;
        }else {
            intQty = 3;
        }
        return intQty;
    }
}
