package com.galanz.gkotdemo.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.galanz.gkotdemo.R

/**
 *   Created by chenmy on 2020/5/13.
 */
sealed class MsgViewholder(view: View) : RecyclerView.ViewHolder(view)

class LeftViewHoler(view: View) : MsgViewholder(view) {
    val leftMsg: TextView = view.findViewById(R.id.leftMsg)
}

class RightViewHoler(view: View) : MsgViewholder(view) {
    val rightMsg: TextView = view.findViewById(R.id.rightMsg)
}