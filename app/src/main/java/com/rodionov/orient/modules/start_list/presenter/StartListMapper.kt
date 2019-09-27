package com.rodionov.orient.modules.start_list.presenter

/**
 * Created by rodionov on 27.09.2019.
 */
interface StartListMapper {
    fun map(from: ParticipantData): List<Any>
}