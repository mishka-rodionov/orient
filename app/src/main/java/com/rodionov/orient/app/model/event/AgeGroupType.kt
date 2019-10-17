package com.rodionov.orient.app.model.event

/**
 * Created by rodionov on 17.10.2019.
 */
enum class AgeGroupType(val ageGroupTypeName: String) {

    ALL(ageGroupTypeName = "Все"),
    OPEN(ageGroupTypeName = "ткрытая"),
    MASTERS(ageGroupTypeName = "Ветераны"),
    CHILDREN(ageGroupTypeName = "Дети"),
    M10(ageGroupTypeName = "М10"),
    M12(ageGroupTypeName = "М12"),
    M14(ageGroupTypeName = "М14"),
    M16(ageGroupTypeName = "М16")

}