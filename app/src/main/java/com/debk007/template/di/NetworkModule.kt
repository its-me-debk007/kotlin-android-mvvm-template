package com.debk007.template.di

import com.debk007.template.network.NetworkHttpClient
import com.debk007.template.repository.Repository
import com.debk007.template.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun providesHttpClient(networkHttpClient: NetworkHttpClient): HttpClient =
        networkHttpClient.getHttpClient()

    @Provides
    @Singleton
    fun providesRepository(repositoryImpl: RepositoryImpl): Repository = repositoryImpl
}