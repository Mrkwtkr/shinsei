package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockArsenicOre extends OreShinsei {
    public BlockArsenicOre(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.ARSENIC_ORE);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){
        return ShinseiItems.arsenicPowder;
    }

    @Override
    public int quantityDropped(Random random){
            return (random.nextInt(4) + 3);
    }

    public boolean isOre(){ return true;}

}
