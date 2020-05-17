package ru.ermolnik.androidsample.ui.app.di

import dagger.Binds
import dagger.Module
import ru.ermolnik.androidsample.di.scope.ActivityScope
import ru.ermolnik.androidsample.ui.app.view.AppActivity
import ru.ermolnik.androidsample.ui.app.view.AppActivityContract
import ru.ermolnik.androidsample.ui.app.view.AppActivityInteractor
import ru.ermolnik.androidsample.ui.app.view.AppActivityViewModel

@Module
abstract class AppActivityModule {

    @Binds
    @ActivityScope
    abstract fun bindView(activity: AppActivity): AppActivityContract.View

    @Binds
    @ActivityScope
    abstract fun bindAppViewModel(appViewModel: AppActivityViewModel): AppActivityContract.ViewModel

    @Binds
    @ActivityScope
    abstract fun bindInteractor(interactor: AppActivityInteractor): AppActivityContract.Interactor

}
