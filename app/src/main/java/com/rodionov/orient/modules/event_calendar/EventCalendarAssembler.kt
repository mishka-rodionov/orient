package com.rodionov.orient.modules.event_calendar

import androidx.fragment.app.FragmentManager
import com.rodionov.orient.modules.event_calendar.model.interactor.EventCalendarInteractorImpl
import com.rodionov.orient.modules.event_calendar.presenter.EventCalendarPresenterImpl
import com.rodionov.orient.modules.event_calendar.router.EventCalendarRouterImpl
import com.rodionov.orient.modules.event_calendar.view.EventCalendarFragment

class EventCalendarAssembler {

    fun assemble(view: EventCalendarFragment) {
        val interactor = EventCalendarInteractorImpl()
        val router = EventCalendarRouterImpl(view.activity?.supportFragmentManager as FragmentManager)
        val presenter = EventCalendarPresenterImpl(router)
        presenter.view = view
        view.presenter = presenter
    }

}