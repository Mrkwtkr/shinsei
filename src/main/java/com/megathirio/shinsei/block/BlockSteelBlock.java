package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockSteelBlock extends BlockShinsei {
    public BlockSteelBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.STEEL_BLOCK);
        this.setHardness(4.5f);
        this.setResistance(7.3f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
