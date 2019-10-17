package com.rodionov.orient.app.model.club

import com.rodionov.orient.app.model.event.Event
import com.rodionov.orient.app.model.user.User

/**
 * Created by rodionov on 17.10.2019.
 */
class Club(
    val clubName: String = "",
    val clubId: Int = 0,
    val clubLocation: String = "",
    val members: List<User> = listOf(),
    val events: List<Event> = listOf(),
    val membersRequests: List<User> = listOf(),
    val eventsRequests: List<Event> = listOf()
    ) {
}