package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockManganeseBlock extends BlockShinsei {
    public BlockManganeseBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.MANGANESE_BLOCK);
        this.setHardness(6.0f);
        this.setResistance(9.7f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
