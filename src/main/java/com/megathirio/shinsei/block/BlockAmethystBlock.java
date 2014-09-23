package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAmethystBlock extends BlockShinsei {
    public BlockAmethystBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.AMETHYST_BLOCK);
        this.setHardness(7.0f);
        this.setResistance(11.3f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
        this.setLightOpacity(5);
    }
}
