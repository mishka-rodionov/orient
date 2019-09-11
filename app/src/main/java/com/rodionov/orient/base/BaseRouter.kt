package com.rodionov.orient.base

import android.support.v4.app.Fragment

/**
 * Created by rodionov on 11.09.2019.
 */
interface BaseRouter {
    fun changeFragment(fragment: Fragment)
}