package com.rodionov.orient.modules.news.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.news.model.interactor.NewsInteractor
import com.rodionov.orient.modules.news.model.interactor.NewsInteractorOutput
import com.rodionov.orient.modules.news.view.NewsView


class NewsPresenterImpl(interactor: NewsInteractor) :
    BasePresenter<NewsView, NewsInteractor>(interactor),
    NewsPresenter, NewsInteractorOutput {

    override fun requestData() {
        interactor?.requestData()
    }
}