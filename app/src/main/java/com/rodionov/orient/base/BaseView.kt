package com.rodionov.orient.base

/**
 * Created by rodionov on 25.09.2019.
 */
interface BaseView<Presenter> {

    var presenter: Presenter?

    fun initPresenter()
}