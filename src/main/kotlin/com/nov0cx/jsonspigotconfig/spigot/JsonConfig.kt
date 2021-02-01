package com.nov0cx.jsonspigotconfig.spigot

import com.nov0cx.jsonspigotconfig.json.Json
import java.io.File
import java.math.BigDecimal
import java.math.BigInteger

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

    fun writeString(file: File, name: String, value: String) {
        json.writeString(file, name, value)
    }

    fun writeInt(file: File, name: String, value: Int) {
        json.writeInt(file, name, value)
    }

    fun writeFloat(file: File, name: String, value: Float) {
        json.writeFloat(file, name, value)
    }

    fun writeDouble(file: File, name: String, value: Double) {
        json.writeDouble(file, name, value)
    }

    fun writeLong(file: File, name: String, value: Long) {
        json.writeLong(file, name, value)
    }

    fun writeShort(file: File, name: String, value: Short) {
        json.writeShort(file, name, value)
    }

    fun writeByteArray(file: File, name: String, value: ByteArray) {
        json.writeByteArray(file, name, value)
    }

    fun writeBool(file: File, name: String, value: Boolean) {
        json.writeBool(file, name, value)
    }

    fun writeBigDecimal(file: File, name: String, value: BigDecimal) {
        json.writeBigDecimal(file, name, value)
    }

    fun writeBigInteger(file: File, name: String, value: BigInteger) {
        json.writeBigInteger(file, name, value)
    }


}