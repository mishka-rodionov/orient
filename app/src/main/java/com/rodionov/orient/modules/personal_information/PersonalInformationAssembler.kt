package com.rodionov.orient.modules.personal_information

import androidx.fragment.app.FragmentManager
import com.rodionov.orient.modules.personal_information.model.interactor.PersonalInformationInteractorImpl
import com.rodionov.orient.modules.personal_information.presenter.PersonalInformationPresenterImpl
import com.rodionov.orient.modules.personal_information.router.PersonalInformationRouterImpl
import com.rodionov.orient.modules.personal_information.view.PersonalInformationFragment

/**
 * Created by rodionov on 07/10/2019.
 */


class PersonalInformationAssembler {

    fun assemble(view: PersonalInformationFragment) {
        val interactor = PersonalInformationInteractorImpl()
        val presenter = PersonalInformationPresenterImpl(interactor)
        val router = PersonalInformationRouterImpl(view.fragmentManager as FragmentManager)

        interactor.interactorOutput = presenter
        presenter.view = view
        view.presenter = presenter
    }

}