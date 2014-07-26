package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockLimestone extends BlockShinsei {
    public BlockLimestone(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.LIMESTONE);
    }

}
