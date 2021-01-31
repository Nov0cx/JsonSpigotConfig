package com.nov0cx.jsonspigotconfig.json

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper

class Json {
    var mapper: ObjectMapper = getObjectMapper()

    private fun getObjectMapper(): ObjectMapper {
        return ObjectMapper()
    }

    fun parse(src: String): JsonNode {
        return mapper.readTree(src)
    }

    fun <T> fromJson(node: JsonNode, clazz: Class<T>): T {
        return mapper.treeToValue(node, clazz)
    }
}