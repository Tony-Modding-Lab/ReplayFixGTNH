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

    public static boolean getEventButtonState() {
        return Mouse.getEventButtonState();
    }

    public static int getEventButton() {
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

    /**
     * 檢查滑鼠是否在視窗範圍內（避免事件誤判）
     */
    public static boolean isInsideWindow() {
        try {
            return Mouse.isInsideWindow();
        } catch (Throwable e) {
            return true; // 若環境不支援則預設回傳 true
        }
    }
}