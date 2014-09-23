package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockJadeBlock extends BlockShinsei {
    public BlockJadeBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.JADE_BLOCK);
        this.setHardness(7.0f);
        this.setResistance(11.3f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
    }
}
