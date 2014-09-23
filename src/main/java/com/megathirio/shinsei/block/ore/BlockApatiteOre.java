package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockApatiteOre extends OreShinsei {

    int intQty = 1;

    public BlockApatiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.APATITE_ORE);
        this.setHardness(5.0f);
        this.setResistance(8.1f);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.apatiteCrystal; }


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
