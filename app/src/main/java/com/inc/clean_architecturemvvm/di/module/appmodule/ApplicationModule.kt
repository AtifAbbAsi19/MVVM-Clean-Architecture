package com.inc.clean_architecturemvvm.di.module.appmodule

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.inc.clean_architecturemvvm.R
import com.inc.clean_architecturemvvm.database.AppDatabase
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


    // Tell Dagger-Hilt to create a singleton accessible everywhere in ApplicationCompenent (i.e. everywhere in the application)
    @Singleton
    @Provides
    fun provideYourDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        AppDatabase::class.java,
        "your_db_name"
    ).build()
    // The reason we can construct a database for the repo



    // The reason we can implement a Dao for the database
    @Singleton
    @Provides
    fun provideArticleDao(db: AppDatabase) = db.getArticleList()



    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()

    @Provides
    @Singleton
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory =
        GsonConverterFactory.create(gson)

    /***
     *
     * https://proandroiddev.com/news-android-app-607f9dc6a3d1
     *
     * https://www.geeksforgeeks.org/how-to-build-a-simple-note-android-app-using-mvvm-and-room-database/
     *
     *
     */

}