package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockGypsum extends BlockShinsei {
    public BlockGypsum(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.GYPSUM);
        this.setHardness(1.0F);
        this.setResistance(3.5F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
    }
}
