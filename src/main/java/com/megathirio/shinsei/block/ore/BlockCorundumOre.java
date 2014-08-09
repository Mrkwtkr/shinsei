package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCorundumOre extends OreShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockCorundumOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CORUNDUM_ORE);
    }
    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        int intWeight1 = random.nextInt(100) + 1;
        if (intWeight <= 25) {
            itemDrop = ShinseiItems.rubyGem;
            if (intWeight1 <= 20) {
                intQty = 2;
            } else {
                intQty = 1;
            }
        }else{
            itemDrop = ShinseiItems.sapphireGem;
            if (intWeight1 <= 20) {
                intQty = 2;
            } else {
                intQty = 1;
            }
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) { return intQty; }
}
