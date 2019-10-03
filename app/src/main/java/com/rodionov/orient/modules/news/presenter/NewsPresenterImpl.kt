package com.rodionov.orient.modules.news.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.news.model.entity.VKWallResponse
import com.rodionov.orient.modules.news.model.interactor.NewsInteractor
import com.rodionov.orient.modules.news.model.interactor.NewsInteractorOutput
import com.rodionov.orient.modules.news.view.NewsView


class NewsPresenterImpl(interactor: NewsInteractor,
                        private val mapper: NewsMapperImpl) :
    BasePresenter<NewsView, NewsInteractor>(interactor),
    NewsPresenter, NewsInteractorOutput {

    override fun requestData() {
        interactor?.requestData()
    }

    override fun receivedPosts(response: VKWallResponse) {
        view?.updateView(mapper.map(response))
    }
}