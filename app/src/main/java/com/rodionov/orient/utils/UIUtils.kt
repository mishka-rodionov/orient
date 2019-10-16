package com.rodionov.orient.utils

import android.app.Activity
import android.content.res.Resources
import android.graphics.Point

/**
 * Created by rodionov on 07.10.2019.
 */
class UIUtils {

    companion object {
        fun convertDpToPixel(dp: Float): Float {
            val resources = Resources.getSystem()
            val metrics = resources.displayMetrics
            return dp * metrics.density
        }

        fun getScreenSize(activity: Activity): Point {
            val display = activity.windowManager.defaultDisplay
            val size = Point()
            display.getSize(size)
            return size
        }
    }

}