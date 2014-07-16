package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGranite extends BlockShinsei {
    public BlockGranite(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.GRANITE);
        this.setHardness(1.0F);
        this.setResistance(3.5F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
    }
}
