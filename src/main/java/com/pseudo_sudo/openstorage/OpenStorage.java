package com.pseudo_sudo.openstorage;

import com.pseudo_sudo.openstorage.configuration.ConfigurationController;
import com.pseudo_sudo.openstorage.init.ModBlocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=OpenStorage.ID, name=OpenStorage.NAME, version=OpenStorage.VERSION)
public class OpenStorage {
    public static final String ID = "OpenStorage";
    public static final String ID_LOWER = ID.toLowerCase();
    public static final String NAME = "OpenStorage";
    public static final String VERSION = "1.7.10-0.1";

    private ConfigurationController configurationController;

    @Mod.Instance(OpenStorage.ID)
    public static OpenStorage instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        this.configurationController = new ConfigurationController(event.getSuggestedConfigurationFile());

        ModBlocks.init();
    }
}
