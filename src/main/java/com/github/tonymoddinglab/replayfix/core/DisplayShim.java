package com.github.tonymoddinglab.replayfix.core;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

import java.nio.IntBuffer;

/**
 * 現代化轉接墊片：用來接管並轉接原本指向舊版 LWJGL 2 Display 的請求
 */
public class DisplayShim {

    public static boolean isCreated() {
        return true;
    }

    public static boolean isCloseRequested() {
        return false;
    }

    public static void update() {
        // 對應現代化視窗更新與交換緩衝區
    }

    private static final IntBuffer VIEWPORT_BUFFER = BufferUtils.createIntBuffer(16);

    public static int getWidth() {
        VIEWPORT_BUFFER.clear();
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, VIEWPORT_BUFFER);
        return VIEWPORT_BUFFER.get(2);
    }

    public static int getHeight() {
        VIEWPORT_BUFFER.clear();
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, VIEWPORT_BUFFER);
        return VIEWPORT_BUFFER.get(3);
    }
    public static void setVSyncEnabled(boolean sync) {
        // 現代化垂直同步由 lwjgl3ify 接管，此處可留空或做相容處理
    }

    public static DisplayMode getDesktopDisplayMode() {
        return new DisplayMode(1920, 1080);
    }

    public static void setDisplayMode(DisplayMode mode) {
        // 視窗模式變更轉接
    }
}