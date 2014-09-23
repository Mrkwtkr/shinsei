package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTurquoiseBlock extends BlockShinsei {
    public BlockTurquoiseBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.TURQUOISE_BLOCK);
        this.setHardness(6.0f);
        this.setResistance(9.7f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
    }
   
}
