package com.inc.clean_architecturemvvm.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "article_media_meta_data_items_entity")
class MediaMetadataItemEntity @JvmOverloads  constructor(

    @ColumnInfo("format")
    @Ignore val format: String? = null,

    @ColumnInfo("width")
    @Ignore  val width: Int? = null,

    @ColumnInfo("url")
    @Ignore   val url: String? = null,

    @ColumnInfo("height")
    @Ignore val height: Int? = null


)