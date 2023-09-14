package com.debk007.template.repository

import com.debk007.template.model.ProductDetailsDTO
import com.debk007.template.network.ApiService
import com.debk007.template.util.ApiState
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : Repository {

    override suspend fun getMandateDetails(): ApiState<ProductDetailsDTO> = try {
        ApiState.Success(apiService.getDetails())
    } catch (e: Exception) {
        ApiState.Error(msg = e.message.toString())
    }
}