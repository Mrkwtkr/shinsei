package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockScheeliteOre extends OreShinsei {
    public BlockScheeliteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.SCHEELITE_ORE);
    }
}