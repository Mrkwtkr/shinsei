package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSiltstone extends BlockShinsei {

    int intQty = 1;

    public BlockSiltstone(){
        super(Material.rock);
        this.setBlockName(Names.Minerals.SILTSTONE);
        this.setHardness(0.5f);
        this.setResistance(.8f);
        this.setHarvestLevel("pickaxe", 0);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.silt; }

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
