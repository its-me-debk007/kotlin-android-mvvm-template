package com.debk007.template.repository

import com.debk007.template.model.ProductDetailsDto
import com.debk007.template.util.ApiState

interface Repository {
    suspend fun getProductDetails(): ApiState<ProductDetailsDto>
}