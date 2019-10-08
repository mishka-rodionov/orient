package com.rodionov.orient.app.splash_activity.presenter

import com.rodionov.orient.app.splash_activity.router.SplashRouter
import com.rodionov.orient.app.splash_activity.view.SplashActivity

/**
 * Created by rodionov on 08.10.2019.
 */
class SplashPresenterImpl(private val view: SplashActivity,
                          private val router: SplashRouter
): SplashPresenter {

    override fun splashStart() {
        router.openMainActivity()
//        router.openPersonalInformationActivity()
    }
}