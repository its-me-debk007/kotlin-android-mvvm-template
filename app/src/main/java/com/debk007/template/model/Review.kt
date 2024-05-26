package com.debk007.template.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Review(
    @Json(name = "rating")
    val rating: Int,
    @Json(name = "comment")
    val comment: String,
    @Json(name = "date")
    val date: String,
    @Json(name = "reviewerName")
    val reviewerName: String,
    @Json(name = "reviewerEmail")
    val reviewerEmail: String
)