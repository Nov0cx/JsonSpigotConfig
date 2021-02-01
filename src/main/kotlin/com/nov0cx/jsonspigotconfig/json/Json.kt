package com.nov0cx.jsonspigotconfig.json

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.nov0cx.jsonspigotconfig.exceptions.JsonValueNotFoundException
import java.io.File
import java.math.BigDecimal
import java.math.BigInteger

class Json {
    val mapper: ObjectMapper = getObjectMapper()

    private fun getObjectMapper(): ObjectMapper {
        return ObjectMapper()
    }

    fun parse(src: String): JsonNode {
        return mapper.readTree(src)
    }

    fun writeObject(file: File, any: Any) {
        mapper.writeValue(file, any)
    }

    fun writeString(file: File, name: String, value: String) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeInt(file: File, name: String, value: Int) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeFloat(file: File, name: String, value: Float) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeDouble(file: File, name: String, value: Double) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeLong(file: File, name: String, value: Long) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeShort(file: File, name: String, value: Short) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeByteArray(file: File, name: String, value: ByteArray) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeBool(file: File, name: String, value: Boolean) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeBigDecimal(file: File, name: String, value: BigDecimal) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun writeBigInteger(file: File, name: String, value: BigInteger) {
        val node = mapper.createObjectNode().put(name, value)
        mapper.writeValue(file, node)
    }

    fun read(file: File, name: String): Any {
        val node = mapper.createObjectNode()
        if(node.has(name)) {
            return node.get(name)
        } else {
            throw JsonValueNotFoundException(name, fileName = file.name)
        }
    }

    fun <T> fromJson(node: JsonNode, clazz: Class<T>): T {
        return mapper.treeToValue(node, clazz)
    }
}