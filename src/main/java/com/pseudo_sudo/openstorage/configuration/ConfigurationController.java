package com.pseudo_sudo.openstorage.configuration;

import com.pseudo_sudo.openstorage.OpenStorage;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationController {
    private Configuration configuration;

    public ConfigurationController(File configFile) {
        this.configuration = new Configuration(configFile);
        this.loadConfiguration();

        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equals(OpenStorage.ID)) {
            this.loadConfiguration();
        }
    }

    private void loadConfiguration() {
        if (this.configuration.hasChanged()) {
            this.configuration.save();
        }
    }
}
