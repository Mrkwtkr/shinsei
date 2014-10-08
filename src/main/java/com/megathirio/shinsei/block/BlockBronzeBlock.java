package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBronzeBlock extends BlockShinsei {
    public BlockBronzeBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.BRONZE_BLOCK);
    }
}
