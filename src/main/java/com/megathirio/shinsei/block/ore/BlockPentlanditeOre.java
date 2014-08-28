package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockPentlanditeOre extends OreShinsei {
    public BlockPentlanditeOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.PENTLANDITE_ORE);
        this.setHardness(4.0f);
        this.setResistance(8f);
    }
}