package com.nov0cx.jsonspigotconfig.exceptions

class JsonValueNotFoundException(valueName: String, fileName: String) : Exception() {
    init {
        initCause(Throwable("Cannot find the value $valueName in the file $fileName."))
    }
}