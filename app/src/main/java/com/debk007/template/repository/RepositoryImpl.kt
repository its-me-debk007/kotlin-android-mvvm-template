package com.debk007.template.repository

import com.debk007.template.BuildConfig
import com.debk007.template.model.ProductDetailsDto
import com.debk007.template.util.ApiState
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val client: HttpClient
) : Repository {

    override suspend fun getProductDetails(): ApiState<ProductDetailsDto> = try {
        val response = client.get(urlString = "${BuildConfig.BASE_URL}products/1")
        ApiState.Success(response.body<ProductDetailsDto>())
    } catch (e: Exception) {
        ApiState.Error(errorMsg = e.message.toString())
    }
}