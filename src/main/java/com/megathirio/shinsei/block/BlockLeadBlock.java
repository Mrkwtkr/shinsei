package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockLeadBlock extends BlockShinsei {
    public BlockLeadBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.LEAD_BLOCK);
        this.setHardness(2.5F);
        this.setResistance(5.0F);
    }
   
}
