package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCryoliteOre extends OreShinsei {
    public BlockCryoliteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CRYOLITE_ORE);
        this.setHarvestLevel("pickaxe", 1);
    }

    public boolean isOre(){ return true;}

}