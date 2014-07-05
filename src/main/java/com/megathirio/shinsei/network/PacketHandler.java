package com.megathirio.shinsei.network;

import com.megathirio.shinsei.network.message.MessageTileEntityShinsei;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID.toLowerCase());

    public static void init(){
        INSTANCE.registerMessage(MessageTileEntityShinsei.class, MessageTileEntityShinsei.class, 0, Side.CLIENT);
//        INSTANCE.registerMessage(MessageKeyPressed.class, MessageKeyPressed.class, 4, Side.SERVER);
    }
}
