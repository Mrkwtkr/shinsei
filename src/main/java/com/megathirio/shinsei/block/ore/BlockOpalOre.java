package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockOpalOre extends OreShinsei {
    public BlockOpalOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.OPAL_ORE);
    }
}