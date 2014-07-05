package com.megathirio.shinsei.network.message;

import com.megathirio.shinsei.tileentity.TileEntityShinsei;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;

public class MessageTileEntityShinsei implements IMessage, IMessageHandler<MessageTileEntityShinsei, IMessage>
{
    public int intX, intY, intZ;
    public byte orientation, state;
    public String customName, owner;

    public MessageTileEntityShinsei()
    {
    }

    public MessageTileEntityShinsei(TileEntityShinsei tileEntityShinsei)
    {
        this.intX = tileEntityShinsei.xCoord;
        this.intY = tileEntityShinsei.yCoord;
        this.intZ = tileEntityShinsei.zCoord;
        this.orientation = (byte) tileEntityShinsei.getOrientation().ordinal();
        this.state = (byte) tileEntityShinsei.getState();
        this.customName = tileEntityShinsei.getCustomName();
        this.owner = tileEntityShinsei.getOwner();
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.intX = buf.readInt();
        this.intY = buf.readInt();
        this.intZ = buf.readInt();
        this.orientation = buf.readByte();
        this.state = buf.readByte();
        int customNameLength = buf.readInt();
        this.customName = new String(buf.readBytes(customNameLength).array());
        int ownerLength = buf.readInt();
        this.owner = new String(buf.readBytes(ownerLength).array());
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(intX);
        buf.writeInt(intY);
        buf.writeInt(intZ);
        buf.writeByte(orientation);
        buf.writeByte(state);
        buf.writeInt(customName.length());
        buf.writeBytes(customName.getBytes());
        buf.writeInt(owner.length());
        buf.writeBytes(owner.getBytes());
    }

    @Override
    public IMessage onMessage(MessageTileEntityShinsei message, MessageContext ctx)
    {
        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.intX, message.intY, message.intZ);

        if (tileEntity instanceof TileEntityShinsei)
        {
            ((TileEntityShinsei) tileEntity).setOrientation(message.orientation);
            ((TileEntityShinsei) tileEntity).setState(message.state);
            ((TileEntityShinsei) tileEntity).setCustomName(message.customName);
            ((TileEntityShinsei) tileEntity).setOwner(message.owner);
        }

        return null;
    }

    @Override
    public String toString()
    {
        return String.format("MessageTileEntityEE - x:%s, y:%s, z:%s, orientation:%s, state:%s, customName:%s, owner:%s", intX, intY, intZ, orientation, state, customName, owner);
    }
}