package com.rodionov.orient.modules.news.model.entity

/**
 * Created by rodionov on 02.10.2019.
 */
class VKWallAttachment(val type: String = "",
                       val photo: VKWallPhoto = VKWallPhoto(),
                       val doc: VKWallDoc = VKWallDoc(),
                       val video: VKWallVideo = VKWallVideo(),
                       val link: VKWallLink = VKWallLink())