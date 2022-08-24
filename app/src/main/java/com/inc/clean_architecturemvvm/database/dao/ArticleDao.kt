package com.inc.clean_architecturemvvm.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.inc.clean_architecturemvvm.data.entity.ArticleItemEntity
import javax.sql.DataSource

@Dao
interface ArticleDao {


    @Query("Select * from article_items_entity")
    fun getArticlesList(): LiveData<List<ArticleItemEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(articleList: List<ArticleItemEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: ArticleItemEntity)

    @Delete
    suspend fun delete(article: ArticleItemEntity)

    @Update
    suspend fun updateArticle(article : ArticleItemEntity)

}