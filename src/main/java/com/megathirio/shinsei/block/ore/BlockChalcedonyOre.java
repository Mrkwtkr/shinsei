package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockChalcedonyOre extends OreShinsei {

    int intQty = 1;

    public BlockChalcedonyOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CHALCEDONY_ORE);
        this.setHardness(6.0f);
        this.setResistance(10f);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.onyxGem; }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            intQty = 3;
        }else if (intWeight <= 40){
            intQty = 2;
        }else{
            intQty = 1;
        }
        return intQty;
    }

    /*
        @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        int intWeight1 = random.nextInt(100) + 1;
        if (intWeight <= 5) {
            itemDrop = ShinseiItems.onyxGem;
            if (intWeight1 <= 20) {
                intQty = 2;
            } else {
                intQty = 1;
            }
        }else if(intWeight <= 25) {
            itemDrop = Items.emerald;
            if (intWeight1 <= 20) {
                intQty = 2;
            } else {
                intQty = 1;
            }
        }else {
            itemDrop = ShinseiItems.aquamarineGem;
            if (intWeight1 <= 5) {
                intQty = 4;
            } else if (intWeight1 <= 15) {
                intQty = 3;
            } else if (intWeight1 <= 25) {
                intQty = 2;
            } else {
                intQty = 1;
            }
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) { return intQty; }

     */
}
