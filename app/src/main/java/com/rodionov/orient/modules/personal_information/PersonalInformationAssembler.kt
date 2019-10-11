package com.rodionov.orient.modules.personal_information

import androidx.fragment.app.FragmentManager
import com.rodionov.orient.modules.personal_information.model.interactor.PersonalInformationInteractorImpl
import com.rodionov.orient.modules.personal_information.presenter.PersonalInformationPresenterImpl
import com.rodionov.orient.modules.personal_information.router.PersonalInformationRouterImpl
import com.rodionov.orient.modules.personal_information.view.PersonalInformationActivity
import com.rodionov.orient.modules.personal_information.view.PersonalInformationFragment

/**
 * Created by rodionov on 07/10/2019.
 */


class PersonalInformationAssembler {

    fun assemble(view: PersonalInformationFragment) {
        val interactor = PersonalInformationInteractorImpl()
        val router = PersonalInformationRouterImpl(view.fragmentManager as FragmentManager)
        val presenter = PersonalInformationPresenterImpl(interactor, router)


        interactor.interactorOutput = presenter
        presenter.view = view
        view.presenter = presenter
    }

    fun activityAssemble(view: PersonalInformationActivity){
        val interactor = PersonalInformationInteractorImpl()
        val router = PersonalInformationRouterImpl(view.supportFragmentManager)
        val presenter = PersonalInformationPresenterImpl(interactor, router)

        view.presenter = presenter
    }

}