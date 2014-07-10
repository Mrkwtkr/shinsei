package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockChalcociteOre extends OreShinsei {
    public BlockChalcociteOre(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.CHALCOCITE_ORE);
        this.setHarvestLevel("pickaxe", 1);
    }

    public boolean isOre(){ return true;}

}
