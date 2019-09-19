package com.rodionov.orient.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.rodionov.orient.R

/**
 * Created by rodionov on 11.09.2019.
 */
open abstract class BaseFragment<Presenter>: Fragment() {

    var presenter: Presenter? = null
    private var containerView: ViewGroup? = null
    private var contentView: View? = null

    abstract fun initPresenter()

//    fun setPresenter(presenter: Presenter){
//
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        containerView = inflater.inflate(R.layout.base_fragment, container, false) as ViewGroup
        contentView = inflater.inflate(getLayoutResource(), container, false)
        containerView?.addView(contentView)

        initPresenter()

        return containerView
    }

    protected abstract fun getLayoutResource(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}