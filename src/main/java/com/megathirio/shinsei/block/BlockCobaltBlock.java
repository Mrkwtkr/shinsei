package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCobaltBlock extends BlockShinsei {
    public BlockCobaltBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.COBALT_BLOCK);
        this.setHardness(5.0f);
        this.setResistance(8.1f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
