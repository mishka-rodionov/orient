package com.rodionov.orient.app.router

import android.support.v4.app.Fragment
import com.rodionov.orient.app.view.MainActivity
import com.rodionov.orient.base.BaseRouterImpl
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
}