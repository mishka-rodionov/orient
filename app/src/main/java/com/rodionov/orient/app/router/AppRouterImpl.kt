package com.rodionov.orient.app.router

import com.rodionov.orient.app.view.MainActivity
import com.rodionov.orient.base.BaseRouterImpl
import com.rodionov.orient.modules.event_calendar.view.EventCalendarFragment
import com.rodionov.orient.modules.news.view.NewsFragment
import com.rodionov.orient.modules.qr_scanner.view.QRScannerFragment
import com.rodionov.orient.modules.start_list.view.StartListFragment

/**
 * Created by rodionov on 24.09.2019.
 */
class AppRouterImpl(activity: MainActivity): BaseRouterImpl(activity.supportFragmentManager), AppRouter {

    override fun openStartList() {
        val fragment = StartListFragment()
        changeFragment(fragment)
    }

    override fun openScannerFragment() {
        val fragment = QRScannerFragment()
        changeFragment(fragment)
    }

    override fun openEventCalendarFragment() {
        val fragment = EventCalendarFragment()
        changeFragment(fragment)
    }

    override fun openNews() {
        val fragment = NewsFragment()
        changeFragment(fragment)
    }
}