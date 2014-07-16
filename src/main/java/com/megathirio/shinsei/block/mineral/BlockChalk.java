package com.megathirio.shinsei.block.mineral;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockChalk extends BlockShinsei {
    public BlockChalk(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.CHALK);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
    }
}
