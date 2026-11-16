package com.github.tonymoddinglab.replayfix.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraftforge.client.event.GuiScreenEvent;

public class ReplayButtonInjector {

    @SubscribeEvent
    public void onInitGui(GuiScreenEvent.InitGuiEvent.Post event) {
        // 在主選單或遊戲暫停選單中強制加入重播按鈕
        if (event.gui instanceof GuiMainMenu || event.gui instanceof GuiIngameMenu) {
            // ID 設定為一個不衝突的數字（例如 9999），並指定按鈕文字與座標
            // 實際位置與寬高可以根據選單畫面微調
            int buttonWidth = 200;
            int buttonHeight = 20; // 依需求調整
            int x = event.gui.width / 2 - 100;
            int y = event.gui.height / 4 + 48 + 72; // 放在合適的空位

            event.buttonList.add(new GuiButton(9999, x, y, "Replays (重播專區)"));
        }
    }

    @SubscribeEvent
    public void onActionPerformed(GuiScreenEvent.ActionPerformedEvent.Pre event) {
        // 當玩家點擊我們新增的按鈕時觸發
        if (event.button.id == 9999) {
            // 觸發開啟 ReplayMod 的重播選單畫面
            // com.replaymod.replay.ReplayModReplay.instance.openReplayGui();
            // 這裡可以呼叫 ReplayMod 對應的 GUI 開啟方法
        }
    }
}