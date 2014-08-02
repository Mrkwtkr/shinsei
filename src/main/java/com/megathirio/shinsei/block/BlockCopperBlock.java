package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCopperBlock extends BlockShinsei {
    public BlockCopperBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.COPPER_BLOCK);
    }
   
}
