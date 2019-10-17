package com.rodionov.orient.modules.start_list.presenter

import com.rodionov.orient.app.model.user.User

/**
 * Created by rodionov on 27.09.2019.
 */
class ParticipantData(val user: User = User(),
                      val startTime: Int = 0,
                      val finishTime: Int = 0) {
}