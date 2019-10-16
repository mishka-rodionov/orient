package com.rodionov.orient.modules.start_list.presenter

import com.rodionov.orient.modules.ui.item.AddItem
import com.rodionov.orient.modules.ui.item.DividerItem
import com.rodionov.orient.modules.ui.item.StartListItem

/**
 * Created by rodionov on 27.09.2019.
 */
class StartListMapperImpl: StartListMapper {
    override fun map(from: List<ParticipantData>): List<Any> {
        val list = mutableListOf<Any>()

        from.forEachIndexed { index, it ->
            list.add(
                StartListItem(
                    firstName = it.user.firstName,
                    lastName = it.user.lastName,
                    clubName = it.user.club,
                    image = it.user.image,
                    startTime = it.startTime,
                    positionNumber = (index + 1).toString()
                )
            )
            list.add(DividerItem())
        }
        list.add(AddItem())
        return list
    }
}