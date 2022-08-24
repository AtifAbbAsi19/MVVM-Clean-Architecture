package com.inc.clean_architecturemvvm.repositories.homerepository

import com.inc.clean_architecturemvvm.database.dao.ArticleDao
import com.inc.clean_architecturemvvm.network.RepositoryArticleServiceApi
import com.inc.clean_architecturemvvm.network.baseApiResultHandler
import javax.inject.Inject


class HomeRepository @Inject constructor(
    private val repositoryArticleServiceApi: RepositoryArticleServiceApi ,
    private val articleDao: ArticleDao ,

) {

    fun fetchArticlesFromDatabase() = articleDao.getArticlesList()

    fun fetchArticlesData() = baseApiResultHandler {
        repositoryArticleServiceApi.getArticlesRequest()
    }
}