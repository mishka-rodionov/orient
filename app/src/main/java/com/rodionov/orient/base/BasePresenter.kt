package com.rodionov.orient.base

/**
 * Created by rodionov on 11.09.2019.
 */
open class BasePresenter<View, Interactor>(val view: View,
                                      val interactor: Interactor)