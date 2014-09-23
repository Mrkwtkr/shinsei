package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockSylviteOre extends OreShinsei {
    public BlockSylviteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.SYLVITE_ORE);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
    }
}