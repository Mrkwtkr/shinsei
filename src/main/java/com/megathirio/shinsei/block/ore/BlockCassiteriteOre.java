package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCassiteriteOre extends OreShinsei {
    public BlockCassiteriteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CASSITERITE_ORE);
        this.setHardness(7.0f);
        this.setResistance(11.3f);
        this.setHarvestLevel("pickaxe", 2);
    }
}
