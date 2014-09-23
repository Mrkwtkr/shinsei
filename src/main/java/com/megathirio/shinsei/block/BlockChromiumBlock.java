package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockChromiumBlock extends BlockShinsei {
    public BlockChromiumBlock(){
        super(Material.iron);
        this.setBlockName(Names.Blocks.CHROMIUM_BLOCK);
        this.setHardness(8.5f);
        this.setResistance(13.8f);
        this.setHarvestLevel("pickaxe", 3);
    }
   
}
