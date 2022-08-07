package com.inc.clean_architecturemvvm.data.dto.request.article

import com.google.gson.annotations.SerializedName

data class ArticleRequestDto(

    @field:SerializedName("session")
    val session: String = "all-sections",

    @field:SerializedName("pages")
    val pages: String = "7",


    )