package com.github.tonymoddinglab.replayfix.core;

import org.lwjglx.Sys;

public class SysShim {

    /**
     * 取得高精度時間（毫秒）
     */
    public static long getTime() {
        return System.currentTimeMillis();
    }

    /**
     * 取得計時器頻率
     */
    public static long getTimerResolution() {
        return 1000L;
    }

    /**
     * 安全開啟網址（用於導向官網下載頁面）
     */
    public static boolean openURL(String url) {
        try {
            Sys.openURL(url);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}