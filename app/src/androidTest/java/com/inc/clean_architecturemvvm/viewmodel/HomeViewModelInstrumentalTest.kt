package com.inc.clean_architecturemvvm.viewmodel

import com.inc.clean_architecturemvvm.data.dto.response.article.ArticleItems
import com.inc.clean_architecturemvvm.network.RepositoryArticleServiceApi
import com.inc.clean_architecturemvvm.repositories.homerepository.HomeRepository
import com.inc.clean_architecturemvvm.viewmodel.homeviewmodel.HomeViewModel
import kotlinx.coroutines.runBlocking


//@ExperimentalCoroutinesApi
class HomeViewModelInstrumentalTest {

    //private val testDispatcher = TestCoroutineDispatcher()
    lateinit var mainViewModel: HomeViewModel
    lateinit var mainRepository: HomeRepository

  //  private val mockWebServer = MockWebServer()

    //@Mock
    lateinit var repositoryArticleServiceApi: RepositoryArticleServiceApi

   // @Before
    fun setup() {
      //  mockWebServer.start(8080)
        mainRepository = HomeRepository(repositoryArticleServiceApi)
        mainViewModel = HomeViewModel(mainRepository)
    }


   // @After
    fun teardown() {
    //    mockWebServer.shutdown()
    }




}