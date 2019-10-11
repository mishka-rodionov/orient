package com.rodionov.orient.modules.event_description.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.event_description.model.interactor.EventDescriptionInteractor
import com.rodionov.orient.modules.event_description.model.interactor.EventDescriptionInteractorOutput
import com.rodionov.orient.modules.event_description.view.EventDescriptionView


class EventDescriptionPresenterImpl(interactor: EventDescriptionInteractor) :
    BasePresenter<EventDescriptionView, EventDescriptionInteractor>(interactor),
    EventDescriptionPresenter, EventDescriptionInteractorOutput {

}