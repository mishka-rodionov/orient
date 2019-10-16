package com.rodionov.orient.modules.news.model.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by rodionov on 02.10.2019.
 */
class VKWallPhoto(
    val id: Int = 0,
    @SerializedName("album_id")
    val albumId: Int = 0,
    @SerializedName("owner_id")
    val ownerId: Int = 0,
    @SerializedName("user_id")
    val userId: Int = 0,
    val sizes: List<VKWallPhotoSize> = listOf(),
    val text: String = "",
    val date: Int = 0,
    @SerializedName("access_key")
    val accessKey: String = ""
)