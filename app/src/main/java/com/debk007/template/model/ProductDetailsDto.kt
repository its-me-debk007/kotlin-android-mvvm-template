package com.debk007.template.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductDetailsDto(
    @Json(name = "id")
    val id: Int,
    @Json(name = "title")
    val title: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "category")
    val category: String,
    @Json(name = "price")
    val price: Double,
    @Json(name = "discountPercentage")
    val discountPercentage: Double,
    @Json(name = "rating")
    val rating: Double,
    @Json(name = "stock")
    val stock: Int,
    @Json(name = "tags")
    val tags: List<String>,
    @Json(name = "brand")
    val brand: String,
    @Json(name = "sku")
    val sku: String,
    @Json(name = "weight")
    val weight: Int,
    @Json(name = "dimensions")
    val dimensions: Dimensions,
    @Json(name = "warrantyInformation")
    val warrantyInformation: String,
    @Json(name = "shippingInformation")
    val shippingInformation: String,
    @Json(name = "availabilityStatus")
    val availabilityStatus: String,
    @Json(name = "reviews")
    val reviews: List<Review>,
    @Json(name = "returnPolicy")
    val returnPolicy: String,
    @Json(name = "minimumOrderQuantity")
    val minimumOrderQuantity: Int,
    @Json(name = "meta")
    val meta: Meta,
    @Json(name = "images")
    val images: List<String>,
    @Json(name = "thumbnail")
    val thumbnail: String
)