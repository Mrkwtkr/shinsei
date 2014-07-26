package com.megathirio.shinsei.block;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAluminumBlock extends BlockShinsei {
    public BlockAluminumBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.ALUMINUM_BLOCK);
    }
   
}
