package com.inc.clean_architecturemvvm.data.model.article

import android.os.Parcelable
import android.view.View
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class ArticleItem(

    @SerializedName("imageUrl")
    var imageUrl: String? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("abstract")
    var abstract: String? = null,

    @SerializedName("published_date")
    var publishedDate: String? = null,

    @SerializedName("byline")
    var byline: String? = null,

    @SerializedName("total_rating")
    var totalRatingCount: Int? = null,


) :Parcelable
    //:Serializable