package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockChalcopyriteOre extends OreShinsei {
    public BlockChalcopyriteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CHALCOPYRITE_ORE);
        this.setHardness(3.5f);
        this.setResistance(5.7f);
    }
}
