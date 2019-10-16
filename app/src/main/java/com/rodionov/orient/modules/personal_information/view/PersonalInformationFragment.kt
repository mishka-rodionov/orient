package com.rodionov.orient.modules.personal_information.view

import android.view.View
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.personal_information.presenter.PersonalInformationPresenter
import com.rodionov.orient.modules.personal_information.PersonalInformationAssembler


class PersonalInformationFragment : BaseFragment<PersonalInformationPresenter>(),
    PersonalInformationView {


    override fun initPresenter() {
        PersonalInformationAssembler().assemble(this)
    }

    override fun requestData() {

    }

    override fun initViews(view: View) {

    }

    override fun getLayoutResource(): Int {
        return R.layout.personal_information_fragment
    }

}