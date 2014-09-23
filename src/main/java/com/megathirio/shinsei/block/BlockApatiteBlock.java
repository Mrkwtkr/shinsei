package com.megathirio.shinsei.block;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockApatiteBlock extends BlockShinsei {
    public BlockApatiteBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.APATITE_BLOCK);
        this.setHardness(5.0f);
        this.setResistance(10f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
    }
   
}
