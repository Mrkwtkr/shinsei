package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMeteoriteOre extends OreShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockMeteoriteOre(){
        super(Material.rock);
        this.setBlockName(Names.Ores.METEORITE_ORE);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 5){
            itemDrop = ShinseiItems.bariumNugget;
        }else if(intWeight <= 10) {
            itemDrop = ShinseiItems.chromiumNugget;
        }else if(intWeight <= 15) {
            itemDrop = ShinseiItems.cobaltNugget;
        }else if(intWeight <= 20) {
            itemDrop = Items.gold_nugget;
        }else if(intWeight <= 25) {
            itemDrop = ShinseiItems.graphitePowder;
        }else if(intWeight <= 30) {
            itemDrop = ShinseiItems.indiumNugget;
        }else if(intWeight <= 35) {
            itemDrop = ShinseiItems.iridiumNugget;
        }else if(intWeight <= 40) {
            itemDrop = ShinseiItems.platinumNugget;
        }else if(intWeight <= 45) {
            itemDrop = ShinseiItems.silverNugget;
        }else if(intWeight <= 50) {
            itemDrop = ShinseiItems.sulphur;
        }else if(intWeight <= 55) {
            itemDrop = ShinseiItems.uraniumPowder;
        }else if(intWeight <= 75) {
            itemDrop = ShinseiItems.nickelNugget;
        }else{
            itemDrop = ShinseiItems.ironNugget;
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            intQty = 4;
        }else if(intWeight <= 40){
            intQty = 3;
        }else if(intWeight <= 60){
            intQty = 2;
        }else {
            intQty = 1;
        }
        return intQty;
    }
}
