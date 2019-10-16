package com.rodionov.orient.modules.news.model.interactor

import com.rodionov.orient.modules.news.model.entity.VKWallResponse


interface NewsInteractorOutput {

    fun receivedPosts(response: VKWallResponse)

}