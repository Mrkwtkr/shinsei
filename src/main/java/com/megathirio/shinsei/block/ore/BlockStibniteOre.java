package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockStibniteOre extends OreShinsei {
    public BlockStibniteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.STIBNITE_ORE);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
    }
}