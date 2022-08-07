package com.inc.clean_architecturemvvm.viewmodel.homeviewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.inc.clean_architecturemvvm.data.dto.mappers.toArticle
import com.inc.clean_architecturemvvm.data.model.article.ArticleItem
import com.inc.clean_architecturemvvm.network.networkstates.ApiState
import com.inc.clean_architecturemvvm.repositories.homerepository.HomeRepository
import com.inc.clean_architecturemvvm.viewmodel.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: HomeRepository
) : BaseViewModel() {


    //Concept of encapsulation
    // Backing property to avoid state updates from other classes
    private val _uiState = MutableStateFlow<ApiState<List<ArticleItem?>?>>(ApiState.Loading)

    // The UI collects from this StateFlow to get its state updates
    val uiState: StateFlow<ApiState<List<ArticleItem?>?>> = _uiState

    val _repositoryList = MutableLiveData<List<ArticleItem?>?>()


    init {
        fetchRepositories()
    }


    fun fetchedArticleDataSuccessFully(): Boolean {
        return null != _uiState.value
    }

    fun fetchedArticleDataFailure(): Boolean {
        return null == _uiState.value
    }


    private fun fetchRepositories() {
        viewModelScope.launch {
            repository.fetchArticlesData().collect() {

                when (it) {

                    is ApiState.Loading -> {
                        _uiState.value = it
                    }

                    is ApiState.Success -> {
                        it.response?.let { response ->

                            Log.i("API:RESPONSE", it.response.toString())


                            val articleList = response.results?.map { it?.toArticle() }

                            if (null != articleList && articleList.isNotEmpty()) {
                                _repositoryList.value = articleList

                                _uiState.value = ApiState.Success(articleList)
                            }
                        }
                    }

                    is ApiState.Failure -> {
                        _uiState.value = it
                    }

                    else -> {

                    }
                }

            }
        }
    }


    fun updateItem(repositoryItem: ArticleItem) {


        _repositoryList.value.let {


            it.let {
/*

                for (item in it!!) {
                    if (repositoryItem == item) {
                        item.expand = View.VISIBLE
                    } else {
                        item?.expand = View.GONE
                    }
                    //it.find { repositoryItem == it }?.expand = true
                }
                _repositoryList.value = (it)
            }

*/
/*
                it?.onEach {

                    if (repositoryItem == it) {
                        it.expand = View.VISIBLE
                    } else {
                        it?.expand = View.GONE
                    }

                }*/

                _uiState.value = ApiState.Success(it)

            }

        }
    }

    var _articleItem = MutableLiveData<ArticleItem?>()

    fun selectedArticle(item: ArticleItem?) {
        this._articleItem.postValue(item)
    }

    override fun onCleared() {
        super.onCleared()

        _repositoryList.value = null

    }

}