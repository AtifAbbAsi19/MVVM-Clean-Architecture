package com.inc.clean_architecturemvvm.data.dto.response.article

import com.google.gson.annotations.SerializedName

data class ArticleRepositoriesDto(

    @field:SerializedName("copyright")
    val copyright: String? = null,

    @field:SerializedName("results")
    val results: List<ArticleItems?>? = null,

    @field:SerializedName("num_results")
    val numResults: Int? = null,

    @field:SerializedName("status")
    val status: String? = null

)


data class ArticleItems(

    @field:SerializedName("per_facet")
    val perFacet: List<String?>? = null,

    @field:SerializedName("eta_id")
    val etaId: Int? = null,

    @field:SerializedName("subsection")
    val subsection: String? = null,

    @field:SerializedName("org_facet")
    val orgFacet: List<Any?>? = null,

    @field:SerializedName("nytdsection")
    val nytdsection: String? = null,

    @field:SerializedName("column")
    val column: Any? = null,

    @field:SerializedName("section")
    val section: String? = null,

    @field:SerializedName("asset_id")
    val assetId: Long? = null,

    @field:SerializedName("source")
    val source: String? = null,

    @field:SerializedName("abstract")
    val abstractDescription: String? = null,

    @field:SerializedName("media")
    val media: List<ArticleMediaItem?>? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("des_facet")
    val desFacet: List<String?>? = null,

    @field:SerializedName("uri")
    val uri: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("adx_keywords")
    val adxKeywords: String? = null,

    @field:SerializedName("geo_facet")
    val geoFacet: List<Any?>? = null,

    @field:SerializedName("id")
    val id: Long? = null,

    @field:SerializedName("published_date")
    val publishedDate: String? = null,

    @field:SerializedName("updated")
    val updated: String? = null,

    @field:SerializedName("byline")
    val byline: String? = null
)


data class ArticleMediaItem(

    @field:SerializedName("copyright")
    val copyright: String? = null,

    @field:SerializedName("media-metadata")
    val mediaMetadata: List<MediaMetadataItem?>? = null,

    @field:SerializedName("subtype")
    val subtype: String? = null,

    @field:SerializedName("caption")
    val caption: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("approved_for_syndication")
    val approvedForSyndication: Int? = null
)


data class MediaMetadataItem(

    @field:SerializedName("format")
    val format: String? = null,

    @field:SerializedName("width")
    val width: Int? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("height")
    val height: Int? = null
)