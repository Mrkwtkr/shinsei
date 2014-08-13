package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockScarletEmeraldBlock extends BlockShinsei {
    public BlockScarletEmeraldBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.SCARLET_EMERALD_BLOCK);
        this.setHardness(7.5f);
        this.setResistance(14f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5F);
    }
   
}
