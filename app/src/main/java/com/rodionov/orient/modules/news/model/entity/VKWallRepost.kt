package com.rodionov.orient.modules.news.model.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by rodionov on 02.10.2019.
 */
class VKWallRepost(
    val count: Int = 0,
    @SerializedName("user_reposted")
    val userReposted: Int = 0
) {
}