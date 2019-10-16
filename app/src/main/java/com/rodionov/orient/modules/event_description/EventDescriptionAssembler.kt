package com.rodionov.orient.modules.event_description

import androidx.fragment.app.FragmentManager
import com.rodionov.orient.modules.event_description.model.interactor.EventDescriptionInteractorImpl
import com.rodionov.orient.modules.event_description.presenter.EventDescriptionPresenterImpl
import com.rodionov.orient.modules.event_description.router.EventDescriptionRouterImpl
import com.rodionov.orient.modules.event_description.view.EventDescriptionFragment

/**
 * Created by rodionov on 12/10/2019.
 */


class EventDescriptionAssembler {

    fun assemble(view: EventDescriptionFragment) {
        val interactor = EventDescriptionInteractorImpl()
        val router = EventDescriptionRouterImpl(view.activity?.supportFragmentManager as FragmentManager)
        val presenter = EventDescriptionPresenterImpl(interactor, router)

        interactor.interactorOutput = presenter
        presenter.view = view
        view.presenter = presenter
    }

}