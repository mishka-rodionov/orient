package com.rodionov.orient.modules.start_list.presenter

import com.rodionov.orient.modules.ui.item.StartListItem

/**
 * Created by rodionov on 27.09.2019.
 */
class StartListMapperImpl: StartListMapper {
    override fun map(from: ParticipantData): List<Any> {
        val list = mutableListOf<StartListItem>()

        list.add(
            StartListItem(
            firstName = from.user.firstName,
                lastName = from.user.lastName,
                clubName = from.user.club,
                image = from.user.image,
                startTime = from.startTime))

        return list
    }
}