package com.rodionov.orient.modules.personal_information.router

import androidx.fragment.app.FragmentManager
import com.rodionov.orient.base.BaseRouterImpl
import com.rodionov.orient.modules.personal_information.view.PersonalInformationFragment

class PersonalInformationRouterImpl(override val fragmentManager: FragmentManager) : BaseRouterImpl(fragmentManager), PersonalInformationRouter {
    override fun openPersonalFragment() {
        val fragment = PersonalInformationFragment()
        changeFragment(fragment = fragment)
    }
}
