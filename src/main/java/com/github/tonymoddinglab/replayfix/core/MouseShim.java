package com.github.tonymoddinglab.replayfix.core;

import org.lwjglx.input.Mouse;

public class MouseShim {

    public static boolean isButtonDown(int button) {
        return Mouse.isButtonDown(button);
    }

    public static int getX() {
        return Mouse.getX();
    }

    public static int getY() {
        return Mouse.getY();
    }

    public static int getDX() {
        return Mouse.getDX();
    }

    public static int getDY() {
        return Mouse.getDY();
    }

    public static int getDWheel() {
        return Mouse.getDWheel();
    }

    public static boolean next() {
        return Mouse.next();
    }

    public static boolean getEventButton() {
        return Mouse.getEventButtonState(); // 相容舊版事件狀態查詢
    }

    public static int getEventButtonState() {
        return Mouse.getEventButton();
    }

    public static int getEventX() {
        return Mouse.getEventX();
    }

    public static int getEventY() {
        return Mouse.getEventY();
    }

    public static int getEventDWheel() {
        return Mouse.getEventDWheel();
    }

    public static long getEventNanoseconds() {
        return Mouse.getEventNanoseconds();
    }

    public static boolean isCreated() {
        return Mouse.isCreated();
    }

    public static void setGrabbed(boolean grabbed) {
        Mouse.setGrabbed(grabbed);
    }

    public static boolean isGrabbed() {
        return Mouse.isGrabbed();
    }

    public static void setCursorPosition(int new_x, int new_y) {
        Mouse.setCursorPosition(new_x, new_y);
    }
}