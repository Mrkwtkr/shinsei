package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTantalumBlock extends BlockShinsei {
    public BlockTantalumBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.TANTALUM_BLOCK);
        this.setHardness(6.5f);
        this.setResistance(11f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
