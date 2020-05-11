package ru.ermolnik.base.presentation.vm

import androidx.lifecycle.ViewModel

interface IBaseViewModel{
    fun onViewCreated()
    fun onResume()
    fun onPause()
    fun onBack()
}