package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCobaltiteOre extends OreShinsei {
    public BlockCobaltiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.COBALTITE_ORE);
        this.setHardness(5.0f);
        this.setResistance(8.1f);
        this.setHarvestLevel("pickaxe", 2);
    }
}
