package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBorniteOre extends OreShinsei {
    public BlockBorniteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.BORNITE_ORE);
        this.setHardness(3f);
        this.setResistance(6f);
    }
}
