package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTantaliteOre extends OreShinsei {
    public BlockTantaliteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.TANTALITE_ORE);
        this.setHardness(6.5f);
        this.setResistance(11f);
        this.setHarvestLevel("pickaxe", 2);
    }
}