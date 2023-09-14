package com.debk007.template.presentation.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.debk007.template.model.ProductDetailsDTO
import com.debk007.template.repository.Repository
import com.debk007.template.util.ApiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    private val _mandateState: MutableState<ApiState<ProductDetailsDTO>> = mutableStateOf(ApiState.Loading())
    val mandateState: State<ApiState<ProductDetailsDTO>> get() = _mandateState

    init {
        getProductDetails()
    }

    private fun getProductDetails() {
        viewModelScope.launch(Dispatchers.IO) {
            _mandateState.value = repository.getProductDetails()
        }
    }
}