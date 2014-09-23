package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockIlmeniteOre extends OreShinsei {
    public BlockIlmeniteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.ILMENITE_ORE);
        this.setHardness(6.0f);
        this.setResistance(9.7f);
        this.setHarvestLevel("pickaxe", 2);
    }
}
