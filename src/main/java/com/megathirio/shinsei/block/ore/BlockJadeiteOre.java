package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockJadeiteOre extends OreShinsei {

    int intQty = 1;

    public BlockJadeiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.JADEITE_ORE);
        this.setHardness(7.0f);
        this.setResistance(12f);
        this.setHarvestLevel("pickaxe", 2);
    }
    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.jadeGem; }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            intQty = 3;
        }else {
            intQty = 1;
        }
        return intQty;
    }

}
