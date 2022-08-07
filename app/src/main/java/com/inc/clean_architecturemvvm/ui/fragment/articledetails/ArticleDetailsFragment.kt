package com.inc.clean_architecturemvvm.ui.fragment.articledetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.inc.clean_architecturemvvm.R
import com.inc.clean_architecturemvvm.databinding.FragmentArticleDetailsBinding
import com.inc.clean_architecturemvvm.databinding.FragmentHomeBinding
import com.inc.clean_architecturemvvm.ui.core.BaseFragment
import com.inc.clean_architecturemvvm.ui.fragment.homefragment.HomeFragmentDirections
import com.inc.clean_architecturemvvm.viewmodel.homeviewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ArticleDetailsFragment : BaseFragment<FragmentArticleDetailsBinding, HomeViewModel>() {


    private val args: ArticleDetailsFragmentArgs by navArgs()

    private val sharedViewModel by activityViewModels<HomeViewModel>() //for shared view model


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(
            inflater,
            container,
            savedInstanceState
        )//calling super to get parent method call and after it execute our method
       // _binding?.item = sharedViewModel._articleItem.value
        _binding?.item = args.articleItem
        return _binding?.root
    }

 /*   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         _binding?.item = args.articleItem



    }
*/
    override fun getLayoutId(): Int {

        return R.layout.fragment_article_details
    }

    override fun getViewModel(): HomeViewModel? {
        return null
    }

    override fun onFinish() {
        sharedViewModel.selectedArticle(null)
       // args.toBundle().clear()
    }


}