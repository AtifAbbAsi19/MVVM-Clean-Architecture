package com.inc.clean_architecturemvvm.viewmodel.homeviewmodel

import com.google.gson.Gson
import com.inc.clean_architecturemvvm.data.dto.response.article.ArticleRepositoriesDto
import com.inc.clean_architecturemvvm.network.networkstates.ApiState
import com.inc.clean_architecturemvvm.repositories.homerepository.HomeRepository
import com.inc.clean_architecturemvvm.utils.MockUtils
import junit.framework.Assert
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class HomeViewModelTest {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var gson: Gson

    @Mock
    lateinit var repository: HomeRepository


    @Before
    fun setup() {
        gson = Gson()
        homeViewModel = HomeViewModel(repository)
    }


    @Test
    fun checkIfDataIsNotNull() {


        val articleResponseSuccessMock = MockUtils.articleSuccessResponse
        val articleResponseDto =
            gson.fromJson(articleResponseSuccessMock, ArticleRepositoriesDto::class.java)

        `when`(repository.fetchArticlesData()).thenReturn(flowOf(ApiState.Success(articleResponseDto)))

        assertEquals(homeViewModel.uiState.value, articleResponseDto.results)

    }

    @Test
    fun checkIfDataIsNull() {

        val result = homeViewModel.fetchedArticleDataFailure()
        assertEquals(false, result)

    }

    @Test
    fun test_fetchArticleListSuccessFully() {

        runBlocking {

            /*
              var jsonString = gson.toJson(ArticleRepositoriesDto("ok",null))*/
            val articleResponseMock = MockUtils.articleSuccessResponse
            val articleResponseDto =
                gson.fromJson(articleResponseMock, ArticleRepositoriesDto::class.java)
            assertEquals(articleResponseDto.status, "OK")

        }
    }

    @Test
    fun test_fetchArticleListFailure() {

        runBlocking {

            /*
              var jsonString = gson.toJson(ArticleRepositoriesDto("ok",null))*/
            val articleResponseMock = MockUtils.articleFailResponse
            val articleResponseDto =
                gson.fromJson(articleResponseMock, ArticleRepositoriesDto::class.java)
            assertEquals(articleResponseDto.status, "Fail")

        }
    }


}