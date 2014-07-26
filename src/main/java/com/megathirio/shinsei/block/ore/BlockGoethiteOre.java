package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGoethiteOre extends OreShinsei {
    public BlockGoethiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.GOETHITE_ORE);
    }
}
