package com.debk007.template.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.debk007.template.model.ProductDetailsDto
import com.debk007.template.util.ApiState

@Composable
fun HomeScreen(productDetails: ApiState<ProductDetailsDto>) {
    when (productDetails) {
        is ApiState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(modifier = Modifier.size(32.dp))
            }
        }

        is ApiState.Error -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = productDetails.errorMsg,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }

        is ApiState.Success -> {
            val data = productDetails.data

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 24.dp)
            ) {
                Text(
                    text = "Product Details",
                    style = MaterialTheme.typography.headlineLarge
                )

                Image(
                    painter = rememberAsyncImagePainter(data.images[0]),
                    contentDescription = "Product Image",
                    modifier = Modifier.padding(top = 8.dp)
                )

                Text(
                    text = "Brand:\n${data.brand}",
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = "Description:\n${data.description}",
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}