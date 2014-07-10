package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockClaystone extends OreShinsei {
    public BlockClaystone(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.CLAYSTONE);
        this.setHardness(0.5F);
        this.setResistance(1.5F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 0);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY){
        return Items.clay_ball;
    }

    @Override
    public int quantityDropped(Random random){
        return (random.nextInt(3) + 2);
    }

    public boolean isOre(){ return true;}

}
