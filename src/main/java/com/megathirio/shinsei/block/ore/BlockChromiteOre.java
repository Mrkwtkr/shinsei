package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockChromiteOre extends OreShinsei {
    public BlockChromiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.CHROMITE_ORE);
        this.setHardness(8.5f);
        this.setResistance(13.8f);
        this.setHarvestLevel("pickaxe", 3);
    }
}
