package com.debk007.template.network

import com.debk007.template.model.ProductDetailsDto
import retrofit2.http.GET

interface ApiService {

    @GET("products/1") // TODO: Set API Endpoint
    suspend fun getProductDetails(): ProductDetailsDto // TODO: Set API Response
}