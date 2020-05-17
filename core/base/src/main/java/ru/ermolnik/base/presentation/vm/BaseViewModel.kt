package ru.ermolnik.base.presentation.vm

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel(),
    IBaseViewModel {

    override fun onBack() {}

    override fun onResume() {}

    override fun onPause() {}

    override fun onViewCreated() {}
}