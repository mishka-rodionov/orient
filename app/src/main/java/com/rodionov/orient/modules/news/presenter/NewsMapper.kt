package com.rodionov.orient.modules.news.presenter

import com.rodionov.orient.modules.news.model.entity.VKWallResponse

/**
 * Created by rodionov on 03.10.2019.
 */
interface NewsMapper {
    fun map(from: VKWallResponse): List<Any>
}