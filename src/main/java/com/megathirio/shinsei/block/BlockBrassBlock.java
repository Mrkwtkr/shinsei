package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBrassBlock extends BlockShinsei {
    public BlockBrassBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.BRASS_BLOCK);
        this.setHardness(4.0f);
        this.setResistance(6.5f);
    }
}
