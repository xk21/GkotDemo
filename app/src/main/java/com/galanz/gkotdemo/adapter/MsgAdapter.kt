package com.galanz.gkotdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.galanz.gkotdemo.R
import com.galanz.gkotdemo.bean.Msg

/**
 *   Created by chenmy on 2020/5/13.
 */
class MsgAdapter(val msgList: List<Msg>) : RecyclerView.Adapter<MsgViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        if (viewType == Msg.TYPE_RECEIVED) {
            LeftViewHoler(
                LayoutInflater.from(parent.context).inflate(R.layout.msg_left_item, parent, false)
            )
        } else {
            RightViewHoler(
                LayoutInflater.from(parent.context).inflate(R.layout.msg_right_item, parent, false)
            )
        }


    override fun getItemCount(): Int {
        return msgList.size
    }

    override fun onBindViewHolder(holder: MsgViewholder, position: Int) {
        val msg = msgList[position]
        when(holder){
            is LeftViewHoler-> holder.leftMsg.text = msg.content
            is RightViewHoler->holder.rightMsg.text = msg.content
        }
    }

    override fun getItemViewType(position: Int): Int {
        val msg = msgList[position]
        return msg.type
    }
}