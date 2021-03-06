package ru.ermolnik.androidsample.di.module

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import ru.ermolnik.androidsample.ui.app.di.AppActivityViewModelModule
import ru.ermolnik.base.presentation.vm.ViewModelFactory

@Module(includes = [AppActivityViewModelModule::class])
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory):
    ViewModelProvider.Factory
}
