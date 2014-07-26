package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSiltstone extends BlockShinsei {
    public BlockSiltstone(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.SILTSTONE);
        this.setHardness(0.5F);
        this.setResistance(1.5F);
        this.setHarvestLevel("pickaxe", 0);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.silt; }

    @Override
    public int quantityDropped(Random random){
        return (random.nextInt(3) + 2);
    }

}
