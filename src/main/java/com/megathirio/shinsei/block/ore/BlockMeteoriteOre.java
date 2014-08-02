package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMeteoriteOre extends OreShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockMeteoriteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.METEORITE_ORE);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 5){
            itemDrop = ShinseiItems.bariumNugget;
            intQty = random.nextInt(5) + 1;
        }else if(intWeight <= 10) {
            itemDrop = ShinseiItems.silverNugget;
            intQty = random.nextInt(5) + 1;
        }else if(intWeight <= 15) {
            itemDrop = ShinseiItems.cobaltNugget;
            intQty = random.nextInt(5) + 1;
        }else {
            itemDrop = ShinseiItems.chromiumNugget;
            intQty = random.nextInt(5) + 1;
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) { return intQty; }

}
