package com.rodionov.orient.base

/**
 * Created by rodionov on 11.09.2019.
 */
open class BasePresenter<View, Interactor>(){

    var view: View? = null
    var interactor: Interactor? = null

    constructor(view: View,
                interactor: Interactor): this(){

        this.view = view
        this.interactor = interactor
    }


}