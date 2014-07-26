package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAcanthiteOre extends OreShinsei {
    public BlockAcanthiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.ACANTHITE_ORE);
        this.setHardness(2.0f);
        this.setResistance(3f);
        this.setHarvestLevel("pickaxe", 1);
    }
}
