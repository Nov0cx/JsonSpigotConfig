package com.nov0cx.jsonspigotconfig.example

import com.nov0cx.jsonspigotconfig.spigot.JsonConfig
import org.bukkit.plugin.java.JavaPlugin

class ExampleMain : JavaPlugin() {
    override fun onEnable() {
        JsonConfig.get().init("ExamplePlugin", "Config")
    }

    override fun onDisable() {

    }
}