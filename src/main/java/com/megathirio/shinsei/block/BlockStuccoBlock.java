package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockStuccoBlock extends BlockShinsei {
    public BlockStuccoBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.STUCCO_BLOCK);
        this.setHardness(3.0f);
        this.setResistance(3.2f);
    }
   
}
