package com.rodionov.orient.app.model.event

/**
 * Created by rodionov on 17.10.2019.
 */
class Distance(
    val distanceType: DistanceType,
    val checkingType: CheckingType,
    val ageGroup: AgeGroupType,
    val length: Float = 0F,
    val totalClimb: Int = 0,
    val countOfControlPoint: Int = 0,
    val numbersOfControlPoint: List<Int> = listOf()
) {
}