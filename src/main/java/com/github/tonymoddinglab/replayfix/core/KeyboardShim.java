package com.github.tonymoddinglab.replayfix.core;

import org.lwjglx.input.Keyboard;

public class KeyboardShim {

    public static boolean isKeyDown(int key) {
        return Keyboard.isKeyDown(key);
    }

    public static void enableRepeatEvents(boolean enable) {
        Keyboard.enableRepeatEvents(enable);
    }

    public static boolean next() {
        return Keyboard.next();
    }

    public static boolean getEventKeyState() {
        return Keyboard.getEventKeyState();
    }

    public static int getEventKey() {
        return Keyboard.getEventKey();
    }

    public static char getEventCharacter() {
        return Keyboard.getEventCharacter();
    }

    public static String getKeyName(int key) {
        return Keyboard.getKeyName(key);
    }

    public static int getKeyIndex(String keyName) {
        return Keyboard.getKeyIndex(keyName);
    }

    public static boolean isCreated() {
        return Keyboard.isCreated();
    }
}