package com.github.tonymoddinglab.replayfix.core;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.7.10")

 // 搶在最早期載入，確保 ASM 轉換器優先生效
@IFMLLoadingPlugin.TransformerExclusions({"com.github.tonymoddinglab.replayfix.core."})
public class ReplayFixLoadingPlugin implements IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{"com.github.tonymoddinglab.replayfix.core.ReplayFixTransformer"};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}