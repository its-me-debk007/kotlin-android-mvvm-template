package com.debk007.template.repository

import com.debk007.template.model.ProductDetailsDto
import com.debk007.template.network.ApiService
import com.debk007.template.util.ApiState
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : Repository {

    override suspend fun getProductDetails(): ApiState<ProductDetailsDto> = try {
        ApiState.Success(apiService.getProductDetails())
    } catch (e: Exception) {
        ApiState.Error(errorMsg = e.message.toString())
    }
}