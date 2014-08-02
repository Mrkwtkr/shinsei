package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCinnabarOre extends OreShinsei {
    public BlockCinnabarOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CINNABAR_ORE);
        this.setHardness(2.0f);
        this.setResistance(3f);
        this.setHarvestLevel("pickaxe", 1);
    }
}
