package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCobaltiteOre extends OreShinsei {
    public BlockCobaltiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CHROMITE_ORE);
        this.setHarvestLevel("pickaxe", 1);
    }

    public boolean isOre(){ return true;}

}