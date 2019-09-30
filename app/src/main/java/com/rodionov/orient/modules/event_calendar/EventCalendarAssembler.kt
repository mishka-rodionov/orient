package com.rodionov.orient.modules.event_calendar

import com.rodionov.orient.modules.event_calendar.model.interactor.EventCalendarInteractorImpl
import com.rodionov.orient.modules.event_calendar.presenter.EventCalendarPresenterImpl
import com.rodionov.orient.modules.event_calendar.view.EventCalendarFragment

class EventCalendarAssembler {

    fun assemble(view: EventCalendarFragment) {
        val interactor = EventCalendarInteractorImpl()
        val presenter = EventCalendarPresenterImpl()
        presenter.view = view
        view.presenter = presenter
    }

}