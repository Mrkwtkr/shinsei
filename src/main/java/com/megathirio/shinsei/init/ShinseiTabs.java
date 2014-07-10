package com.megathirio.shinsei.init;

import com.megathirio.shinsei.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShinseiTabs {
    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.blockCopper);
        }
    };

    public static final CreativeTabs ORES_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.borniteOre);
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ShinseiItems.scarletEmeraldGem;
        }
    };

    public static final CreativeTabs POWDERS_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ShinseiItems.arsenicPowder;
        }
    };

    public static final CreativeTabs MACHINES_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.blockAluminum);
        }
    };

    public static final CreativeTabs TOOLS_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ShinseiItems.copperPickaxe;
        }
    };

    public static final CreativeTabs LIQUIDS_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ShinseiItems.slakedLime;
        }
    };

}