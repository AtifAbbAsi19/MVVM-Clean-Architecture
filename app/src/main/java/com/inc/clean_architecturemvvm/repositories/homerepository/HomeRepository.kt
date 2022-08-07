package com.inc.clean_architecturemvvm.repositories.homerepository

import com.inc.clean_architecturemvvm.network.RepositoryArticleServiceApi
import com.inc.clean_architecturemvvm.network.baseApiResultHandler
import javax.inject.Inject


class HomeRepository @Inject constructor(
    private val repositoryArticleServiceApi: RepositoryArticleServiceApi
) {
    fun fetchArticlesData() = baseApiResultHandler {
        repositoryArticleServiceApi.getArticlesRequest()
    }
}