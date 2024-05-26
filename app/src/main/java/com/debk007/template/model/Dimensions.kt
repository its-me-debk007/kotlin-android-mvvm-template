package com.debk007.template.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Dimensions(
    @Json(name = "width")
    val width: Double,
    @Json(name = "height")
    val height: Double,
    @Json(name = "depth")
    val depth: Double
)