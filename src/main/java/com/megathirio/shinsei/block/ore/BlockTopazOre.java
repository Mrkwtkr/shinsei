package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockTopazOre extends OreShinsei {

    int intQty = 1;

    public BlockTopazOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.TOPAZ_ORE);
        this.setHardness(8f);
        this.setResistance(18f);
        this.setHarvestLevel("pickaxe", 3);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.topazGem; }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            intQty = 2;
        }else {
            intQty = 1;
        }
        return intQty;
    }
}