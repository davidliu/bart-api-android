package com.davidliu.bartapi.gson

import com.google.gson.*
import java.lang.reflect.Type

class IntegerSerializer : JsonSerializer<Int>, JsonDeserializer<Int> {

    override fun serialize(arg0: Int?, arg1: Type, arg2: JsonSerializationContext): JsonElement =
        when (arg0 == null) {
            true -> JsonNull.INSTANCE
            false -> JsonPrimitive(arg0)
        }

    @Throws(JsonParseException::class)
    override fun deserialize(arg0: JsonElement, arg1: Type, arg2: JsonDeserializationContext): Int? {
        if (arg0.isJsonPrimitive
            && arg0.asJsonPrimitive.isString
            && arg0.asString.equals("Leaving", false)
        ) {
            return 0
        }
        return arg0.asInt
    }
}