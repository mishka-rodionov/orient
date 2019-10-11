package com.rodionov.orient.modules.event_calendar.router

import androidx.fragment.app.FragmentManager
import com.rodionov.orient.base.BaseRouterImpl
import com.rodionov.orient.modules.event_description.view.EventDescriptionFragment

class EventCalendarRouterImpl(fragmentManager: FragmentManager) : BaseRouterImpl(fragmentManager), EventCalendarRouter {

    override fun openEventDescriptionFragment() {
        val fragment = EventDescriptionFragment()
        changeFragment(fragment)
    }
}
