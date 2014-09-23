package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockVanadiumBlock extends BlockShinsei {
    public BlockVanadiumBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.VANADIUM_BLOCK);
        this.setHardness(7.0f);
        this.setResistance(11.3f);
        this.setHarvestLevel("pickaxe", 2);
    }
}
