package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBasaltCobble extends BlockShinsei {
    public BlockBasaltCobble() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.BASALT_COBBLE);
        this.setHardness(6.0f);
        this.setResistance(12f);
        this.setHarvestLevel("pickaxe", 3);
    }
}