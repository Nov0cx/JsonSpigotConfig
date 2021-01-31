package com.nov0cx.jsonspigotconfig.example;

import com.nov0cx.jsonspigotconfig.spigot.JsonConfig;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleJava extends JavaPlugin {
    @Override
    public void onEnable() {
        JsonConfig.get().init("ExamplePlugin", "Config");

    }

    @Override
    public void onDisable() {

    }
}
