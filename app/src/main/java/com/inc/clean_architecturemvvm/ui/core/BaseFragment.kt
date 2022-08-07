package com.inc.clean_architecturemvvm.ui.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.inc.clean_architecturemvvm.viewmodel.core.BaseViewModel

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel?> : Fragment() {

    var _binding: T? = null
    private var _baseViewModel: V? = null


    open fun getBinding(): T? {
        return _binding
    }

    open fun getBindingVariable(): Int {
        return -1
    }

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getViewModel(): V?

    abstract fun onFinish()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        if (null == _binding) {
            _binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)

        }
        return _binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.setVariable(getBindingVariable(), _baseViewModel)
        _binding?.lifecycleOwner = this
        _binding?.executePendingBindings()
    }


    override fun onDestroyView() {

        unbind()
        System.runFinalization() //The java.lang.System.runFinalization()
        // method runs the finalization methods of any objects pending finalization.
        System.gc() //garbage collector to remove object

        onFinish()

        super.onDestroyView()
    }

    open fun unbind() {

        if (null != _binding) {
            _binding?.unbind()
        }

    }
}