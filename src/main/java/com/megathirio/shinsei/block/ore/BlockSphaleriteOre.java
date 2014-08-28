package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockSphaleriteOre extends OreShinsei {
    public BlockSphaleriteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.SPHALERITE_ORE);
        this.setHardness(3.5f);
        this.setResistance(7f);
    }
}