package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAquamarineBlock extends BlockShinsei {
    public BlockAquamarineBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.AQUAMARINE_BLOCK);
        this.setHardness(7.5f);
        this.setResistance(12.1f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
    }
   
}
