package com.inc.clean_architecturemvvm.network

import com.inc.clean_architecturemvvm.data.dto.response.article.ArticleRepositoriesDto
import com.inc.clean_architecturemvvm.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query


interface RepositoryArticleServiceApi {


    // @Headers("Accept: application/json")
    @GET(EndPoints.ARTICLE_REPO_URL)
    suspend fun getArticles(): Response<ArticleRepositoriesDto>


    //http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=sample-key
    @GET("${EndPoints.ARTICLE_REPO_ENDPOINT}/{session}/{page}.json")
    suspend fun getArticlesRequest(
        @Path("session") session: String = Constants.REQUEST_PARAMS.SESSION.key,
        @Path("page") page: String = Constants.REQUEST_PARAMS.PAGE.key,
        @Query("api-key") apiKey: String = Constants.REQUEST_PARAMS.API_KEY.key
    ): Response<ArticleRepositoriesDto>

}