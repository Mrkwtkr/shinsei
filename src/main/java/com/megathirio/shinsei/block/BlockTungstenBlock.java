package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTungstenBlock extends BlockShinsei {
    public BlockTungstenBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.TUNGSTEN_BLOCK);
        this.setHardness(5.0f);
        this.setResistance(8.1f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
