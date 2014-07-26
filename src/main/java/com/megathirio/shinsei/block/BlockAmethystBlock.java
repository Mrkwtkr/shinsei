package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAmethystBlock extends BlockShinsei {
    public BlockAmethystBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.AMETHYST_BLOCK);
        this.setLightLevel(.5F);
    }
}
