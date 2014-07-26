package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockRealgarOre extends OreShinsei {
    public BlockRealgarOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.REALGAR_ORE);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){
        return ShinseiItems.arsenicPowder;
    }

    @Override
    public int quantityDropped(Random random){
            return (random.nextInt(4) + 3);
    }
}
