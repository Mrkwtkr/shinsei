package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGypsum extends BlockShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockGypsum(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.GYPSUM);
        this.setHardness(1.5F);
        this.setResistance(2.0F);
        this.setHarvestLevel("pickaxe", 0);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 10) {
            itemDrop = ShinseiItems.calciumPowder;
                intQty = random.nextInt(3) + 2;
        }else {
            itemDrop = ShinseiItems.gypsumPowder;
            intQty = random.nextInt(4) + 3;
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) { return intQty; }
}
