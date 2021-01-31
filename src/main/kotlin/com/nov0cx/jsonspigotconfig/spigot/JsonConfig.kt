package com.nov0cx.jsonspigotconfig.spigot

import com.nov0cx.jsonspigotconfig.json.Json
import java.io.File

/*
 * <p>
 * .json isn't need for configName
 * </p>
 */
class JsonConfig() {

    private lateinit var file: File
    private var json: Json = Json()

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

    fun writeClass(clazz: Class<Any>) {
        json.writeObject(file, clazz)
    }

}