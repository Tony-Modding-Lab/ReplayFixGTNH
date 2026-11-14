package com.github.tonymoddinglab.replayfix.client;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraftforge.client.event.GuiOpenEvent;
import org.lwjgl.Sys;

public class MissingModNotifier implements GuiYesNoCallback {

    private static boolean hasShownWarning = false;
    private GuiScreen parentMenu;

    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {
        if (!hasShownWarning && event.gui instanceof GuiMainMenu) {
            if (!Loader.isModLoaded("replaymod")) {
                hasShownWarning = true;
                this.parentMenu = event.gui;

                event.gui = new GuiYesNo(
                        this,
                        "§e[ReplayFixGTNH] 尚未安裝 ReplayMod 本體（請至官網最下方下載 1.7.10 版）",
                        "§7錄影相容補丁已自動安全停用，不影響正常遊玩 GTNH！",
                        "前往下載頁面",
                        "我知道了，繼續遊戲",
                        0
                );
            }
        }
    }

    @Override
    public void confirmClicked(boolean result, int id) {
        if (result) {
            Sys.openURL("https://www.replaymod.com/download/");
        }
        Minecraft.getMinecraft().displayGuiScreen(this.parentMenu);
    }
}
