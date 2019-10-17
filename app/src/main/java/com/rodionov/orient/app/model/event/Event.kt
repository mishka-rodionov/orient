package com.rodionov.orient.app.model.event

import com.rodionov.orient.app.model.user.User


/**
 * Created by rodionov on 17.10.2019.
 */
class Event(
    val eventName: String = "",
    val eventDate: String  = "",
    val eventTime: String = "",
    val eventLocation: String = "",
    val driveDirection: Image = Image(),
    val distanceType: DistanceType ,
    val checkingType: CheckingType,
    val distances: List<Distance> = listOf(),
    val comment: String = "",
    val emergencyAzimuth: String = "",
    val startList: List<User> = listOf(),
    val requests: List<User> = listOf()
) {
}