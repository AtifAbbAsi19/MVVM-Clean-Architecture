package com.inc.clean_architecturemvvm.ui.fragment.homefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.library.baseAdapters.BR
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.inc.clean_architecturemvvm.R
import com.inc.clean_architecturemvvm.adapter.articleadapter.ArticleAdapter
import com.inc.clean_architecturemvvm.data.model.article.ArticleItem
import com.inc.clean_architecturemvvm.databinding.FragmentHomeBinding
import com.inc.clean_architecturemvvm.network.networkstates.ApiState
import com.inc.clean_architecturemvvm.ui.core.BaseFragment
import com.inc.clean_architecturemvvm.viewmodel.homeviewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    var adapter: ArticleAdapter? = null

    private val sharedViewModel by activityViewModels<HomeViewModel>() //for shared view model


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        _binding?.setVariable(BR.viewModel, sharedViewModel)

        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        adapter = ArticleAdapter(arrayListOf()) {
            navigateToDetailsScreen(it as ArticleItem)
        }

        _binding?.articleRecyclerview?.adapter = adapter
        _binding?.articleRecyclerview?.hasFixedSize()

        // viewModel.fetchRepositories()


        lifecycleScope.launch {

            sharedViewModel.uiState.collect {

                when (it) {

                    is ApiState.Loading -> {
                        // do nothing for now
                    }

                    is ApiState.Success -> {
                        updateUi(it.response)
                    }


                    else -> {
                    }
                }
            }
        }
    }

    private fun updateUi(response: List<ArticleItem?>?) {

        if (!response.isNullOrEmpty())
            adapter?.updateRepositoriesList(articleList = response as ArrayList<ArticleItem>)

    }


    private fun navigateToDetailsScreen(articleItem: ArticleItem) {

       // val bundle = Bundle()
        //bundle.putParcelable("articleItem", articleItem)



        val action = HomeFragmentDirections.actionHomeFragmentToArticleDetailsFragment(articleItem)
      //  Navigation.findNavController(_binding?.root!!).navigate(action)


      //  sharedViewModel.selectedArticle(articleItem)

       // val action = HomeFragmentDirections.actionHomeFragmentToArticleDetailsFragment(articleItem)

        findNavController().apply {
            navigate(action)
           // navigate(R.id.articleDetailsFragment)
            // backQueue.clear()
        }
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun getViewModel(): HomeViewModel? {
        return sharedViewModel
    }

    override fun onFinish() {
        adapter = null
    }


}