package com.inc.clean_architecturemvvm.utils

import android.text.TextUtils

class Validator {

    fun isEmptySecureKey(key: String) = key.ifEmpty { false }

    fun isValidApiKey(key: String) = key == Constants.REQUEST_PARAMS_MOCK.API_KEY_MOCK.key

    fun isForAllSession(session: String) = session == Constants.REQUEST_PARAMS_MOCK.SESSION_MOCK.key

    fun isForSevenPages(page: String) = page == Constants.REQUEST_PARAMS_MOCK.PAGE_MOCK.key

    fun isValidBaseUrl(url: String) = url == Constants.BASE_URL

    fun isEmptyCheckTextUtils(value: String?) = TextUtils.isEmpty(value)

    fun isEmptyCheckNormal(value: String?) = value?.isEmpty()

    fun isNotEmptyCheckNormal(value: String?) = value?.isNotEmpty()

    fun isNull(value: String?) = value?.isNullOrBlank()

    fun isInvalidAPIKey(value: String?) = value?.isNullOrBlank()

    fun isPageValidNumeric(value: String) = value.all { it in '0'..'9' }

    fun isValidString(value: String): Boolean {

        val result = value.toIntOrNull()
        return when (result) {
            null -> false
            else -> true
        }
    }


}