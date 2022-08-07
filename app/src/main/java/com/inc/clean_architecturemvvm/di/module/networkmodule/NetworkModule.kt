package com.inc.clean_architecturemvvm.di.module.networkmodule

import com.inc.clean_architecturemvvm.network.RepositoryArticleServiceApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideAuthApi(retrofit: Retrofit): RepositoryArticleServiceApi {
        return retrofit.create(RepositoryArticleServiceApi::class.java)
    }

}