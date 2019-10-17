package com.rodionov.orient.modules.event_calendar.presenter

import android.util.Log
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.event_calendar.model.interactor.EventCalendarInteractor
import com.rodionov.orient.modules.event_calendar.model.interactor.EventCalendarInteractorOutput
import com.rodionov.orient.modules.event_calendar.router.EventCalendarRouterImpl
import com.rodionov.orient.modules.event_calendar.view.EventCalendarView
import com.rodionov.orient.ui.item.DividerItem
import com.rodionov.orient.ui.item.EventCalendarItem


class EventCalendarPresenterImpl(private val router: EventCalendarRouterImpl) :
    BasePresenter<EventCalendarView, EventCalendarInteractor>(),
    EventCalendarPresenter, EventCalendarInteractorOutput {

    override fun requestEvents() {
        val list = mutableListOf<Any>()
        list.add(
            EventCalendarItem(
                eventName = "День залетчика",
                eventDate = "12.05.2019",
                eventTime = "12:00",
                eventLocation = "Balashov"
            )
        )
        list.add(DividerItem())
        list.add(
            EventCalendarItem(
                eventName = "День залетчика 2",
                eventDate = "13.05.2019",
                eventTime = "10:00",
                eventLocation = "Balashov"
            )
        )
        Log.d(OrientApp.LIFECYCLE_TAG, "requestEvents EventCalendarFragment")
        view?.updateView(list)
    }

    override fun eventItemClicked() {
        router.openEventDescriptionFragment()
    }
}