package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockHalite extends OreShinsei {
    public BlockHalite(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.HALITE);
        this.setHardness(1.0F);
        this.setResistance(3.5F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){ return ShinseiItems.salt; }

    @Override
    public int quantityDropped(Random random){
        return (random.nextInt(4) + 3);
    }

    public boolean isOre(){ return true;}

}
