package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockDolomiteOre extends OreShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockDolomiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.DOLOMITE_ORE);
        this.setHardness(3.5f);
        this.setResistance(7f);
    }
    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20) {
            itemDrop = ShinseiItems.calciumPowder;
            intQty = random.nextInt(4) + 2;
        }else {
            itemDrop = Item.getItemFromBlock(this);
            intQty = 1;
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) { return intQty; }
}
