package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBerylOre extends OreShinsei {
    Item itemDrop = null;
    int intQty = 1;

    public BlockBerylOre() {
        super(Material.rock);
        this.setBlockName(Names.Ores.BERYL_ORE);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 5){
            itemDrop = ShinseiItems.scarletEmeraldGem;
            intQty = 1;
        }else if(intWeight <= 15) {
            itemDrop = Items.emerald;
            intQty = random.nextInt(1) + 1;
        }else {
            itemDrop = ShinseiItems.aquamarineGem;
            intQty = random.nextInt(2) + 1;
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) { return intQty; }
}