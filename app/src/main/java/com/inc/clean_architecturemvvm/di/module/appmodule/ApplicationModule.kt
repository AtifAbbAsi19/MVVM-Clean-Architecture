package com.inc.clean_architecturemvvm.di.module.appmodule

import android.content.Context
import com.inc.clean_architecturemvvm.R
import com.inc.clean_architecturemvvm.di.qualifier.SecureKeyApi
import com.inc.clean_architecturemvvm.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Singleton
    @Provides
    @SecureKeyApi
    fun provideSecureKey(@ApplicationContext context: Context): String {
        return context.getString(R.string.times_api_key)
    }


    @Singleton
    @Provides
    fun provideRetrofitInstance(): Retrofit {

        val client = OkHttpClient.Builder()

        client.interceptors().add(Interceptor { chain: Interceptor.Chain ->
            var request = chain.request()
            request = request
                .newBuilder()
                .build()
            chain.proceed(request)
        })

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.build())
            .build()
    }


}