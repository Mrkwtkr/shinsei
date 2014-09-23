package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockRealgarOre extends OreShinsei {
    public BlockRealgarOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.REALGAR_ORE);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
    }
}
