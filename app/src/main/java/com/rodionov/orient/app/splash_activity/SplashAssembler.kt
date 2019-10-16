package com.rodionov.orient.app.splash_activity

import com.rodionov.orient.app.splash_activity.presenter.SplashPresenterImpl
import com.rodionov.orient.app.splash_activity.router.SplashRouterImpl
import com.rodionov.orient.app.splash_activity.view.SplashActivity

/**
 * Created by rodionov on 08.10.2019.
 */
class SplashAssembler {

    fun assemble(view: SplashActivity){
        val router = SplashRouterImpl(view)
        val presenter = SplashPresenterImpl(view, router)
        view.presenter = presenter
    }
}