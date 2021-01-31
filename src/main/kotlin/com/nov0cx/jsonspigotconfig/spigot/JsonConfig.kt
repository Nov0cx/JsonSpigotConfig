package com.nov0cx.jsonspigotconfig.spigot

import java.io.File

/*
 * <p>
 * .json isn't need for configName
 * </p>
 */
class JsonConfig() {

    private lateinit var file: File

    companion object Static {
        private lateinit var instance: JsonConfig

        @JvmStatic
        fun get(): JsonConfig {
            return instance
        }
    }

    fun init(pluginName: String, configName: String) {
        file = File("./plugins/$pluginName/$configName.json")
    }
}