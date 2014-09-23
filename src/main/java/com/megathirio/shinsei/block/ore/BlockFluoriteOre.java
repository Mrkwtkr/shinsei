package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockFluoriteOre extends OreShinsei {

    int intQty = 1;

    public BlockFluoriteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.FLUORITE_ORE);
        this.setHardness(4.0f);
        this.setResistance(6.5f);
        this.setLightLevel(.5F);    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.fluoriteCrystal; }


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
