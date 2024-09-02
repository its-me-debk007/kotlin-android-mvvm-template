package com.debk007.template.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductDetailsDto(
    @SerialName("availabilityStatus")
    val availabilityStatus: String,
    @SerialName("brand")
    val brand: String,
    @SerialName("category")
    val category: String,
    @SerialName("description")
    val description: String,
    @SerialName("dimensions")
    val dimensions: Dimensions,
    @SerialName("discountPercentage")
    val discountPercentage: Double,
    @SerialName("id")
    val id: Int,
    @SerialName("images")
    val images: List<String>,
    @SerialName("meta")
    val meta: Meta,
    @SerialName("minimumOrderQuantity")
    val minimumOrderQuantity: Int,
    @SerialName("price")
    val price: Double,
    @SerialName("rating")
    val rating: Double,
    @SerialName("returnPolicy")
    val returnPolicy: String,
    @SerialName("reviews")
    val reviews: List<Review>,
    @SerialName("shippingInformation")
    val shippingInformation: String,
    @SerialName("sku")
    val sku: String,
    @SerialName("stock")
    val stock: Int,
    @SerialName("tags")
    val tags: List<String>,
    @SerialName("thumbnail")
    val thumbnail: String,
    @SerialName("title")
    val title: String,
    @SerialName("warrantyInformation")
    val warrantyInformation: String,
    @SerialName("weight")
    val weight: Int
)