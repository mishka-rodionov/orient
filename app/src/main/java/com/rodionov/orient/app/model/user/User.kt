package com.rodionov.orient.app.model.user

/**
 * Created by rodionov on 27.09.2019.
 */
class User
{
    companion object{
        var instance = User()
    }

    var firstName: String = ""
    var lastName: String = ""
    var club: String = ""
    var role: String = ""
    var yearOfBirth: Int = 0
    var phoneNumber: String = ""
    var image: String = ""
    var isAuthenticated: Boolean = false

}