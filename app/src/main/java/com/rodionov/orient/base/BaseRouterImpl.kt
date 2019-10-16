package com.rodionov.orient.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.rodionov.orient.R
import com.rodionov.orient.modules.start_list.view.StartListFragment

/**
 * Created by rodionov on 10.09.2019.
 */
open class BaseRouterImpl(open val fragmentManager: FragmentManager){

    protected fun changeFragment(fragment: Fragment){
        fragmentManager.beginTransaction()
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
            .addToBackStack(fragment.javaClass.name)
            .replace(R.id.contentFrame, fragment, fragment.javaClass.name)
            .commit()
    }

    open fun openFirstFragment() {
        val fragment = StartListFragment()
        changeFragment(fragment)
    }
}