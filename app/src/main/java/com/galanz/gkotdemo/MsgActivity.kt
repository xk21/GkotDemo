package com.galanz.gkotdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.galanz.gkotdemo.adapter.MsgAdapter
import com.galanz.gkotdemo.bean.Msg
import kotlinx.android.synthetic.main.activity_msg.*

class MsgActivity : BaseActivity(), View.OnClickListener {

    private val msgList = ArrayList<Msg>()

    //延迟属性防止设置null
    private lateinit var adapter: MsgAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_msg)
//        initMsg()
        val linearLayoutManager = LinearLayoutManager(this)
        msgRecyclerView.layoutManager = linearLayoutManager
        //延迟初始化判断
        if (!::adapter.isInitialized) {
            adapter = MsgAdapter(msgList)
        }
        msgRecyclerView.adapter = adapter
        send.setOnClickListener(this)
        initMsg()
    }

    private fun initMsg() {
        msgList.run {
            add(Msg("你好,影魔", Msg.TYPE_RECEIVED))
            add(Msg("你好,有鬼", Msg.TYPE_SENT))
            add(Msg("吃我影压吧", Msg.TYPE_RECEIVED))
            add(Msg("看我鬼影重重", Msg.TYPE_SENT))
        }
    }

    override fun onClick(v: View?) {
        when (v) {
            send -> {
                val content = inputText.text.toString()
                if (content.isNotEmpty()){
                    msgList.add(Msg(content,Msg.TYPE_SENT))
                    adapter.notifyItemChanged(msgList.size-1)
                    msgRecyclerView.scrollToPosition(msgList.size-1)
                    inputText.setText("")
                }
            }
        }
    }
}
