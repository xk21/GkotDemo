package com.galanz.gkotdemo

import android.app.Activity
import android.util.Log

/**
 *   Created by chenmy on 2020/5/12.
 */
object ActivityCollector {

    const val TAG = "ActivityCollector"

    private val activities = ArrayList<Activity>()
    fun addActivity(activity: Activity){
        activities.add(activity)
        Log.d(TAG,"add: "+activity::class.simpleName)
    }

    fun removeActivity(activity: Activity){
        activities.remove(activity)
        Log.d(TAG,"remove: "+activity::class.simpleName)
    }

    fun finishAll(){
        for (activity in activities) {
            if (!activity.isFinishing){
                activity.finish()
            }
        }
        activities.clear()
    }
}