package com.github.tonymoddinglab.replayfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ReplayFixGTNH.MODID, name = ReplayFixGTNH.NAME, version = ReplayFixGTNH.VERSION)
public class ReplayFixGTNH {
    public static final String MODID = "replayfixgtnh";
    public static final String NAME = "ReplayFixGTNH";
    public static final String VERSION = "1.0.0-GTNH";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Initializing ReplayFixGTNH for GTNH 2.9 LWJGL3 environment...");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info("ReplayFixGTNH loaded successfully.");
    }
}