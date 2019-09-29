package com.rodionov.orient.modules.start_list

import com.rodionov.orient.modules.start_list.presenter.StartListPresenterImpl
import com.rodionov.orient.modules.start_list.view.StartListFragment

/**
 * Created by rodionov on 23.09.2019.
 */
class StartListAssembler{

    fun assemble(view: StartListFragment){
        val presenter = StartListPresenterImpl()
        presenter.view = view
        view.presenter = presenter
    }

}