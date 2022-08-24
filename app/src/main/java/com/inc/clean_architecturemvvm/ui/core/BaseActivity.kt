package com.inc.clean_architecturemvvm.ui.core

import android.app.ActionBar
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.inc.clean_architecturemvvm.viewmodel.core.BaseViewModel

abstract class BaseActivity<BINDING : ViewDataBinding, VIEWMODEL : BaseViewModel?> :
    AppCompatActivity() {

    private lateinit var _binding: BINDING
    private var _baseViewModel: VIEWMODEL? = null

    @LayoutRes
    abstract fun getLayout(): Int

    abstract fun getViewModel(): VIEWMODEL?

    // lateinit var appContext: Context

    abstract fun onFinish()

    open fun getBinding(): BINDING? {
        return _binding
    }


    open fun afterOnCreate(savedInstanceState: Bundle?) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DataBindingUtil.setContentView(this@BaseActivity, getLayout())
        _binding.lifecycleOwner = this@BaseActivity
        _baseViewModel = _baseViewModel ?: getViewModel()

        afterOnCreate(savedInstanceState)

    }


    override fun onDestroy() {

        unbind()
        System.runFinalization() //The java.lang.System.runFinalization()
        // method runs the finalization methods of any objects pending finalization.
        System.gc() //garbage collector to remove object
        onFinish() //on finish method

        super.onDestroy()
    }


    open fun showBackButton(visibility : Boolean) {

    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    open fun unbind() {
        if (::_binding.isInitialized) {
            getBinding()?.unbind()
        }
    }

}