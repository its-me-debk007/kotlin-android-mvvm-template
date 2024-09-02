package com.debk007.template.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.debk007.template.model.ProductDetailsDto
import com.debk007.template.repository.Repository
import com.debk007.template.util.ApiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    // TODO: Set UI State
    private val _productDetailsState: MutableStateFlow<ApiState<ProductDetailsDto>> =
        MutableStateFlow(ApiState.Loading)
    val productDetailsState = _productDetailsState.asStateFlow()

    init {
        getProductDetails()
    }

    private fun getProductDetails() {
        viewModelScope.launch(Dispatchers.IO) {
            _productDetailsState.value = repository.getProductDetails()
        }
    }
}