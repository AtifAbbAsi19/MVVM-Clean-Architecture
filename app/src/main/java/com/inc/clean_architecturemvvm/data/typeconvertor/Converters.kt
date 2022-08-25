package com.inc.clean_architecturemvvm.data.typeconvertor

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.inc.clean_architecturemvvm.data.entity.ArticleItemEntity
import com.inc.clean_architecturemvvm.data.entity.ArticleMediaItemEntity
import com.inc.clean_architecturemvvm.data.entity.MediaMetadataItemEntity
import java.lang.reflect.Type

object Converters {

    @JvmStatic
    @TypeConverter
    fun listToJsonString(value: List<String>?): String = Gson().toJson(value)

    @JvmStatic
    @TypeConverter
    fun jsonStringToList(value: String) = Gson().fromJson(value, Array<String>::class.java).toList()
    @JvmStatic
    @TypeConverter
    fun mediaMetadataItemEntityToJson(value: MediaMetadataItemEntity?) = Gson().toJson(value)

    @JvmStatic
    @TypeConverter
    fun articleMediaItemEntityToJson(value: ArticleMediaItemEntity?) = Gson().toJson(value)

    @JvmStatic
    @TypeConverter
    fun articleItemEntityEntityToJson(value: ArticleItemEntity?) = Gson().toJson(value)

    @JvmStatic
    @TypeConverter
    fun stringToArticleMedia(string: String?): ArticleMediaItemEntity? {
        return Gson().fromJson(string, ArticleMediaItemEntity::class.java)
    }

    @JvmStatic
    @TypeConverter
    fun stringToArticle(string: String?): ArticleItemEntity? {
        return Gson().fromJson(string, ArticleItemEntity::class.java)
    }

    @JvmStatic
    @TypeConverter
    fun stringToMediaMetaData(string: String?): MediaMetadataItemEntity? {
        return Gson().fromJson(string, MediaMetadataItemEntity::class.java)
    }

    @JvmStatic
    @TypeConverter
    public fun fromStringArray(value: String?): ArrayList<String?>? {
        val listType: Type = object : TypeToken<ArrayList<String?>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @JvmStatic
    @TypeConverter
    public fun fromArrayList(list: ArrayList<String?>?): String? {
        return Gson().toJson(list)
    }



    @TypeConverter
    fun articleMediaItemEntityListToJsonString(value: List<ArticleMediaItemEntity>?): String = Gson().toJson(value)

    @TypeConverter
    fun jsonStringToArticleMediaItemEntityList(value: String) = Gson().fromJson(value, Array<ArticleMediaItemEntity>::class.java).toList()



    @TypeConverter
    fun mediaMetadataItemEntityListToJsonString(value: List<MediaMetadataItemEntity>?): String = Gson().toJson(value)

    @TypeConverter
    fun jsonStringToMediaMetadataItemEntityList(value: String) = Gson().fromJson(value, Array<MediaMetadataItemEntity>::class.java).toList()



}