package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBismuthOre extends OreShinsei {
    public BlockBismuthOre(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.BISMUTH_ORE);
        this.setHarvestLevel("pickaxe", 1);
    }

    public boolean isOre(){ return true;}

}
