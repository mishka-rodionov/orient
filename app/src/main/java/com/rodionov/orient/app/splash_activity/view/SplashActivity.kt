package com.rodionov.orient.app.splash_activity.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rodionov.orient.app.splash_activity.SplashAssembler
import com.rodionov.orient.app.splash_activity.presenter.SplashPresenter

/**
 * Created by rodionov on 08.10.2019.
 */
class SplashActivity: AppCompatActivity(), SplashView {

    lateinit var presenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SplashAssembler().assemble(this)
        presenter.splashStart()

        finish()

    }
}