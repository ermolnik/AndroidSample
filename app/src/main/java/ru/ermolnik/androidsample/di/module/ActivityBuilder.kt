package ru.ermolnik.androidsample.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.ermolnik.androidsample.ui.app.AppActivity
import ru.ermolnik.androidsample.di.scope.ActivityScope

@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [AppActivityModule::class])
    internal abstract fun contributeMainActivity(): AppActivity
}
