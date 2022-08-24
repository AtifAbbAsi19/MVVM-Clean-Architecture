package com.inc.clean_architecturemvvm.data.entity

import android.os.Parcelable
import androidx.room.*
import com.google.gson.annotations.SerializedName
import com.inc.clean_architecturemvvm.data.dto.response.article.ArticleMediaItem
import kotlinx.android.parcel.Parcelize
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable


@Entity(tableName = "article_items_entity", primaryKeys = ["_id"])
data class ArticleItemEntity @JvmOverloads constructor(

    // specifying its initial value as 0
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    @SerializedName("_id")
    @NotNull
    var _id: Int,

    @ColumnInfo(name = "section")
    @SerializedName("section")
    @Nullable
    val section: String? = null,

    @ColumnInfo(name = "abstract")
    @SerializedName("abstract")
    @Nullable
    val abstractDescription: String? = null,

    @Embedded(prefix = "media")
    @SerializedName("media")
    @Nullable
    val media: List<ArticleMediaItemEntity?>? = null,

    @ColumnInfo(name = "title") @SerializedName("title")
    @Nullable
    val title: String? = null,


    @ColumnInfo(name = "uri") @SerializedName("uri")
    @Nullable
    val uri: String? = null,


    @ColumnInfo("articleId")
    @SerializedName("articleId")
    @Nullable
    val articleId: Long? = null,

    @Nullable
    @ColumnInfo("published_date") @SerializedName("published_date")
    val publishedDate: String? = null,

    @Nullable
    @ColumnInfo("updated") @SerializedName("updated")
    val updated: String? = null,

    @Nullable
    @ColumnInfo("byline") @SerializedName("byline")
    val byline: String? = null
)

