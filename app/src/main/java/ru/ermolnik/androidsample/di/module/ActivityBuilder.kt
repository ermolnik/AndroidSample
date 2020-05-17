package ru.ermolnik.androidsample.di.module

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import ru.ermolnik.androidsample.ui.app.view.AppActivity
import ru.ermolnik.androidsample.di.scope.ActivityScope
import ru.ermolnik.androidsample.ui.app.di.AppActivityModule

@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        AndroidInjectionModule::class,
        AppActivityModule::class
    ])

    internal abstract fun contributeAppActivity(): AppActivity

}
