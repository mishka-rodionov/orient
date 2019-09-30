package com.rodionov.orient.modules.event_calendar.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.event_calendar.model.interactor.EventCalendarInteractor
import com.rodionov.orient.modules.event_calendar.model.interactor.EventCalendarInteractorOutput
import com.rodionov.orient.modules.event_calendar.view.EventCalendarView


class EventCalendarPresenterImpl() :
    BasePresenter<EventCalendarView, EventCalendarInteractor>(),
    EventCalendarPresenter, EventCalendarInteractorOutput {

}