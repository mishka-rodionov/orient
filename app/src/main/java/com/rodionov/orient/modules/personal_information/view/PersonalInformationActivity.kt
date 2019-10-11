package com.rodionov.orient.modules.personal_information.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rodionov.orient.modules.personal_information.PersonalInformationAssembler
import com.rodionov.orient.modules.personal_information.presenter.PersonalInformationPresenter

/**
 * Created by rodionov on 08.10.2019.
 */
class PersonalInformationActivity: AppCompatActivity() {

    lateinit var presenter: PersonalInformationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        PersonalInformationAssembler().activityAssemble(this)

        presenter.openPersonalInformationFragment()
    }
}