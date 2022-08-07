package com.inc.clean_architecturemvvm.data.dto.response.core

import com.google.gson.annotations.SerializedName


data class BaseArticleResponse<T : Any>(

    @field:SerializedName("copyright")
    val copyright: String? = null,

    @field:SerializedName("results")
    val results: List<T?>? = null,

    @field:SerializedName("num_results")
    val numResults: Int? = null,

    @field:SerializedName("status")
    val status: String? = null

)