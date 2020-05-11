package ru.ermolnik.androidsample

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import ru.ermolnik.androidsample.di.component.AppComponent
import ru.ermolnik.androidsample.di.component.DaggerAppComponent
import ru.ermolnik.base.presentation.BaseApplication

class App : BaseApplication() {

    private lateinit var appComponent: AppComponent

    override fun injectDagger() {
        appComponent = DaggerAppComponent
            .factory()
            .create(this)

        appComponent.inject(this)
    }
}
