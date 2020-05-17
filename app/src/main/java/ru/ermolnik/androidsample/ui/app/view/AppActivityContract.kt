package ru.ermolnik.androidsample.ui.app.view

import ru.ermolnik.base.presentation.view.BaseView
import ru.ermolnik.base.presentation.view.IBaseView
import ru.ermolnik.base.presentation.vm.IBaseViewModel

interface AppActivityContract {

    interface View : IBaseView {
    }

    interface ViewModel : IBaseViewModel {
    }

    interface Interactor {
    }
}