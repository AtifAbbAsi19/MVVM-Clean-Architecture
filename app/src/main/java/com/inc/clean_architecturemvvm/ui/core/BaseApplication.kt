package com.inc.clean_architecturemvvm.ui.core

import android.app.Application
import android.content.Context
import com.inc.clean_architecturemvvm.R
import com.inc.clean_architecturemvvm.di.qualifier.SecureKeyApi
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication @Inject constructor() : Application() {


    @Inject
    @SecureKeyApi
    lateinit var _secureKeyApi: String


    override fun onCreate() {
        super.onCreate()

        secureAPIKey = _secureKeyApi
        context = this
    }


    fun getSecureAPI(): String {
        return secureAPIKey
    }

    fun getContext(): Context {
        return context
    }

    companion object {

        lateinit var secureAPIKey: String
        lateinit var context: Context

    }


}