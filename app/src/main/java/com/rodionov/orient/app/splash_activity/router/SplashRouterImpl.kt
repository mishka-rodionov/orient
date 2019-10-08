package com.rodionov.orient.app.splash_activity.router

import android.content.Intent
import com.rodionov.orient.app.main_activities.view.BottomNavigationBarActivity
import com.rodionov.orient.app.splash_activity.view.SplashActivity
import com.rodionov.orient.modules.personal_information.view.PersonalInformationActivity

/**
 * Created by rodionov on 08.10.2019.
 */
class SplashRouterImpl(private val activity: SplashActivity): SplashRouter {

    override fun openPersonalInformationActivity() {
        val intent = Intent(activity, PersonalInformationActivity::class.java)
        activity.startActivity(intent)
    }

    override fun openMainActivity() {
        val intent = Intent(activity, BottomNavigationBarActivity::class.java)
        activity.startActivity(intent)
    }
}