package com.rodionov.orient.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.rodionov.orient.R

/**
 * Created by rodionov on 11.09.2019.
 */
open abstract class BaseFragment<Presenter>: Fragment(), BaseView<Presenter> {

    override var presenter: Presenter? = null
    private var containerView: ViewGroup? = null
    private var contentView: View? = null

//    abstract fun initPresenter()

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view = view)
        requestData()
    }

    protected abstract fun initViews(view: View)

    protected abstract fun getLayoutResource(): Int

    protected abstract fun requestData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}