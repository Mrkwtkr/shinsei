package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockMagnesiumBlock extends BlockShinsei {
    public BlockMagnesiumBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.MAGNESIUM_BLOCK);
        this.setHardness(3.5f);
        this.setResistance(5.7f);
    }
   
}
