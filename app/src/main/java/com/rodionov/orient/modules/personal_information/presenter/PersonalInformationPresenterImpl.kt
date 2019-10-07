package com.rodionov.orient.modules.personal_information.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.personal_information.model.interactor.PersonalInformationInteractor
import com.rodionov.orient.modules.personal_information.model.interactor.PersonalInformationInteractorOutput
import com.rodionov.orient.modules.personal_information.view.PersonalInformationView


class PersonalInformationPresenterImpl(interactor: PersonalInformationInteractor) :
    BasePresenter<PersonalInformationView, PersonalInformationInteractor>(interactor),
    PersonalInformationPresenter, PersonalInformationInteractorOutput {

}