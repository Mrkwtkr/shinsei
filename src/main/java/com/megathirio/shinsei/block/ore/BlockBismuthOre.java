package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBismuthOre extends OreShinsei {
    public BlockBismuthOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.BISMUTH_ORE);
        this.setHardness(2.25f);
        this.setResistance(4f);
        this.setHarvestLevel("pickaxe", 1);
    }
}
