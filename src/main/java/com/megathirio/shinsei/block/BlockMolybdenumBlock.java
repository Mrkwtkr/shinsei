package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockMolybdenumBlock extends BlockShinsei {
    public BlockMolybdenumBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.MOLYBDENUM_BLOCK);
        this.setHardness(1.5f);
        this.setResistance(2.4f);
        this.setHarvestLevel("pickaxe", 0);
    }
}
