package com.rodionov.orient.modules.event_description.router

import androidx.fragment.app.FragmentManager
import com.rodionov.orient.base.BaseRouterImpl
import com.rodionov.orient.modules.start_list.view.StartListFragment


class EventDescriptionRouterImpl(fragmentManager: FragmentManager) : BaseRouterImpl(fragmentManager),EventDescriptionRouter {
    override fun openStartProtocol() {
        val fragment = StartListFragment()
        changeFragment(fragment)
    }
}
