package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockRubyBlock extends BlockShinsei {
    public BlockRubyBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.RUBY_BLOCK);
        this.setHardness(9f);
        this.setResistance(25f);
        this.setHarvestLevel("pickaxe", 3);
        this.setLightLevel(.5F);
    }
   
}
