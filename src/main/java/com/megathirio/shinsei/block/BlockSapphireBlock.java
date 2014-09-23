package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockSapphireBlock extends BlockShinsei {
    public BlockSapphireBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.SAPPHIRE_BLOCK);
        this.setHardness(9f);
        this.setResistance(14.6f);
        this.setHarvestLevel("pickaxe", 3);
        this.setLightLevel(.5f);
    }
   
}
