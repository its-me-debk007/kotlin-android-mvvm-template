package com.debk007.template.network

import com.debk007.template.model.ProductDetailsDTO
import retrofit2.http.GET

interface ApiService {

    @GET("products/1") // TODO: Set API Endpoint
    suspend fun getProductDetails(): ProductDetailsDTO // TODO: Set API Response
}