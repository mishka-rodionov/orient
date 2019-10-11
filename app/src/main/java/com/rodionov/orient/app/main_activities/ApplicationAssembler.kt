package com.rodionov.orient.app.main_activities

import com.rodionov.orient.app.main_activities.presenter.AppPresenterImpl
import com.rodionov.orient.app.main_activities.router.AppRouterImpl
import com.rodionov.orient.app.main_activities.view.MainActivity

/**
 * Created by rodionov on 19.09.2019.
 */
class ApplicationAssembler {
    fun assemble(activity: MainActivity){
        val router =
            AppRouterImpl(activity = activity)
        val presenter = AppPresenterImpl(router)
        activity.presenter = presenter
    }
}