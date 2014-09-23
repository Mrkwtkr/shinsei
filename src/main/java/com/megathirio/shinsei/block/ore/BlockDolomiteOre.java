package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockDolomiteOre extends OreShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockDolomiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.DOLOMITE_ORE);
        this.setHardness(3.5f);
        this.setResistance(5.7f);
    }
}
