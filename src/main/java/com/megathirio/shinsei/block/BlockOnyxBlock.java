package com.megathirio.shinsei.block;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOnyxBlock extends BlockShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockOnyxBlock(){
        super(Material.rock);
        this.setBlockName(Names.Blocks.ONYX_BLOCK);
        this.setHardness(6.0f);
        this.setResistance(10f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5F);
    }
}
