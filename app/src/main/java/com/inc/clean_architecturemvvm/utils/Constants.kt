package com.inc.clean_architecturemvvm.utils

import com.inc.clean_architecturemvvm.ui.core.BaseApplication

object Constants {



    const val INVALID_KEY = "KKPpxxHQrGtbLhSNJWqJmQLO7fqXly8q"
    const val INVALID_SECTION = "sections"
    const val INVALID_PAGE = "8"
    const val INVALID_BASE_URL = "http://google.com/"


    const val BASE_URL = "http://api.nytimes.com/"

    enum class REQUEST_PARAMS(val key: String) {
        SESSION("all-sections"),
        PAGE("7"),
        API_KEY(BaseApplication.secureAPIKey),
        API_KEY_TEST("GtbLhSNJWqJmQLO7fqXly8qKKPpxxHQr")
    }

    enum class REQUEST_PARAMS_MOCK(val key: String) {
        SESSION_MOCK("all-sections"),
        PAGE_MOCK("7"),
        API_KEY_MOCK("GtbLhSNJWqJmQLO7fqXly8qKKPpxxHQr")
    }

}