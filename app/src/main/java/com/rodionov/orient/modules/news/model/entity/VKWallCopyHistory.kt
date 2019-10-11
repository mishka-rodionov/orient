package com.rodionov.orient.modules.news.model.entity

/**
 * Created by rodionov on 05.10.2019.
 */
class VKWallCopyHistory(
    val id: Int = 0,
    val owner_id: Int = 0,
    val from_id: Int = 0,
    val date: Int = 0,
    val post_type: String = "",
    val text: String = "",
    val attachments: VKWallAttachment = VKWallAttachment()
)