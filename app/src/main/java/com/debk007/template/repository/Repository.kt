package com.debk007.template.repository

import com.debk007.template.model.ProductDetailsDTO
import com.debk007.template.util.ApiState

interface Repository {
    suspend fun getProductDetails(): ApiState<ProductDetailsDTO>
}