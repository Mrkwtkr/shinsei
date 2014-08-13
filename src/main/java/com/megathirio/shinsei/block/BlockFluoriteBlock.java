package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockFluoriteBlock extends BlockShinsei {
    public BlockFluoriteBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.FLUORITE_BLOCK);
        this.setHardness(4.0f);
        this.setResistance(8f);
        this.setLightLevel(.5F);
    }
   
}
