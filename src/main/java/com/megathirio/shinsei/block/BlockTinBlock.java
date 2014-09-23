package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTinBlock extends BlockShinsei {
    public BlockTinBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.TIN_BLOCK);
        this.setHardness(7.0f);
        this.setResistance(11.3f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
