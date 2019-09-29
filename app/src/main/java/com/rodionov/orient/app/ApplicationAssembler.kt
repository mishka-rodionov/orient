package com.rodionov.orient.app

import com.rodionov.orient.app.presenter.AppPresenterImpl
import com.rodionov.orient.app.router.AppRouterImpl
import com.rodionov.orient.app.view.MainActivity

/**
 * Created by rodionov on 19.09.2019.
 */
class ApplicationAssembler {
    fun assemble(activity: MainActivity){
        val router = AppRouterImpl(activity = activity)
        val presenter = AppPresenterImpl(router)
        activity.presenter = presenter
    }
}