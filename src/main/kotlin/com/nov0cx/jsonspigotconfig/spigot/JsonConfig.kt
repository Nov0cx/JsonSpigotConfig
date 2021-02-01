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
        if(!file.exists())
            file.createNewFile()
    }

    fun writeClass(clazz: Class<Any>) {
        json.writeObject(file, clazz)
    }

    fun writeString(name: String, value: String) {
        json.writeString(file, name, value)
    }

    fun writeInt(name: String, value: Int) {
        json.writeInt(file, name, value)
    }

    fun writeFloat(name: String, value: Float) {
        json.writeFloat(file, name, value)
    }

    fun writeDouble(name: String, value: Double) {
        json.writeDouble(file, name, value)
    }

    fun writeLong(name: String, value: Long) {
        json.writeLong(file, name, value)
    }

    fun writeShort(name: String, value: Short) {
        json.writeShort(file, name, value)
    }

    fun writeByteArray(name: String, value: ByteArray) {
        json.writeByteArray(file, name, value)
    }

    fun writeBool(name: String, value: Boolean) {
        json.writeBool(file, name, value)
    }

    fun writeBigDecimal(name: String, value: BigDecimal) {
        json.writeBigDecimal(file, name, value)
    }

    fun writeBigInteger(name: String, value: BigInteger) {
        json.writeBigInteger(file, name, value)
    }

    fun readAny(name: String): Any {
        return json.read(file, name)
    }

    fun readAnyArray(name: String): Array<*> {
        val result = json.read(file, name)
        if(result is Array<*>) {
            return result
        }
        throw Exception("The value $name isn't an Array!")
    }

    fun readInt(name: String): Int {
        val result = json.read(file, name)
        if(result is Int) {
            return result
        }
        throw Exception("The value $name isn't an Int!")
    }

    fun readLong(name: String): Long {
        val result = json.read(file, name)
        if(result is Long) {
            return result
        }
        throw Exception("The value $name isn't an Long!")
    }

    fun readShort(name: String): Short {
        val result = json.read(file, name)
        if(result is Short) {
            return result
        }
        throw Exception("The value $name isn't an Short!")
    }

    fun readByte(name: String): Byte {
        val result = json.read(file, name)
        if(result is Byte) {
            return result
        }
        throw Exception("The value $name isn't an Byte!")
    }

    fun readFloat(name: String): Float {
        val result = json.read(file, name)
        if(result is Float) {
            return result
        }
        throw Exception("The value $name isn't an Float!")
    }

    fun readDouble(name: String): Double {
        val result = json.read(file, name)
        if(result is Double) {
            return result
        }
        throw Exception("The value $name isn't an Double!")
    }
}