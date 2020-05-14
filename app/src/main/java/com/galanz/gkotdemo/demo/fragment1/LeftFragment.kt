package com.galanz.gkotdemo.demo.fragment1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.galanz.gkotdemo.R

/**
 *   Created by chenmy on 2020/5/14.
 */
class LeftFragment : Fragment() {
    companion object {
        const val TAG = "LeftFragment"
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"1111")
        return inflater.inflate(R.layout.left_fragment, container, false)
    }
}