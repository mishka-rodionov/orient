package com.rodionov.orient.base

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import com.rodionov.orient.R

/**
 * Created by rodionov on 10.09.2019.
 */
interface BaseRouter {
    fun changeFragment(fragment: Fragment){
        fragment.fragmentManager.beginTransaction()
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
            .addToBackStack(fragment.javaClass.name)
            .replace(R.id.contentFrame, fragment, fragment.javaClass.name)
            .commitAllowingStateLoss();
    }
}