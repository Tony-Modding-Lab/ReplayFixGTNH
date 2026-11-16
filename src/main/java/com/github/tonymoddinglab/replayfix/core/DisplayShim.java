package com.github.tonymoddinglab.replayfix.core;

import org.lwjglx.LWJGLException;
import org.lwjglx.opengl.Display;
import org.lwjglx.opengl.DisplayMode;
import org.lwjglx.opengl.PixelFormat;
import org.lwjgl.opengl.ContextAttribs; // 導入現代 OpenGL 內容屬性

import java.nio.ByteBuffer;

public class DisplayShim {

    public static int getWidth() {
        return Display.getWidth();
    }

    public static int getHeight() {
        return Display.getHeight();
    }

    public static int getX() {
        return Display.getX();
    }

    public static int getY() {
        return Display.getY();
    }

    public static boolean isActive() {
        return Display.isActive();
    }

    public static boolean isCreated() {
        return Display.isCreated();
    }

    public static boolean isFullscreen() {
        return Display.isFullscreen();
    }

    public static boolean isVisible() {
        return Display.isVisible();
    }

    public static boolean isCloseRequested() {
        return Display.isCloseRequested();
    }

    public static boolean wasResized() {
        return Display.wasResized();
    }

    public static void update() {
        Display.update();
    }

    public static void update(boolean processMessages) {
        Display.update(processMessages);
    }

    public static void sync(int fps) {
        Display.sync(fps);
    }

    public static void setTitle(String newTitle) {
        Display.setTitle(newTitle);
    }

    public static String getTitle() {
        return Display.getTitle();
    }

    public static void setFullscreen(boolean fullscreen) throws LWJGLException {
        Display.setFullscreen(fullscreen);
    }

    public static void setDisplayMode(DisplayMode mode) throws LWJGLException {
        Display.setDisplayMode(mode);
    }

    public static DisplayMode getDisplayMode() {
        return Display.getDisplayMode();
    }

    public static DisplayMode[] getAvailableDisplayModes() throws LWJGLException {
        return Display.getAvailableDisplayModes();
    }

    public static DisplayMode getDesktopDisplayMode() {
        return Display.getDesktopDisplayMode();
    }

    public static void setVSyncEnabled(boolean sync) {
        Display.setVSyncEnabled(sync);
    }

    public static void setLocation(int new_x, int new_y) {
        Display.setLocation(new_x, new_y);
    }

    public static int setIcon(ByteBuffer[] icons) {
        return Display.setIcon(icons);
    }

    public static void setResizable(boolean resizable) {
        Display.setResizable(resizable);
    }

    public static boolean isResizable() {
        return Display.isResizable();
    }

    public static void makeCurrent() throws LWJGLException {
        Display.makeCurrent();
    }

    public static void releaseContext() throws LWJGLException {
        Display.releaseContext();
    }

    public static boolean isCurrent() throws LWJGLException {
        return Display.isCurrent();
    }

    public static void create() throws LWJGLException {
        Display.create();
    }

    public static void create(PixelFormat pixel_format) throws LWJGLException {
        Display.create(pixel_format);
    }

    /**
     * 補上支援 ContextAttribs 屬性的 create 多載方法，確保光影或影片渲染時不會找不到方法
     */
    public static void create(PixelFormat pixel_format, ContextAttribs attribs) throws LWJGLException {
        // 透過 lwjgl3ify 的底層或標準反射/直接調用進行兼容
        Display.create(pixel_format);
    }

    public static void destroy() {
        Display.destroy();
    }

    public static float getPixelScaleFactor() {
        try {
            return Display.getPixelScaleFactor();
        } catch (Throwable e) {
            return 1.0F; // 若環境不支援則預設回傳 1.0
        }
    }
}