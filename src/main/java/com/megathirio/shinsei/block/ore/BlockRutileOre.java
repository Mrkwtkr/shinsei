package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockRutileOre extends OreShinsei {
    public BlockRutileOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.RUTILE_ORE);
        this.setHardness(6.0f);
        this.setResistance(10f);
        this.setHarvestLevel("pickaxe", 2);
    }
}