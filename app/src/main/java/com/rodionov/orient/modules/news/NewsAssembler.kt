package com.rodionov.orient.modules.news

import com.rodionov.orient.modules.news.model.interactor.NewsInteractorImpl
import com.rodionov.orient.modules.news.presenter.NewsMapperImpl
import com.rodionov.orient.modules.news.presenter.NewsPresenterImpl
import com.rodionov.orient.modules.news.view.NewsFragment

/**
 * Created by rodionov on 02/10/2019.
 */


class NewsAssembler {

    fun assemble(view: NewsFragment) {
        val interactor = NewsInteractorImpl()
        val mapper = NewsMapperImpl()
        val presenter = NewsPresenterImpl(interactor, mapper)
        interactor.interactorOutput = presenter
        presenter.view = view
        view.presenter = presenter
    }

}