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
    int intQty = 0;
    int intDrop = 0;

    public BlockBerylOre() {
        super(Material.rock);
        this.setBlockName(Names.Ores.BERYL_ORE);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intDrop = random.nextInt(3);
        if(intDrop == 0){
            itemDrop = Items.emerald;
        }else if(intDrop == 1){
            itemDrop = ShinseiItems.aquamarineGem;
        }else{
            itemDrop = ShinseiItems.scarletEmeraldGem;
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(2) + 1;
    }
}