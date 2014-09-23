package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockSilverBlock extends BlockShinsei {
    public BlockSilverBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.SILVER_BLOCK);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
    }
}
