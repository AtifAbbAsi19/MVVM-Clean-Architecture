package com.inc.clean_architecturemvvm.ui.activity.main

import android.os.Bundle
import androidx.activity.viewModels
import com.inc.clean_architecturemvvm.R
import com.inc.clean_architecturemvvm.databinding.ActivityMainBinding
import com.inc.clean_architecturemvvm.ui.core.BaseActivity
import com.inc.clean_architecturemvvm.viewmodel.homeviewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, HomeViewModel>() {



    private val homeViewModel: HomeViewModel by viewModels() //for shared view model

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun getLayout(): Int {
      return  R.layout.activity_main
    }

    override fun getViewModel(): HomeViewModel? {
        return homeViewModel
    }

    override fun onFinish() {

    }
}