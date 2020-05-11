package ru.ermolnik.base.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import dagger.android.support.DaggerFragment
import ru.ermolnik.base.presentation.vm.BaseViewModel

abstract class BaseFragment<VM : BaseViewModel> : DaggerFragment(),
    BaseView {

    @get:LayoutRes
    abstract val layoutId: Int

    abstract var viewModel: VM

    open fun showLoading(loading: Boolean) = Unit

    open fun showMessage(succeed: Boolean) = Unit

    open fun enableControls(enabled: Boolean) = Unit

    open fun resetUi() = Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.onViewCreated()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }


    override fun onResume() {
        viewModel.onResume()
        super.onResume()
    }

    override fun onPause() {
        viewModel.onPause()
        super.onPause()
    }

    fun setState(state: UiState) {
        when (state) {
            UiState.LOADING -> {
                showLoading(true)
                enableControls(false)
            }
            UiState.SUCCESS -> {
                showMessage(true)
                showLoading(false)
                enableControls(true)
                resetUi()
            }
            UiState.ERROR, UiState.EMPTY -> {
                showMessage(false)
                showLoading(false)
                enableControls(false)
            }

        }
    }
}
