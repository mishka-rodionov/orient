package com.rodionov.orient.app.model.event

/**
 * Created by rodionov on 17.10.2019.
 */
enum class CheckingType(val checkingTypeName: String) {

    PENCIL(checkingTypeName = "Карандаш"),
    COMPOSTERS(checkingTypeName = "Компостер"),
    ELECTRONIC(checkingTypeName = "Электронная отметка")

}