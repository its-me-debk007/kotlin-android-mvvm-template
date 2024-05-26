package com.debk007.template.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Meta(
    @Json(name = "createdAt")
    val createdAt: String,
    @Json(name = "updatedAt")
    val updatedAt: String,
    @Json(name = "barcode")
    val barcode: String,
    @Json(name = "qrCode")
    val qrCode: String
)