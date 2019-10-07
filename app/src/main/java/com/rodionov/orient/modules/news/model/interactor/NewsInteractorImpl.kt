package com.rodionov.orient.modules.news.model.interactor

import android.util.Log
import com.rodionov.orient.app.OrientApp
import com.rodionov.orient.base.BaseInteractor
import com.rodionov.orient.network.ServiceFactory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers


class NewsInteractorImpl : BaseInteractor<NewsInteractorOutput>(), NewsInteractor{

    override fun requestData() {
        ServiceFactory.getVkNewsFeed().getWall("orienteeringbalashov", 10, 0)
            .subscribeOn(Schedulers.newThread())
//            .map {
//
//            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    Log.d(OrientApp.NETWORK, "VKWallResponse count = ${it.response.count}")
                    Log.d(OrientApp.NETWORK, "VKWallResponse comments = ${it.response.items[0].toString()}")
//                    Log.d(OrientApp.NETWORK, "VKWallResponse date = ${it.response.items[0].date}")
//                    Log.d(OrientApp.NETWORK, "VKWallResponse fromId = ${it.response.items[0].fromId}")
//                    Log.d(OrientApp.NETWORK, "VKWallResponse id = ${it.response.items[0].id}")
//                    Log.d(OrientApp.NETWORK, "VKWallResponse likes = ${it.response.items[0].likes.count}")
//                    Log.d(OrientApp.NETWORK, "VKWallResponse markedAsAds = ${it.response.items[0].markedAsAds}")
//                    Log.d(OrientApp.NETWORK, "VKWallResponse ownerId = ${it.response.items[0].ownerId}")
                    interactorOutput?.receivedPosts(it)
                },
                onError = {
                    Log.d(OrientApp.NETWORK, "${it.stackTrace}")
                }
            )
    }
}