package com.megathirio.shinsei.core.client.handler;

import com.megathirio.shinsei.core.client.settings.KeyBindings;
import com.megathirio.shinsei.reference.Key;
import com.megathirio.shinsei.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


public class KeyInputEventHandler {

    private static Key getPressedKeyBinding(){

        if(KeyBindings.charge.isPressed()){
            return Key.CHARGE;
        }else if(KeyBindings.release.isPressed()){
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){

        LogHelper.info(getPressedKeyBinding());
    }
}
