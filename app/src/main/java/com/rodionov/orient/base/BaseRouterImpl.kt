package com.rodionov.orient.base

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.rodionov.orient.R
import com.rodionov.orient.modules.qr_scanner.view.QRScannerFragment

/**
 * Created by rodionov on 10.09.2019.
 */
open class BaseRouterImpl(val fragmentManager: FragmentManager){

    protected fun changeFragment(fragment: Fragment){
        fragmentManager.beginTransaction()
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
            .addToBackStack(fragment.javaClass.name)
            .replace(R.id.contentFrame, fragment, fragment.javaClass.name)
            .commit()
    }

    fun openFirstFragment() {
        val fragment = QRScannerFragment()
        changeFragment(fragment)
    }
}