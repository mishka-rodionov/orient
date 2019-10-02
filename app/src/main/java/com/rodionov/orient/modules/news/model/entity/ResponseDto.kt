package com.rodionov.orient.modules.news.model.entity

/**
 * Created by rodionov on 02.10.2019.
 */
class ResponseDto(val count: Int = 0,
                  val items: List<VKWallItem> = listOf<VKWallItem>()) {
}