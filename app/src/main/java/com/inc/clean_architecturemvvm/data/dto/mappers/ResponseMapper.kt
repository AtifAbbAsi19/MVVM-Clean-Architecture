package com.inc.clean_architecturemvvm.data.dto.mappers


import android.text.TextUtils
import com.inc.clean_architecturemvvm.data.dto.response.article.ArticleItems
import com.inc.clean_architecturemvvm.data.model.article.ArticleItem


fun ArticleItems.toArticle(): ArticleItem {

    val articleItem = ArticleItem()
    articleItem.title = this.title
    articleItem.abstract = this.abstractDescription
    articleItem.byline = this.byline
    articleItem.publishedDate = this.publishedDate

    if (!this.media.isNullOrEmpty()) {

        if (null != this.media[0]) {
            if (this.media[0]?.mediaMetadata.isNullOrEmpty().not()) {

                for (article in this.media[0]?.mediaMetadata!!) {
                    if (null != this.media[0]?.mediaMetadata?.get(0) && TextUtils.isEmpty(this.media[0]?.mediaMetadata?.get(0)?.url).not()) {
                        articleItem.imageUrl = this.media[0]?.mediaMetadata?.get(0)?.url
                        break
                    }

                }


            }
        }


   /*     if (null != this.media[0]) {
            if (this.media[0]?.mediaMetadata.isNullOrEmpty().not()) {

                this.media[0]?.mediaMetadata?.forEachIndexed lit@{ index, data ->

                    if (null != data && TextUtils.isEmpty(data.url)) {
                        articleItem.imageUrl = data.url
                        return@lit
                    }
                }

            }
        }*/

    }


    return articleItem
}