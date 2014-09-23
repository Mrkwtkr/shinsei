package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockZincBlock extends BlockShinsei {
    public BlockZincBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.ZINC_BLOCK);
        this.setHardness(3.5f);
        this.setResistance(4.9f);
    }
   
}
