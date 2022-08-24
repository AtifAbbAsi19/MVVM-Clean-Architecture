package com.inc.clean_architecturemvvm.data.entity

import androidx.room.*
import com.google.gson.annotations.SerializedName
import com.inc.clean_architecturemvvm.data.dto.response.article.MediaMetadataItem


@Entity(tableName = "article_media_items_entity")
data class ArticleMediaItemEntity   constructor(

    @ColumnInfo("copyright")
    val copyright: String? = null,

   // @Embedded(prefix = "mediaMetadata")
/*
    @SerializedName("mediaMetadata")
    val mediaMetadata: List<MediaMetadataItemEntity?>? = null,
*/

    @ColumnInfo("subtype")
    val subtype: String? = null,

    @ColumnInfo("caption")
    val caption: String? = null,

    @ColumnInfo("type")
    val type: String? = null,

    @ColumnInfo("approved_for_syndication")
    @Ignore val approvedForSyndication: Int? = null
){

    constructor() : this(null,null,null,null,null)

}