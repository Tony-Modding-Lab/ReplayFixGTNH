package com.github.tonymoddinglab.replayfix.core;

import org.lwjglx.Sys;

public class SysShim {

    public static long getTime() {
        return System.currentTimeMillis();
    }

    public static long getTimerResolution() {
        return 1000L;
    }

    public static boolean openURL(String url) {
        try {
            Sys.openURL(url);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 取得作業系統類型（輔助相容判斷）
     */
    public static String getος() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) return "WINDOWS";
        if (os.contains("mac")) return "MACOS";
        if (os.contains("nix") || os.contains("nux") || os.contains("bsd")) return "LINUX";
        return "UNKNOWN";
    }
}