package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTitaniumBlock extends BlockShinsei {
    public BlockTitaniumBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.TITANIUM_BLOCK);
        this.setHardness(6.0f);
        this.setResistance(10f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
